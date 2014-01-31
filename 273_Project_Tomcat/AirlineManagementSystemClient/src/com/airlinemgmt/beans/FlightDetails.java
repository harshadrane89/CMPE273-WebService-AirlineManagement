/**
 * FlightDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.airlinemgmt.beans;

public class FlightDetails  implements java.io.Serializable {
    private java.lang.String airlineName;

    private int availableSeats;

    private java.lang.String dest;

    private java.lang.String flightDate;

    private java.lang.String flightNum;

    private com.airlinemgmt.beans.Journey[] journeyInfo;

    private com.airlinemgmt.beans.Journey[] newJourney;

    private int numOfSeats;

    private com.airlinemgmt.beans.Traveller[] passengerInfo;

    private java.lang.String src;

    public FlightDetails() {
    }

    public FlightDetails(
           java.lang.String airlineName,
           int availableSeats,
           java.lang.String dest,
           java.lang.String flightDate,
           java.lang.String flightNum,
           com.airlinemgmt.beans.Journey[] journeyInfo,
           com.airlinemgmt.beans.Journey[] newJourney,
           int numOfSeats,
           com.airlinemgmt.beans.Traveller[] passengerInfo,
           java.lang.String src) {
           this.airlineName = airlineName;
           this.availableSeats = availableSeats;
           this.dest = dest;
           this.flightDate = flightDate;
           this.flightNum = flightNum;
           this.journeyInfo = journeyInfo;
           this.newJourney = newJourney;
           this.numOfSeats = numOfSeats;
           this.passengerInfo = passengerInfo;
           this.src = src;
    }


    /**
     * Gets the airlineName value for this FlightDetails.
     * 
     * @return airlineName
     */
    public java.lang.String getAirlineName() {
        return airlineName;
    }


    /**
     * Sets the airlineName value for this FlightDetails.
     * 
     * @param airlineName
     */
    public void setAirlineName(java.lang.String airlineName) {
        this.airlineName = airlineName;
    }


    /**
     * Gets the availableSeats value for this FlightDetails.
     * 
     * @return availableSeats
     */
    public int getAvailableSeats() {
        return availableSeats;
    }


    /**
     * Sets the availableSeats value for this FlightDetails.
     * 
     * @param availableSeats
     */
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }


    /**
     * Gets the dest value for this FlightDetails.
     * 
     * @return dest
     */
    public java.lang.String getDest() {
        return dest;
    }


    /**
     * Sets the dest value for this FlightDetails.
     * 
     * @param dest
     */
    public void setDest(java.lang.String dest) {
        this.dest = dest;
    }


    /**
     * Gets the flightDate value for this FlightDetails.
     * 
     * @return flightDate
     */
    public java.lang.String getFlightDate() {
        return flightDate;
    }


    /**
     * Sets the flightDate value for this FlightDetails.
     * 
     * @param flightDate
     */
    public void setFlightDate(java.lang.String flightDate) {
        this.flightDate = flightDate;
    }


    /**
     * Gets the flightNum value for this FlightDetails.
     * 
     * @return flightNum
     */
    public java.lang.String getFlightNum() {
        return flightNum;
    }


    /**
     * Sets the flightNum value for this FlightDetails.
     * 
     * @param flightNum
     */
    public void setFlightNum(java.lang.String flightNum) {
        this.flightNum = flightNum;
    }


    /**
     * Gets the journeyInfo value for this FlightDetails.
     * 
     * @return journeyInfo
     */
    public com.airlinemgmt.beans.Journey[] getJourneyInfo() {
        return journeyInfo;
    }


    /**
     * Sets the journeyInfo value for this FlightDetails.
     * 
     * @param journeyInfo
     */
    public void setJourneyInfo(com.airlinemgmt.beans.Journey[] journeyInfo) {
        this.journeyInfo = journeyInfo;
    }


    /**
     * Gets the newJourney value for this FlightDetails.
     * 
     * @return newJourney
     */
    public com.airlinemgmt.beans.Journey[] getNewJourney() {
        return newJourney;
    }


    /**
     * Sets the newJourney value for this FlightDetails.
     * 
     * @param newJourney
     */
    public void setNewJourney(com.airlinemgmt.beans.Journey[] newJourney) {
        this.newJourney = newJourney;
    }


    /**
     * Gets the numOfSeats value for this FlightDetails.
     * 
     * @return numOfSeats
     */
    public int getNumOfSeats() {
        return numOfSeats;
    }


    /**
     * Sets the numOfSeats value for this FlightDetails.
     * 
     * @param numOfSeats
     */
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }


    /**
     * Gets the passengerInfo value for this FlightDetails.
     * 
     * @return passengerInfo
     */
    public com.airlinemgmt.beans.Traveller[] getPassengerInfo() {
        return passengerInfo;
    }


    /**
     * Sets the passengerInfo value for this FlightDetails.
     * 
     * @param passengerInfo
     */
    public void setPassengerInfo(com.airlinemgmt.beans.Traveller[] passengerInfo) {
        this.passengerInfo = passengerInfo;
    }


    /**
     * Gets the src value for this FlightDetails.
     * 
     * @return src
     */
    public java.lang.String getSrc() {
        return src;
    }


    /**
     * Sets the src value for this FlightDetails.
     * 
     * @param src
     */
    public void setSrc(java.lang.String src) {
        this.src = src;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightDetails)) return false;
        FlightDetails other = (FlightDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airlineName==null && other.getAirlineName()==null) || 
             (this.airlineName!=null &&
              this.airlineName.equals(other.getAirlineName()))) &&
            this.availableSeats == other.getAvailableSeats() &&
            ((this.dest==null && other.getDest()==null) || 
             (this.dest!=null &&
              this.dest.equals(other.getDest()))) &&
            ((this.flightDate==null && other.getFlightDate()==null) || 
             (this.flightDate!=null &&
              this.flightDate.equals(other.getFlightDate()))) &&
            ((this.flightNum==null && other.getFlightNum()==null) || 
             (this.flightNum!=null &&
              this.flightNum.equals(other.getFlightNum()))) &&
            ((this.journeyInfo==null && other.getJourneyInfo()==null) || 
             (this.journeyInfo!=null &&
              java.util.Arrays.equals(this.journeyInfo, other.getJourneyInfo()))) &&
            ((this.newJourney==null && other.getNewJourney()==null) || 
             (this.newJourney!=null &&
              java.util.Arrays.equals(this.newJourney, other.getNewJourney()))) &&
            this.numOfSeats == other.getNumOfSeats() &&
            ((this.passengerInfo==null && other.getPassengerInfo()==null) || 
             (this.passengerInfo!=null &&
              java.util.Arrays.equals(this.passengerInfo, other.getPassengerInfo()))) &&
            ((this.src==null && other.getSrc()==null) || 
             (this.src!=null &&
              this.src.equals(other.getSrc())));
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
        if (getAirlineName() != null) {
            _hashCode += getAirlineName().hashCode();
        }
        _hashCode += getAvailableSeats();
        if (getDest() != null) {
            _hashCode += getDest().hashCode();
        }
        if (getFlightDate() != null) {
            _hashCode += getFlightDate().hashCode();
        }
        if (getFlightNum() != null) {
            _hashCode += getFlightNum().hashCode();
        }
        if (getJourneyInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJourneyInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJourneyInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewJourney() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewJourney());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewJourney(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNumOfSeats();
        if (getPassengerInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengerInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengerInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSrc() != null) {
            _hashCode += getSrc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "FlightDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlineName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "airlineName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "availableSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "dest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "flightDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "flightNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journeyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "journeyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "Journey"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.airlinemgmt.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newJourney");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "newJourney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "Journey"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.airlinemgmt.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "numOfSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "passengerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "Traveller"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.airlinemgmt.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("src");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "src"));
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