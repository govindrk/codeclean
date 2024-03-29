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
@XmlType(name = "documentTypeList")
@XmlEnum
public enum DocumentTypeList {
    
    @XmlEnumValue("Australian Birth Certificate")
    AUSTRALIAN_BIRTH_CERTIFICATE("Australian Birth Certificate"),
    
    @XmlEnumValue("Australian Citizenship Certificate")
    AUSTRALIAN_CITIZENSHIP_CERTIFICATE("Australian Citizenship Certificate"),
    
    @XmlEnumValue("Australian Drivers Licence")
    AUSTRALIAN_DRIVERS_LICENCE("Australian Drivers Licence"),
    
    @XmlEnumValue("Australian Passport")
    AUSTRALIAN_PASSPORT("Australian Passport"),
    
    @XmlEnumValue("Australian Photo Firearms Licence")
    AUSTRALIAN_PHOTO_FIREARMS_LICENCE("Australian Photo Firearms Licence"),
    
    @XmlEnumValue("Australian Taxation Office Correspondence (with TFN)")
    AUSTRALIAN_TAXATION_OFFICE_CORRESPONDENCE_WITH_TFN("Australian Taxation Office Correspondence (with TFN)"),
    
    @XmlEnumValue("Bank Statement")
    BANK_STATEMENT("Bank Statement"),
    
    @XmlEnumValue("Centrelink or Social Security Card")
    CENTRELINK_OR_SOCIAL_SECURITY_CARD("Centrelink or Social Security Card"),
    
    @XmlEnumValue("Credit Card")
    CREDIT_CARD("Credit Card"),
    
    @XmlEnumValue("Deed Poll")
    DEED_POLL("Deed Poll"),
    
    @XmlEnumValue("Department of Veterans Affairs Card")
    DEPARTMENT_OF_VETERANS_AFFAIRS_CARD("Department of Veterans Affairs Card"),
    
    @XmlEnumValue("Electoral Roll Acknowledgement")
    ELECTORAL_ROLL_ACKNOWLEDGEMENT("Electoral Roll Acknowledgement"),
    
    @XmlEnumValue("Electricity Bill")
    ELECTRICITY_BILL("Electricity Bill"),
    
    @XmlEnumValue("Gas Bill")
    GAS_BILL("Gas Bill"),
    
    @XmlEnumValue("Government Benefits Notice")
    GOVERNMENT_BENEFITS_NOTICE("Government Benefits Notice"),
    
    @XmlEnumValue("Health Care Card")
    HEALTH_CARE_CARD("Health Care Card"),
    
    @XmlEnumValue("International Passport")
    INTERNATIONAL_PASSPORT("International Passport"),
    
    @XmlEnumValue("Internet Service Provider Bill")
    INTERNET_SERVICE_PROVIDER_BILL("Internet Service Provider Bill"),
    
    @XmlEnumValue("Landline Phone Bill")
    LANDLINE_PHONE_BILL("Landline Phone Bill"),
    
    @XmlEnumValue("Marriage Certificate")
    MARRIAGE_CERTIFICATE("Marriage Certificate"),
    
    @XmlEnumValue("Medicare Card")
    MEDICARE_CARD("Medicare Card"),
    
    @XmlEnumValue("Motor Vehicle Registration or Insurance Papers")
    MOTOR_VEHICLE_REGISTRATION_OR_INSURANCE_PAPERS("Motor Vehicle Registration or Insurance Papers"),
    
    @XmlEnumValue("National Identity Card")
    NATIONAL_IDENTITY_CARD("National Identity Card"),
    
    @XmlEnumValue("Other")
    OTHER("Other"),
    
    @XmlEnumValue("Pension Card")
    PENSION_CARD("Pension Card"),
    
    @XmlEnumValue("Professional or Trade Association Card")
    PROFESSIONAL_OR_TRADE_ASSOCIATION_CARD("Professional or Trade Association Card"),
    
    @XmlEnumValue("Proof of Age Card")
    PROOF_OF_AGE_CARD("Proof of Age Card"),
    
    @XmlEnumValue("Property Insurance Papers")
    PROPERTY_INSURANCE_PAPERS("Property Insurance Papers"),
    
    @XmlEnumValue("Property Lease or Rental Agreement")
    PROPERTY_LEASE_OR_RENTAL_AGREEMENT("Property Lease or Rental Agreement"),
    
    @XmlEnumValue("Rates Notice")
    RATES_NOTICE("Rates Notice"),
    
    @XmlEnumValue("State or Federal Government Employee Photo Identity Card")
    STATE_OR_FEDERAL_GOVERNMENT_EMPLOYEE_PHOTO_IDENTITY_CARD("State or Federal Government Employee Photo Identity Card"),
    
    @XmlEnumValue("Tax Assessment")
    TAX_ASSESSMENT("Tax Assessment"),
    
    @XmlEnumValue("Tertiary Education Institution Photo Identity Card")
    TERTIARY_EDUCATION_INSTITUTION_PHOTO_IDENTITY_CARD("Tertiary Education Institution Photo Identity Card"),
    
    @XmlEnumValue("Verification of Identity Document")
    VERIFICATION_OF_IDENTITY_DOCUMENT("Verification of Identity Document"),
    
    @XmlEnumValue("Water Utility Bill")
    WATER_UTILITY_BILL("Water Utility Bill");
    private final String value;
    DocumentTypeList(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static DocumentTypeList fromValue(String v) {
        for (DocumentTypeList c: DocumentTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
