
package wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setBlockTokenAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setBlockTokenAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokenHid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockTokenAction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setBlockTokenAction", propOrder = {
    "tokenHid",
    "blockTokenAction"
})
public class SetBlockTokenAction {

    protected String tokenHid;
    protected int blockTokenAction;

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
     * Gets the value of the blockTokenAction property.
     * 
     */
    public int getBlockTokenAction() {
        return blockTokenAction;
    }

    /**
     * Sets the value of the blockTokenAction property.
     * 
     */
    public void setBlockTokenAction(int value) {
        this.blockTokenAction = value;
    }

}
