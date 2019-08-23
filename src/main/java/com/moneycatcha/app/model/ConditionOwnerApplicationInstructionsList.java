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
@XmlType(name = "conditionOwnerApplicationInstructionsList")
@XmlEnum
public enum ConditionOwnerApplicationInstructionsList {
    
    @XmlEnumValue("Applicant")
    APPLICANT("Applicant"),
    
    @XmlEnumValue("Borrower's Solicitor")
    BORROWER_S_SOLICITOR("Borrower's Solicitor"),
    
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    
    @XmlEnumValue("Broker")
    BROKER("Broker"),
    
    @XmlEnumValue("Loan Officer")
    LOAN_OFFICER("Loan Officer"),
    
    @XmlEnumValue("Settlement Agent")
    SETTLEMENT_AGENT("Settlement Agent");
    private final String value;
    ConditionOwnerApplicationInstructionsList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static ConditionOwnerApplicationInstructionsList fromValue(String v) {
        for (ConditionOwnerApplicationInstructionsList c: ConditionOwnerApplicationInstructionsList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
