
package com.webservice.customer.generated.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the id.co.bca.ws.mbs.soap.customer package. 
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

    private final static QName _InsertCustomer_QNAME = new QName("http://test.co.id/ws/customer/", "InsertCustomer");
    private final static QName _GetAllCustomerResponse_QNAME = new QName("http://test.co.id/ws/customer/", "GetAllCustomerResponse");
    private final static QName _InsertCustomerResponse_QNAME = new QName("http://test.co.id/ws/customer/", "InsertCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: id.co.bca.ws.mbs.soap.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link ListOfCustomerType }
     * 
     */
    public ListOfCustomerType createListOfCustomerType() {
        return new ListOfCustomerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.co.id/ws/customer/", name = "InsertCustomer")
    public JAXBElement<CustomerType> createInsertCustomer(CustomerType value) {
        return new JAXBElement<CustomerType>(_InsertCustomer_QNAME, CustomerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.co.id/ws/customer/", name = "GetAllCustomerResponse")
    public JAXBElement<ListOfCustomerType> createGetAllCustomerResponse(ListOfCustomerType value) {
        return new JAXBElement<ListOfCustomerType>(_GetAllCustomerResponse_QNAME, ListOfCustomerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.co.id/ws/customer/", name = "InsertCustomerResponse")
    public JAXBElement<String> createInsertCustomerResponse(String value) {
        return new JAXBElement<String>(_InsertCustomerResponse_QNAME, String.class, null, value);
    }

}
