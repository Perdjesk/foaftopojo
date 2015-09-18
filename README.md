# foaftopojo
foaftopojo is a dirty program parsing RDFS/OWL ontology and per term documentation to produce a FOAF Java class.

foaftopojo creates a [`FOAF.java`](FOAF.java) class containing the [FOAF ontology](http://xmlns.com/foaf/spec/) with per-term documentation. 

The documentation is fully reproduce and documentation links are translated to JavaDoc `@link`.

## Usage examples

### Alibaba Sesame

```java
@Iri(FOAF.Person)
public interface Person {
  @Iri(FOAF.depiction)
  Image getDepiction();

  @Iri(FOAF.depiction)
  void setDepiction(Image depiction);
}
```

![image javadoc](http://i.imgur.com/R14WYg2.png)

