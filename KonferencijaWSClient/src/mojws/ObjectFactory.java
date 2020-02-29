
package mojws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mojws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFutureConferences_QNAME = new QName("http://webServices.statelessBeans/", "getFutureConferences");
    private final static QName _GetFutureConferencesResponse_QNAME = new QName("http://webServices.statelessBeans/", "getFutureConferencesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mojws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFutureConferences }
     * 
     */
    public GetFutureConferences createGetFutureConferences() {
        return new GetFutureConferences();
    }

    /**
     * Create an instance of {@link GetFutureConferencesResponse }
     * 
     */
    public GetFutureConferencesResponse createGetFutureConferencesResponse() {
        return new GetFutureConferencesResponse();
    }

    /**
     * Create an instance of {@link Conference }
     * 
     */
    public Conference createConference() {
        return new Conference();
    }

    /**
     * Create an instance of {@link ConferenceConfpo }
     * 
     */
    public ConferenceConfpo createConferenceConfpo() {
        return new ConferenceConfpo();
    }

    /**
     * Create an instance of {@link Conferenceposetilac }
     * 
     */
    public Conferenceposetilac createConferenceposetilac() {
        return new Conferenceposetilac();
    }

    /**
     * Create an instance of {@link ConferenceConfpred }
     * 
     */
    public ConferenceConfpred createConferenceConfpred() {
        return new ConferenceConfpred();
    }

    /**
     * Create an instance of {@link Conferencepredavac }
     * 
     */
    public Conferencepredavac createConferencepredavac() {
        return new Conferencepredavac();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFutureConferences }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFutureConferences }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.statelessBeans/", name = "getFutureConferences")
    public JAXBElement<GetFutureConferences> createGetFutureConferences(GetFutureConferences value) {
        return new JAXBElement<GetFutureConferences>(_GetFutureConferences_QNAME, GetFutureConferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFutureConferencesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFutureConferencesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.statelessBeans/", name = "getFutureConferencesResponse")
    public JAXBElement<GetFutureConferencesResponse> createGetFutureConferencesResponse(GetFutureConferencesResponse value) {
        return new JAXBElement<GetFutureConferencesResponse>(_GetFutureConferencesResponse_QNAME, GetFutureConferencesResponse.class, null, value);
    }

}
