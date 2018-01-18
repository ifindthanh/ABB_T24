
package wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCodeAndMessage" type="{http://ws.basic.tms.securemetric.com/}returnCodeAndMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIException", propOrder = {
    "message",
    "returnCodeAndMessage"
})
public class APIException {

    protected String message;
    protected ReturnCodeAndMessage returnCodeAndMessage;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the returnCodeAndMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCodeAndMessage }
     *     
     */
    public ReturnCodeAndMessage getReturnCodeAndMessage() {
        return returnCodeAndMessage;
    }

    /**
     * Sets the value of the returnCodeAndMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCodeAndMessage }
     *     
     */
    public void setReturnCodeAndMessage(ReturnCodeAndMessage value) {
        this.returnCodeAndMessage = value;
    }

}
