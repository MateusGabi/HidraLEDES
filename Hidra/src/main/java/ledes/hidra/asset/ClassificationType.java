
package ledes.hidra.asset;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classificationType", propOrder = {
    "contexts",
    "descriptionGroups"
})
public class ClassificationType {

    @XmlElement(required = true)
    protected ClassificationType.Contexts contexts;
    @XmlElement(required = true)
    protected ClassificationType.DescriptionGroups descriptionGroups;

    /**
     * Gets the value of the property contexts.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType.Contexts }
     *     
     */
    public ClassificationType.Contexts getContexts() {
        return contexts;
    }

    /**
     * Define the value of the property contexts.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType.Contexts }
     *     
     */
    public void setContexts(ClassificationType.Contexts value) {
        this.contexts = value;
    }

    /**
     * Gets the value of the property descriptionGroups.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType.DescriptionGroups }
     *     
     */
    public ClassificationType.DescriptionGroups getDescriptionGroups() {
        return descriptionGroups;
    }

    /**
     * Define the value of the property descriptionGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType.DescriptionGroups }
     *     
     */
    public void setDescriptionGroups(ClassificationType.DescriptionGroups value) {
        this.descriptionGroups = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="context" type="{}context" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "context"
    })
    public static class Contexts {

        @XmlElement(required = true)
        protected List<Context> context;

        /**
         * Gets the value of the context property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the context property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContext().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Context }
         * 
         * 
         * @return 
         */
        public List<Context> getContext() {
            if (context == null) {
                context = new ArrayList<Context>();
            }
            return this.context;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="descriptionGroups" type="{}descriptionGroup" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descriptionGroups"
    })
    public static class DescriptionGroups {

        @XmlElement(required = true)
        protected List<DescriptionGroup> descriptionGroups;

        /**
         * Gets the value of the descriptionGroups property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descriptionGroups property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescriptionGroups().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DescriptionGroup }
         * 
         * 
         * @return 
         */
        public List<DescriptionGroup> getDescriptionGroups() {
            if (descriptionGroups == null) {
                descriptionGroups = new ArrayList<DescriptionGroup>();
            }
            return this.descriptionGroups;
        }

    }

}
