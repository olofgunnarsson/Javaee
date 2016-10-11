package se.kits.javaee.boundary;

import se.kits.javaee.entity.User;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Stateless
@Path("/user")
public class UserResource {

    @Inject
    private UserManager userManager;

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/{id}")
    public Response getUser(@PathParam("id") Long id) {
        User user = userManager.find(id);
        return Response.ok(user).build();
    }


    @POST
    @Path("/{name}")
    public Response createUser(@PathParam("name") String name) {
        final User user = userManager.create(name);
        return Response.created(URI.create("/user/" + user.getId())).build();
    }

}