package com.bvirtual.view.card;

import com.bvirtual.model.card.BusModel;
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
public class BusBean implements Serializable {

    String busesid;
    String types;
    String numberofseats;
    String conditions;
    String colors;
    String registrationnumbers;
    String companiesid;
    String companyname;

    public String getBusesid() {
        return busesid;
    }

    public void setBusesid(String busesid) {
        this.busesid = busesid;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getNumberofseats() {
        return numberofseats;
    }

    public void setNumberofseats(String numberofseats) {
        this.numberofseats = numberofseats;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getRegistrationnumbers() {
        return registrationnumbers;
    }

    public void setRegistrationnumbers(String registrationnumbers) {
        this.registrationnumbers = registrationnumbers;
    }

    public String getCompaniesid() {
        return companiesid;
    }

    public void setCompaniesid(String companiesid) {
        this.companiesid = companiesid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    
    public void submitButtonAction() {
        BusModel accountModel = new BusModel(busesid, types, numberofseats, conditions, colors, registrationnumbers);
        PaymentWebservice.addBus(accountModel);
    }
}
