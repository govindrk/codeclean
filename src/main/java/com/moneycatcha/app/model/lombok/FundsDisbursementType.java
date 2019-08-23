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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundsDisbursementType", propOrder = {
    "accountNumber",
    "billerDetails",
    "personName"
})

@Data

@Entity
public class FundsDisbursementType {
    @XmlElement(name = "AccountNumber")
    protected FinancialAccountType accountNumber;
    @XmlElement(name = "BillerDetails")
    protected FundsDisbursementType.BillerDetails billerDetails;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CompanyName")
    protected String companyName;
    @XmlAttribute(name = "Method")
    protected SurplusFundsDisbursementMethodList method;
    @XmlAttribute(name = "UniqueID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String uniqueID;
    @XmlAttribute(name = "x_Account")
    @XmlIDREF
    protected Object xAccount;
    @XmlAttribute(name = "x_Address")
    @XmlIDREF
    protected Object xAddress;
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")

@Data

@Entity
    public static class BillerDetails {
        @XmlAttribute(name = "BillerCode")
        protected String billerCode;
        @XmlAttribute(name = "BillerName")
        protected String billerName;
        @XmlAttribute(name = "CRN")
        protected String crn;
    }
}
