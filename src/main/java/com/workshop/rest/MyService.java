package com.workshop.rest;


import com.google.gson.JsonObject;
import com.workshop.utility.Utility;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/myservice")
public class MyService {

    @GET
    @Produces("text/json")
    @Path("/{message}")
    public String getMessage(@PathParam("message") String message) {
        return "Hello there "+message;
    }

    @GET
    @Produces("text/json")
    @Path("/json")
    public String getJSON() {
        return Utility.convertFileToJSON("my.json").toString();
    }
}
