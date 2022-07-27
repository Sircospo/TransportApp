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
public class AccountBean implements Serializable {

    public String email;
    public String password;
    public String type;
    public String accountid;
    public AccountModel selectedAccount;
    
    
    public AccountBean(){
        
    }

    public String getEmail() {
        return email;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
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

    public void submitButtonAction() {
        FacesMessage msg = null;
        AccountModel accountModel = new AccountModel("", email, password, type);
        ResponseModel addAccount = PaymentWebservice.addAccount(accountModel);
        if (addAccount.isSuccess()) {
            msg = new FacesMessage("Account added successfully");

        } else {
            msg = new FacesMessage("Operation failed");
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }
    
    public void updateButtonAction() {
        FacesMessage msg = null;
        AccountModel accountModel = new AccountModel("", email, password, type);
        ResponseModel addAccount = PaymentWebservice.updateAccount(accountModel);
        if (addAccount.isSuccess()) {
            msg = new FacesMessage("Account added successfully");

        } else {
            msg = new FacesMessage("Operation failed");
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }
    
    
}
