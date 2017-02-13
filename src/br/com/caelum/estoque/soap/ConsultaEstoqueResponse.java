
package br.com.caelum.estoque.soap;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConsultaEstoqueResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultaEstoqueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estoques" type="{http://caelum.com.br/v1/estoquews}itemEstoque" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaEstoqueResponse", propOrder = {
    "estoques"
})
public class ConsultaEstoqueResponse {

    @XmlElement(name = "Estoques")
    protected List<ItemEstoque> estoques;

    /**
     * Gets the value of the estoques property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estoques property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstoques().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEstoque }
     * 
     * 
     */
    public List<ItemEstoque> getEstoques() {
        if (estoques == null) {
            estoques = new ArrayList<ItemEstoque>();
        }
        return this.estoques;
    }

}