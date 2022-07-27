package com.bvirtual.view.payment;

import com.bvirtual.model.card.AccountModel;
import com.bvirtual.model.card.BookingModel;
import com.bvirtual.model.card.BusModel;
import com.bvirtual.model.card.CompanyModel;

import com.bvirtual.model.card.DriverModel;
import com.bvirtual.model.card.JourneyModel;
import com.bvirtual.model.card.PickupModel;
import com.bvirtual.model.card.RestpointModel;
import com.bvirtual.model.card.TripModel;
import com.bvirtual.model.card.TripModel1;

import com.bvirtual.model.payment.CallbackModel;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import com.bvirtual.model.payment.PaymentModel;
import com.bvirtual.model.payment.VerifiedIdModel;

import com.bvirtual.webservice.PaymentWebservice;
import com.bvirtual.webservice.ResponseModel;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

@ManagedBean
public class CRMbean implements Serializable {

    private String mobileNumber;
    private VerifiedIdModel selectedVerifiedIdModel;
    private PaymentModel selectedPaymentModel;
    private CallbackModel selectedCallbackModel;

    private List<PaymentModel> paymentModel;
    private List<CallbackModel> callbackModel;
    private VerifiedIdModel verifiedIdModel;

    private List<DriverModel> driverModel;

    private List<CompanyModel> companyModel;

    private List<AccountModel> accountModel;
    private List<BusModel> busModel;
    private List<JourneyModel> journeyModel;
    private List<TripModel1> tripModel;
    private List<RestpointModel> RestpointModel;
    private List<PickupModel> pickuplocationModel;
    private List<BookingModel> bookingModel;
    private AccountModel selectedAccount;
    private FacesMessage msg;

    public VerifiedIdModel getVerifiedIdModel() {
        return verifiedIdModel;
    }

    public List<CompanyModel> getCompanyModel() {
        return companyModel;
    }

    public void setCompanyModel(List<CompanyModel> companyModel) {
        this.companyModel = companyModel;
    }

    public void setVerifiedIdModel(VerifiedIdModel verifiedIdModel) {
        this.verifiedIdModel = verifiedIdModel;
    }

    public List<PaymentModel> getPaymentModel() {
        return paymentModel;
    }

    public VerifiedIdModel getSelectedVerifiedIdModel() {
        return selectedVerifiedIdModel;
    }

    public void setSelectedVerifiedIdModel(VerifiedIdModel selectedVerifiedIdModel) {
        this.selectedVerifiedIdModel = selectedVerifiedIdModel;
    }

    public CallbackModel getSelectedCallbackModel() {
        return selectedCallbackModel;
    }

    public void setSelectedCallbackModel(CallbackModel selectedCallbackModel) {
        this.selectedCallbackModel = selectedCallbackModel;
    }

    public List<CallbackModel> getCallbackModel() {
        return callbackModel;
    }

    public void setCallbackModel(List<CallbackModel> callbackModel) {
        this.callbackModel = callbackModel;
    }

    public PaymentModel getSelectedPaymentModel() {
        return selectedPaymentModel;
    }

