/**
 * <p>
 * Friend of a Friend (FOAF) vocabulary - The Friend of a Friend (FOAF) RDF vocabulary, described using
 * W3C RDF Schema and the Web Ontology Language.
 * <p>
 */

public class FOAF {
	/**
	 * <p>
	 * personal mailbox - A  personal mailbox, ie. an Internet mailbox associated with exactly one owner,
	 * the first owner of this mailbox. This is a 'static inverse functional property', in that  there is
	 * (across time and change) at most one individual that ever has any particular value for foaf:mbox.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #mbox} property is a relationship between the owner of a mailbox and 
	 * a mailbox. These are typically identified using the mailto: URI scheme (see <a 
	 * href="http://ftp.ics.uci.edu/pub/ietf/uri/rfc2368.txt">RFC 2368</a>).
	 * </p>
	 * 
	 * <p>
	 * Note that there are many mailboxes (eg. shared ones) which are not the 
	 * {@link #mbox} of anyone. Furthermore, a person can have multiple 
	 * {@link #mbox} properties. 
	 * </p>
	 * 
	 * <p>
	 * In FOAF, we often see {@link #mbox} used as an indirect way of identifying its 
	 * owner. This works even if the mailbox is itself out of service (eg. 10 years old), since 
	 * the property is defined in terms of its primary owner, and doesn't require the mailbox to 
	 * actually be being used for anything.
	 * </p>
	 * 
	 * <p>
	 * Many people are wary of sharing information about their mailbox addresses in public. To 
	 * address such concerns whilst continuing the FOAF convention of indirectly identifying 
	 * people by referring to widely known properties, FOAF also provides the 
	 * {@link #mbox_sha1sum} mechanism, which is a relationship between a person and 
	 * the value you get from passing a mailbox URI to the SHA1 mathematical function.
	 * </p>
	 * 
	*/
	public static final String mbox = "http://xmlns.com/foaf/0.1/mbox";
	/**
	 * <p>
	 * sha1sum of a personal mailbox URI name - The sha1sum of the URI of an Internet mailbox associated
	 * with exactly one owner, the  first owner of the mailbox.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * A {@link #mbox_sha1sum} of a {@link #Person} is a textual representation of 
	 * the result of applying the SHA1 mathematical functional to a 'mailto:' identifier (URI) for an 
	 * Internet mailbox that they stand in a {@link #mbox} relationship to.
	 * </p>
	 * 
	 * <p>
	 * In other words, if you have a mailbox ({@link #mbox}) but don't want to reveal its 
	 * address, you can take that address and generate a {@link #mbox_sha1sum} representation 
	 * of it. Just as a {@link #mbox} can be used as an indirect identifier for its owner, we 
	 * can do the same with {@link #mbox_sha1sum} since there is only one 
	 * {@link #Person} with any particular value for that property.
	 * </p>
	 * 
	 * <p>
	 * Many FOAF tools use {@link #mbox_sha1sum} in preference to exposing mailbox 
	 * information. This is usually for privacy and SPAM-avoidance reasons. Other relevant techniques 
	 * include the use of PGP encryption (see <a href="http://usefulinc.com/foaf/">Edd Dumbill's 
	 * documentation</a>) and the use of <a 
	 * href="http://www.w3.org/2001/12/rubyrdf/util/foafwhite/intro.html">FOAF-based whitelists</a> for 
	 * mail filtering.
	 * </p>
	 * 
	 * <p>
	 * Code examples for SHA1 in C#, Java, PHP, Perl and Python can be found <a 
	 * href="http://www.intertwingly.net/blog/1545.html">in Sam Ruby's 
	 * weblog entry</a>. Remember to include the 'mailto:' prefix, but no trailing 
	 * whitespace, when computing a {@link #mbox_sha1sum} property.
	 * </p>
	 * <!-- what about Javascript. move refs to wiki maybe. -->
	 * 
	*/
	public static final String mbox_sha1sum = "http://xmlns.com/foaf/0.1/mbox_sha1sum";
	/**
	 * <p>
	 * gender - The gender of this Agent (typically but not necessarily 'male' or 'female').
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #gender} property relates a {@link #Agent} (typically a 
	 * {@link #Person}) to a string representing its gender. In most cases the value 
	 * will be the string 'female' or 'male' (in lowercase without surrounding quotes or spaces). 
	 * Like all FOAF properties, there is in general no requirement to use  
	 * {@link #gender} in any particular document or description. Values other than 
	 * 'male' and 'female' may be used, but are not enumerated here. The {@link #gender} 
	 * mechanism is not intended to capture the full variety of biological, social and sexual 
	 * concepts associated with the word 'gender'. 
	 * </p>
	 * 
	 * <p>
	 * Anything that has a {@link #gender} property will be some kind of 
	 * {@link #Agent}. However there are kinds of {@link #Agent} to 
	 * which the concept of gender isn't applicable (eg. a {@link #Group}). FOAF does not 
	 * currently include a class corresponding directly to "the type of thing that has a gender".
	 * At any point in time, a {@link #Agent} has at most one value for 
	 * {@link #gender}. FOAF does not treat {@link #gender} as a 
	 * <em>static</em> property; the same individual may have different values for this property 
	 * at different times.
	 * </p>
	 * 
	 * <p>
	 * Note that FOAF's notion of gender isn't defined biologically or anatomically - this would 
	 * be tricky since we have a broad notion that applies to all {@link #Agent}s 
	 * (including robots - eg. Bender from Futurama is 'male'). As stressed above, 
	 * FOAF's notion of gender doesn't attempt to encompass the full range of concepts associated 
	 * with human gender, biology and sexuality. As such it is a (perhaps awkward) compromise 
	 * between the clinical and the social/psychological. In general, a person will be the best 
	 * authority on their {@link #gender}. Feedback on this design is 
	 * particularly welcome (via the FOAF mailing list, 
	 * <a href="http://lists.foaf-project.org/mailman/listinfo/foaf-dev">foaf-dev</a>). We have tried to 
	 * be respectful of diversity without attempting to catalogue or enumerate that diversity. 
	 * </p>
	 * 
	 * <p>
	 * This may also be a good point for a periodic reminder: as with all FOAF properties, 
	 * documents that use '{@link #gender}' will on occassion be innacurate, misleading 
	 * or outright false. FOAF, like all open means of communication, supports <em>lying</em>.
	 *  Application authors using 
	 * FOAF data should always be cautious in their presentation of unverified information, but be 
	 * particularly sensitive to issues and risks surrounding sex and gender (including privacy 
	 * and personal safety concerns). Designers of FOAF-based user interfaces should be careful to allow users to omit 
	 * {@link #gender} when describing themselves and others, and to allow at least for 
	 * values other than 'male' and 'female' as options. Users of information 
	 * conveyed via FOAF (as via information conveyed through mobile phone text messages, email, 
	 * Internet chat, HTML pages etc.) should be skeptical of unverified information.
	 * </p>
	 *  
	 * <!--
	 * b/g article currently offline.
	 * http://216.239.37.104/search?q=cache:Q_P_fH8M0swJ:archives.thedaily.washington.edu/1997/042997/sex.042997.html+%22Lois+McDermott%22&hl=en&start=7&ie=UTF-8
	 * -->
	 * 
	*/
	public static final String gender = "http://xmlns.com/foaf/0.1/gender";
	/**
	 * <p>
	 * sha1sum (hex) - A sha1sum hash, in hex.
	 * </p>
	 * <b> Status:</b> unstable
	 * <p>
	 * The {@link #sha1} property relates a {@link #Document} to the textual form of 
	 * a SHA1 hash of (some representation of) its contents.
	 * </p>
	 * 
	 * <p class="editorial">
	 * The design for this property is neither complete nor coherent. The {@link #Document} 
	 * class is currently used in a way that allows multiple instances at different URIs to have the 
	 * 'same' contents (and hence hash). If {@link #sha1} is an owl:InverseFunctionalProperty, 
	 * we could deduce that several such documents were the self-same thing. A more careful design is 
	 * needed, which distinguishes documents in a broad sense from byte sequences.
	 * </p>
	 * 
	 * 
	*/
	public static final String sha1 = "http://xmlns.com/foaf/0.1/sha1";
	/**
	 * <p>
	 * based near - A location that something is based near, for some broadly human notion of near.
	 * </p>
	 * <b> Status:</b> testing
	 * <!-- note: is this mis-specified? perhaps range ought to also be SpatialThing, so we
	 *      can have multiple labels on the same point? -->
	 * 
	 * <p>The {@link #based_near} relationship relates two "spatial 
	 * things"
	 * (anything that can <em>be somewhere</em>), the latter typically
	 * described using the geo:lat / geo:long
	 * <a href="http://www.w3.org/2003/01/geo/wgs84_pos#">geo-positioning vocabulary</a>
	 * (See <a href="http://esw.w3.org/topic/GeoInfo">GeoInfo</a> in the W3C semweb
	 * wiki for details). This allows us to say describe the typical latitute and 
	 * longitude of, say, a Person (people are spatial things - they can be 
	 * places) without implying that a precise location has been given.
	 * </p>
	 * 
	 * <p>We do not say much about what 'near' means in this context; it is a
	 * 'rough and ready' concept. For a more precise treatment, see
	 * <a href="http://esw.w3.org/topic/GeoOnion">GeoOnion vocab</a> design
	 * discussions, which are aiming to produce a more sophisticated vocabulary for 
	 * such purposes.
	 * </p>
	 * 
	 * <p> FOAF files often make use of the <code>contact:nearestAirport} property. This
	 * illustrates the distinction between FOAF documents (which may make claims using <em>any</em> RDF
	 * vocabulary) and the core FOAF vocabulary defined by this specification. For further reading on
	 * the use of <code>nearestAirport} see <a 
	 * href="http://wiki.foaf-project.org/w/UsingContactNearestAirport">UsingContactNearestAirport</a> in the 
	 * FOAF wiki.
	 * </p>
	 * 
	*/
	public static final String based_near = "http://xmlns.com/foaf/0.1/based_near";
	/**
	 * <p>
	 * title - Title (Mr, Mrs, Ms, Dr. etc)
	 * </p>
	 * <b> Status:</b> testing
	 * <p class="editorial">
	 * This property is a candidate for deprecation in favour of 'honorificPrefix' following Portable Contacts usage. See the <a href="http://wiki.foaf-project.org/w/IssueTracker">FOAF Issue Tracker</a>.
	 * </p>
	 * 
	 * <p>
	 * The approriate values for {@link #title} are not formally constrained, and will 
	 * vary across community and context. Values such as 'Mr', 'Mrs', 'Ms', 'Dr' etc. are 
	 * expected.
	 * </p>
	 * 
	 * 
	*/
	public static final String title = "http://xmlns.com/foaf/0.1/title";
	/**
	 * <p>
	 * nickname - A short informal nickname characterising an agent (includes login identifiers, IRC and
	 * other chat nicknames).
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #nick} property relates a {@link #Person} to a short (often 
	 * abbreviated) nickname, such as those use in IRC chat, online accounts, and computer 
	 * logins.
	 * </p>
	 * 
	 * <p>
	 * This property is necessarily vague, because it does not indicate any particular naming 
	 * control authority, and so cannot distinguish a person's login from their (possibly 
	 * various) IRC nicknames or other similar identifiers. However it has some utility, since 
	 * many people use the same string (or slight variants) across a variety of such 
	 * environments.
	 * </p>
	 * 
	 * <p>
	 * For specific controlled sets of names (relating primarily to Instant Messanger accounts), 
	 * FOAF provides some convenience properties: {@link #jabberID}, 
	 * {@link #aimChatID}, {@link #msnChatID} and 
	 * {@link #icqChatID}. Beyond this, the problem of representing such accounts is not 
	 * peculiar to Instant Messanging, and it is not scaleable to attempt to enumerate each 
	 * naming database as a distinct FOAF property. The {@link #OnlineAccount} term (and 
	 * supporting vocabulary) are provided as a more verbose and more expressive generalisation 
	 * of these properties.
	 * </p>
	 * 
	*/
	public static final String nick = "http://xmlns.com/foaf/0.1/nick";
	/**
	 * <p>
	 * jabber ID - A jabber ID for something.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #jabberID} property relates a {@link #Agent} to a textual 
	 * identifier assigned to them in the <a href="http://www.jabber.org/">Jabber</a> messaging 
	 * system. 
	 * See the <a href="http://www.jabber.org/">Jabber</a> site for more information about the Jabber 
	 * protocols and tools.
	 * </p>
	 * 
	 * <p>
	 * Jabber, unlike several other online messaging systems, is based on an open, publically 
	 * documented protocol specification, and has a variety of open source implementations. Jabber IDs 
	 * can be assigned to a variety of kinds of thing, including software 'bots', chat rooms etc. For 
	 * the purposes of FOAF, these are all considered to be kinds of {@link #Agent} (ie. 
	 * things that <em>do</em> stuff). The uses of Jabber go beyond simple IM chat applications. The 
	 * {@link #jabberID} property is provided as a basic hook to help support RDF description 
	 * of Jabber users and services.
	 * </p>
	 * 
	 * <p>
	 * See {@link #OnlineChatAccount} (and {@link #OnlineAccount}) for a
	 * more general (and verbose) mechanism for describing IM and chat accounts.
	 * </p>
	 * 
	*/
	public static final String jabberID = "http://xmlns.com/foaf/0.1/jabberID";
	/**
	 * <p>
	 * AIM chat ID - An AIM chat ID
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #aimChatID} property relates a {@link #Agent} to a textual 
	 * identifier ('screenname') assigned to them in the AOL Instant Messanger (AIM) system. 
	 * See AOL's <a href="http://www.aim.com/">AIM</a> site for more details of AIM and AIM 
	 * screennames. The <a href="http://www.apple.com/macosx/what-is-macosx/ichat.html">iChat</a> tools from <a 
	 * href="http://www.apple.com/">Apple</a> also make use of AIM identifiers. 
	 * </p>
	 * 
	 * <p>
	 * See {@link #OnlineChatAccount} (and {@link #OnlineAccount}) for a
	 * more general (and verbose) mechanism for describing IM and chat accounts.
	 * </p>
	 * 
	 * 
	*/
	public static final String aimChatID = "http://xmlns.com/foaf/0.1/aimChatID";
	/**
	 * <p>
	 * Skype ID - A Skype ID
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #skype} property relates a {@link #Agent} to an account name of 
	 * a Skype account of theirs.
	 * </p>
	 * 
	 * <p>
	 * See {@link #OnlineChatAccount} (and {@link #OnlineAccount}) for a
	 * more general (and verbose) mechanism for describing IM and chat accounts.
	 * </p>
	 * 
	 * 
	*/
	public static final String skypeID = "http://xmlns.com/foaf/0.1/skypeID";
	/**
	 * <p>
	 * ICQ chat ID - An ICQ chat ID
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #icqChatID} property relates a {@link #Agent} to a textual 
	 * identifier assigned to them in the ICQ Chat system. 
	 * See the <a href="http://web.icq.com/icqchat/">icq chat</a> site for more details of the 'icq' 
	 * service. Their "<a href="http://www.icq.com/products/whatisicq.html">What is ICQ?</a>" document 
	 * provides a basic overview, while their "<a href="http://company.icq.com/info/">About Us</a> page 
	 * notes that ICQ has been acquired by AOL. Despite the relationship with AOL, ICQ is at 
	 * the time of writing maintained as a separate identity from the AIM brand (see 
	 * {@link #aimChatID}).
	 * </p>
	 * 
	 * <p>
	 * See {@link #OnlineChatAccount} (and {@link #OnlineAccount}) for a
	 * more general (and verbose) mechanism for describing IM and chat accounts.
	 * </p>
	 * 
	*/
	public static final String icqChatID = "http://xmlns.com/foaf/0.1/icqChatID";
	/**
	 * <p>
	 * Yahoo chat ID - A Yahoo chat ID
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #yahooChatID} property relates a {@link #Agent} to a textual 
	 * identifier assigned to them in the Yahoo online Chat system. 
	 * See Yahoo's the <a href="http://chat.yahoo.com/">Yahoo! Chat</a> site for more details of their 
	 * service. Yahoo chat IDs are also used across several other Yahoo services, including email and 
	 * <a href="http://www.yahoogroups.com/">Yahoo! Groups</a>.
	 * </p>
	 * 
	 * <p>
	 * See {@link #OnlineChatAccount} (and {@link #OnlineAccount}) for a
	 * more general (and verbose) mechanism for describing IM and chat accounts.
	 * </p>
	 * 
	 * 
	*/
	public static final String yahooChatID = "http://xmlns.com/foaf/0.1/yahooChatID";
	/**
	 * <p>
	 * MSN chat ID - An MSN chat ID
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #msnChatID} property relates a {@link #Agent} to a textual 
	 * identifier assigned to them in the Microsoft online chat system originally known as 'MSN', and now 
	 * <a href="http://en.wikipedia.org/wiki/Windows_Live_Messenger">Windows Live Messenger</a>.
	 * See the <a href="http://download.live.com/messenger">Microsoft mesenger</a> and <a href="http://en.wikipedia.org/wiki/Windows_Live_ID">Windows Live ID</a> sites for more details.
	 * </p>
	 * 
	 * <p>See {@link #OnlineChatAccount} (and {@link #OnlineAccount}) for a 
	 * more general (and verbose) mechanism for describing IM and chat accounts. 
	 * </p>
	 * 
	*/
	public static final String msnChatID = "http://xmlns.com/foaf/0.1/msnChatID";
	/**
	 * <p>
	 * name - A name for some thing.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>The {@link #name} of something is a simple textual string.</p>
	 * 
	 * <p>
	 * XML language tagging may be used to indicate the language of the name. For example:
	 * </p>
	 * 
	 * <div class="example">
	 * <code>
	 * &lt;foaf:name xml:lang="en"&gt;Dan Brickley&lt;/foaf:name&gt;
	 * }
	 * </div>
	 * 
	 * <p>
	 * FOAF provides some other naming constructs.  While foaf:name does not explicitly represent name substructure (family vs given etc.) it 
	 * does provide a basic level of interoperability. See the <a 
	 * href="http://wiki.foaf-project.org/w/IssueTracker">issue tracker</a> for status of work on this issue.
	 * </p>
	 * 
	 * <p>
	 * The {@link #name} property, like all RDF properties with a range of rdfs:Literal, may be used with XMLLiteral datatyped 
	 * values (multiple {@link #name}s are acceptable whether they are in the same langauge or not). XMLLiteral usage is not yet widely adopted. Feedback on this aspect of the FOAF design is particularly welcomed.
	 * </p>
	 * 
	*/
	public static final String name = "http://xmlns.com/foaf/0.1/name";
	/**
	 * <p>
	 * firstName - The first name of a person.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #firstName} property is provided (alongside {@link #lastName}) as a mechanism to support legacy data that cannot be
	 * easily interpreted in terms of the (otherwise preferred) {@link #familyName} and {@link #givenName} properties. The concepts
	 * of 'first' and 'last' names do not work well across cultural and linguistic boundaries; however they are widely used in addressbooks and databases.
	 * </p>
	 * <p>
	 * See the <a href="http://wiki.foaf-project.org/w/NameVocabIssue">issue tracker</a> for design discussions, status and ongoing work on rationalising the FOAF
	 * naming machinery.
	 * </p>
	 * <p>
	 * There is also a simple {@link #name} property.
	 * </p>
	 * 
	*/
	public static final String firstName = "http://xmlns.com/foaf/0.1/firstName";
	/**
	 * <p>
	 * lastName - The last name of a person.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #lastName} property is provided (alongside {@link #firstName}) as a mechanism to support legacy data that cannot be
	 * easily interpreted in terms of the (otherwise preferred) {@link #familyName} and {@link #givenName} properties. The concepts 
	 * of 'first' and 'last' names do not work well across cultural and linguistic boundaries; however they are widely used in addressbooks and databases.
	 * </p>
	 * <p>
	 * See the <a href="http://wiki.foaf-project.org/w/NameVocabIssue">issue tracker</a> for design discussions, status and ongoing work on rationalising the FOAF 
	 * naming machinery.
	 * </p>
	 * <p>
	 * There is also a simple {@link #name} property.
	 * </p>
	 * 
	*/
	public static final String lastName = "http://xmlns.com/foaf/0.1/lastName";
	/**
	 * <p>
	 * Given name - The given name of some person.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #givenName} property is provided (alongside {@link #familyName}) for use when describing parts of people's names. Although these
	 * concepts do not capture the full range of personal naming styles found world-wide, they are commonly used and have some value. 
	 * </p>
	 * <p>
	 * There is also a simple {@link #name} property.
	 * </p>
	 * 
	 * <p>
	 * Support is also provided for the more archaic and culturally varying terminology of {@link #firstName} and {@link #lastName}.
	 * </p>
	 * 
	 * <p>
	 * See the <a href="http://wiki.foaf-project.org/w/NameVocabIssue">issue tracker</a> for design discussions, status and ongoing work on rationalising the FOAF
	 * naming machinery.
	 * </p>
	 * 
	*/
	public static final String givenName = "http://xmlns.com/foaf/0.1/givenName";
	/**
	 * <p>
	 * familyName - The family name of some person.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #familyName} property is provided (alongside {@link #givenName}) for use when describing parts of people's names. Although these
	 * concepts do not capture the full range of personal naming styles found world-wide, they are commonly used and have some value.
	 * </p>
	 * <p>
	 * There is also a simple {@link #name} property.
	 * </p>
	 * 
	 * <p>
	 * Support is also provided for the more archaic and culturally varying terminology of {@link #firstName} and {@link #lastName}.
	 * </p>
	 * 
	 * <p>
	 * See the <a href="http://wiki.foaf-project.org/w/NameVocabIssue">issue tracker</a> for design discussions, status and ongoing work on rationalising the FOAF
	 * naming machinery.
	 * </p>
	 * 
	*/
	public static final String familyName = "http://xmlns.com/foaf/0.1/familyName";
	/**
	 * <p>
	 * phone - A phone,  specified using fully qualified tel: URI scheme (refs:
	 * http://www.w3.org/Addressing/schemes.html#tel).
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #phone} of something is a phone, typically identified using the tel: URI 
	 * scheme.
	 * </p>
	 * 
	 * 
	*/
	public static final String phone = "http://xmlns.com/foaf/0.1/phone";
	/**
	 * <p>
	 * homepage - A homepage for some thing.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #homepage} property relates something to a homepage about it.
	 * </p>
	 * 
	 * <p>
	 * Many kinds of things have homepages. FOAF allows a thing to have multiple homepages, but 
	 * constrains {@link #homepage} so that there can be only one thing that has any 
	 * particular homepage.
	 * </p>
	 * 
	 * <p>
	 * A 'homepage' in this sense is a public Web document, typically but not necessarily 
	 * available in HTML format. The page has as a {@link #topic} the thing whose 
	 * homepage it is. The homepage is usually controlled, edited or published by the thing whose 
	 * homepage it is; as such one might look to a homepage for information on its owner from its 
	 * owner. This works for people, companies, organisations etc. 
	 * </p>
	 * 
	 * <p>
	 * The {@link #homepage} property is a sub-property of the more general 
	 * {@link #page} property for relating a thing to a page about that thing. See also 
	 * {@link #topic}, the inverse of the {@link #page} property. 
	 * </p>
	 * 
	 * 
	*/
	public static final String homepage = "http://xmlns.com/foaf/0.1/homepage";
	/**
	 * <p>
	 * weblog - A weblog of some thing (whether person, group, company etc.).
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #weblog} property relates a {@link #Agent} to a weblog of 
	 * that agent.
	 * </p>
	 * 
	*/
	public static final String weblog = "http://xmlns.com/foaf/0.1/weblog";
	/**
	 * <p>
	 * openid - An OpenID for an Agent.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * A {@link #openid} is a property of a {@link #Agent} that associates it with a document that can be used as an <a 
	 * href="http://www.w3.org/TR/webarch/#indirect-identification">indirect identifier</a> in the manner of the <a href="http://openid.net/specs/openid-authentication-1_1.html">OpenID</a>
	 *  "Identity URL". As the OpenID 1.1 specification notes, OpenID itself"<em>does not provide any mechanism to 
	 * exchange profile information, though Consumers of an Identity can learn more about an End User from any public, semantically 
	 * interesting documents linked thereunder (FOAF, RSS, Atom, vCARD, etc.)</em>". In this way, FOAF and OpenID complement each other; 
	 * neither provides a stand-alone approach to online "trust", but combined they can address interesting parts of this larger problem 
	 * space.
	 * </p>
	 * 
	 * <p>
	 * The {@link #openid} property is "inverse functional", meaning that anything that is the foaf:openid of something, is the 
	 * {@link #openid} of no more than one thing. FOAF is agnostic as to whether there are (according to the relevant OpenID 
	 * specifications) OpenID URIs that are equally associated with multiple Agents. FOAF offers sub-classes of Agent, ie. 
	 * {@link #Organization} and {@link #Group}, that allow for such scenarios to be consistent with the notion that any 
	 * foaf:openid is the foaf:openid of just one {@link #Agent}.
	 * </p>
	 * 
	 * <p>
	 * FOAF does not mandate any particular URI scheme for use as {@link #openid} values. The OpenID 1.1 specification includes a <a 
	 * href="http://openid.net/specs/openid-authentication-1_1.html#delegating_authentication">delegation model</a> that is often used to 
	 * allow a weblog or homepage document to also serve in OpenID authentication via "link rel" HTML markup. This deployment model provides a 
	 * convenient connection to FOAF, since a similar <a href="http://xmlns.com/foaf/spec/#sec-autodesc">technique</a> is used for FOAF 
	 * autodiscovery in HTML. A single document can, for example, serve both as a homepage and an OpenID identity URL.
	 * </p>
	 * 
	*/
	public static final String openid = "http://xmlns.com/foaf/0.1/openid";
	/**
	 * <p>
	 * tipjar - A tipjar document for this agent, describing means for payment and reward.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #tipjar} property relates an {@link #Agent}
	 * to a {@link #Document} that describes some mechanisms for
	 * paying or otherwise rewarding that agent.
	 * </p>
	 * 
	 * <p>
	 * The {@link #tipjar} property was created following <a
	 * href="http://rdfweb.org/mt/foaflog/archives/2004/02/12/20.07.32/">discussions</a> 
	 * about simple, lightweight mechanisms that could be used to encourage 
	 * rewards and payment for content exchanged online. An agent's
	 * {@link #tipjar} page(s) could describe informal ("Send me a
	 * postcard!", "here's my book, music and movie wishlist") or formal
	 * (machine-readable micropayment information) information about how that
	 * agent can be paid or rewarded. The reward is not associated with any
	 * particular action or content from the agent concerned. A link to 
	 * a service such as <a href="http://www.paypal.com/">PayPal</a> is the
	 * sort of thing we might expect to find in a tipjar document.
	 * </p>
	 * 
	 * <p>
	 * Note that the value of a {@link #tipjar} property is just a
	 * document (which can include anchors into HTML pages). We expect, but 
	 * do not currently specify, that this will evolve into a hook
	 * for finding more machine-readable information to support payments,
	 * rewards. The {@link #OnlineAccount} machinery is also relevant,
	 * although the information requirements for automating payments are not 
	 * currently clear.
	 * </p>
	 * 
	 * 
	*/
	public static final String tipjar = "http://xmlns.com/foaf/0.1/tipjar";
	/**
	 * <p>
	 * plan - A .plan comment, in the tradition of finger and '.plan' files.
	 * </p>
	 * <b> Status:</b> testing
	 * <!-- orig contrib'd by Cardinal -->
	 * 
	 * <p>The {@link #plan} property provides a space for a
	 * {@link #Person} to hold some arbitrary content that would appear in
	 * a traditional '.plan' file.  The plan file was stored in a user's home
	 * directory on a UNIX machine, and displayed to people when the user was
	 * queried with the finger utility.</p>
	 * 
	 * <p>A plan file could contain anything.  Typical uses included brief
	 * comments, thoughts, or remarks on what a person had been doing lately.  Plan
	 * files were also prone to being witty or simply osbscure.  Others may be more
	 * creative, writing any number of seemingly random compositions in their plan
	 * file for people to stumble upon.</p>
	 * 
	 * <p>
	 * See <a href="http://www.rajivshah.com/Case_Studies/Finger/Finger.htm">History of the 
	 * Finger Protocol</a> by Rajiv Shah for more on this piece of Internet history. The 
	 * {@link #geekcode} property may also be of interest.
	 * </p>
	 * 
	*/
	public static final String plan = "http://xmlns.com/foaf/0.1/plan";
	/**
	 * <p>
	 * made - Something that was made by this agent.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #made} property relates a {@link #Agent} 
	 * to something {@link #made} by it. As such it is an 
	 * inverse of the {@link #maker} property, which relates a thing to 
	 * something that made it. See {@link #made} for more details on the 
	 * relationship between these FOAF terms and related Dublin Core vocabulary.
	 * </p>
	 * 
	 * 
	*/
	public static final String made = "http://xmlns.com/foaf/0.1/made";
	/**
	 * <p>
	 * maker - An agent that  made this thing.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #maker} property relates something to a  
	 * {@link #Agent} that {@link #made} it. As such it is an 
	 * inverse of the {@link #made} property.
	 * </p>
	 * 
	 * <p>
	 * The {@link #name} (or other <code>rdfs:label}) of the 
	 * {@link #maker} of something can be described as the 
	 * <code>dc:creator} of that thing.</p>
	 * 
	 * <p>
	 * For example, if the thing named by the URI 
	 * http://danbri.org/ has a 
	 * {@link #maker} that is a {@link #Person} whose 
	 * {@link #name} is 'Dan Brickley', we can conclude that 
	 * http://danbri.org/ has a <code>dc:creator} of 'Dan 
	 * Brickley'. 
	 * </p>
	 * 
	 * <p>
	 * FOAF descriptions are encouraged to use <code>dc:creator} only for 
	 * simple textual names, and to use {@link #maker} to indicate 
	 * creators, rather than risk confusing creators with their names. This 
	 * follows most Dublin Core usage. See <a 
	 * href="http://wiki.foaf-project.org/w/UsingDublinCoreCreator">UsingDublinCoreCreator</a> 
	 * for details.
	 * </p>
	 * 
	*/
	public static final String maker = "http://xmlns.com/foaf/0.1/maker";
	/**
	 * <p>
	 * image - An image that can be used to represent some thing (ie. those depictions which are
	 * particularly representative of something, eg. one's photo on a homepage).
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #img} property relates a {@link #Person} to a 
	 * {@link #Image} that represents them. Unlike its super-property 
	 * {@link #depiction}, we only use {@link #img} when an image is 
	 * particularly representative of some person. The analogy is with the image(s) that might 
	 * appear on someone's homepage, rather than happen to appear somewhere in their photo album.
	 * </p>
	 * 
	 * <p>
	 * Unlike the more general {@link #depiction} property (and its inverse, 
	 * {@link #depicts}), the {@link #img} property is only used with 
	 * representations of people (ie. instances of {@link #Person}). So you can't use 
	 * it to find pictures of cats, dogs etc. The basic idea is to have a term whose use is more 
	 * restricted than {@link #depiction} so we can have a useful way of picking out a 
	 * reasonable image to represent someone. FOAF defines {@link #img} as a 
	 * sub-property of {@link #depiction}, which means that the latter relationship is 
	 * implied whenever two things are related by the former.
	 * </p>
	 * 
	 * <p>
	 * Note that {@link #img} does not have any restrictions on the dimensions, colour 
	 * depth, format etc of the {@link #Image} it references. 
	 * </p>
	 * 
	 * <p>
	 * Terminology: note that {@link #img} is a property (ie. relationship), and that 
	 * <code>code:Image} is a similarly named class (ie. category, a type of thing). It 
	 * might have been more helpful to call {@link #img} 'mugshot' or similar; instead 
	 * it is named by analogy to the HTML IMG element.
	 * </p> 
	 * 
	*/
	public static final String img = "http://xmlns.com/foaf/0.1/img";
	/**
	 * <p>
	 * depiction - A depiction of some thing.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #depiction} property is a relationship between a thing and an 
	 * {@link #Image} that depicts it. As such it is an inverse of the
	 * {@link #depicts} relationship. 
	 * </p>
	 * 
	 * <p>
	 * A common use of {@link #depiction} (and {@link #depicts}) is to indicate 
	 * the contents of a digital image, for example the people or objects represented in an 
	 * online photo gallery. 
	 * </p>
	 * 
	 * <p>
	 * Extensions to this basic idea include '<a 
	 * href="http://rdfweb.org/2002/01/photo/">Co-Depiction</a>' (social networks as evidenced in 
	 * photos), as well as richer photo metadata through the mechanism  of using SVG paths to 
	 * indicate the <em>regions</em> of an image which depict some particular thing. See <a 
	 * href="http://www.jibbering.com/svg/AnnotateImage.html">'Annotating Images With SVG'</a> 
	 * for tools and details.
	 * </p>
	 * 
	 * <p>
	 * The basic notion of 'depiction' could also be extended to deal with multimedia content 
	 * (video clips, audio), or refined to deal with corner cases, such as pictures of pictures etc.
	 * </p>
	 * 
	 * <p>
	 * The {@link #depiction} property is a super-property of the more specific property 
	 * {@link #img}, which is used more sparingly. You stand in a 
	 * {@link #depiction} relation to <em>any</em> {@link #Image} that depicts 
	 * you, whereas {@link #img} is typically used to indicate a few images that are 
	 * particularly representative.
	 * </p>
	 * 
	*/
	public static final String depiction = "http://xmlns.com/foaf/0.1/depiction";
	/**
	 * <p>
	 * depicts - A thing depicted in this representation.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #depicts} property is a relationship between a {@link #Image} 
	 * and something that the image depicts. As such it is an inverse of the 
	 * {@link #depiction} relationship. See {@link #depiction} for further notes.
	 * </p>
	 * 
	 * 
	 * 
	*/
	public static final String depicts = "http://xmlns.com/foaf/0.1/depicts";
	/**
	 * <p>
	 * thumbnail - A derived thumbnail image.
	 * </p>
	 * <b> Status:</b> testing
	 * <!-- originally contrib'd by Cardinal; rejiggged a bit by danbri -->
	 * 
	 * <p>
	 * The {@link #thumbnail} property is a relationship between a 
	 * full-size {@link #Image} and a smaller, representative {@link #Image} 
	 * that has been derrived from it. 
	 * </p>
	 * 
	 * <p>
	 * It is typical in FOAF to express {@link #img} and {@link #depiction} 
	 * relationships in terms of the larger, 'main' (in some sense) image, rather than its thumbnail(s). 
	 * A {@link #thumbnail} might be clipped or otherwise reduced such that it does not 
	 * depict everything that the full image depicts. Therefore FOAF does not specify that a 
	 * thumbnail {@link #depicts} everything that the image it is derrived from depicts.
	 * However, FOAF does expect that anything depicted in the thumbnail will also be depicted in 
	 * the source image.
	 * </p>
	 * 
	 * <!-- todo: add RDF rules here showing this -->
	 * 
	 * <p>
	 * A {@link #thumbnail} is typically small enough that it can be
	 * loaded and viewed quickly before a viewer decides to download the larger
	 * version. They are often used in online photo gallery applications.
	 * </p>
	 * 
	 * 
	*/
	public static final String thumbnail = "http://xmlns.com/foaf/0.1/thumbnail";
	/**
	 * <p>
	 * myersBriggs - A Myers Briggs (MBTI) personality classification.
	 * </p>
	 * <b> Status:</b> testing
	 * <!-- todo: expand acronym -->
	 * 
	 * <p>
	 * The {@link #myersBriggs} property represents the Myers Briggs (MBTI) approach to 
	 * personality taxonomy. It is included in FOAF as an example of a property 
	 * that takes certain constrained values, and to give some additional detail to the FOAF 
	 * files of those who choose to include it. The {@link #myersBriggs} property applies only to the 
	 * {@link #Person} class; wherever you see it, you can infer it is being applied to 
	 * a person.
	 * </p>
	 * 
	 * <p>
	 * The {@link #myersBriggs} property is interesting in that it illustrates how 
	 * FOAF can serve as a carrier for various kinds of information, without necessarily being 
	 * commited to any associated worldview. Not everyone will find myersBriggs (or star signs, 
	 * or blood types, or the four humours) a useful perspective on human behaviour and 
	 * personality. The inclusion of a Myers Briggs property doesn't indicate that FOAF endorses 
	 * the underlying theory, any more than the existence of {@link #weblog} is an 
	 * endorsement of soapboxes.
	 * </p>
	 * 
	 * <p>
	 * The values for {@link #myersBriggs} are the following 16 4-letter textual codes: 
	 * ESTJ, INFP, ESFP, INTJ, ESFJ, INTP, ENFP, ISTJ, ESTP, INFJ, ENFJ, ISTP, ENTJ, ISFP, 
	 * ENTP, ISFJ. If multiple of these properties are applicable, they are represented by 
	 * applying multiple properties to a person.
	 * </p>
	 * 
	 * <p>
	 * For further reading on MBTI, see various online sources (eg. <a 
	 * href="http://www.teamtechnology.co.uk/tt/t-articl/mb-simpl.htm">this article</a>). There 
	 * are various online sites which offer quiz-based tools for determining a person's MBTI 
	 * classification. The owners of the MBTI trademark have probably not approved of these.
	 * </p>
	 * 
	 * <p>
	 * This FOAF property suggests some interesting uses, some of which could perhaps be used to 
	 * test the claims made by proponents of the MBTI (eg. an analysis of weblog postings 
	 * filtered by MBTI type). However it should be noted that MBTI FOAF descriptions are 
	 * self-selecting; MBTI categories may not be uniformly appealing to the people they 
	 * describe. Further, there is probably a degree of cultural specificity implicit in the 
	 * assumptions made by many questionaire-based MBTI tools; the MBTI system may not make 
	 * sense in cultural settings beyond those it was created for. 
	 * </p>
	 * 
	 * <p>
	 * See also <a href="http://webspace.webring.com/people/cl/lifexplore/mbintro.htm">Cory Caplinger's summary table</a> or the RDFWeb article, <a 
	 * href="http://web.archive.org/web/20080802184922/http://rdfweb.org/mt/foaflog/archives/000004.html">FOAF Myers Briggs addition</a> 
	 * for further background and examples.
	 * </p>
	 * 
	 * <p>
	 * Note: Myers Briggs Type Indicator and MBTI are registered trademarks of Consulting 
	 * Psychologists Press Inc. Oxford Psycholgists Press Ltd has exclusive rights to the 
	 * trademark in the UK. 
	 * </p>
	 * 
	*/
	public static final String myersBriggs = "http://xmlns.com/foaf/0.1/myersBriggs";
	/**
	 * <p>
	 * workplace homepage - A workplace homepage of some person; the homepage of an organization they work
	 * for.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #workplaceHomepage} of a {@link #Person} is a 
	 * {@link #Document} that is the {@link #homepage} of a 
	 * {@link #Organization} that they work for.
	 * </p>
	 * 
	 * <p>
	 * By directly relating people to the homepages of their workplace, we have a simple convention 
	 * that takes advantage of a set of widely known identifiers, while taking care not to confuse the 
	 * things those identifiers identify (ie. organizational homepages) with the actual organizations 
	 * those homepages describe.
	 * </p>
	 * 
	 * <div class="example">
	 * <p>
	 * For example, Dan Brickley works at W3C. Dan is a {@link #Person} with a 
	 * {@link #homepage} of http://danbri.org/; W3C is a 
	 * {@link #Organization} with a {@link #homepage} of http://www.w3.org/. This 
	 * allows us to say that Dan has a {@link #workplaceHomepage} of http://www.w3.org/.
	 * </p>
	 * 
	 * <pre>
	 * &lt;foaf:Person&gt;
	 *  &lt;foaf:name>Dan Brickley&lt;/foaf:name&gt;
	 *  &lt;foaf:workplaceHomepage rdf:resource="http://www.w3.org/"/&gt;
	 * &lt;/foaf:Person&gt;
	 * </pre>
	 * </div>
	 * 
	 * 
	 * <p>
	 * Note that several other FOAF properties work this way; 
	 * {@link #schoolHomepage} is the most similar. In general, FOAF often indirectly 
	 * identifies things via Web page identifiers where possible, since these identifiers are widely 
	 * used and known. FOAF does not currently have a term for the name of the relation (eg. 
	 * "workplace") that holds 
	 * between a {@link #Person} and an {@link #Organization} that they work for.
	 * </p>
	 * 
	 * 
	*/
	public static final String workplaceHomepage = "http://xmlns.com/foaf/0.1/workplaceHomepage";
	/**
	 * <p>
	 * work info homepage - A work info homepage of some person; a page about their work for some
	 * organization.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #workInfoHomepage} of a {@link #Person} is a 
	 * {@link #Document} that describes their work. It is generally (but not necessarily) a 
	 * different document from their {@link #homepage}, and from any 
	 * {@link #workplaceHomepage}(s) they may have. 
	 * </p>
	 * 
	 * <p>
	 * The purpose of this property is to distinguish those pages you often see, which describe 
	 * someone's professional role within an organisation or project. These aren't really homepages, 
	 * although they share some characterstics.
	 * </p>
	 * 
	 * 
	*/
	public static final String workInfoHomepage = "http://xmlns.com/foaf/0.1/workInfoHomepage";
	/**
	 * <p>
	 * schoolHomepage - A homepage of a school attended by the person.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The <code>schoolHomepage} property relates a {@link #Person} to a 
	 * {@link #Document} that is the {@link #homepage} of a School that the 
	 * person attended.
	 * </p>
	 * 
	 * <p>
	 * FOAF does not (currently) define a class for 'School' (if it did, it would probably be as 
	 * a sub-class of {@link #Organization}). The original application area for 
	 * {@link #schoolHomepage} was for 'schools' in the British-English sense; however 
	 * American-English usage has dominated, and it is now perfectly reasonable to describe 
	 * Universities, Colleges and post-graduate study using {@link #schoolHomepage}.
	 * </p>
	 * 
	 * <p>
	 * This very basic facility provides a basis for a low-cost, decentralised approach to 
	 * classmate-reunion and suchlike. Instead of requiring a central database, we can use FOAF 
	 * to express claims such as 'I studied <em>here</em>' simply by mentioning a 
	 * school's homepage within FOAF files. Given the homepage of a school, it is easy for 
	 * FOAF aggregators to lookup this property in search of people who attended that school.
	 * </p>
	 * 
	*/
	public static final String schoolHomepage = "http://xmlns.com/foaf/0.1/schoolHomepage";
	/**
	 * <p>
	 * knows - A person known by this person (indicating some level of reciprocated interaction between the
	 * parties).
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #knows} property relates a {@link #Person} to another 
	 * {@link #Person} that he or she knows. 
	 * </p>
	 * 
	 * <p>
	 * We take a broad view of 'knows', but do require some form of reciprocated interaction (ie. 
	 * stalkers need not apply). Since social attitudes and conventions on this topic vary 
	 * greatly between communities, counties and cultures, it is not appropriate for FOAF to be 
	 * overly-specific here. 
	 * </p>
	 * 
	 * <p>
	 * If someone {@link #knows} a person, it would be usual for 
	 * the relation to be reciprocated. However this doesn't mean that there is any obligation 
	 * for either party to publish FOAF describing this relationship. A {@link #knows} 
	 * relationship does not imply friendship, endorsement, or that a face-to-face meeting 
	 * has taken place: phone, fax, email, and smoke signals are all perfectly 
	 * acceptable ways of communicating with people you know. 
	 * </p>
	 * <p>
	 * You probably know hundreds of people, yet might only list a few in your public FOAF file. 
	 * That's OK. Or you might list them all. It is perfectly fine to have a FOAF file and not 
	 * list anyone else in it at all. 
	 * This illustrates the Semantic Web principle of partial description: RDF documents 
	 * rarely describe the entire picture. There is always more to be said, more information 
	 * living elsewhere in the Web (or in our heads...).
	 * </p>
	 * 
	 * <p>
	 * Since {@link #knows} is vague by design, it may be suprising that it has uses. 
	 * Typically these involve combining other RDF properties. For example, an application might 
	 * look at properties of each {@link #weblog} that was {@link #made} by 
	 * someone you "{@link #knows}". Or check the newsfeed of the online photo archive 
	 * for each of these people, to show you recent photos taken by people you know.
	 * </p>
	 * 
	 * <p>
	 * To provide additional levels of representation beyond mere 'knows', FOAF applications 
	 * can do several things. 
	 * </p>
	 * <p>
	 * They can use more precise relationships than {@link #knows} to relate people to 
	 * people. The original FOAF design included two of these ('knowsWell','friend') which we 
	 * removed because they were somewhat <em>awkward</em> to actually use, bringing an 
	 * inappopriate air of precision to an intrinsically vague concept. Other extensions have 
	 * been proposed, including Eric Vitiello's <a 
	 * href="http://www.perceive.net/schemas/20021119/relationship/">Relationship module</a> for 
	 * FOAF.
	 * </p>
	 * 
	 * <p>
	 * In addition to using more specialised inter-personal relationship types 
	 * (eg rel:acquaintanceOf etc) it is often just as good to use RDF descriptions of the states 
	 * of affairs which imply particular kinds of relationship. So for example, two people who 
	 * have the same value for their {@link #workplaceHomepage} property are 
	 * typically colleagues. We don't (currently) clutter FOAF up with these extra relationships, 
	 * but the facts can be written in FOAF nevertheless. Similarly, if there exists a 
	 * {@link #Document} that has two people listed as its {@link #maker}s, 
	 * then they are probably collaborators of some kind. Or if two people appear in 100s of 
	 * digital photos together, there's a good chance they're friends and/or colleagues.
	 * </p>
	 * 
	 * <p>
	 * So FOAF is quite pluralistic in its approach to representing relationships between people. 
	 * FOAF is built on top of a general purpose machine language for representing relationships 
	 * (ie. RDF), so is quite capable of representing any kinds of relationship we care to add. 
	 * The problems are generally social rather than technical; deciding on appropriate ways of 
	 * describing these interconnections is a subtle art.
	 * </p>
	 * 
	 * <p>
	 * Perhaps the most important use of {@link #knows} is, alongside the 
	 * <code>rdfs:seeAlso} property, to connect FOAF files together. Taken alone, a FOAF 
	 * file is somewhat dull. But linked in with 1000s of other FOAF files it becomes more 
	 * interesting, with each FOAF file saying a little more about people, places, documents, things... 
	 * By mentioning other people (via {@link #knows} or other relationships), and by 
	 * providing an <code>rdfs:seeAlso} link to their FOAF file, you can make it easy for 
	 * FOAF indexing tools ('<a href="http://wiki.foaf-project.org/w/ScutterSpec">scutters</a>') to find 
	 * your FOAF and the FOAF of the people you've mentioned. And the FOAF of the people they 
	 * mention, and so on. This makes it possible to build FOAF aggregators without the need for 
	 * a centrally managed directory of FOAF files...
	 * </p>
	 * 
	 * 
	*/
	public static final String knows = "http://xmlns.com/foaf/0.1/knows";
	/**
	 * <p>
	 * interest - A page about a topic of interest to this person.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #interest} property represents an interest of a 
	 * {@link #Agent}, through 
	 * indicating a {@link #Document} whose {@link #topic}(s) broadly 
	 * characterises that interest.</p>
	 * 
	 * <p class="example">
	 * For example, we might claim that a person or group has an interest in RDF by saying they
	 * stand in a {@link #interest} relationship to the <a 
	 * href="http://www.w3.org/RDF/">RDF</a> home page. Loosly, such RDF would be saying 
	 * <em>"this agent is interested in the topic of this page"</em>.
	 * </p>
	 * 
	 * <p class="example">
	 * Uses of {@link #interest} include a variety of filtering and resource discovery 
	 * applications. It could be used, for example, to help find answers to questions such as 
	 * "Find me members of this organisation with an interest in XML who have also contributed to 
	 * <a href="http://www.cpan.org/">CPAN</a>)". 
	 * </p>
	 * 
	 * <p>
	 * This approach to characterising interests is intended to compliment other mechanisms (such 
	 * as the use of controlled vocabulary). It allows us to use a widely known set of unique 
	 * identifiers (Web page URIs) with minimal pre-coordination. Since URIs have a controlled 
	 * syntax, this makes data merging much easier than the use of free-text characterisations of 
	 * interest.
	 * </p>
	 * 
	 * 
	 * <p>
	 * Note that interest does not imply expertise, and that this FOAF term provides no support 
	 * for characterising levels of interest: passing fads and lifelong quests are both examples 
	 * of someone's {@link #interest}. Describing interests in full is a complex 
	 * undertaking; {@link #interest} provides one basic component of FOAF's approach to 
	 * these problems.
	 * </p>
	 * 
	*/
	public static final String interest = "http://xmlns.com/foaf/0.1/interest";
	/**
	 * <p>
	 * topic_interest - A thing of interest to this person.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #topic_interest} property links a {@link #Agent} to a thing that they're interested in. 
	 * Unlike {@link #topic} it is not indirected through a document, but links the thing directly.
	 * </p>
	 * 
	*/
	public static final String topic_interest = "http://xmlns.com/foaf/0.1/topic_interest";
	/**
	 * <p>
	 * publications - A link to the publications of this person.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #publications} property indicates a {@link #Document}
	 * listing (primarily in human-readable form) some publications associated with the  
	 * {@link #Person}. Such documents are typically published alongside one's 
	 * {@link #homepage}.
	 * </p>
	 * 
	*/
	public static final String publications = "http://xmlns.com/foaf/0.1/publications";
	/**
	 * <p>
	 * current project - A current project this person works on.
	 * </p>
	 * <b> Status:</b> testing
	 * <!-- originally contrib'd by Cardinal -->
	 * 
	 * <p>A {@link #currentProject} relates a {@link #Person}
	 * to a {@link #Document} indicating some collaborative or
	 * individual undertaking.  This relationship
	 * indicates that the {@link #Person} has some active role in the
	 * project, such as development, coordination, or support.</p>
	 * 
	 * <p>When a {@link #Person} is no longer involved with a project, or
	 * perhaps is inactive for some time, the relationship becomes a
	 * {@link #pastProject}.</p>
	 * 
	 * <p>
	 * If the {@link #Person} has stopped working on a project because it
	 * has been completed (successfully or otherwise), {@link #pastProject} is
	 * applicable. In general, {@link #currentProject} is used to indicate
	 * someone's current efforts (and implied interests, concerns etc.), while
	 * {@link #pastProject} describes what they've previously been doing.
	 * </p>
	 * 
	 * <!-- 
	 * <p>Generally speaking, anything that a {@link #Person} has
	 * {@link #made} could also qualify as a
	 * {@link #currentProject} or {@link #pastProject}.</p>
	 * -->
	 * 
	 * <p class="editorial">
	 * Note that this property requires further work. There has been confusion about 
	 * whether it points to a thing (eg. something you've made; a homepage for a project, 
	 * ie. a {@link #Document} or to instances of the class {@link #Project}, 
	 * which might themselves have a {@link #homepage}. In practice, it seems to have been 
	 * used in a similar way to {@link #interest}, referencing homepages of ongoing projects.
	 * </p>
	 * 
	*/
	public static final String currentProject = "http://xmlns.com/foaf/0.1/currentProject";
	/**
	 * <p>
	 * past project - A project this person has previously worked on.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>After a {@link #Person} is no longer involved with a
	 * {@link #currentProject}, or has been inactive for some time, a
	 * {@link #pastProject} relationship can be used. This indicates that
	 * the {@link #Person} was involved with the described project at one
	 * point. 
	 * </p>
	 * 
	 * <p>
	 * If the {@link #Person} has stopped working on a project because it 
	 * has been completed (successfully or otherwise), {@link #pastProject} is 
	 * applicable. In general, {@link #currentProject} is used to indicate 
	 * someone's current efforts (and implied interests, concerns etc.), while 
	 * {@link #pastProject} describes what they've previously been doing.
	 * </p>
	 * 
	 * 
	*/
	public static final String pastProject = "http://xmlns.com/foaf/0.1/pastProject";
	/**
	 * <p>
	 * logo - A logo representing some thing.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #logo} property is used to indicate a graphical logo of some kind. 
	 * <em>It is probably underspecified...</em>
	 * </p>
	 * 
	*/
	public static final String logo = "http://xmlns.com/foaf/0.1/logo";
	/**
	 * <p>
	 * topic - A topic of some page or document.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #topic} property relates a document to a thing that the document is 
	 * about.
	 * </p>
	 * 
	 * <p>
	 * As such it is an inverse of the {@link #page} property, which relates a thing to 
	 * a document about that thing.
	 * </p>
	 * 
	*/
	public static final String topic = "http://xmlns.com/foaf/0.1/topic";
	/**
	 * <p>
	 * primary topic - The primary topic of some page or document.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #primaryTopic} property relates a document to the
	 * main thing that the document is about.
	 * </p>
	 * 
	 * <p>
	 * The {@link #primaryTopic} property is <em>functional</em>: for
	 * any document it applies to, it can have at most one value. This is
	 * useful, as it allows for data merging. In many cases it may be difficult
	 * for third parties to determine the primary topic of a document, but in
	 * a useful number of cases (eg. descriptions of movies, restaurants,
	 * politicians, ...) it should be reasonably obvious. Documents are very
	 * often the most authoritative source of information about their own
	 * primary topics, although this cannot be guaranteed since documents cannot be
	 * assumed to be accurate, honest etc.
	 * </p>
	 * 
	 * <p>
	 * It is an inverse of the {@link #isPrimaryTopicOf} property, which relates a 
	 * thing to  a document <em>primarily</em> about that thing. The choice between these two 
	 * properties is purely pragmatic. When describing documents, we 
	 * use {@link #primaryTopic} former to point to the things they're about. When 
	 * describing things (people etc.), it is useful to be able to directly cite documents which 
	 * have those things as their main topic - so we use {@link #isPrimaryTopicOf}. In this 
	 * way, Web sites such as <a href="http://www.wikipedia.org/">Wikipedia</a> or <a 
	 * href="http://www.nndb.com/">NNDB</a> can provide indirect identification for the things they 
	 * have descriptions of.
	 * </p>
	 * 
	 * 
	 * 
	*/
	public static final String primaryTopic = "http://xmlns.com/foaf/0.1/primaryTopic";
	/**
	 * <p>
	 * focus - The underlying or 'focal' entity associated with some SKOS-described concept.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #focus} property relates a conceptualisation of something to the thing itself.
	 * Specifically, it is designed for use with W3C's <a href="http://www.w3.org/2004/02/skos/">SKOS</a> 
	 * vocabulary, to help indicate specific individual things (typically people, places, artifacts) 
	 * that are mentioned in different SKOS schemes (eg. thesauri).
	 * </p>
	 * 
	 * <p>
	 * W3C SKOS is based around collections of linked 'concepts', which indicate topics, subject areas and categories. 
	 * <a href="http://www.w3.org/TR/2005/WD-swbp-skos-core-guide-20050510/#secmodellingrdf">In SKOS</a>,
	 * properties of a skos:Concept are properties of the conceptualization (see <a href="http://www.w3.org/TR/2005/WD-swbp-skos-core-guide-20051102/#secopen">2005 discussion</a> for details); 
	 * for example administrative and record-keeping metadata. Two schemes might have an entry for the same individual; the foaf:focus property
	 * can be used to indicate the thing in they world that they both focus on. Many SKOS concepts don't work this way; 
	 * broad topical areas and subject categories don't typically correspond to some particular entity. However, in cases
	 * when they do, it is useful to link both subject-oriented and thing-oriented information via foaf:focus.
	 * </p>
	 * 
	 * <p>
	 * FOAF's focus property works alongside its other topic-oriented constructs: {@link #topic}, {@link #primaryTopic} 
	 * are used when talking about the topical emphasis of a document. The notion of {@link #primaryTopic} 
	 * is particularly important in FOAF as it provides an indirect mechanism for identifying things indirectly. A
	 * similar approach is explored by the <a href="http://larry.masinter.net/duri.html">TDB URI scheme</a>. FOAF includes topic-oriented 
	 * functionality to address its <a href="http://www.foaf-project.org/original-intro">original goals</a> of linking people to information,
	 * as well as to other people, through the use of linked information.
	 * </p>
	 * 
	*/
	public static final String focus = "http://xmlns.com/foaf/0.1/focus";
	/**
	 * <p>
	 * is primary topic of - A document that this thing is the primary topic of.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #isPrimaryTopicOf} property relates something to a document that is 
	 * mainly about it.
	 * </p>
	 * 
	 * 
	 * <p>
	 * The {@link #isPrimaryTopicOf} property is <em>inverse functional</em>: for
	 * any document that is the value of this property, there is at most one thing in the world
	 * that is the primary topic of that document. This is useful, as it allows for data 
	 * merging, as described in the documentation for its inverse, {@link #primaryTopic}.
	 * </p>
	 * 
	 * <p>
	 * {@link #page} is a super-property of {@link #isPrimaryTopicOf}. The change 
	 * of terminology between the two property names reflects the utility of 'primaryTopic' and its 
	 * inverse when identifying things. Anything that has an <code>isPrimaryTopicOf} relation 
	 * to some document X, also has a {@link #page} relationship to it.
	 * </p>
	 * <p>
	 * Note that {@link #homepage}, is a sub-property of both {@link #page} and 
	 * {@link #isPrimaryTopicOf}. The awkwardly named 
	 * {@link #isPrimaryTopicOf} is less specific, and can be used with any document 
	 * that is primarily about the thing of interest (ie. not just on homepages).
	 * </p>
	 * 
	*/
	public static final String isPrimaryTopicOf = "http://xmlns.com/foaf/0.1/isPrimaryTopicOf";
	/**
	 * <p>
	 * page - A page or document about this thing.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #page} property relates a thing to a document about that thing.
	 * </p>
	 * 
	 * <p>
	 * As such it is an inverse of the {@link #topic} property, which relates a document 
	 * to a thing that the document is about.
	 * </p>
	 * 
	*/
	public static final String page = "http://xmlns.com/foaf/0.1/page";
	/**
	 * <p>
	 * account - Indicates an account held by this agent.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #account} property relates a {@link #Agent} to an 
	 * {@link #OnlineAccount} for which they are the sole account holder. See 
	 * {@link #OnlineAccount} for usage details.
	 * </p>
	 * 
	 * 
	*/
	public static final String account = "http://xmlns.com/foaf/0.1/account";
	/**
	 * <p>
	 * account service homepage - Indicates a homepage of the service provide for this online account.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #accountServiceHomepage} property indicates a relationship between a 
	 * {@link #OnlineAccount} and the homepage of the supporting service provider.
	 * </p>
	 * 
	*/
	public static final String accountServiceHomepage = "http://xmlns.com/foaf/0.1/accountServiceHomepage";
	/**
	 * <p>
	 * account name - Indicates the name (identifier) associated with this online account.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #accountName} property of a {@link #OnlineAccount} is a 
	 * textual representation of the account name (unique ID) associated with that account.
	 * </p>
	 * 
	 * 
	*/
	public static final String accountName = "http://xmlns.com/foaf/0.1/accountName";
	/**
	 * <p>
	 * member - Indicates a member of a Group
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #member} property relates a {@link #Group} to a 
	 * {@link #Agent} that is a member of that group.
	 * </p>
	 * 
	 * <p>
	 * See {@link #Group} for details and examples.
	 * </p>
	 * 
	*/
	public static final String member = "http://xmlns.com/foaf/0.1/member";
	/**
	 * <p>
	 * membershipClass - Indicates the class of individuals that are a member of a Group
	 * </p>
	 * <b> Status:</b> unstable
	 * <p>
	 * The {@link #membershipClass} property relates a {@link #Group} to an RDF 
	 * class representing a sub-class of {@link #Agent} whose instances are all the 
	 * agents that are a {@link #member} of the {@link #Group}.
	 * </p>
	 * 
	 * <p>
	 * See {@link #Group} for details and examples.
	 * </p>
	 * 
	*/
	public static final String membershipClass = "http://xmlns.com/foaf/0.1/membershipClass";
	/**
	 * <p>
	 * birthday - The birthday of this Agent, represented in mm-dd string form, eg. '12-31'.
	 * </p>
	 * <b> Status:</b> unstable
	 * <p>
	 * The {@link #birthday} property is a relationship between a {@link #Agent} 
	 * and a string representing the month and day in which they were born (Gregorian calendar).
	 * See <a href="http://wiki.foaf-project.org/w/BirthdayIssue">BirthdayIssue</a> for details of related properties that can 
	 * be used to describe such things in more flexible ways.
	 * </p>
	 * 
	 * <p>
	 * See also {@link #age}.
	 * </p>
	 * 
	*/
	public static final String birthday = "http://xmlns.com/foaf/0.1/birthday";
	/**
	 * <p>
	 * age - The age in years of some agent.
	 * </p>
	 * <b> Status:</b> unstable
	 * <p>
	 * The {@link #age} property is a relationship between a {@link #Agent} 
	 * and an integer string representing their age in years. See also {@link #birthday}. 
	 * </p>
	 * 
	 * 
	 * 
	*/
	public static final String age = "http://xmlns.com/foaf/0.1/age";
	/**
	 * <p>
	 * status - A string expressing what the user is happy for the general public (normally) to know about
	 * their current activity.
	 * </p>
	 * <b> Status:</b> unstable
	 * <p>
	 * {@link #status} is a short textual string expressing what the user is happy
	 * for the general public (normally) to know about their current activity. mood, location, etc.
	 * </p>
	 * 
	 * 
	*/
	public static final String status = "http://xmlns.com/foaf/0.1/status";
	/**
	 * <p>
	 * Person - A person.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #Person} class represents people. Something is a 
	 * {@link #Person} if it is a person. We don't nitpic about whether they're 
	 * alive, dead, real, or imaginary. The {@link #Person} class is a sub-class of the 
	 * {@link #Agent} class, since all people are considered 'agents' in FOAF. 
	 * </p>
	 * 
	 * 
	*/
	public static final String Person = "http://xmlns.com/foaf/0.1/Person";
	/**
	 * <p>
	 * Document - A document.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #Document} class represents those things which are, broadly conceived, 
	 * 'documents'.
	 * </p>
	 * 
	 * <p>
	 * The {@link #Image} class is a sub-class of {@link #Document}, since all images 
	 * are documents.
	 * </p>
	 * 
	 * <p class="editorial">
	 * We do not (currently) distinguish precisely between physical and electronic documents, or 
	 * between copies of a work and the abstraction those copies embody. The relationship between 
	 * documents and their byte-stream representation needs clarification (see {@link #sha1} 
	 * for related issues).
	 * </p>
	 * 
	 * 
	*/
	public static final String Document = "http://xmlns.com/foaf/0.1/Document";
	/**
	 * <p>
	 * Organization - An organization.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #Organization} class represents a kind of {@link #Agent} 
	 * corresponding to social instititutions such as companies, societies etc.
	 * </p>
	 * 
	 * <p class="editorial">
	 * This is a more 'solid' class than {@link #Group}, which allows 
	 * for more ad-hoc collections of individuals. These terms, like the corresponding
	 * natural language concepts, have some overlap, but different emphasis.
	 * </p>
	 * 
	*/
	public static final String Organization = "http://xmlns.com/foaf/0.1/Organization";
	/**
	 * <p>
	 * Group - A class of Agents.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #Group} class represents a collection of individual agents (and may 
	 * itself play the role of a {@link #Agent}, ie. something that can perform actions).
	 * </p>
	 * <p>
	 * This concept is intentionally quite broad, covering informal and 
	 * ad-hoc groups, long-lived communities, organizational groups within a workplace, etc. Some 
	 * such groups may have associated characteristics which could be captured in RDF (perhaps a 
	 * {@link #homepage}, {@link #name}, mailing list etc.).
	 * </p>
	 * 
	 * <p>
	 * While a {@link #Group} has the characteristics of a {@link #Agent}, it 
	 * is also associated with a number of other {@link #Agent}s (typically people) who 
	 * constitute the {@link #Group}. FOAF provides a mechanism, the 
	 * {@link #membershipClass} property, which relates a {@link #Group} to a 
	 * sub-class of the class {@link #Agent} who are members of the group. This is a 
	 * little complicated, but allows us to make group membership rules explicit.
	 * </p>
	 * 
	 * 
	 * <p>The markup (shown below) for defining a group is both complex and powerful. It 
	 * allows group membership rules to match against any RDF-describable characteristics of the potential 
	 * group members. As FOAF and similar vocabularies become more expressive in their ability to 
	 * describe individuals, the {@link #Group} mechanism for categorising them into 
	 * groups also becomes more powerful. 
	 * </p>
	 * 
	 * <p> 
	 * While the formal description of membership criteria for a {@link #Group} may
	 * be complex, the basic mechanism for saying that someone is in a {@link #Group} is
	 * very simple. We simply use a {@link #member} property of the
	 * {@link #Group} to indicate the agents that are members of the group. For example:
	 * 
	 * </p> 
	 * 
	 * <div class="example"> 
	 * 
	 * <pre> 
	 * &lt;foaf:Group&gt;
	 *  &lt;foaf:name&gt;ILRT staff&lt;/foaf:name&gt;
	 *  &lt;foaf:member&gt;
	 *   &lt;foaf:Person&gt;
	 *    &lt;foaf:name&gt;Martin Poulter&lt;/foaf:name&gt;
	 *    &lt;foaf:homepage rdf:resource="http://www.ilrt.bris.ac.uk/aboutus/staff/staffprofile/?search=plmlp"/&gt;
	 *    &lt;foaf:workplaceHomepage rdf:resource="http://www.ilrt.bris.ac.uk/"/&gt;
	 *   &lt;/foaf:Person&gt;
	 *  &lt;/foaf:member&gt;
	 * &lt;/foaf:Group&gt;
	 * </pre>
	 * </div>
	 * 
	 * 
	 * 
	 * <p>
	 * Behind the scenes, further RDF statements can be used to express the rules for being a 
	 * member of this group. End-users of FOAF need not pay attention to these details.
	 * </p>
	 * 
	 * 
	 * <p>
	 * Here is an example. We define a {@link #Group} representing those people who 
	 * are ILRT staff members (ILRT is a department at the University of Bristol). The {@link #membershipClass} property connects the group (conceived of as a social 
	 * entity and agent in its own right) with the class definition for those people who 
	 * constitute it. In this case, the rule is that all group members are in the 
	 * ILRTStaffPerson class, which is in turn populated by all those things that are a 
	 * {@link #Person} and which have a {@link #workplaceHomepage} of 
	 * http://www.ilrt.bris.ac.uk/. This is typical: FOAF groups are created by 
	 * specifying a sub-class of {@link #Agent} (in fact usually this 
	 * will be a sub-class of {@link #Person}), and giving criteria 
	 * for which things fall in or out of the sub-class. For this, we use the 
	 * <code>owl:onProperty} and <code>owl:hasValue} properties, 
	 * indicating the property/value pairs which must be true of matching 
	 * agents.
	 * </p>
	 * 
	 * <div class="example">
	 * <pre>
	 * &lt;!-- here we see a FOAF group described.
	 *      each foaf group may be associated with an OWL definition 
	 *      specifying the class of agents that constitute the group's membership --&gt;
	 * &lt;foaf:Group&gt;
	 *  &lt;foaf:name&gt;ILRT staff&lt;/foaf:name&gt;
	 *  &lt;foaf:membershipClass&gt;
	 *     &lt;owl:Class rdf:about="http://ilrt.example.com/groups#ILRTStaffPerson"&gt;
	 *      &lt;rdfs:subClassOf rdf:resource="http://xmlns.com/foaf/0.1/Person"/&gt;
	 *      &lt;rdfs:subClassOf&gt;
	 *        &lt;owl:Restriction&gt; 
	 *          &lt;owl:onProperty rdf:resource="http://xmlns.com/foaf/0.1/workplaceHomepage"/&gt;
	 *          &lt;owl:hasValue rdf:resource="http://www.ilrt.bris.ac.uk/"/&gt;
	 *        &lt;/owl:Restriction&gt; 
	 *      &lt;/rdfs:subClassOf&gt;
	 *    &lt;/owl:Class&gt;
	 *  &lt;/foaf:membershipClass&gt;
	 * &lt;/foaf:Group&gt;
	 * </pre>
	 * </div>
	 *   
	 * 
	 * <p>
	 * Note that while these example OWL rules for being in the eg:ILRTStaffPerson class are 
	 * based on a {@link #Person} having a particular 
	 * {@link #workplaceHomepage}, this places no obligations on the authors of actual 
	 * FOAF documents to include this information. If the information <em>is</em> included, then 
	 * generic OWL tools may infer that some person is an eg:ILRTStaffPerson. To go the extra 
	 * step and infer that some eg:ILRTStaffPerson is a {@link #member} of the group 
	 * whose {@link #name} is "ILRT staff", tools will need some knowledge of the way 
	 * FOAF deals with groups. In other words, generic OWL technology gets us most of the way, 
	 * but the full {@link #Group} machinery requires extra work for implimentors.
	 * </p>
	 * 
	 * <p>
	 * The current design names the relationship as pointing <em>from</em> the group, 
	 * to the member. This is convenient when writing XML/RDF that encloses the members within 
	 * markup that describes the group. Alternate representations of the same content are 
	 * allowed in RDF, so you can write claims about the Person and the Group without having to 
	 * nest either description inside the other. For (brief) example:
	 * </p>
	 * 
	 * <div class="example">
	 * <pre>
	 * &lt;foaf:Group&gt;
	 *  &lt;foaf:member rdf:nodeID="martin"/&gt;
	 *  &lt;!-- more about the group here --&gt;
	 * &lt;/foaf:Group&gt;
	 * &lt;foaf:Person rdf:nodeID="martin"&gt;
	 *   &lt;!-- more about martin here --&gt;
	 * &lt;/foaf:Person&gt;
	 * </pre>
	 * </div>
	 * 
	 * <p>
	 * There is a FOAF <a href="http://wiki.foaf-project.org/w/IssueTracker">issue tracker</a> 
	 * associated with this FOAF term. A design goal is to make the most of W3C's <a 
	 * href="http://www.w3.org/2001/sw/WebOnt">OWL</a> language for representing group-membership 
	 * criteria, while also making it easy to leverage existing groups and datasets available 
	 * online (eg. buddylists, mailing list membership lists etc). Feedback on the current design 
	 * is solicited! Should we consider using SPARQL queries instead, for example?
	 * </p>
	 * 
	 * 
	*/
	public static final String Group = "http://xmlns.com/foaf/0.1/Group";
	/**
	 * <p>
	 * Agent - An agent (eg. person, group, software or physical artifact).
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The {@link #Agent} class is the class of agents; things that do stuff. A well 
	 * known sub-class is {@link #Person}, representing people. Other kinds of agents 
	 * include {@link #Organization} and {@link #Group}.
	 * </p>
	 * 
	 * <p>
	 * The {@link #Agent} class is useful in a few places in FOAF where 
	 * {@link #Person} would have been overly specific. For example, the IM chat ID 
	 * properties such as <code>jabberID} are typically associated with people, but 
	 * sometimes belong to software bots.
	 * </p>
	 * 
	 * <!-- todo: write rdfs:domain statements for those properties -->
	 * 
	*/
	public static final String Agent = "http://xmlns.com/foaf/0.1/Agent";
	/**
	 * <p>
	 * Project - A project (a collective endeavour of some kind).
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #Project} class represents the class of things that are 'projects'. These 
	 * may be formal or informal, collective or individual. It is often useful to indicate the 
	 * {@link #homepage} of a {@link #Project}.
	 * </p>
	 * 
	 * <p class="editorial">
	 * Further work is needed to specify the connections between this class and the FOAF properties 
	 * {@link #currentProject} and {@link #pastProject}.
	 * </p>
	 * 
	*/
	public static final String Project = "http://xmlns.com/foaf/0.1/Project";
	/**
	 * <p>
	 * Image - An image.
	 * </p>
	 * <b> Status:</b> stable
	 * <p>
	 * The class {@link #Image} is a sub-class of {@link #Document} 
	 * corresponding to those documents which are images.
	 * </p>
	 * 
	 * <p>
	 * Digital images (such as JPEG, PNG, GIF bitmaps, SVG diagrams etc.) are examples of 
	 * {@link #Image}. 
	 * </p>
	 * 
	 * <!-- much more we could/should say here -->
	 * 
	*/
	public static final String Image = "http://xmlns.com/foaf/0.1/Image";
	/**
	 * <p>
	 * PersonalProfileDocument - A personal profile RDF document.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #PersonalProfileDocument} class represents those
	 * things that are a {@link #Document}, and that use RDF to
	 * describe properties of the person who is the {@link #maker}
	 * of the document. There is just one {@link #Person} described in
	 * the document, ie.
	 * the person who {@link #made} it and who will be its
	 * {@link #primaryTopic}.
	 * </p>
	 * 
	 * <p>
	 * The {@link #PersonalProfileDocument} class, and FOAF's
	 * associated conventions for describing it, captures an important
	 * deployment pattern for the FOAF vocabulary. FOAF is very often used in
	 * public RDF documents made available through the Web. There is a
	 * colloquial notion that these "FOAF files" are often <em>somebody's</em>
	 * FOAF file. Through {@link #PersonalProfileDocument} we provide
	 * a machine-readable expression of this concept, providing a basis for 
	 * FOAF documents to make claims about their maker and topic.
	 * </p>
	 * 
	 * <p>
	 * When describing a {@link #PersonalProfileDocument} it is
	 * typical (and useful) to describe its associated {@link #Person}
	 * using the {@link #maker} property. Anything that is a
	 * {@link #Person} and that is the {@link #maker} of some
	 * {@link #PersonalProfileDocument} will be the {@link #primaryTopic} of
	 * that {@link #Document}. Although this can be inferred, it is
	 * often helpful to include this information explicitly within the
	 * {@link #PersonalProfileDocument}.
	 * </p>
	 * 
	 * <p>
	 * For example, here is a fragment of a personal profile document which
	 * describes its author explicitly:
	 * </p>
	 * <div class="example">
	 * <pre>
	 * &lt;foaf:Person rdf:nodeID="p1"&gt;
	 *  &lt;foaf:name&gt;Dan Brickley&lt;/foaf:name&gt;
	 *  &lt;foaf:homepage rdf:resource="http://danbri.org/"/&gt;
	 *  &lt;!-- etc... --&gt;
	 * &lt;/foaf:Person&gt;
	 * 
	 * &lt;foaf:PersonalProfileDocument rdf:about=""&gt;
	 *    &lt;foaf:maker rdf:nodeID="p1"/&gt;
	 *    &lt;foaf:primaryTopic rdf:nodeID="p1"/&gt;
	 * &lt;/foaf:PersonalProfileDocument&gt;
	 * </pre>
	 * </div>
	 * 
	 * <p>
	 * Note that a {@link #PersonalProfileDocument} will have some
	 * representation as RDF. Typically this will be in W3C's RDF/XML syntax,
	 * however we leave open the possibility for the use of other notations, or
	 * representational conventions including automated transformations from
	 * HTML (<a href="http://www.w3.org/2004/01/rdxh/spec">GRDDL</a> spec for
	 * one such technique).
	 * </p>
	 * 
	 * 
	 * 
	*/
	public static final String PersonalProfileDocument = "http://xmlns.com/foaf/0.1/PersonalProfileDocument";
	/**
	 * <p>
	 * Online Account - An online account.
	 * </p>
	 * <b> Status:</b> testing
	 * <p>
	 * The {@link #OnlineAccount} class represents the provision of some form of online 
	 * service, by some party (indicated indirectly via a {@link #accountServiceHomepage}) to some {@link #Agent}. The 
	 * {@link #account} property of the agent is used to indicate accounts that are associated with the agent.
	 * </p>
	 * 
	 * <p>
	 * See {@link #OnlineChatAccount} for an example. Other sub-classes include {@link #OnlineEcommerceAccount} and {@link #OnlineGamingAccount}.
	 * </p>
	 * 
	 * <p>
	 * One deployment style for this construct is to use URIs for well-known documents (or other entities) that strongly embody the account-holding relationship; for 
	 * example, user profile pages on social network sites. This has the advantage of providing URIs that are likely to be easy to link with other information,
	 * but means that the instances of this class should not be considered 'accounts' in the abstract or business sense of a 'contract'.
	 * </p>
	 * 
	*/
	public static final String OnlineAccount = "http://xmlns.com/foaf/0.1/OnlineAccount";
	/**
	 * <p>
	 * Online Gaming Account - An online gaming account.
	 * </p>
	 * <b> Status:</b> unstable
	 * <p>
	 * A {@link #OnlineGamingAccount} is a {@link #OnlineAccount} devoted to 
	 * online gaming.
	 * </p>
	 * 
	 * <p>
	 * Examples might include <a href="http://everquest.station.sony.com/">EverQuest</a>, 
	 * <a href="http://www.xbox.com/live/">Xbox live</a>, <a 
	 * href="http://nwn.bioware.com/">Neverwinter Nights</a>, etc., as well as older text-based 
	 * systems (MOOs, MUDs and suchlike).
	 * </p>
	 * 
	*/
	public static final String OnlineGamingAccount = "http://xmlns.com/foaf/0.1/OnlineGamingAccount";
	/**
	 * <p>
	 * Online E-commerce Account - An online e-commerce account.
	 * </p>
	 * <b> Status:</b> unstable
	 * <p>
	 * A {@link #OnlineEcommerceAccount} is a {@link #OnlineAccount} devoted to 
	 * buying and/or selling of goods, services etc. Examples include <a 
	 * href="http://www.amazon.com/">Amazon</a>, <a href="http://www.ebay.com/">eBay</a>, <a 
	 * href="http://www.paypal.com/">PayPal</a>, <a 
	 * href="http://www.thinkgeek.com/">thinkgeek</a>, etc.
	 * </p>
	 * 
	 * 
	*/
	public static final String OnlineEcommerceAccount = "http://xmlns.com/foaf/0.1/OnlineEcommerceAccount";
	/**
	 * <p>
	 * Online Chat Account - An online chat account.
	 * </p>
	 * <b> Status:</b> unstable
	 * <p>
	 * A {@link #OnlineChatAccount} is a {@link #OnlineAccount} devoted to 
	 * chat / instant messaging. The account may offer other services too; FOAF's 
	 * sub-classes of {@link #OnlineAccount} are not mutually disjoint.
	 * </p>
	 * 
	 * <p>
	 * This is a generalization of the FOAF Chat ID properties, 
	 * {@link #jabberID}, {@link #aimChatID}, 
	 * {@link #skypeID}, {@link #msnChatID}, {@link #icqChatID} and 
	 * {@link #yahooChatID}. 
	 * </p>
	 * 
	 * <p>
	 * Unlike those simple properties, {@link #OnlineAccount} and associated FOAF terms 
	 * allows us to describe a great variety of online accounts, without having to anticipate 
	 * them in the FOAF vocabulary.
	 * </p>
	 * 
	 * <p>
	 * For example, here is a description of an IRC chat account, specific to the Freenode IRC 
	 * network:
	 * </p>
	 * 
	 * <div class="example">
	 * <pre>
	 * &lt;foaf:Person&gt;
	 *   &lt;foaf:name&gt;Dan Brickley&lt;/foaf:name&gt;
	 *   &lt;foaf:account&gt;
	 *     &lt;foaf:OnlineAccount&gt;
	 *       &lt;rdf:type rdf:resource="http://xmlns.com/foaf/0.1/OnlineChatAccount"/&gt;
	 *       &lt;foaf:accountServiceHomepage 
	 *                rdf:resource="http://www.freenode.net/"/&gt;
	 *       &lt;foaf:accountName&gt;danbri&lt;/foaf:accountName&gt;
	 *     &lt;/foaf:OnlineAccount&gt;
	 *   &lt;/foaf:account&gt;
	 * &lt;/foaf:Person&gt;
	 * </pre>
	 * </div>
	 * 
	 * <p>
	 * Note that it may be impolite to carelessly reveal someone else's chat identifier (which 
	 * might also serve as an indicate of email address) As with email,  there are privacy and 
	 * anti-SPAM considerations. FOAF does not currently provide a way to  represent an 
	 * obfuscated chat ID (ie. there is no parallel to the {@link #mbox} / 
	 * {@link #mbox_sha1sum} mapping). 
	 * </p>
	 * <p>
	 * In addition to the generic {@link #OnlineAccount} and 
	 * {@link #OnlineChatAccount} mechanisms, 
	 * FOAF also provides several convenience chat ID properties 
	 * ({@link #jabberID}, {@link #aimChatID}, {@link #icqChatID}, 
	 * {@link #msnChatID},{@link #yahooChatID}, {@link #skypeID}). 
	 * These serve as as a shorthand for some common cases; their use may not always be 
	 * appropriate.
	 * </p>
	 * <p class="editorial">
	 * We should specify some mappings between the abbreviated and full representations of 
	 * <a href="http://www.jabber.org/">Jabber</a>, <a href="http://www.aim.com/">AIM</a>, <a 
	 * href="http://chat.msn.com/">MSN</a>, <a href="http://web.icq.com/icqchat/">ICQ</a>, <a 
	 * href="http://chat.yahoo.com/">Yahoo!</a> and <a href="http://chat.msn.com/">MSN</a> chat 
	 * accounts. This has been done for {@link #skypeID}. This requires us to 
	 * identify an appropriate {@link #accountServiceHomepage} for each. If we 
	 * wanted to make the {@link #OnlineAccount} mechanism even more generic, we could 
	 * invent a relationship that holds between a {@link #OnlineAccount} instance and a 
	 * convenience property. To continue the example above, we could describe how <a 
	 * href="http://www.freenode.net/">Freenode</a> could define a property 'fn:freenodeChatID' 
	 * corresponding to Freenode online accounts.
	 * </p>
	 * 
	*/
	public static final String OnlineChatAccount = "http://xmlns.com/foaf/0.1/OnlineChatAccount";
}
