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
@XmlType(name = "collateralClassList")
@XmlEnum
public enum CollateralClassList {
    
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    
    @XmlEnumValue("Agriculture")
    AGRICULTURE("Agriculture"),
    
    @XmlEnumValue("Aircraft")
    AIRCRAFT("Aircraft"),
    
    @XmlEnumValue("Aircraft Engine")
    AIRCRAFT_ENGINE("Aircraft Engine"),
    
    @XmlEnumValue("Airframe")
    AIRFRAME("Airframe"),
    
    @XmlEnumValue("All Present and After Acquired Property With Exception")
    ALL_PRESENT_AND_AFTER_ACQUIRED_PROPERTY_WITH_EXCEPTION("All Present and After Acquired Property With Exception"),
    
    @XmlEnumValue("All Present and After Acquired Property Without Exception")
    ALL_PRESENT_AND_AFTER_ACQUIRED_PROPERTY_WITHOUT_EXCEPTION("All Present and After Acquired Property Without Exception"),
    
    @XmlEnumValue("Chattel Paper")
    CHATTEL_PAPER("Chattel Paper"),
    
    @XmlEnumValue("Circuit Layout")
    CIRCUIT_LAYOUT("Circuit Layout"),
    
    @XmlEnumValue("Copyright")
    COPYRIGHT("Copyright"),
    
    @XmlEnumValue("Crops")
    CROPS("Crops"),
    
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    
    @XmlEnumValue("Design")
    DESIGN("Design"),
    
    @XmlEnumValue("Document of Title")
    DOCUMENT_OF_TITLE("Document of Title"),
    
    @XmlEnumValue("General Intangible")
    GENERAL_INTANGIBLE("General Intangible"),
    
    @XmlEnumValue("Helicopter")
    HELICOPTER("Helicopter"),
    
    @XmlEnumValue("Intellectual Property")
    INTELLECTUAL_PROPERTY("Intellectual Property"),
    
    @XmlEnumValue("Intermediate Security")
    INTERMEDIATE_SECURITY("Intermediate Security"),
    
    @XmlEnumValue("Investment Instrument")
    INVESTMENT_INSTRUMENT("Investment Instrument"),
    
    @XmlEnumValue("Livestock")
    LIVESTOCK("Livestock"),
    
    @XmlEnumValue("Motor Vehicle")
    MOTOR_VEHICLE("Motor Vehicle"),
    
    @XmlEnumValue("Negotiable Instrument")
    NEGOTIABLE_INSTRUMENT("Negotiable Instrument"),
    
    @XmlEnumValue("Other Goods")
    OTHER_GOODS("Other Goods"),
    
    @XmlEnumValue("Patent")
    PATENT("Patent"),
    
    @XmlEnumValue("Plant Breeders Right")
    PLANT_BREEDERS_RIGHT("Plant Breeders Right"),
    
    @XmlEnumValue("Small Aircraft")
    SMALL_AIRCRAFT("Small Aircraft"),
    
    @XmlEnumValue("Trade Mark")
    TRADE_MARK("Trade Mark"),
    
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    
    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),
    
    @XmlEnumValue("Watercraft")
    WATERCRAFT("Watercraft");
    private final String value;
    CollateralClassList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static CollateralClassList fromValue(String v) {
        for (CollateralClassList c: CollateralClassList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
