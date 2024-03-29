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
@XmlType(name = "significantChangeList")
@XmlEnum
public enum SignificantChangeList {
    
    @XmlEnumValue("Anticipated Large Expenditure")
    ANTICIPATED_LARGE_EXPENDITURE("Anticipated Large Expenditure"),
    
    @XmlEnumValue("End of Contract or Loss of Employment")
    END_OF_CONTRACT_OR_LOSS_OF_EMPLOYMENT("End of Contract or Loss of Employment"),
    
    @XmlEnumValue("Extended Unpaid Leave")
    EXTENDED_UNPAID_LEAVE("Extended Unpaid Leave"),
    
    @XmlEnumValue("Increased Debt Repayments for an Existing Loan")
    INCREASED_DEBT_REPAYMENTS_FOR_AN_EXISTING_LOAN("Increased Debt Repayments for an Existing Loan"),
    
    @XmlEnumValue("Leaving Employment")
    LEAVING_EMPLOYMENT("Leaving Employment"),
    
    @XmlEnumValue("Medical Treatment or Illness")
    MEDICAL_TREATMENT_OR_ILLNESS("Medical Treatment or Illness"),
    
    @XmlEnumValue("Other")
    OTHER("Other"),
    
    @XmlEnumValue("Permanent Decrease in Income")
    PERMANENT_DECREASE_IN_INCOME("Permanent Decrease in Income"),
    
    @XmlEnumValue("Permanent Increase in Expense")
    PERMANENT_INCREASE_IN_EXPENSE("Permanent Increase in Expense"),
    
    @XmlEnumValue("Temporary Decrease in Income")
    TEMPORARY_DECREASE_IN_INCOME("Temporary Decrease in Income"),
    
    @XmlEnumValue("Temporary Increase in Expense")
    TEMPORARY_INCREASE_IN_EXPENSE("Temporary Increase in Expense");
    private final String value;
    SignificantChangeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static SignificantChangeList fromValue(String v) {
        for (SignificantChangeList c: SignificantChangeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
