package com.bvirtual.webservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import org.glassfish.jersey.client.ClientConfig;
//import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 *
 * @author Bsystems4
 */
public class Engine {

    public static Response getRequestResponse(String ENDPOINT, String URLPart) {
        Client newClient = ClientBuilder.newClient();
        try {
            Response get = newClient.target(ENDPOINT + URLPart)
                    .request()
                    .get();
//            return newClient.target(ENDPOINT + URLPart)
//                    .request()
//                    .get();
            return get;
        } catch (Exception ex) {
            Logger.getLogger(Engine.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static Response deleteRequestResponse(String ENDPOINT, String URLPart) {
        Client newClient = ClientBuilder.newClient();
        try {
            Response get = newClient.target(ENDPOINT + URLPart)
                    .request()
                    .delete();
//            return newClient.target(ENDPOINT + URLPart)
//                    .request()
//                    .get();
            return get;
        } catch (Exception ex) {
            Logger.getLogger(Engine.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static Response putRequestResponse(String ENDPOINT, String URLPart, EntityModel entityModel) {
        Client newClient = ClientBuilder.newClient();
        try {
            Response get = newClient.target(ENDPOINT + URLPart)
                    .request()
                    .put(Entity.json(entityModel));
//            return newClient.target(ENDPOINT + URLPart)
//                    .request()
//                    .get();
            return get;
        } catch (Exception ex) {
            Logger.getLogger(Engine.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static Response postRequestResponse(String ENDPOINT, String URLPart, EntityModel entityModel) {
        Client newClient = ClientBuilder.newClient();
        try {

            return newClient.target(ENDPOINT + URLPart)
                    .request(MediaType.APPLICATION_JSON)
                    .post(Entity.json(entityModel));
        } catch (Exception ex) {
            Logger.getLogger(Engine.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return null;
        }
    }

}
