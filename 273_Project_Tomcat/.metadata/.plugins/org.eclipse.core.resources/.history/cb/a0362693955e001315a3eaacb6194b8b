/**
 * AirlineMgmtServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.airlinemgmt.service;

public class AirlineMgmtServiceServiceLocator extends org.apache.axis.client.Service implements com.airlinemgmt.service.AirlineMgmtServiceService {

    public AirlineMgmtServiceServiceLocator() {
    }


    public AirlineMgmtServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AirlineMgmtServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AirlineMgmtService
    private java.lang.String AirlineMgmtService_address = "http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService";

    public java.lang.String getAirlineMgmtServiceAddress() {
        return AirlineMgmtService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AirlineMgmtServiceWSDDServiceName = "AirlineMgmtService";

    public java.lang.String getAirlineMgmtServiceWSDDServiceName() {
        return AirlineMgmtServiceWSDDServiceName;
    }

    public void setAirlineMgmtServiceWSDDServiceName(java.lang.String name) {
        AirlineMgmtServiceWSDDServiceName = name;
    }

    public com.airlinemgmt.service.AirlineMgmtService getAirlineMgmtService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AirlineMgmtService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAirlineMgmtService(endpoint);
    }

    public com.airlinemgmt.service.AirlineMgmtService getAirlineMgmtService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.airlinemgmt.service.AirlineMgmtServiceSoapBindingStub _stub = new com.airlinemgmt.service.AirlineMgmtServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAirlineMgmtServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAirlineMgmtServiceEndpointAddress(java.lang.String address) {
        AirlineMgmtService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.airlinemgmt.service.AirlineMgmtService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.airlinemgmt.service.AirlineMgmtServiceSoapBindingStub _stub = new com.airlinemgmt.service.AirlineMgmtServiceSoapBindingStub(new java.net.URL(AirlineMgmtService_address), this);
                _stub.setPortName(getAirlineMgmtServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AirlineMgmtService".equals(inputPortName)) {
            return getAirlineMgmtService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.airlinemgmt.com", "AirlineMgmtServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.airlinemgmt.com", "AirlineMgmtService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AirlineMgmtService".equals(portName)) {
            setAirlineMgmtServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
