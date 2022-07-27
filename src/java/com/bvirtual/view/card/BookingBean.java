package com.bvirtual.view.card;

import com.bvirtual.model.card.BookingModel;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import com.bvirtual.model.payment.GVIVEResponseModel;
import com.bvirtual.model.payment.VerifiedIdModel;

import com.bvirtual.webservice.PaymentWebservice;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;

@ManagedBean
public class BookingBean implements Serializable {

    public String tripname;
    public String payments;

    public String getTripname() {
        return tripname;
    }

    public void setTripname(String tripname) {
        this.tripname = tripname;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public void submitButtonAction() {
        BookingModel accountModel = new BookingModel("", tripname, payments);
        PaymentWebservice.addBooking(accountModel);
    }
}
