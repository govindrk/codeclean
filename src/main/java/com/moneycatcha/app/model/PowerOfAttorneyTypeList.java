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
@XmlType(name = "powerOfAttorneyTypeList")
@XmlEnum
public enum PowerOfAttorneyTypeList {
    
    @XmlEnumValue("Company")
    COMPANY("Company"),
    
    @XmlEnumValue("Enduring")
    ENDURING("Enduring"),
    
    @XmlEnumValue("General")
    GENERAL("General"),
    
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;
    PowerOfAttorneyTypeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static PowerOfAttorneyTypeList fromValue(String v) {
        for (PowerOfAttorneyTypeList c: PowerOfAttorneyTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
