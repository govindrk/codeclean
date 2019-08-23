//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.20 at 10:22:11 PM AWST 
//
package com.moneycatcha.app.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialAccountType", propOrder = {
    "branchDomicile"
})
public class FinancialAccountType {
    @XmlElement(name = "BranchDomicile")
    protected FinancialAccountType.BranchDomicile branchDomicile;
    @XmlAttribute(name = "AccountName")
    protected String accountName;
    @XmlAttribute(name = "AccountNumber")
    protected String accountNumber;
    @XmlAttribute(name = "AccountTypeName")
    protected String accountTypeName;
    @XmlAttribute(name = "BSB")
    protected String bsb;
    @XmlAttribute(name = "FinancialInstitution")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String financialInstitution;
    @XmlAttribute(name = "OtherFIName")
    protected String otherFIName;
    
    public FinancialAccountType.BranchDomicile getBranchDomicile() {
        return branchDomicile;
    }
    
    public void setBranchDomicile(FinancialAccountType.BranchDomicile value) {
        this.branchDomicile = value;
    }
    
    public String getAccountName() {
        return accountName;
    }
    
    public void setAccountName(String value) {
        this.accountName = value;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }
    
    public String getAccountTypeName() {
        return accountTypeName;
    }
    
    public void setAccountTypeName(String value) {
        this.accountTypeName = value;
    }
    
    public String getBSB() {
        return bsb;
    }
    
    public void setBSB(String value) {
        this.bsb = value;
    }
    
    public String getFinancialInstitution() {
        return financialInstitution;
    }
    
    public void setFinancialInstitution(String value) {
        this.financialInstitution = value;
    }
    
    public String getOtherFIName() {
        return otherFIName;
    }
    
    public void setOtherFIName(String value) {
        this.otherFIName = value;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BranchDomicile {
        @XmlAttribute(name = "InternalName")
        protected String internalName;
        @XmlAttribute(name = "InternalNumber")
        protected String internalNumber;
        
        public String getInternalName() {
            return internalName;
        }
        
        public void setInternalName(String value) {
            this.internalName = value;
        }
        
        public String getInternalNumber() {
            return internalNumber;
        }
        
        public void setInternalNumber(String value) {
            this.internalNumber = value;
        }
    }
}