    public void setSelectedPaymentModel(PaymentModel selectedPaymentModel) {
        this.selectedPaymentModel = selectedPaymentModel;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void searchAction() {
        driverModel = PaymentWebservice.getDrivers();
        busModel = PaymentWebservice.getBuses();
        journeyModel = PaymentWebservice.getJourneys();
        accountModel = PaymentWebservice.getAccounts();
        tripModel = PaymentWebservice.getTrips();
        RestpointModel = PaymentWebservice.getRestpoints();
        pickuplocationModel = PaymentWebservice.getPickuplocations();
        bookingModel = PaymentWebservice.getBookings();
//        verifiedIdModel = PaymentWebservice.getVerifiedId(mobileNumber);
//        accountModel = NewClass.getAccount(mobileNumber);
//        fundingModel = NewClass.getFundings(mobileNumber);
//        fundsTransferModel = NewClass.getTrsnsfers(mobileNumber);
//        cardModel = NewClass.getCards(mobileNumber);
//        plasticCardModel = NewClass.getAllPlasticCards(mobileNumber);
    }

    public void deleteAction() {
        //PaymentWebservice.deleteAccount(mobileNumber);

    }

    public void bookAction() {
        //PaymentWebservice.deleteAccount(mobileNumber);

    }

    public void setSelectedAccount(AccountModel selected) {
        this.selectedAccount = selected;
    }

    public AccountModel getSelectedAccount() {
        return selectedAccount;
    }

    public void updateAccountAction() {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("selectedAccount", selectedAccount);
//           FacesContext.getCurrentInstance().getExternalContext().
    }

    public void deleteAccountAction() {
        ResponseModel addAccount = PaymentWebservice.deleteAccount(selectedAccount.getAccountid());
        if (addAccount.isSuccess()) {
            msg = new FacesMessage("Account deleted successfully");

        } else {
            msg = new FacesMessage("Operation failed");
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void deleteBusAction(String id) {
        PaymentWebservice.deleteBus(id);
    }

    public void deleteBookingAction(String id) {
        PaymentWebservice.deleteBooking(id);
    }

    public void deleteDriverAction(String id) {
        PaymentWebservice.deleteDriver(id);
    }

    public void deleteJourneyAction(String id) {
        PaymentWebservice.deleteJourney(id);
    }

    public void deletePickupLocationAction(String id) {
        PaymentWebservice.deletePickup(id);
    }

    public void deleteRestpointAction(String id) {
        PaymentWebservice.deleteRestpoint(id);
    }

    public void deleteTripAction(String id) {
        PaymentWebservice.deleteTrip(id);
    }

    public void setPaymentModel(List<PaymentModel> paymentModel) {
        this.paymentModel = paymentModel;
    }

    @PostConstruct
    public void init() {
//        driverModel = PaymentWebservice.getDrivers();
//        busModel = PaymentWebservice.getBuses();
//        journeyModel = PaymentWebservice.getJourneys();
//        accountModel = PaymentWebservice.getAccounts();
//        tripModel = PaymentWebservice.getTrips();
//        RestpointModel = PaymentWebservice.getRestpoints();
//        pickuplocationModel = PaymentWebservice.getPickuplocations();
//        bookingModel = PaymentWebservice.getBookings();
//        companyModel = PaymentWebservice.getCompanies();
    }

    public List<DriverModel> getDriverModel() {
        return driverModel;
    }

    public void setDriverModel(List<DriverModel> driverModel) {
        this.driverModel = driverModel;
    }

    public List<AccountModel> getAccountModel() {
        return accountModel;
    }

    public void setAccountModel(List<AccountModel> accountModel) {
        this.accountModel = accountModel;
    }

    public List<BusModel> getBusModel() {
        return busModel;
    }

    public void setBusModel(List<BusModel> busModel) {
        this.busModel = busModel;
    }

    public List<JourneyModel> getJourneyModel() {
        return journeyModel;
    }

    public void setJourneyModel(List<JourneyModel> journeyModel) {
        this.journeyModel = journeyModel;
    }

    public List<TripModel1> getTripModel() {
        return tripModel;
    }

    public void setTripModel(List<TripModel1> tripModel) {
        this.tripModel = tripModel;
    }

    public List<RestpointModel> getRestpointModel() {
        return RestpointModel;
    }

    public void setRestpointModel(List<RestpointModel> RestpointModel) {
        this.RestpointModel = RestpointModel;
    }

    public List<PickupModel> getPickuplocationModel() {
        return pickuplocationModel;
    }

    public void setPickuplocationModel(List<PickupModel> pickuplocationModel) {
        this.pickuplocationModel = pickuplocationModel;
    }

    public List<BookingModel> getBookingModel() {
        return bookingModel;
    }

    public void setBookingModel(List<BookingModel> bookingModel) {
        this.bookingModel = bookingModel;
    }

    public void onRowSelect(SelectEvent event) {
//        PaymentModel paymentModel = (PaymentModel) event.getObject();
//        callbackModel = PaymentWebservice.getCallbacks(paymentModel.getMobileNumber(), paymentModel.getTransactionReferenceId());
        //  callbackModel = PaymentWebservice.getCallbacks(mobileNumber, "112233");
    }

    public void callbackOnRowSelect(SelectEvent event) {
//        UIViewRoot view = FacesContext.getCurrentInstance().getViewRoot();
//        UIComponent component = view.findComponent("uf:transactionReference");
//        UIComponent sidebar = view.findComponent("uf:sidebar1");
////        component.getAttributes().put("value", ((PaymentModel) event.getObject()).getTransactionReferenceId());
//        component.getAttributes().put("value", "df");
//        sidebar.getAttributes().put("visible", true);
    }

}
