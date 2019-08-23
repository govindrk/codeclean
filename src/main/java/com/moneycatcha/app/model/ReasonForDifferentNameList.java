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
@XmlType(name = "reasonForDifferentNameList")
@XmlEnum
public enum ReasonForDifferentNameList {
    
    @XmlEnumValue("Abbreviation")
    ABBREVIATION("Abbreviation"),
    
    @XmlEnumValue("Amalgamation")
    AMALGAMATION("Amalgamation"),
    
    @XmlEnumValue("Amalgamation Evidence")
    AMALGAMATION_EVIDENCE("Amalgamation Evidence"),
    
    @XmlEnumValue("Change Incorporated Name")
    CHANGE_INCORPORATED_NAME("Change Incorporated Name"),
    
    @XmlEnumValue("Deed Poll")
    DEED_POLL("Deed Poll"),
    
    @XmlEnumValue("Error in Register")
    ERROR_IN_REGISTER("Error in Register"),
    
    @XmlEnumValue("Legislative Change Company")
    LEGISLATIVE_CHANGE_COMPANY("Legislative Change Company"),
    
    @XmlEnumValue("Legislative Change Company Evidence")
    LEGISLATIVE_CHANGE_COMPANY_EVIDENCE("Legislative Change Company Evidence"),
    
    @XmlEnumValue("Legislative Change Non Company")
    LEGISLATIVE_CHANGE_NON_COMPANY("Legislative Change Non Company"),
    
    @XmlEnumValue("Legislative Change Non Company Evidence")
    LEGISLATIVE_CHANGE_NON_COMPANY_EVIDENCE("Legislative Change Non Company Evidence"),
    
    @XmlEnumValue("Marriage")
    MARRIAGE("Marriage"),
    
    @XmlEnumValue("Merger or Takeover")
    MERGER_OR_TAKEOVER("Merger or Takeover"),
    
    @XmlEnumValue("Merger or Takeover Evidence")
    MERGER_OR_TAKEOVER_EVIDENCE("Merger or Takeover Evidence"),
    
    @XmlEnumValue("New Name")
    NEW_NAME("New Name"),
    
    @XmlEnumValue("Resumption of Maiden Name")
    RESUMPTION_OF_MAIDEN_NAME("Resumption of Maiden Name"),
    
    @XmlEnumValue("Sale or Transfer")
    SALE_OR_TRANSFER("Sale or Transfer"),
    
    @XmlEnumValue("Sale or Transfer Evidence")
    SALE_OR_TRANSFER_EVIDENCE("Sale or Transfer Evidence");
    private final String value;
    ReasonForDifferentNameList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ReasonForDifferentNameList fromValue(String v) {
        for (ReasonForDifferentNameList c: ReasonForDifferentNameList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
