
package wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for token complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="token">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bindFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="blockStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="boundByUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boundDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="boundToUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdByUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="encryptPublicKeyBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encryptionKeyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyGeneratedByUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyGeneratedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="keySize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modifiedByUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revokedByUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revokedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signPublicKeyBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signatureKeyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "token", propOrder = {
    "bindFlag",
    "blockStatus",
    "boundByUsername",
    "boundDate",
    "boundToUsername",
    "createdByUsername",
    "createdDate",
    "encryptPublicKeyBase64",
    "encryptionKeyName",
    "hid",
    "keyGeneratedByUsername",
    "keyGeneratedDate",
    "keySize",
    "modifiedByUsername",
    "modifiedDate",
    "name",
    "revokedByUsername",
    "revokedDate",
    "signPublicKeyBase64",
    "signatureKeyName",
    "status"
})
public class Token {

    protected int bindFlag;
    protected int blockStatus;
    protected String boundByUsername;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar boundDate;
    protected String boundToUsername;
    protected String createdByUsername;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String encryptPublicKeyBase64;
    protected String encryptionKeyName;
    protected String hid;
    protected String keyGeneratedByUsername;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar keyGeneratedDate;
    protected int keySize;
    protected String modifiedByUsername;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    protected String name;
    protected String revokedByUsername;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revokedDate;
    protected String signPublicKeyBase64;
    protected String signatureKeyName;
    protected int status;

    /**
     * Gets the value of the bindFlag property.
     * 
     */
    public int getBindFlag() {
        return bindFlag;
    }

    /**
     * Sets the value of the bindFlag property.
     * 
     */
    public void setBindFlag(int value) {
        this.bindFlag = value;
    }

    /**
     * Gets the value of the blockStatus property.
     * 
     */
    public int getBlockStatus() {
        return blockStatus;
    }

    /**
     * Sets the value of the blockStatus property.
     * 
     */
    public void setBlockStatus(int value) {
        this.blockStatus = value;
    }

    /**
     * Gets the value of the boundByUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundByUsername() {
        return boundByUsername;
    }

    /**
     * Sets the value of the boundByUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundByUsername(String value) {
        this.boundByUsername = value;
    }

    /**
     * Gets the value of the boundDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoundDate() {
        return boundDate;
    }

    /**
     * Sets the value of the boundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoundDate(XMLGregorianCalendar value) {
        this.boundDate = value;
    }

    /**
     * Gets the value of the boundToUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundToUsername() {
        return boundToUsername;
    }

    /**
     * Sets the value of the boundToUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundToUsername(String value) {
        this.boundToUsername = value;
    }

    /**
     * Gets the value of the createdByUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByUsername() {
        return createdByUsername;
    }

    /**
     * Sets the value of the createdByUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByUsername(String value) {
        this.createdByUsername = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the encryptPublicKeyBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptPublicKeyBase64() {
        return encryptPublicKeyBase64;
    }

    /**
     * Sets the value of the encryptPublicKeyBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptPublicKeyBase64(String value) {
        this.encryptPublicKeyBase64 = value;
    }

    /**
     * Gets the value of the encryptionKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKeyName() {
        return encryptionKeyName;
    }

    /**
     * Sets the value of the encryptionKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKeyName(String value) {
        this.encryptionKeyName = value;
    }

    /**
     * Gets the value of the hid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHid() {
        return hid;
    }

    /**
     * Sets the value of the hid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHid(String value) {
        this.hid = value;
    }

    /**
     * Gets the value of the keyGeneratedByUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyGeneratedByUsername() {
        return keyGeneratedByUsername;
    }

    /**
     * Sets the value of the keyGeneratedByUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyGeneratedByUsername(String value) {
        this.keyGeneratedByUsername = value;
    }

    /**
     * Gets the value of the keyGeneratedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKeyGeneratedDate() {
        return keyGeneratedDate;
    }

    /**
     * Sets the value of the keyGeneratedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKeyGeneratedDate(XMLGregorianCalendar value) {
        this.keyGeneratedDate = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     */
    public int getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     */
    public void setKeySize(int value) {
        this.keySize = value;
    }

    /**
     * Gets the value of the modifiedByUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedByUsername() {
        return modifiedByUsername;
    }

    /**
     * Sets the value of the modifiedByUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedByUsername(String value) {
        this.modifiedByUsername = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the revokedByUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevokedByUsername() {
        return revokedByUsername;
    }

    /**
     * Sets the value of the revokedByUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevokedByUsername(String value) {
        this.revokedByUsername = value;
    }

    /**
     * Gets the value of the revokedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevokedDate() {
        return revokedDate;
    }

    /**
     * Sets the value of the revokedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevokedDate(XMLGregorianCalendar value) {
        this.revokedDate = value;
    }

    /**
     * Gets the value of the signPublicKeyBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignPublicKeyBase64() {
        return signPublicKeyBase64;
    }

    /**
     * Sets the value of the signPublicKeyBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignPublicKeyBase64(String value) {
        this.signPublicKeyBase64 = value;
    }

    /**
     * Gets the value of the signatureKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureKeyName() {
        return signatureKeyName;
    }

    /**
     * Sets the value of the signatureKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureKeyName(String value) {
        this.signatureKeyName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

}
