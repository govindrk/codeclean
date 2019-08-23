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
@XmlType(name = "trustPurposeList")
@XmlEnum
public enum TrustPurposeList {
    
    @XmlEnumValue("Family Trust")
    FAMILY_TRUST("Family Trust"),
    
    @XmlEnumValue("Protective")
    PROTECTIVE("Protective"),
    
    @XmlEnumValue("Security Trust")
    SECURITY_TRUST("Security Trust"),
    
    SMSF("SMSF"),
    
    @XmlEnumValue("Trading Trust")
    TRADING_TRUST("Trading Trust");
    private final String value;
    TrustPurposeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static TrustPurposeList fromValue(String v) {
        for (TrustPurposeList c: TrustPurposeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
