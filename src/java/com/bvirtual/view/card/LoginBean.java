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
public class LoginBean implements Serializable {

    public String email;
    public String password;
    public String username;

    public LoginBean() {

    }

    public String getUsername() {
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("username") != null) {
            return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("username").toString();
        } else {
            return username;
        }
    }

    public void setUsername(String username) {
        this.username = username;
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
    

    public void submitButtonAction() {
        // FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
//        FacesMessage msg = null;
//        ResponseModel addAccount = PaymentWebservice.authenticate(email, password);
//        if (addAccount.isSuccess()) {
//            msg = new FacesMessage("login", "Login successfully");
//            String[] split = addAccount.getRecordId().split(";");
//            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("accountid", split[0]);
//            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("username", split[1]);
//            Object get6 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("accountid");
//            Object get = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("isBookingClicked");
//            Object get2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("tobook");
//            try {
//                if (split[1] != null && split[1].toLowerCase().contains("admin")) {
//                    FacesContext.getCurrentInstance().getExternalContext().redirect("crm.xhtml");
//                } else if (get != null && get.toString().equals("true")) {
//                     //FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("isBookingClicked", "false");
//                    FacesContext.getCurrentInstance().getExternalContext().redirect("addbooking3.xhtml");
//                } else if (get2 != null && get2.toString().equals("true")) {
//                    FacesContext.getCurrentInstance().getExternalContext().redirect("addbooking2.xhtml");
//                } else {
//                    FacesContext.getCurrentInstance().getExternalContext().redirect("index2.xhtml");
//                }
//
//            } catch (IOException ex) {
//                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        } else {
//            msg = new FacesMessage("login", "Operation failed Username and Password does not match ");
//        }
//        FacesContext.getCurrentInstance().addMessage(null, msg);

    }

}
