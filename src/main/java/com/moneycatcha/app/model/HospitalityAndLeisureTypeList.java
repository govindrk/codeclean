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
@XmlType(name = "hospitalityAndLeisureTypeList")
@XmlEnum
public enum HospitalityAndLeisureTypeList {
    
    @XmlEnumValue("Air Conditioning")
    AIR_CONDITIONING("Air Conditioning"),
    
    @XmlEnumValue("Cooking")
    COOKING("Cooking"),
    
    @XmlEnumValue("Gaming")
    GAMING("Gaming"),
    
    @XmlEnumValue("Garden")
    GARDEN("Garden"),
    
    @XmlEnumValue("Kitchen")
    KITCHEN("Kitchen"),
    
    @XmlEnumValue("Other")
    OTHER("Other"),
    
    @XmlEnumValue("Refrigeration")
    REFRIGERATION("Refrigeration"),
    
    @XmlEnumValue("Salon")
    SALON("Salon"),
    
    @XmlEnumValue("Spa")
    SPA("Spa");
    private final String value;
    HospitalityAndLeisureTypeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static HospitalityAndLeisureTypeList fromValue(String v) {
        for (HospitalityAndLeisureTypeList c: HospitalityAndLeisureTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
