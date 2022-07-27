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
public class BusModel implements EntityModel {

    String busesid; 
    String types; 
    String numberofseats; 
    String conditions; 
    String colors;
    String registrationnumbers; 
    String companiesid; 
    String companyname;
    private ArrayList<Object[]> list;

    public BusModel() {
        
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getBusesid() {
        return busesid;
    }

    public BusModel(String busesid, String types, String numberofseats, String conditions, String colors, String registrationnumbers) {
        this.busesid = busesid;
        this.types = types;
        this.numberofseats = numberofseats;
        this.conditions = conditions;
        this.colors = colors;
        this.registrationnumbers = registrationnumbers;
        this.companiesid = companiesid;
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
    
    


}
