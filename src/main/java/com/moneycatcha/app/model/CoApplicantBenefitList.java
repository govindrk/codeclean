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
@XmlType(name = "coApplicantBenefitList")
@XmlEnum
public enum CoApplicantBenefitList {
    
    @XmlEnumValue("No Substantial Benefit")
    NO_SUBSTANTIAL_BENEFIT("No Substantial Benefit"),
    
    @XmlEnumValue("No Substantial Benefit and Proceed")
    NO_SUBSTANTIAL_BENEFIT_AND_PROCEED("No Substantial Benefit and Proceed"),
    
    @XmlEnumValue("Substantial Benefit")
    SUBSTANTIAL_BENEFIT("Substantial Benefit");
    private final String value;
    CoApplicantBenefitList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static CoApplicantBenefitList fromValue(String v) {
        for (CoApplicantBenefitList c: CoApplicantBenefitList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
