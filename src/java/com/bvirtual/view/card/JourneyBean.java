package com.bvirtual.view.card;

import com.bvirtual.model.card.JourneyModel;
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
public class JourneyBean implements Serializable {

    public String tripid;
    public String setoffdate;
    public String remarks;

    public String ratings;
    public String arrivaldate;

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

    public void submitButtonAction() {
        JourneyModel accountModel = new JourneyModel("", tripid, setoffdate, remarks, ratings, arrivaldate);
        PaymentWebservice.addJourney(accountModel);
    }
}
