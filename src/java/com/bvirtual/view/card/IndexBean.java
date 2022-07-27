package com.bvirtual.view.card;

import com.bvirtual.model.card.AccountModel;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import com.bvirtual.model.payment.GVIVEResponseModel;
import com.bvirtual.model.payment.VerifiedIdModel;

import com.bvirtual.webservice.PaymentWebservice;
import com.bvirtual.webservice.ResponseModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;

@ManagedBean
public class IndexBean implements Serializable {

    public IndexBean() {

    }

    @PostConstruct
    public void init() {

//         Object get = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("accountid");
//         if(get == null){
//              FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
//         }
        // FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
    }

    public void logoutButtonAction() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
        FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
    }

    public void submitButtonAction2() throws IOException {

        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("tobook", "true");
        Object get = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("accountid");

//        Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        if (get == null) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
        } else {
            FacesContext.getCurrentInstance().getExternalContext().redirect("addbooking2.xhtml");
        }

    }

    public void submitButtonAction() throws IOException {

        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("isBookingClicked", "true");
        Object get = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("accountid");

        if (get == null) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
        } else {
            FacesContext.getCurrentInstance().getExternalContext().redirect("addbooking3.xhtml");
        }

    }

}
