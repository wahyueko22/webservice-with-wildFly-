
package com.webservice.customer.generated.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomerSoapType", targetNamespace = "http://test.co.id/ws/customer/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerSoapType {


    /**
     * Request All Customer
     * 
     * @return
     *     returns id.co.bca.ws.mbs.soap.customer.ListOfCustomerType
     */
    @WebMethod(operationName = "GetAllCustomer")
    @WebResult(name = "GetAllCustomerResponse", targetNamespace = "http://test.co.id/ws/customer/", partName = "parameters")
    public ListOfCustomerType getAllCustomer();

    /**
     * Insert Customer
     * 
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InsertCustomer")
    @WebResult(name = "InsertCustomerResponse", targetNamespace = "http://test.co.id/ws/customer/", partName = "parameters")
    public String insertCustomer(
        @WebParam(name = "InsertCustomer", targetNamespace = "http://test.co.id/ws/customer/", partName = "parameters")
        CustomerType parameters);

}