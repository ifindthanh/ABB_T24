
package wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bindToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bindToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenHid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="temporaryBinding" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindToken", propOrder = {
    "username",
    "tokenHid",
    "temporaryBinding"
})
public class BindToken {

    protected String username;
    protected String tokenHid;
    protected boolean temporaryBinding;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the tokenHid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenHid() {
        return tokenHid;
    }

    /**
     * Sets the value of the tokenHid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenHid(String value) {
        this.tokenHid = value;
    }

    /**
     * Gets the value of the temporaryBinding property.
     * 
     */
    public boolean isTemporaryBinding() {
        return temporaryBinding;
    }

    /**
     * Sets the value of the temporaryBinding property.
     * 
     */
    public void setTemporaryBinding(boolean value) {
        this.temporaryBinding = value;
    }

}
