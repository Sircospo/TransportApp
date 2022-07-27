/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvirtual.model.card;


import com.bvirtual.webservice.EntityModel;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Bsystems
 */
@XmlRootElement
public class TripModel1 implements EntityModel {

    String tripsid;
    String pickuplocation;
    String destinations;
    String tripdate;
    String droppoints;
    String restpoints;
    String priceperkg;
    String pickuppoint;
    String departuretopickuptime;
    String prices;
    String buses;
      String busname;

    private ArrayList<Object[]> list;

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public TripModel1() {

    }

    public String getPickuplocation() {
        return pickuplocation;
    }

    public void setPickuplocation(String pickuplocation) {
        this.pickuplocation = pickuplocation;
    }

    public String getDestinations() {
        return destinations;
    }

    public void setDestinations(String destinations) {
        this.destinations = destinations;
    }

    public String getTripdate() {
        return tripdate;
    }

    public void setTripdate(String tripdate) {
        this.tripdate = tripdate;
    }

    public String getDroppoints() {
        return droppoints;
    }

    public void setDroppoints(String droppoints) {
        this.droppoints = droppoints;
    }

    public String getRestpoints() {
        return restpoints;
    }

    public void setRestpoints(String restpoints) {
        this.restpoints = restpoints;
    }

    public String getPriceperkg() {
        return priceperkg;
    }

    public void setPriceperkg(String priceperkg) {
        this.priceperkg = priceperkg;
    }

    public String getPickuppoint() {
        return pickuppoint;
    }

    public void setPickuppoint(String pickuppoint) {
        this.pickuppoint = pickuppoint;
    }

    public String getDeparturetopickuptime() {
        return departuretopickuptime;
    }

    public void setDeparturetopickuptime(String departuretopickuptime) {
        this.departuretopickuptime = departuretopickuptime;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public String getBuses() {
        return buses;
    }

    public void setBuses(String buses) {
        this.buses = buses;
    }

 

    public TripModel1(String tripsid, String pickuplocation, String destinations, String tripdate, String droppoints, String restpoints, String priceperkg, String pickuppoint, String departuretopickuptime, String prices, String buses) {
        this.tripsid = tripsid;
        this.pickuplocation = pickuplocation;
        this.destinations = destinations;
        this.tripdate = tripdate;
        this.droppoints = droppoints;
        this.restpoints = restpoints;
        this.priceperkg = priceperkg;
        this.pickuppoint = pickuppoint;
        this.departuretopickuptime = departuretopickuptime;
        this.prices = prices;
        this.buses = buses;

    }

    public String getTripsid() {
        return tripsid;
    }

    public void setTripsid(String tripsid) {
        this.tripsid = tripsid;
    }

  

}
