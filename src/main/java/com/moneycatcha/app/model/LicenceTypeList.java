//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.20 at 10:22:11 PM AWST 
//
package com.moneycatcha.app.model;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
@XmlType(name = "licenceTypeList")
@XmlEnum
public enum LicenceTypeList {
    
    ACL,
    
    CRN;
    public String value() {
        return name();
    }
    public static LicenceTypeList fromValue(String v) {
        return valueOf(v);
    }
}