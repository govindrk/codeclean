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
@XmlType(name = "repaymentFrequencyList")
@XmlEnum
public enum RepaymentFrequencyList {
    
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    
    @XmlEnumValue("Fortnightly")
    FORTNIGHTLY("Fortnightly"),
    
    @XmlEnumValue("Half Yearly")
    HALF_YEARLY("Half Yearly"),
    
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    
    @XmlEnumValue("One Off")
    ONE_OFF("One Off"),
    
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    
    @XmlEnumValue("Seasonal")
    SEASONAL("Seasonal"),
    
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    
    @XmlEnumValue("Yearly")
    YEARLY("Yearly");
    private final String value;
    RepaymentFrequencyList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static RepaymentFrequencyList fromValue(String v) {
        for (RepaymentFrequencyList c: RepaymentFrequencyList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
