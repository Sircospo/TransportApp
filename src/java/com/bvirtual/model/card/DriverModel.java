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
public class DriverModel implements EntityModel {

    String driversid;
    String driversname;
    String licences;
    String phonenumbers;
    String busesid;
    String busname;


    public DriverModel() {

    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public DriverModel(String driversid, String driversname, String licences, String phonenumbers, String busesid) {
        this.driversid = driversid;
        this.driversname = driversname;
        this.licences = licences;
        this.phonenumbers = phonenumbers;
        this.busesid = busesid;
    }

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

}
