//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.20 at 10:22:11 PM AWST 
//
package com.moneycatcha.app.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
@XmlType(name = "taxDepreciationMethodList")
@XmlEnum
public enum TaxDepreciationMethodList {
    
    @XmlEnumValue("Diminishing Value")
    DIMINISHING_VALUE("Diminishing Value"),
    
    @XmlEnumValue("Straight Line")
    STRAIGHT_LINE("Straight Line");
    private final String value;
    TaxDepreciationMethodList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static TaxDepreciationMethodList fromValue(String v) {
        for (TaxDepreciationMethodList c: TaxDepreciationMethodList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
