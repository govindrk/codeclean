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
@XmlType(name = "tenureTypeList")
@XmlEnum
public enum TenureTypeList {
    
    @XmlEnumValue("Community Title")
    COMMUNITY_TITLE("Community Title"),
    
    @XmlEnumValue("Company Title")
    COMPANY_TITLE("Company Title"),
    
    @XmlEnumValue("Crown Land")
    CROWN_LAND("Crown Land"),
    
    @XmlEnumValue("Crown Lease")
    CROWN_LEASE("Crown Lease"),
    
    @XmlEnumValue("Freehold")
    FREEHOLD("Freehold"),
    
    @XmlEnumValue("Group Titles Plan")
    GROUP_TITLES_PLAN("Group Titles Plan"),
    
    @XmlEnumValue("Leasehold")
    LEASEHOLD("Leasehold"),
    
    @XmlEnumValue("Moiety Title")
    MOIETY_TITLE("Moiety Title"),
    
    @XmlEnumValue("None")
    NONE("None"),
    
    @XmlEnumValue("Other Title")
    OTHER_TITLE("Other Title"),
    
    @XmlEnumValue("Purple Title")
    PURPLE_TITLE("Purple Title"),
    
    @XmlEnumValue("Strata Title")
    STRATA_TITLE("Strata Title"),
    
    @XmlEnumValue("Stratum Title")
    STRATUM_TITLE("Stratum Title"),
    
    @XmlEnumValue("Survey Strata Title")
    SURVEY_STRATA_TITLE("Survey Strata Title"),
    
    @XmlEnumValue("Unit Title")
    UNIT_TITLE("Unit Title");
    private final String value;
    TenureTypeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static TenureTypeList fromValue(String v) {
        for (TenureTypeList c: TenureTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
