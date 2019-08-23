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
@XmlType(name = "housingStatusList")
@XmlEnum
public enum HousingStatusList {
    
    @XmlEnumValue("Boarding")
    BOARDING("Boarding"),
    
    @XmlEnumValue("Caravan")
    CARAVAN("Caravan"),
    
    @XmlEnumValue("Other")
    OTHER("Other"),
    
    @XmlEnumValue("Own Home")
    OWN_HOME("Own Home"),
    
    @XmlEnumValue("Own Home Mortgage")
    OWN_HOME_MORTGAGE("Own Home Mortgage"),
    
    @XmlEnumValue("Renting")
    RENTING("Renting"),
    
    @XmlEnumValue("Supplied by Employer")
    SUPPLIED_BY_EMPLOYER("Supplied by Employer"),
    
    @XmlEnumValue("With Parents")
    WITH_PARENTS("With Parents");
    private final String value;
    HousingStatusList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static HousingStatusList fromValue(String v) {
        for (HousingStatusList c: HousingStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
