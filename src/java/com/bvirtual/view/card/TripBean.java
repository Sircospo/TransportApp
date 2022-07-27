package com.bvirtual.view.card;

import com.bvirtual.model.card.TripModel1;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import com.bvirtual.model.payment.GVIVEResponseModel;
import com.bvirtual.model.payment.VerifiedIdModel;

import com.bvirtual.webservice.PaymentWebservice;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;

@ManagedBean
public class TripBean implements Serializable {

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

    public String getTripsid() {
        return tripsid;
    }

    public void setTripsid(String tripsid) {
        this.tripsid = tripsid;
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

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public void submitButtonAction() {
        TripModel1 accountModel = new TripModel1(tripsid, pickuplocation, destinations, tripdate, droppoints, restpoints, priceperkg, pickuppoint, departuretopickuptime, prices, buses);
        PaymentWebservice.addTrip(accountModel);
    }
}
