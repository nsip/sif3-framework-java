
package sif3.infra.common.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for createsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="create" type="{http://www.sifassociation.org/infrastructure/3.3}createType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createsType", namespace = "http://www.sifassociation.org/infrastructure/3.3", propOrder = {
    "create"
})
public class CreatesType {

    @XmlElement(namespace = "http://www.sifassociation.org/infrastructure/3.3", required = true)
    protected List<CreateType> create;

    /**
     * Gets the value of the create property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the create property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateType }
     * 
     * 
     */
    public List<CreateType> getCreate() {
        if (create == null) {
            create = new ArrayList<CreateType>();
        }
        return this.create;
    }

}
