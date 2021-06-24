package dev.lankydan.web.library.user;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.Set;

@Path("/user")
public class UserResource {

    @Inject
    @RestClient
    UserService userService;

    @GET
    @Path("/{user_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<User> getUser(@PathParam String user_id) {
        return userService.getUser(user_id);
    };

    @GET
    @Path("/{user_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Set<User>> getUserAsUni(@PathParam String user_id) {
        return userService.getUserAsUni(user_id);
    };

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<User> listUsers() {
        return userService.listUsers();
    };

    @POST
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<User> createUser(User user) {
        return userService.createUser(user);
    };

    @PUT
    @Path("/{user_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<User> updateUser(@PathParam String user_id) {
        return userService.updateUser(user_id);
    };

    @DELETE
    @Path("/{user_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<User> deleteUser(@PathParam String user_id) {
        return userService.deleteUser(user_id);
    };
}
