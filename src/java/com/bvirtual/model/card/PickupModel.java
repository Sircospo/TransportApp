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
public class PickupModel implements EntityModel {

    String pickuplocationsid;
    String pickuppoint;
    String googlemap;
    String remarks;
    String tripsid;
    String tripname;
    private ArrayList<Object[]> list;

    public PickupModel() {

    }

    public String getTripname() {
        return tripname;
    }

    public void setTripname(String tripname) {
        this.tripname = tripname;
    }

    public String getPickuplocationsid() {
        return pickuplocationsid;
    }

    public void setPickuplocationsid(String pickuplocationsid) {
        this.pickuplocationsid = pickuplocationsid;
    }

    public String getPickuppoint() {
        return pickuppoint;
    }

    public void setPickuppoint(String pickuppoint) {
        this.pickuppoint = pickuppoint;
    }

    public String getGooglemap() {
        return googlemap;
    }

    public void setGooglemap(String googlemap) {
        this.googlemap = googlemap;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTripsid() {
        return tripsid;
    }

    public void setTripsid(String tripsid) {
        this.tripsid = tripsid;
    }

    public PickupModel(String pickuplocationsid, String pickuppoint, String googlemap, String remarks, String tripsid) {
        this.pickuplocationsid = pickuplocationsid;
        this.pickuppoint = pickuppoint;
        this.googlemap = googlemap;
        this.remarks = remarks;
        this.tripsid = tripsid;
    }

}
