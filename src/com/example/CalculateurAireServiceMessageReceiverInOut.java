/**
 * CalculateurAireServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package com.example;


/**
 *  CalculateurAireServiceMessageReceiverInOut message receiver
 */
public class CalculateurAireServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            CalculateurAireServiceSkeleton skel = (CalculateurAireServiceSkeleton) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("getAireRectangle".equals(methodName)) {
                    com.example.GetAireRectangleResponse getAireRectangleResponse13 =
                        null;
                    com.example.GetAireRectangle wrappedParam = (com.example.GetAireRectangle) fromOM(msgContext.getEnvelope()
                                                                                                                .getBody()
                                                                                                                .getFirstElement(),
                            com.example.GetAireRectangle.class);

                    getAireRectangleResponse13 = skel.getAireRectangle(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getAireRectangleResponse13, false,
                            new javax.xml.namespace.QName(
                                "http://example.com", "getAireRectangleResponse"));
                } else if ("getAireCarre".equals(methodName)) {
                    com.example.GetAireCarreResponse getAireCarreResponse15 = null;
                    com.example.GetAireCarre wrappedParam = (com.example.GetAireCarre) fromOM(msgContext.getEnvelope()
                                                                                                        .getBody()
                                                                                                        .getFirstElement(),
                            com.example.GetAireCarre.class);

                    getAireCarreResponse15 = skel.getAireCarre(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getAireCarreResponse15, false,
                            new javax.xml.namespace.QName(
                                "http://example.com", "getAireCarreResponse"));
                } else if ("getAireTriangle".equals(methodName)) {
                    com.example.GetAireTriangleResponse getAireTriangleResponse17 =
                        null;
                    com.example.GetAireTriangle wrappedParam = (com.example.GetAireTriangle) fromOM(msgContext.getEnvelope()
                                                                                                              .getBody()
                                                                                                              .getFirstElement(),
                            com.example.GetAireTriangle.class);

                    getAireTriangleResponse17 = skel.getAireTriangle(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getAireTriangleResponse17, false,
                            new javax.xml.namespace.QName(
                                "http://example.com", "getAireTriangleResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        com.example.GetAireRectangle param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.example.GetAireRectangle.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.example.GetAireRectangleResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.example.GetAireRectangleResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(com.example.GetAireCarre param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.example.GetAireCarre.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.example.GetAireCarreResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.example.GetAireCarreResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.example.GetAireTriangle param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.example.GetAireTriangle.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.example.GetAireTriangleResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.example.GetAireTriangleResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.example.GetAireRectangleResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.example.GetAireRectangleResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.example.GetAireRectangleResponse wrapgetAireRectangle() {
        com.example.GetAireRectangleResponse wrappedElement = new com.example.GetAireRectangleResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.example.GetAireCarreResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.example.GetAireCarreResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.example.GetAireCarreResponse wrapgetAireCarre() {
        com.example.GetAireCarreResponse wrappedElement = new com.example.GetAireCarreResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.example.GetAireTriangleResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.example.GetAireTriangleResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.example.GetAireTriangleResponse wrapgetAireTriangle() {
        com.example.GetAireTriangleResponse wrappedElement = new com.example.GetAireTriangleResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (com.example.GetAireCarre.class.equals(type)) {
                return com.example.GetAireCarre.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.example.GetAireCarreResponse.class.equals(type)) {
                return com.example.GetAireCarreResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.example.GetAireRectangle.class.equals(type)) {
                return com.example.GetAireRectangle.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.example.GetAireRectangleResponse.class.equals(type)) {
                return com.example.GetAireRectangleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.example.GetAireTriangle.class.equals(type)) {
                return com.example.GetAireTriangle.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.example.GetAireTriangleResponse.class.equals(type)) {
                return com.example.GetAireTriangleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
