/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvirtual.webservice;

import com.bvirtual.webservice.EntityModel;

/**
 *
 * @author Bsystems
 */
public class ResponseModel implements EntityModel {

    String recordId;
    boolean success;
    String message;
    String entity;
    String operation;

    
    public ResponseModel() {
    }

    public ResponseModel(String recordId, boolean success, String message, String entity, String operation) {
        this.recordId = recordId;
        this.success = success;
        this.message = message;
        this.entity = entity;
        this.operation = operation;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }



}
