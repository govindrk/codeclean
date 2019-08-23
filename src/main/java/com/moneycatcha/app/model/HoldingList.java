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
@XmlType(name = "holdingList")
@XmlEnum
public enum HoldingList {
    
    @XmlEnumValue("Company Share")
    COMPANY_SHARE("Company Share"),
    
    @XmlEnumValue("Joint Tenants")
    JOINT_TENANTS("Joint Tenants"),
    
    @XmlEnumValue("Sole")
    SOLE("Sole"),
    
    @XmlEnumValue("Tennant Common in Equal Shares")
    TENNANT_COMMON_IN_EQUAL_SHARES("Tennant Common in Equal Shares"),
    
    @XmlEnumValue("Tennant Common in Shares of")
    TENNANT_COMMON_IN_SHARES_OF("Tennant Common in Shares of"),
    
    @XmlEnumValue("Time Share")
    TIME_SHARE("Time Share");
    private final String value;
    HoldingList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static HoldingList fromValue(String v) {
        for (HoldingList c: HoldingList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}