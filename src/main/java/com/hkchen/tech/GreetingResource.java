package com.hkchen.tech;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String gethello() {
        return "Hello GET";
    }

    @POST
    @Path("/api")
    @Produces(MediaType.TEXT_PLAIN)
    public String postHello() {
        return "Hello POST";
    }
}
