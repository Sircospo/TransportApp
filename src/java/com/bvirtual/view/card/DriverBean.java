package com.bvirtual.view.card;

import com.bvirtual.model.card.DriverModel;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import com.bvirtual.model.payment.GVIVEResponseModel;
import com.bvirtual.model.payment.VerifiedIdModel;

import com.bvirtual.webservice.PaymentWebservice;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;

@ManagedBean
public class DriverBean implements Serializable {

    String driversid;
    String driversname;
    String licences;
    String phonenumbers;
    String busesid;

    public String getDriversid() {
        return driversid;
    }

    public void setDriversid(String driversid) {
        this.driversid = driversid;
    }

    public String getDriversname() {
        return driversname;
    }

    public void setDriversname(String driversname) {
        this.driversname = driversname;
    }

    public String getLicences() {
        return licences;
    }

    public void setLicences(String licences) {
        this.licences = licences;
    }

    public String getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(String phonenumbers) {
        this.phonenumbers = phonenumbers;
    }

    public String getBusesid() {
        return busesid;
    }

    public void setBusesid(String busesid) {
        this.busesid = busesid;
    }

   

    public void submitButtonAction() {
        DriverModel accountModel = new DriverModel(driversid, driversname, licences, phonenumbers, busesid);
        PaymentWebservice.addDriver(accountModel);
    }
}
