
package mojws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conferenceConfpo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conferenceConfpo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conference" type="{http://webServices.statelessBeans/}conference" minOccurs="0"/&gt;
 *         &lt;element name="conferenceposetilac" type="{http://webServices.statelessBeans/}conferenceposetilac" minOccurs="0"/&gt;
 *         &lt;element name="idConference_ConfPos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conferenceConfpo", propOrder = {
    "conference",
    "conferenceposetilac",
    "idConferenceConfPos"
})
public class ConferenceConfpo {

    protected Conference conference;
    protected Conferenceposetilac conferenceposetilac;
    @XmlElement(name = "idConference_ConfPos")
    protected int idConferenceConfPos;

    /**
     * Gets the value of the conference property.
     * 
     * @return
     *     possible object is
     *     {@link Conference }
     *     
     */
    public Conference getConference() {
        return conference;
    }

    /**
     * Sets the value of the conference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conference }
     *     
     */
    public void setConference(Conference value) {
        this.conference = value;
    }

    /**
     * Gets the value of the conferenceposetilac property.
     * 
     * @return
     *     possible object is
     *     {@link Conferenceposetilac }
     *     
     */
    public Conferenceposetilac getConferenceposetilac() {
        return conferenceposetilac;
    }

    /**
     * Sets the value of the conferenceposetilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conferenceposetilac }
     *     
     */
    public void setConferenceposetilac(Conferenceposetilac value) {
        this.conferenceposetilac = value;
    }

    /**
     * Gets the value of the idConferenceConfPos property.
     * 
     */
    public int getIdConferenceConfPos() {
        return idConferenceConfPos;
    }

    /**
     * Sets the value of the idConferenceConfPos property.
     * 
     */
    public void setIdConferenceConfPos(int value) {
        this.idConferenceConfPos = value;
    }

}
