/**
 * CalculateurAireServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package com.example;


/**
 *  CalculateurAireServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class CalculateurAireServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public CalculateurAireServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public CalculateurAireServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getAireRectangle method
     * override this method for handling normal response from getAireRectangle operation
     */
    public void receiveResultgetAireRectangle(
        com.example.CalculateurAireServiceStub.GetAireRectangleResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAireRectangle operation
     */
    public void receiveErrorgetAireRectangle(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAireCarre method
     * override this method for handling normal response from getAireCarre operation
     */
    public void receiveResultgetAireCarre(
        com.example.CalculateurAireServiceStub.GetAireCarreResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAireCarre operation
     */
    public void receiveErrorgetAireCarre(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAireTriangle method
     * override this method for handling normal response from getAireTriangle operation
     */
    public void receiveResultgetAireTriangle(
        com.example.CalculateurAireServiceStub.GetAireTriangleResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAireTriangle operation
     */
    public void receiveErrorgetAireTriangle(java.lang.Exception e) {
    }
}
