//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.20 at 10:22:11 PM AWST 
//
package com.moneycatcha.app.model;
import lombok.Data;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentationInstructionsType")

@Data

@Entity
public class DocumentationInstructionsType {
    @XmlAttribute(name = "Method")
    protected DocumentationInstructionsMethodList method;
    @XmlAttribute(name = "SendDocumentsTo")
    protected SendDocumentsToList sendDocumentsTo;
    @XmlAttribute(name = "x_DeliverTo")
    @XmlIDREF
    protected Object xDeliverTo;
    @XmlAttribute(name = "x_NominatedAuthority")
    @XmlIDREF
    protected Object xNominatedAuthority;
}
