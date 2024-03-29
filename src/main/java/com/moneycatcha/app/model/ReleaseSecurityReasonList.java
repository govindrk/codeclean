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
@XmlType(name = "releaseSecurityReasonList")
@XmlEnum
public enum ReleaseSecurityReasonList {
    
    @XmlEnumValue("Debt Reduction")
    DEBT_REDUCTION("Debt Reduction"),
    
    @XmlEnumValue("Dissolving Partnership")
    DISSOLVING_PARTNERSHIP("Dissolving Partnership"),
    
    @XmlEnumValue("No Longer Required")
    NO_LONGER_REQUIRED("No Longer Required"),
    
    @XmlEnumValue("Refinancing with Another Lender")
    REFINANCING_WITH_ANOTHER_LENDER("Refinancing with Another Lender"),
    
    @XmlEnumValue("Sale of Property")
    SALE_OF_PROPERTY("Sale of Property");
    private final String value;
    ReleaseSecurityReasonList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ReleaseSecurityReasonList fromValue(String v) {
        for (ReleaseSecurityReasonList c: ReleaseSecurityReasonList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
