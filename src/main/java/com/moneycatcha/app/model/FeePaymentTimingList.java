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
@XmlType(name = "feePaymentTimingList")
@XmlEnum
public enum FeePaymentTimingList {
    
    @XmlEnumValue("Before Credit Drawdown")
    BEFORE_CREDIT_DRAWDOWN("Before Credit Drawdown"),
    
    @XmlEnumValue("On Credit Drawdown")
    ON_CREDIT_DRAWDOWN("On Credit Drawdown"),
    
    @XmlEnumValue("On Event Occurrence")
    ON_EVENT_OCCURRENCE("On Event Occurrence"),
    
    @XmlEnumValue("Regular Recurring")
    REGULAR_RECURRING("Regular Recurring");
    private final String value;
    FeePaymentTimingList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static FeePaymentTimingList fromValue(String v) {
        for (FeePaymentTimingList c: FeePaymentTimingList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}