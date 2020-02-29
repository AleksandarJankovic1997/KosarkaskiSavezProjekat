
package mojws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conferencepredavac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conferencepredavac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conferenceConfpreds" type="{http://webServices.statelessBeans/}conferenceConfpred" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idConferencePredavac" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oblast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conferencepredavac", propOrder = {
    "conferenceConfpreds",
    "idConferencePredavac",
    "ime",
    "oblast",
    "prezime"
})
public class Conferencepredavac {

    @XmlElement(nillable = true)
    protected List<ConferenceConfpred> conferenceConfpreds;
    protected int idConferencePredavac;
    protected String ime;
    protected String oblast;
    protected String prezime;

    /**
     * Gets the value of the conferenceConfpreds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conferenceConfpreds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConferenceConfpreds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConferenceConfpred }
     * 
     * 
     */
    public List<ConferenceConfpred> getConferenceConfpreds() {
        if (conferenceConfpreds == null) {
            conferenceConfpreds = new ArrayList<ConferenceConfpred>();
        }
        return this.conferenceConfpreds;
    }

    /**
     * Gets the value of the idConferencePredavac property.
     * 
     */
    public int getIdConferencePredavac() {
        return idConferencePredavac;
    }

    /**
     * Sets the value of the idConferencePredavac property.
     * 
     */
    public void setIdConferencePredavac(int value) {
        this.idConferencePredavac = value;
    }

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the oblast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblast() {
        return oblast;
    }

    /**
     * Sets the value of the oblast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblast(String value) {
        this.oblast = value;
    }

    /**
     * Gets the value of the prezime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Sets the value of the prezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezime(String value) {
        this.prezime = value;
    }

}
