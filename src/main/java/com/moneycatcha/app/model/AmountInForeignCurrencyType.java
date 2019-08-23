//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.20 at 10:22:11 PM AWST 
//
package com.moneycatcha.app.model;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amountInForeignCurrencyType")
public class AmountInForeignCurrencyType {
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CurrencyCode")
    protected CurrencyCodeList currencyCode;
    @XmlAttribute(name = "ExchangeDateTime")
    protected XMLGregorianCalendar exchangeDateTime;
    @XmlAttribute(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    
    public BigDecimal getAmount() {
        return amount;
    }
    
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }
    
    public CurrencyCodeList getCurrencyCode() {
        return currencyCode;
    }
    
    public void setCurrencyCode(CurrencyCodeList value) {
        this.currencyCode = value;
    }
    
    public XMLGregorianCalendar getExchangeDateTime() {
        return exchangeDateTime;
    }
    
    public void setExchangeDateTime(XMLGregorianCalendar value) {
        this.exchangeDateTime = value;
    }
    
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }
    
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }
}
