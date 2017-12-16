/**
 * CalculateurAireServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package com.example;


/**
 *  CalculateurAireServiceSkeleton java skeleton for the axisService
 */
public class CalculateurAireServiceSkeleton {
    /**
     * Auto generated method signature
     *
     * @param getAireRectangle
     * @return getAireRectangleResponse
     */
    public com.example.GetAireRectangleResponse getAireRectangle(
        com.example.GetAireRectangle getAireRectangle0) {
        //TODO : fill this with the necessary business logic
        com.example.GetAireRectangleResponse res = new com.example.GetAireRectangleResponse();
        res.set_return(getAireRectangle0.getHauteur() * getAireRectangle0.getLargeur());

        return res;
    }

    /**
     * Auto generated method signature
     *
     * @param getAireCarre2
     * @return getAireCarreResponse3
     */
    public com.example.GetAireCarreResponse getAireCarre(
        com.example.GetAireCarre getAireCarre2) {
        com.example.GetAireCarreResponse res = new com.example.GetAireCarreResponse();
        res.set_return(getAireCarre2.getLongeur() * getAireCarre2.getLongeur());

        return res;
    }

    /**
     * Auto generated method signature
     *
     * @param getAireTriangle4
     * @return getAireTriangleResponse5
     */
    public com.example.GetAireTriangleResponse getAireTriangle(
        com.example.GetAireTriangle getAireTriangle4) {
        com.example.GetAireTriangleResponse res = new com.example.GetAireTriangleResponse();
        res.set_return((getAireTriangle4.getBase() * getAireTriangle4.getHauteur()) / 2);

        return res;
    }
}
