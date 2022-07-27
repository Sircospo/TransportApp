package com.bvirtual.model.card;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.bvirtual.webservice.EntityModel;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Bsystems
 */
@XmlRootElement
public class BookingModel implements EntityModel {

String bookingsid; 
String tripsid;
String payments;
String tripname;
    private ArrayList<Object[]> list;

    public BookingModel() {
        
    }

    public String getTripname() {
        return tripname;
    }

    public void setTripname(String tripname) {
        this.tripname = tripname;
    }

    public String getBookingsid() {
        return bookingsid;
    }

    public void setBookingsid(String bookingsid) {
        this.bookingsid = bookingsid;
    }

    public String getTripsid() {
        return tripsid;
    }

    public void setTripsid(String tripsid) {
        this.tripsid = tripsid;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public BookingModel(String bookingsid, String tripsid, String payments) {
        this.bookingsid = bookingsid;
        this.tripsid = tripsid;
        this.payments = payments;
    }
  


}
