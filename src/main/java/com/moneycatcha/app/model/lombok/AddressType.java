//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.20 at 10:22:11 PM AWST 
//
package com.moneycatcha.app.model;
import lombok.Data;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressType", propOrder = {
    "deliveryPoint",
    "dxBox",
    "nonStandard",
    "poBox",
    "standard"
})

@Data

@Entity
public class AddressType {
    @XmlElement(name = "DeliveryPoint")
    protected AddressType.DeliveryPoint deliveryPoint;
    @XmlElement(name = "DXBox")
    protected AddressType.DXBox dxBox;
    @XmlElement(name = "NonStandard")
    protected AddressType.NonStandard nonStandard;
    @XmlElement(name = "POBox")
    protected AddressType.POBox poBox;
    @XmlElement(name = "Standard")
    protected AddressType.Standard standard;
    @XmlAttribute(name = "AustralianPostCode")
    protected String australianPostCode;
    @XmlAttribute(name = "AustralianState")
    protected AuStateList australianState;
    @XmlAttribute(name = "City")
    protected String city;
    @XmlAttribute(name = "Country")
    protected CountryCodeList country;
    @XmlAttribute(name = "DataSource")
    protected DataSourceList dataSource;
    @XmlAttribute(name = "GNAF_ID")
    protected String gnafid;
    @XmlAttribute(name = "Latitude")
    protected BigDecimal latitude;
    @XmlAttribute(name = "LGAName")
    protected String lgaName;
    @XmlAttribute(name = "Longitude")
    protected BigDecimal longitude;
    @XmlAttribute(name = "OverseasPostCode")
    protected String overseasPostCode;
    @XmlAttribute(name = "OverseasState")
    protected String overseasState;
    @XmlAttribute(name = "Suburb")
    protected String suburb;
    @XmlAttribute(name = "TBAAddress")
    protected YesNoList tbaAddress;
    @XmlAttribute(name = "Type")
    protected AddressTypeList type;
    @XmlAttribute(name = "UniqueID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String uniqueID;
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")

@Data

@Entity
    public static class DXBox {
        @XmlAttribute(name = "Exchange")
        protected String exchange;
        @XmlAttribute(name = "Number")
        protected String number;
        @XmlAttribute(name = "Provider")
        protected String provider;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")

@Data

@Entity
    public static class DeliveryPoint {
        @XmlAttribute(name = "Identifier")
        protected String identifier;
        @XmlAttribute(name = "IdentifierBarcode")
        protected String identifierBarcode;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")

@Data

@Entity
    public static class NonStandard {
        @XmlAttribute(name = "Line1")
        protected String line1;
        @XmlAttribute(name = "Line2")
        protected String line2;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")

@Data

@Entity
    public static class POBox {
        @XmlAttribute(name = "Exchange")
        protected String exchange;
        @XmlAttribute(name = "Number")
        protected String number;
        @XmlAttribute(name = "Type")
        protected PoBoxTypeList type;
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")

@Data

@Entity
    public static class Standard {
        @XmlAttribute(name = "BuildingName")
        protected String buildingName;
        @XmlAttribute(name = "Level")
        protected String level;
        @XmlAttribute(name = "LevelType")
        protected LevelTypeList levelType;
        @XmlAttribute(name = "LotSection")
        protected String lotSection;
        @XmlAttribute(name = "StreetName")
        protected String streetName;
        @XmlAttribute(name = "StreetNumber")
        protected String streetNumber;
        @XmlAttribute(name = "StreetSuffix")
        protected StreetSuffixList streetSuffix;
        @XmlAttribute(name = "StreetType")
        protected StreetTypeList streetType;
        @XmlAttribute(name = "ToStreetNumber")
        protected String toStreetNumber;
        @XmlAttribute(name = "ToUnitNumber")
        protected String toUnitNumber;
        @XmlAttribute(name = "Unit")
        protected String unit;
        @XmlAttribute(name = "UnitType")
        protected UnitTypeList unitType;
    }
}
