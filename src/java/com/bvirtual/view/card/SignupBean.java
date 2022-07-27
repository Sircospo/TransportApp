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
public class SignupBean implements Serializable {

    public String email;
    public String password;
    public String cpassword;
    public String type = "CUSTOMER";
    public String accountid;
    public String fname;
    public String lname;

    public AccountModel selectedAccount;

    public SignupBean() {

    }

    public String getFname() {
        return fname;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public AccountModel getSelectedAccount() {
        return selectedAccount;
    }

    public void setSelectedAccount(AccountModel selectedAccount) {
        this.selectedAccount = selectedAccount;
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
//        FacesMessage msg = null;
//        if (password.equals(cpassword)) {
//            AccountModel accountModel = new AccountModel("", email, password, type, fname, lname);
//            ResponseModel addAccount = PaymentWebservice.addAccount(accountModel);
//            if (addAccount.isSuccess()) {
//                msg = new FacesMessage("Account added successfully");
//
//                try {
//                    FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
//                } catch (IOException ex) {
//                    Logger.getLogger(SignupBean.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            } else {
//                msg = new FacesMessage("Operation failed");
//            }
//        } else {
//            msg = new FacesMessage("Passwords do not match");
//        }
//
//        FacesContext.getCurrentInstance().addMessage(null, msg);

    }

    public void updateButtonAction() {
//        FacesMessage msg = null;
//        AccountModel accountModel = new AccountModel("", email, password, type, fname, lname);
//        ResponseModel addAccount = PaymentWebservice.updateAccount(accountModel);
//        if (addAccount.isSuccess()) {
//            msg = new FacesMessage("Account added successfully");
//
//        } else {
//            msg = new FacesMessage("Operation failed");
//        }
//        FacesContext.getCurrentInstance().addMessage(null, msg);

    }

    private static class Customer {

        public Customer() {
        }
    }

}
