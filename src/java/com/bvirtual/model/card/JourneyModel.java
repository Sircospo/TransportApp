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
public class JourneyModel implements EntityModel {

String journeysid; 
String tripid; 
String setoffdate; 
String remarks; 
String ratings; 
String arrivaldate;  
String tripname;
private ArrayList<Object[]> list;

    public JourneyModel() {
       
    }

    public String getTripname() {
        return tripname;
    }

    public void setTripname(String tripname) {
        this.tripname = tripname;
    }


    public JourneyModel(String journeysid, String tripid, String setoffdate, String remarks, String ratings, String arrivaldate) {
        this.journeysid = journeysid;
        this.tripid = tripid;
        this.setoffdate = setoffdate;
        this.remarks = remarks;
        this.ratings = ratings;
        this.arrivaldate = arrivaldate;
    }

    public String getJourneysid() {
        return journeysid;
    }

    public void setJourneysid(String journeysid) {
        this.journeysid = journeysid;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public String getSetoffdate() {
        return setoffdate;
    }

    public void setSetoffdate(String setoffdate) {
        this.setoffdate = setoffdate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(String arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

   
}
