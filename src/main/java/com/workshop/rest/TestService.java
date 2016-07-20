package com.workshop.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/rest/testservice")
public class TestService {

    @GET
    @Produces("text/plain")    
    public String getMessage() {
        return "Hello there";
    }
}
