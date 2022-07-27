package com.bvirtual.view.card;

import com.bvirtual.model.card.RestpointModel;
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
public class RestpoinBean implements Serializable {

    String restpointid;
    String remarks;
    String googlemap;

    public String getRestpointid() {
        return restpointid;
    }

    public void setRestpointid(String restpointid) {
        this.restpointid = restpointid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getGooglemap() {
        return googlemap;
    }

    public void setGooglemap(String googlemap) {
        this.googlemap = googlemap;
    }

    public void submitButtonAction() {
        RestpointModel accountModel = new RestpointModel(restpointid, remarks, googlemap);
        PaymentWebservice.addRestpoint(accountModel);
    }
}
