/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvirtual.model.payment;

import com.bvirtual.webservice.EntityModel;

/**
 *
 * @author Bsystems
 */

public class GVIVERequestModel implements EntityModel{

    String idNumber;

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

     public GVIVERequestModel() {
    }



}
