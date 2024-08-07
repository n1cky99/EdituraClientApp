
package com.aosd.editura.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EdituraWS", targetNamespace = "http://editura.aosd.com/", wsdlLocation = "http://localhost:8080/Editura/EdituraWS?wsdl")
public class EdituraWS_Service
    extends Service
{

    private final static URL EDITURAWS_WSDL_LOCATION;
    private final static WebServiceException EDITURAWS_EXCEPTION;
    private final static QName EDITURAWS_QNAME = new QName("http://editura.aosd.com/", "EdituraWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Editura/EdituraWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EDITURAWS_WSDL_LOCATION = url;
        EDITURAWS_EXCEPTION = e;
    }

    public EdituraWS_Service() {
        super(__getWsdlLocation(), EDITURAWS_QNAME);
    }

    public EdituraWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EDITURAWS_QNAME, features);
    }

    public EdituraWS_Service(URL wsdlLocation) {
        super(wsdlLocation, EDITURAWS_QNAME);
    }

    public EdituraWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EDITURAWS_QNAME, features);
    }

    public EdituraWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EdituraWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EdituraWS
     */
    @WebEndpoint(name = "EdituraWSPort")
    public EdituraWS getEdituraWSPort() {
        return super.getPort(new QName("http://editura.aosd.com/", "EdituraWSPort"), EdituraWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EdituraWS
     */
    @WebEndpoint(name = "EdituraWSPort")
    public EdituraWS getEdituraWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://editura.aosd.com/", "EdituraWSPort"), EdituraWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EDITURAWS_EXCEPTION!= null) {
            throw EDITURAWS_EXCEPTION;
        }
        return EDITURAWS_WSDL_LOCATION;
    }

}
