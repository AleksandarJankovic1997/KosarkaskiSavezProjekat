
package mojws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conferenceposetilac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conferenceposetilac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conferenceConfpos" type="{http://webServices.statelessBeans/}conferenceConfpo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idConferencePosetilac" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "conferenceposetilac", propOrder = {
    "conferenceConfpos",
    "idConferencePosetilac",
    "ime",
    "prezime"
})
public class Conferenceposetilac {

    @XmlElement(nillable = true)
    protected List<ConferenceConfpo> conferenceConfpos;
    protected int idConferencePosetilac;
    protected String ime;
    protected String prezime;

    /**
     * Gets the value of the conferenceConfpos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conferenceConfpos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConferenceConfpos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConferenceConfpo }
     * 
     * 
     */
    public List<ConferenceConfpo> getConferenceConfpos() {
        if (conferenceConfpos == null) {
            conferenceConfpos = new ArrayList<ConferenceConfpo>();
        }
        return this.conferenceConfpos;
    }

    /**
     * Gets the value of the idConferencePosetilac property.
     * 
     */
    public int getIdConferencePosetilac() {
        return idConferencePosetilac;
    }

    /**
     * Sets the value of the idConferencePosetilac property.
     * 
     */
    public void setIdConferencePosetilac(int value) {
        this.idConferencePosetilac = value;
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
