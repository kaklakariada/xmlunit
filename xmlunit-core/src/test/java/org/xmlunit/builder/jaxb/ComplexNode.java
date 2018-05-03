//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.29 at 04:09:58 PM CET 
//


package org.xmlunit.builder.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ComplexNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SingleNestedComplexNode" type="{https://www.xmlunit.org/test/complexXml}ComplexNode" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Double" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Decimal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NestedComplexNode" type="{https://www.xmlunit.org/test/complexXml}ComplexNode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexNode", propOrder = {
    "singleNestedComplexNode",
    "id",
    "date",
    "number",
    "_double",
    "decimal",
    "nestedComplexNodes"
})
public class ComplexNode
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SingleNestedComplexNode")
    protected ComplexNode singleNestedComplexNode;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Date", type = String.class)
    @XmlJavaTypeAdapter(DateTimeToDateAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date date;
    @XmlElement(name = "Number")
    protected Integer number;
    @XmlElement(name = "Double")
    protected Double _double;
    @XmlElement(name = "Decimal")
    protected BigDecimal decimal;
    @XmlElement(name = "NestedComplexNode")
    protected List<ComplexNode> nestedComplexNodes;

    /**
     * Gets the value of the singleNestedComplexNode property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexNode }
     *     
     */
    public ComplexNode getSingleNestedComplexNode() {
        return singleNestedComplexNode;
    }

    /**
     * Sets the value of the singleNestedComplexNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexNode }
     *     
     */
    public void setSingleNestedComplexNode(ComplexNode value) {
        this.singleNestedComplexNode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the double property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDouble() {
        return _double;
    }

    /**
     * Sets the value of the double property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDouble(Double value) {
        this._double = value;
    }

    /**
     * Gets the value of the decimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimal() {
        return decimal;
    }

    /**
     * Sets the value of the decimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimal(BigDecimal value) {
        this.decimal = value;
    }

    /**
     * Gets the value of the nestedComplexNodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nestedComplexNodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNestedComplexNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexNode }
     * 
     * 
     */
    public List<ComplexNode> getNestedComplexNodes() {
        if (nestedComplexNodes == null) {
            nestedComplexNodes = new ArrayList<ComplexNode>();
        }
        return this.nestedComplexNodes;
    }

}
