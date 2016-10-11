package se.kits.javaee;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Stateless
@Path("/user")
public class App {

    @PersistenceContext(name = "ds")
    private EntityManager em;

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/{id}")
    public Response helloWorld(@PathParam("id") Long id) {
        final User user = (User) em.createNamedQuery("findUserById")
                .setParameter("id", id)
                .getSingleResult();
        return Response.ok(user).build();
    }


    @POST
    @Produces(APPLICATION_JSON)
    @Path("/{name}")
    public Response createUser(@PathParam("name") String name) {
        final User o = new User(name);
        em.persist(o);
        em.flush();
        User user = (User) em.createNamedQuery("findUserByName")
                .setParameter("name", name)
                .getSingleResult();
        return Response.created(URI.create("/user/" + user.getId())).build();
    }

}