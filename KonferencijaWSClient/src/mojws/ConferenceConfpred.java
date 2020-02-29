
package mojws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conferenceConfpred complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conferenceConfpred"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conference" type="{http://webServices.statelessBeans/}conference" minOccurs="0"/&gt;
 *         &lt;element name="conferencepredavac" type="{http://webServices.statelessBeans/}conferencepredavac" minOccurs="0"/&gt;
 *         &lt;element name="idConference_ConfPred" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conferenceConfpred", propOrder = {
    "conference",
    "conferencepredavac",
    "idConferenceConfPred"
})
public class ConferenceConfpred {

    protected Conference conference;
    protected Conferencepredavac conferencepredavac;
    @XmlElement(name = "idConference_ConfPred")
    protected int idConferenceConfPred;

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
     * Gets the value of the conferencepredavac property.
     * 
     * @return
     *     possible object is
     *     {@link Conferencepredavac }
     *     
     */
    public Conferencepredavac getConferencepredavac() {
        return conferencepredavac;
    }

    /**
     * Sets the value of the conferencepredavac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conferencepredavac }
     *     
     */
    public void setConferencepredavac(Conferencepredavac value) {
        this.conferencepredavac = value;
    }

    /**
     * Gets the value of the idConferenceConfPred property.
     * 
     */
    public int getIdConferenceConfPred() {
        return idConferenceConfPred;
    }

    /**
     * Sets the value of the idConferenceConfPred property.
     * 
     */
    public void setIdConferenceConfPred(int value) {
        this.idConferenceConfPred = value;
    }

}
