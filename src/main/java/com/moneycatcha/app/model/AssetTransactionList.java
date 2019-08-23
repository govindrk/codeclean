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
@XmlType(name = "assetTransactionList")
@XmlEnum
public enum AssetTransactionList {
    
    @XmlEnumValue("Owns")
    OWNS("Owns"),
    
    @XmlEnumValue("Owns Existing Mortgage")
    OWNS_EXISTING_MORTGAGE("Owns Existing Mortgage"),
    
    @XmlEnumValue("Purchasing")
    PURCHASING("Purchasing"),
    
    @XmlEnumValue("Sold")
    SOLD("Sold");
    private final String value;
    AssetTransactionList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static AssetTransactionList fromValue(String v) {
        for (AssetTransactionList c: AssetTransactionList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
