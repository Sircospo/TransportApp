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
public class RestpointModel implements EntityModel {

String restpointid; 
String remarks; 
String googlemap;
  private ArrayList<Object[]> list;

    public RestpointModel() {
       
    }

  

    public RestpointModel(String restpointid, String remarks, String googlemap) {
        this.restpointid = restpointid;
        this.remarks = remarks;
        this.googlemap = googlemap;
    }

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

  

}
