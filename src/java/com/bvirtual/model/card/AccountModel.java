package com.bvirtual.model.card;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.bvirtual.webservice.EntityModel;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Bsystems
 */
@ManagedBean
public class AccountModel implements EntityModel {

    String accountid;
    String email;
    String password;
    String type;

    public AccountModel() {

    }

    @PostConstruct
    public void init() {
        AccountModel get = (AccountModel) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("");
        if(get != null){
            accountid = get.getAccountid();
            email = get.getEmail();
            password = get.getPassword();
            type = get.getType();
        }
    }

    public AccountModel(String accountid, String email, String password, String type) {
        this.accountid = accountid;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
