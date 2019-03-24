package com.zion.oldcoffee.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/coffee")
public class OldCoffeeService {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getCoffee() {
        return "<h2>Hello Jersey</h2>";
    }

}
