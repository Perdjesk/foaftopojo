package io.voctopojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.text.WordUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class VocToPojo {

	static final String LS = System.getProperty("line.separator");
	static final String FOAF_DOC = "http://xmlns.com/foaf/doc/";

	static class PojoEntry {
		String field;
		String value;
		String doc;

		PojoEntry(String field, String value, String doc) {
			this.field = field;
			this.value = value;
			this.doc = doc;
		}

		String getJava() {
			doc = doc.replaceAll("<code>foaf:", "{@link #");
			doc = doc.replaceAll("</code>", "}");
			StringBuilder sb = new StringBuilder();
			sb.append("\t/**" + LS);
			sb.append("\t * " + doc.replace(LS, LS + "\t * ") + LS);
			sb.append("\t*/" + LS);
			sb.append("\tpublic static final String " + field + " = \"" + value + "\";");
			return sb.toString();
		}

	}

	static class Foafinfo {
		String title;
		String description;
	}

	public static void main(String[] args) {
		try {
			VocToPojo v = new VocToPojo();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public VocToPojo() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse("http://xmlns.com/foaf/spec/index.rdf");

		List<PojoEntry> entries = parseEntries(doc, "rdf:Property");
		entries.addAll(parseEntries(doc, "rdfs:Class"));
		
		PrintWriter writer = new PrintWriter("FOAF.java", "UTF-8");
		writer.println(getFoafInfo(doc));
		writer.println("public class FOAF {");
		for (PojoEntry e : entries) {
			writer.println(e.getJava());
		}
		writer.println("}");
		writer.close();
	}

	private String getFoafInfo(Document doc) {
		NodeList nl = doc.getElementsByTagName("owl:Ontology");
		Node n = nl.item(0);
		NamedNodeMap atts = n.getAttributes();
		String title = getAttributeByName("dc:title", atts);
		String description = getAttributeByName("dc:description", atts);
		String about = getAttributeByName("rdf:about", atts);
		StringBuilder sb = new StringBuilder();
		sb.append("/**" + LS);
		sb.append(" * " + "<p>" + LS);
		sb.append(" * " + WordUtils.wrap(title + " - " + description, 100).replace(LS, LS + " * ") + LS);
		sb.append(" * " + "<p>" + LS);
		sb.append(" */" + LS);
		return sb.toString();

	}

	private List<PojoEntry> parseEntries(Document doc, String upperElement) throws IOException, ParserConfigurationException, SAXException {
		List<PojoEntry> entries = new ArrayList<>();
		NodeList nl = doc.getElementsByTagName(upperElement);
		for (int i = 0; i < nl.getLength(); i++) {
			Node n = nl.item(i);
			NamedNodeMap atts = n.getAttributes();
			String about = getAttributeByName("rdf:about", atts);
			String label = getAttributeByName("rdfs:label", atts);
			String term_status = getAttributeByName("vs:term_status", atts);
			String comment = getAttributeByName("rdfs:comment", atts);

			if (term_status.equals("archaic"))
				continue;

			if (about == null || label == null || term_status == null || comment == null) {
				System.err.println(about);
				continue;
			}

			String preamble = WordUtils.wrap(label + " - " + comment, 100);
			StringBuilder jDoc = new StringBuilder();
			jDoc.append("<p>" + LS + preamble + LS + "</p>");
			jDoc.append(LS);
			jDoc.append("<b> Status:</b> " + term_status);
			jDoc.append(LS);

			String entity = about.substring(about.lastIndexOf("/") + 1, about.length());
			String foafDoc = getFoafDoc(entity);
			jDoc = jDoc.append(foafDoc);

			PojoEntry entry = new PojoEntry(entity, about.toString(), jDoc.toString());
			entries.add(entry);
		}
		return entries;
	}

	private String getAttributeByName(String attributName, NamedNodeMap attributes) {
		Node n = attributes.getNamedItem(attributName);
		if (n != null)
			return n.getNodeValue();
		return null;

	}

	private String getFoafDoc(String entity) throws IOException, ParserConfigurationException, SAXException {
		StringBuilder sb = new StringBuilder();
		String doc = null;
		try {
			URL oracle = new URL(FOAF_DOC + entity + ".en");
			BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				sb.append(inputLine);
				sb.append(LS);
			}
			in.close();
			doc = sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}
}
