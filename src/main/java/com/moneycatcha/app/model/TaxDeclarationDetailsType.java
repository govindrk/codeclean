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
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxDeclarationDetailsType")
public class TaxDeclarationDetailsType {
    @XmlAttribute(name = "AlreadyProvided")
    protected YesNoList alreadyProvided;
    @XmlAttribute(name = "ExemptionCategory")
    protected TaxDeclarationExemptionCategoryList exemptionCategory;
    @XmlAttribute(name = "Undeclared")
    protected YesNoList undeclared;
    
    public YesNoList getAlreadyProvided() {
        return alreadyProvided;
    }
    
    public void setAlreadyProvided(YesNoList value) {
        this.alreadyProvided = value;
    }
    
    public TaxDeclarationExemptionCategoryList getExemptionCategory() {
        return exemptionCategory;
    }
    
    public void setExemptionCategory(TaxDeclarationExemptionCategoryList value) {
        this.exemptionCategory = value;
    }
    
    public YesNoList getUndeclared() {
        return undeclared;
    }
    
    public void setUndeclared(YesNoList value) {
        this.undeclared = value;
    }
}
