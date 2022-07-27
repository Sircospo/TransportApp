package com.bvirtual.view.card;

import com.bvirtual.model.card.PickupModel;
import com.bvirtual.model.card.RestpointModel;
import com.bvirtual.model.card.TripModel1;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import com.bvirtual.model.payment.GVIVEResponseModel;
import com.bvirtual.model.payment.VerifiedIdModel;

import com.bvirtual.webservice.PaymentWebservice;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;

@ManagedBean
public class PickupBean implements Serializable {

    String Pickuplocationsid;
    String Pickuppoint;
    String googlemap;
    String remarks;
    String tripsid;
    String tripname;
    private List<TripModel1> tripModel;

      @PostConstruct
    public void init() {
        tripModel = PaymentWebservice.getTrips();
    }
    public String getPickuplocationsid() {
        return Pickuplocationsid;
    }

    public void setPickuplocationsid(String restpointid) {
        this.Pickuplocationsid = Pickuplocationsid;
    }

    public String getPickuppoint() {
        return Pickuppoint;
    }

    public void setPickuppoint(String Pickuppoint) {
        this.Pickuppoint = Pickuppoint;
    }

    public String getTripsid() {
        return tripsid;
    }

    public void setTripsid(String tripsid) {
        this.tripsid = tripsid;
    }

    public String getTripname() {
        return tripname;
    }

    public void setTripname(String tripname) {
        this.tripname = tripname;
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

    public void submitButtonAction() {
//      PickupModel accountModel = new PickupModel(Pickuplocationsid,Pickuppoint,googlemap, remarks, tripsid,tripname);
//        PaymentWebservice.addPickup(accountModel);
//        
//         try {
//                FacesContext.getCurrentInstance().getExternalContext().redirect("crm.xhtml");
//            } catch (IOException ex) {
//                Logger.getLogger(AccountBean.class.getName()).log(Level.SEVERE, null, ex);
//            }
    }
}
