/**
 * Payment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.airlinemgmt.beans;

public class Payment  implements java.io.Serializable {
    private java.lang.String cardNum;

    private java.lang.String fName;

    private int journeyId;

    private java.lang.String lName;

    private int paymentID;

    private java.lang.String paymentType;

    public Payment() {
    }

    public Payment(
           java.lang.String cardNum,
           java.lang.String fName,
           int journeyId,
           java.lang.String lName,
           int paymentID,
           java.lang.String paymentType) {
           this.cardNum = cardNum;
           this.fName = fName;
           this.journeyId = journeyId;
           this.lName = lName;
           this.paymentID = paymentID;
           this.paymentType = paymentType;
    }


    /**
     * Gets the cardNum value for this Payment.
     * 
     * @return cardNum
     */
    public java.lang.String getCardNum() {
        return cardNum;
    }


    /**
     * Sets the cardNum value for this Payment.
     * 
     * @param cardNum
     */
    public void setCardNum(java.lang.String cardNum) {
        this.cardNum = cardNum;
    }


    /**
     * Gets the fName value for this Payment.
     * 
     * @return fName
     */
    public java.lang.String getFName() {
        return fName;
    }


    /**
     * Sets the fName value for this Payment.
     * 
     * @param fName
     */
    public void setFName(java.lang.String fName) {
        this.fName = fName;
    }


    /**
     * Gets the journeyId value for this Payment.
     * 
     * @return journeyId
     */
    public int getJourneyId() {
        return journeyId;
    }


    /**
     * Sets the journeyId value for this Payment.
     * 
     * @param journeyId
     */
    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }


    /**
     * Gets the lName value for this Payment.
     * 
     * @return lName
     */
    public java.lang.String getLName() {
        return lName;
    }


    /**
     * Sets the lName value for this Payment.
     * 
     * @param lName
     */
    public void setLName(java.lang.String lName) {
        this.lName = lName;
    }


    /**
     * Gets the paymentID value for this Payment.
     * 
     * @return paymentID
     */
    public int getPaymentID() {
        return paymentID;
    }


    /**
     * Sets the paymentID value for this Payment.
     * 
     * @param paymentID
     */
    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }


    /**
     * Gets the paymentType value for this Payment.
     * 
     * @return paymentType
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this Payment.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Payment)) return false;
        Payment other = (Payment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardNum==null && other.getCardNum()==null) || 
             (this.cardNum!=null &&
              this.cardNum.equals(other.getCardNum()))) &&
            ((this.fName==null && other.getFName()==null) || 
             (this.fName!=null &&
              this.fName.equals(other.getFName()))) &&
            this.journeyId == other.getJourneyId() &&
            ((this.lName==null && other.getLName()==null) || 
             (this.lName!=null &&
              this.lName.equals(other.getLName()))) &&
            this.paymentID == other.getPaymentID() &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCardNum() != null) {
            _hashCode += getCardNum().hashCode();
        }
        if (getFName() != null) {
            _hashCode += getFName().hashCode();
        }
        _hashCode += getJourneyId();
        if (getLName() != null) {
            _hashCode += getLName().hashCode();
        }
        _hashCode += getPaymentID();
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Payment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "Payment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "cardNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "fName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "journeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "lName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "paymentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
