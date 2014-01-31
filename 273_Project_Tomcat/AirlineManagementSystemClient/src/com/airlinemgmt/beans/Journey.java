/**
 * Journey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.airlinemgmt.beans;

public class Journey  implements java.io.Serializable {
    private java.lang.String airline;

    private java.lang.String arrivalDate;

    private java.lang.String boardingPoint;

    private java.lang.String custId;

    private java.lang.String departureDate;

    private java.lang.String destinationPoint;

    private float fare;

    private java.lang.String flightNum;

    private int isActive;

    private int journeyId;

    private java.lang.String maxFare;

    private java.lang.String minFare;

    private int numberOfSeats;

    public Journey() {
    }

    public Journey(
           java.lang.String airline,
           java.lang.String arrivalDate,
           java.lang.String boardingPoint,
           java.lang.String custId,
           java.lang.String departureDate,
           java.lang.String destinationPoint,
           float fare,
           java.lang.String flightNum,
           int isActive,
           int journeyId,
           java.lang.String maxFare,
           java.lang.String minFare,
           int numberOfSeats) {
           this.airline = airline;
           this.arrivalDate = arrivalDate;
           this.boardingPoint = boardingPoint;
           this.custId = custId;
           this.departureDate = departureDate;
           this.destinationPoint = destinationPoint;
           this.fare = fare;
           this.flightNum = flightNum;
           this.isActive = isActive;
           this.journeyId = journeyId;
           this.maxFare = maxFare;
           this.minFare = minFare;
           this.numberOfSeats = numberOfSeats;
    }


    /**
     * Gets the airline value for this Journey.
     * 
     * @return airline
     */
    public java.lang.String getAirline() {
        return airline;
    }


    /**
     * Sets the airline value for this Journey.
     * 
     * @param airline
     */
    public void setAirline(java.lang.String airline) {
        this.airline = airline;
    }


    /**
     * Gets the arrivalDate value for this Journey.
     * 
     * @return arrivalDate
     */
    public java.lang.String getArrivalDate() {
        return arrivalDate;
    }


    /**
     * Sets the arrivalDate value for this Journey.
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(java.lang.String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }


    /**
     * Gets the boardingPoint value for this Journey.
     * 
     * @return boardingPoint
     */
    public java.lang.String getBoardingPoint() {
        return boardingPoint;
    }


    /**
     * Sets the boardingPoint value for this Journey.
     * 
     * @param boardingPoint
     */
    public void setBoardingPoint(java.lang.String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }


    /**
     * Gets the custId value for this Journey.
     * 
     * @return custId
     */
    public java.lang.String getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this Journey.
     * 
     * @param custId
     */
    public void setCustId(java.lang.String custId) {
        this.custId = custId;
    }


    /**
     * Gets the departureDate value for this Journey.
     * 
     * @return departureDate
     */
    public java.lang.String getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this Journey.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.lang.String departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the destinationPoint value for this Journey.
     * 
     * @return destinationPoint
     */
    public java.lang.String getDestinationPoint() {
        return destinationPoint;
    }


    /**
     * Sets the destinationPoint value for this Journey.
     * 
     * @param destinationPoint
     */
    public void setDestinationPoint(java.lang.String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }


    /**
     * Gets the fare value for this Journey.
     * 
     * @return fare
     */
    public float getFare() {
        return fare;
    }


    /**
     * Sets the fare value for this Journey.
     * 
     * @param fare
     */
    public void setFare(float fare) {
        this.fare = fare;
    }


    /**
     * Gets the flightNum value for this Journey.
     * 
     * @return flightNum
     */
    public java.lang.String getFlightNum() {
        return flightNum;
    }


    /**
     * Sets the flightNum value for this Journey.
     * 
     * @param flightNum
     */
    public void setFlightNum(java.lang.String flightNum) {
        this.flightNum = flightNum;
    }


    /**
     * Gets the isActive value for this Journey.
     * 
     * @return isActive
     */
    public int getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this Journey.
     * 
     * @param isActive
     */
    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the journeyId value for this Journey.
     * 
     * @return journeyId
     */
    public int getJourneyId() {
        return journeyId;
    }


    /**
     * Sets the journeyId value for this Journey.
     * 
     * @param journeyId
     */
    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }


    /**
     * Gets the maxFare value for this Journey.
     * 
     * @return maxFare
     */
    public java.lang.String getMaxFare() {
        return maxFare;
    }


    /**
     * Sets the maxFare value for this Journey.
     * 
     * @param maxFare
     */
    public void setMaxFare(java.lang.String maxFare) {
        this.maxFare = maxFare;
    }


    /**
     * Gets the minFare value for this Journey.
     * 
     * @return minFare
     */
    public java.lang.String getMinFare() {
        return minFare;
    }


    /**
     * Sets the minFare value for this Journey.
     * 
     * @param minFare
     */
    public void setMinFare(java.lang.String minFare) {
        this.minFare = minFare;
    }


    /**
     * Gets the numberOfSeats value for this Journey.
     * 
     * @return numberOfSeats
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }


    /**
     * Sets the numberOfSeats value for this Journey.
     * 
     * @param numberOfSeats
     */
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Journey)) return false;
        Journey other = (Journey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airline==null && other.getAirline()==null) || 
             (this.airline!=null &&
              this.airline.equals(other.getAirline()))) &&
            ((this.arrivalDate==null && other.getArrivalDate()==null) || 
             (this.arrivalDate!=null &&
              this.arrivalDate.equals(other.getArrivalDate()))) &&
            ((this.boardingPoint==null && other.getBoardingPoint()==null) || 
             (this.boardingPoint!=null &&
              this.boardingPoint.equals(other.getBoardingPoint()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.destinationPoint==null && other.getDestinationPoint()==null) || 
             (this.destinationPoint!=null &&
              this.destinationPoint.equals(other.getDestinationPoint()))) &&
            this.fare == other.getFare() &&
            ((this.flightNum==null && other.getFlightNum()==null) || 
             (this.flightNum!=null &&
              this.flightNum.equals(other.getFlightNum()))) &&
            this.isActive == other.getIsActive() &&
            this.journeyId == other.getJourneyId() &&
            ((this.maxFare==null && other.getMaxFare()==null) || 
             (this.maxFare!=null &&
              this.maxFare.equals(other.getMaxFare()))) &&
            ((this.minFare==null && other.getMinFare()==null) || 
             (this.minFare!=null &&
              this.minFare.equals(other.getMinFare()))) &&
            this.numberOfSeats == other.getNumberOfSeats();
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
        if (getAirline() != null) {
            _hashCode += getAirline().hashCode();
        }
        if (getArrivalDate() != null) {
            _hashCode += getArrivalDate().hashCode();
        }
        if (getBoardingPoint() != null) {
            _hashCode += getBoardingPoint().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getDestinationPoint() != null) {
            _hashCode += getDestinationPoint().hashCode();
        }
        _hashCode += new Float(getFare()).hashCode();
        if (getFlightNum() != null) {
            _hashCode += getFlightNum().hashCode();
        }
        _hashCode += getIsActive();
        _hashCode += getJourneyId();
        if (getMaxFare() != null) {
            _hashCode += getMaxFare().hashCode();
        }
        if (getMinFare() != null) {
            _hashCode += getMinFare().hashCode();
        }
        _hashCode += getNumberOfSeats();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Journey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "Journey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "airline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "arrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boardingPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "boardingPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "custId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "departureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "destinationPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "fare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "flightNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "journeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "maxFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "minFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.airlinemgmt.com", "numberOfSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
