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
@XmlType(name = "materialsHandlingAndLiftingTypeList")
@XmlEnum
public enum MaterialsHandlingAndLiftingTypeList {
    
    @XmlEnumValue("Crane")
    CRANE("Crane"),
    
    @XmlEnumValue("Forklift")
    FORKLIFT("Forklift"),
    
    @XmlEnumValue("Jack / Lifting")
    JACK_LIFTING("Jack / Lifting"),
    
    @XmlEnumValue("Lift / Elevator")
    LIFT_ELEVATOR("Lift / Elevator"),
    
    @XmlEnumValue("Other")
    OTHER("Other"),
    
    @XmlEnumValue("Scissor Lift")
    SCISSOR_LIFT("Scissor Lift"),
    
    @XmlEnumValue("Storage")
    STORAGE("Storage"),
    
    @XmlEnumValue("Telescopic Handler")
    TELESCOPIC_HANDLER("Telescopic Handler");
    private final String value;
    MaterialsHandlingAndLiftingTypeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static MaterialsHandlingAndLiftingTypeList fromValue(String v) {
        for (MaterialsHandlingAndLiftingTypeList c: MaterialsHandlingAndLiftingTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
