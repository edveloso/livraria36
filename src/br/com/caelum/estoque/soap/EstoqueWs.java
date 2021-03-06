
package br.com.caelum.estoque.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EstoqueWs", targetNamespace = "http://caelum.com.br/v1/estoquews")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EstoqueWs {


    /**
     * 
     * @param parameters
     * @param token
     * @return
     *     returns br.com.caelum.estoque.soap.ConsultaEstoqueResponse
     */
    @WebMethod(operationName = "ConsultaEstoque")
    @WebResult(name = "ConsultaEstoqueResponse", targetNamespace = "http://caelum.com.br/v1/estoquews", partName = "parameters")
    public ConsultaEstoqueResponse consultaEstoque(
        @WebParam(name = "ConsultaEstoque", targetNamespace = "http://caelum.com.br/v1/estoquews", partName = "parameters")
        ConsultaEstoque parameters,
        @WebParam(name = "token", targetNamespace = "http://caelum.com.br/v1/estoquews", header = true, partName = "token")
        String token);

}
