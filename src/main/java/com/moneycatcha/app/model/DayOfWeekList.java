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
@XmlType(name = "dayOfWeekList")
@XmlEnum
public enum DayOfWeekList {
    
    @XmlEnumValue("Friday")
    FRIDAY("Friday"),
    
    @XmlEnumValue("Monday")
    MONDAY("Monday"),
    
    @XmlEnumValue("Saturday")
    SATURDAY("Saturday"),
    
    @XmlEnumValue("Sunday")
    SUNDAY("Sunday"),
    
    @XmlEnumValue("Thursday")
    THURSDAY("Thursday"),
    
    @XmlEnumValue("Tuesday")
    TUESDAY("Tuesday"),
    
    @XmlEnumValue("Wednesday")
    WEDNESDAY("Wednesday");
    private final String value;
    DayOfWeekList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static DayOfWeekList fromValue(String v) {
        for (DayOfWeekList c: DayOfWeekList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}