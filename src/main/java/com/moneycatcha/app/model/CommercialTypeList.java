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
@XmlType(name = "commercialTypeList")
@XmlEnum
public enum CommercialTypeList {
    
    @XmlEnumValue("Block of Units or Flats")
    BLOCK_OF_UNITS_OR_FLATS("Block of Units or Flats"),
    
    @XmlEnumValue("Factory")
    FACTORY("Factory"),
    
    @XmlEnumValue("Multiple Dwelling Development")
    MULTIPLE_DWELLING_DEVELOPMENT("Multiple Dwelling Development"),
    
    @XmlEnumValue("Non Specialised Commercial")
    NON_SPECIALISED_COMMERCIAL("Non Specialised Commercial"),
    
    @XmlEnumValue("Offices")
    OFFICES("Offices"),
    
    @XmlEnumValue("Other")
    OTHER("Other"),
    
    @XmlEnumValue("Professional Chambers")
    PROFESSIONAL_CHAMBERS("Professional Chambers"),
    
    @XmlEnumValue("Residential Commercial")
    RESIDENTIAL_COMMERCIAL("Residential Commercial"),
    
    @XmlEnumValue("Retirement Village")
    RETIREMENT_VILLAGE("Retirement Village"),
    
    @XmlEnumValue("Vacant Land")
    VACANT_LAND("Vacant Land"),
    
    @XmlEnumValue("Warehouse")
    WAREHOUSE("Warehouse");
    private final String value;
    CommercialTypeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static CommercialTypeList fromValue(String v) {
        for (CommercialTypeList c: CommercialTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
