
package org.example.schema.calculate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="factor1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="factor2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "factor1",
    "factor2"
})
@XmlRootElement(name = "Add")
public class Add {

    protected int factor1;
    protected int factor2;

    /**
     * Gets the value of the factor1 property.
     * 
     */
    public int getFactor1() {
        return factor1;
    }

    /**
     * Sets the value of the factor1 property.
     * 
     */
    public void setFactor1(int value) {
        this.factor1 = value;
    }

    /**
     * Gets the value of the factor2 property.
     * 
     */
    public int getFactor2() {
        return factor2;
    }

    /**
     * Sets the value of the factor2 property.
     * 
     */
    public void setFactor2(int value) {
        this.factor2 = value;
    }

}
