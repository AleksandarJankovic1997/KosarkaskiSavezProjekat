
package wsdlServices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdlServices package. 
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

    private final static QName _ValidateEmail_QNAME = new QName("http://emailValidator.milan.jovic.dmi.uns.ac.rs/", "validateEmail");
    private final static QName _ValidateEmailResponse_QNAME = new QName("http://emailValidator.milan.jovic.dmi.uns.ac.rs/", "validateEmailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdlServices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateEmail }
     * 
     */
    public ValidateEmail createValidateEmail() {
        return new ValidateEmail();
    }

    /**
     * Create an instance of {@link ValidateEmailResponse }
     * 
     */
    public ValidateEmailResponse createValidateEmailResponse() {
        return new ValidateEmailResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateEmail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateEmail }{@code >}
     */
    @XmlElementDecl(namespace = "http://emailValidator.milan.jovic.dmi.uns.ac.rs/", name = "validateEmail")
    public JAXBElement<ValidateEmail> createValidateEmail(ValidateEmail value) {
        return new JAXBElement<ValidateEmail>(_ValidateEmail_QNAME, ValidateEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://emailValidator.milan.jovic.dmi.uns.ac.rs/", name = "validateEmailResponse")
    public JAXBElement<ValidateEmailResponse> createValidateEmailResponse(ValidateEmailResponse value) {
        return new JAXBElement<ValidateEmailResponse>(_ValidateEmailResponse_QNAME, ValidateEmailResponse.class, null, value);
    }

}
