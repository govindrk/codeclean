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
@XmlType(name = "applicantTypeList")
@XmlEnum
public enum ApplicantTypeList {
    
    @XmlEnumValue("Borrower")
    BORROWER("Borrower"),
    
    @XmlEnumValue("Borrower and Guarantor")
    BORROWER_AND_GUARANTOR("Borrower and Guarantor"),
    
    @XmlEnumValue("Guarantor")
    GUARANTOR("Guarantor");
    
    private final String value;
    ApplicantTypeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ApplicantTypeList fromValue(String v) {
        for (ApplicantTypeList c: ApplicantTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
