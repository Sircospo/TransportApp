package com.bvirtual.model.card;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.bvirtual.webservice.EntityModel;
import java.util.ArrayList;

/**
 *
 * @author Bsystems
 */

public class CompanyModel  implements EntityModel{

    String companyid;
    String companyname;
    String location;
    String googlemap;
    String phone;
    String email;
    String rating;
    String officenumber;

    private ArrayList<Object[]> list;

    public CompanyModel() {

    }

    public CompanyModel(String companyid, String companyname, String location, String googlemap, String phone, String email, String rating, String officenumber) {
        this.companyid = companyid;
        this.companyname = companyname;
        this.location = location;
        this.googlemap = googlemap;
        this.phone = phone;
        this.email = email;
        this.rating = rating;
        this.officenumber = officenumber;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGooglemap() {
        return googlemap;
    }

    public void setGooglemap(String googlemap) {
        this.googlemap = googlemap;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getOfficenumber() {
        return officenumber;
    }

    public void setOfficenumber(String officenumber) {
        this.officenumber = officenumber;
    }



}
