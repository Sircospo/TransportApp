package com.bvirtual.webservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.util.List;
import javax.ws.rs.core.GenericType;
import com.bvirtual.model.payment.GVIVERequestModel;
import com.bvirtual.model.payment.GVIVEResponseModel;
import com.bvirtual.model.payment.PaymentModel;
import com.bvirtual.model.payment.VerifiedIdModel;

/**
 *
 * @author Bsystems4
 */
public class PaymentWebservice {

    private static String ENDPOINT = "http://localhost:8084/transport/";
//    private static String ENDPOINT = "http://bvirtualcard.com/payments";

    public static List<DriverModel> getDrivers() {
        GenericType<List<DriverModel>> genericType = new GenericType<List<DriverModel>>() {
        };
        return Engine.getRequestResponse(ENDPOINT, "drivers").readEntity(genericType);
    }

    public static List<BusModel> getBuses() {
        GenericType<List<BusModel>> genericType = new GenericType<List<BusModel>>() {
        };
        return Engine.getRequestResponse(ENDPOINT, "buses").readEntity(genericType);
    }

    public static List<JourneyModel> getJourneys() {
        GenericType<List<JourneyModel>> genericType = new GenericType<List<JourneyModel>>() {
        };
        return Engine.getRequestResponse(ENDPOINT, "journeys").readEntity(genericType);
    }

    public static List<AccountModel> getAccounts() {
        GenericType<List<AccountModel>> genericType = new GenericType<List<AccountModel>>() {
        };
        return Engine.getRequestResponse(ENDPOINT, "accounts").readEntity(genericType);
    }

    public static List<TripModel1> getTrips() {
        GenericType<List<TripModel1>> genericType = new GenericType<List<TripModel1>>() {
        };
        return Engine.getRequestResponse(ENDPOINT, "trips").readEntity(genericType);
    }

    public static List<RestpointModel> getRestpoints() {
        GenericType<List<RestpointModel>> genericType = new GenericType<List<RestpointModel>>() {
        };
        return Engine.getRequestResponse(ENDPOINT, "restpoints").readEntity(genericType);
    }

    public static List<PickupModel> getPickuplocations() {
        GenericType<List<PickupModel>> genericType = new GenericType<List<PickupModel>>() {
        };
        return Engine.getRequestResponse(ENDPOINT, "pickups").readEntity(genericType);
    }

    public static List<BookingModel> getBookings() {
        GenericType<List<BookingModel>> genericType = new GenericType<List<BookingModel>>() {
        };
        return Engine.getRequestResponse(ENDPOINT, "bookings").readEntity(genericType);
    }

    public static List<CompanyModel> getCompanies() {
        GenericType<List<CompanyModel>> genericType = new GenericType<List<CompanyModel>>() {
        };
        return Engine.getRequestResponse(ENDPOINT, "companies").readEntity(genericType);
    }

    public static ResponseModel deleteBooking(String id) {
        return Engine.deleteRequestResponse(ENDPOINT, "bookings/" + id).readEntity(ResponseModel.class);
    }

    public static ResponseModel deleteBus(String id) {
        return Engine.deleteRequestResponse(ENDPOINT, "buses/" + id).readEntity(ResponseModel.class);
    }

    public static ResponseModel deleteDriver(String id) {
        return Engine.deleteRequestResponse(ENDPOINT, "drivers/" + id).readEntity(ResponseModel.class);
    }

    public static ResponseModel deleteJourney(String id) {
        return Engine.deleteRequestResponse(ENDPOINT, "journeys/" + id).readEntity(ResponseModel.class);
    }

    public static ResponseModel deletePickup(String id) {
        return Engine.deleteRequestResponse(ENDPOINT, "pickups/" + id).readEntity(ResponseModel.class);
    }

    public static ResponseModel deleteRestpoint(String id) {
        return Engine.deleteRequestResponse(ENDPOINT, "restpoints/" + id).readEntity(ResponseModel.class);
    }

    public static ResponseModel deleteTrip(String id) {
        return Engine.deleteRequestResponse(ENDPOINT, "trips/" + id).readEntity(ResponseModel.class);
    }

    public static ResponseModel deleteAccount(String id) {

        return Engine.deleteRequestResponse(ENDPOINT, "accounts/" + id).readEntity(ResponseModel.class);
    }

    public static ResponseModel addAccount(AccountModel id) {
        return Engine.postRequestResponse(ENDPOINT,
                "accounts/", id).readEntity(ResponseModel.class);
    }
    
       public static ResponseModel addCompany(CompanyModel id) {
        return Engine.postRequestResponse(ENDPOINT,
                "accounts/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel addTrip(TripModel1 id) {
        return Engine.postRequestResponse(ENDPOINT,
                "trips/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel addRestpoint(RestpointModel id) {
        return Engine.postRequestResponse(ENDPOINT,
                "restpoints/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel addPickup(PickupModel id) {
        return Engine.postRequestResponse(ENDPOINT,
                "pickups/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel addJourney(JourneyModel id) {
        return Engine.postRequestResponse(ENDPOINT,
                "journeys/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel addDriver(DriverModel id) {
        return Engine.postRequestResponse(ENDPOINT,
                "drivers/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel addBooking(BookingModel id) {
        return Engine.postRequestResponse(ENDPOINT,
                "bookings/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel addBus(BusModel id) {
        return Engine.postRequestResponse(ENDPOINT,
                "buses/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel updateAccount(AccountModel id) {
        return Engine.putRequestResponse(ENDPOINT,
                "accounts/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel updateTrip(TripModel id) {
        return Engine.putRequestResponse(ENDPOINT,
                "trips/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel updateRestpoint(RestpointModel id) {
        return Engine.putRequestResponse(ENDPOINT,
                "restpoints/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel updatePickup(PickupModel id) {
        return Engine.putRequestResponse(ENDPOINT,
                "pickups/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel updateJourney(JourneyModel id) {
        return Engine.putRequestResponse(ENDPOINT,
                "journeys/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel updateDriver(DriverModel id) {
        return Engine.putRequestResponse(ENDPOINT,
                "drivers/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel updateBooking(BookingModel id) {
        return Engine.putRequestResponse(ENDPOINT,
                "bookings/", id).readEntity(ResponseModel.class);
    }

    public static ResponseModel updateBus(BusModel id) {
        return Engine.putRequestResponse(ENDPOINT,
                "buses/", id).readEntity(ResponseModel.class);
    }

}
