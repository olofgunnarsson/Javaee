package se.kits.javaee;


import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Stateless
public class App {

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/")
    public String helloWorld() {
        return "{\"result\": \"Hello world!\"}";
    }

}