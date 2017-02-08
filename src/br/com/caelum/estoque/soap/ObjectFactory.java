
package br.com.caelum.estoque.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.estoque.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultaEstoqueResponse_QNAME = new QName("http://caelum.com.br/v1/estoquews", "ConsultaEstoqueResponse");
    private final static QName _Token_QNAME = new QName("http://caelum.com.br/v1/estoquews", "token");
    private final static QName _ConsultaEstoque_QNAME = new QName("http://caelum.com.br/v1/estoquews", "ConsultaEstoque");
    private final static QName _ItemEstoque_QNAME = new QName("http://caelum.com.br/v1/estoquews", "ItemEstoque");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.estoque.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemEstoque }
     * 
     */
    public ItemEstoque createItemEstoque() {
        return new ItemEstoque();
    }

    /**
     * Create an instance of {@link ConsultaEstoque }
     * 
     */
    public ConsultaEstoque createConsultaEstoque() {
        return new ConsultaEstoque();
    }

    /**
     * Create an instance of {@link ConsultaEstoqueResponse }
     * 
     */
    public ConsultaEstoqueResponse createConsultaEstoqueResponse() {
        return new ConsultaEstoqueResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaEstoqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caelum.com.br/v1/estoquews", name = "ConsultaEstoqueResponse")
    public JAXBElement<ConsultaEstoqueResponse> createConsultaEstoqueResponse(ConsultaEstoqueResponse value) {
        return new JAXBElement<ConsultaEstoqueResponse>(_ConsultaEstoqueResponse_QNAME, ConsultaEstoqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caelum.com.br/v1/estoquews", name = "token")
    public JAXBElement<String> createToken(String value) {
        return new JAXBElement<String>(_Token_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaEstoque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caelum.com.br/v1/estoquews", name = "ConsultaEstoque")
    public JAXBElement<ConsultaEstoque> createConsultaEstoque(ConsultaEstoque value) {
        return new JAXBElement<ConsultaEstoque>(_ConsultaEstoque_QNAME, ConsultaEstoque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemEstoque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caelum.com.br/v1/estoquews", name = "ItemEstoque")
    public JAXBElement<ItemEstoque> createItemEstoque(ItemEstoque value) {
        return new JAXBElement<ItemEstoque>(_ItemEstoque_QNAME, ItemEstoque.class, null, value);
    }

}
