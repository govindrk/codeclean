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
@XmlType(name = "insuranceTypeList")
@XmlEnum
public enum InsuranceTypeList {
    
    @XmlEnumValue("Body Corporate")
    BODY_CORPORATE("Body Corporate"),
    
    @XmlEnumValue("Building Insurance")
    BUILDING_INSURANCE("Building Insurance"),
    
    @XmlEnumValue("Building Replacement")
    BUILDING_REPLACEMENT("Building Replacement"),
    
    @XmlEnumValue("Consumer Credit Insurance")
    CONSUMER_CREDIT_INSURANCE("Consumer Credit Insurance"),
    
    @XmlEnumValue("Disablement")
    DISABLEMENT("Disablement"),
    
    @XmlEnumValue("Home Contents Insurance")
    HOME_CONTENTS_INSURANCE("Home Contents Insurance"),
    
    @XmlEnumValue("Income Protection")
    INCOME_PROTECTION("Income Protection"),
    
    @XmlEnumValue("Involuntary Unemployment")
    INVOLUNTARY_UNEMPLOYMENT("Involuntary Unemployment"),
    
    @XmlEnumValue("Life Insurance")
    LIFE_INSURANCE("Life Insurance"),
    
    LMI("LMI"),
    
    @XmlEnumValue("Other")
    OTHER("Other"),
    
    @XmlEnumValue("Trauma")
    TRAUMA("Trauma");
    private final String value;
    InsuranceTypeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static InsuranceTypeList fromValue(String v) {
        for (InsuranceTypeList c: InsuranceTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}