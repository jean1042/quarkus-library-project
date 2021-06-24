package dev.lankydan.web.library.user;


import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.logging.annotations.Pos;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.*;
import java.util.Set;

@Path("/u1")
@RegisterRestClient
public interface UserService {

    @GET
    @Path("/{user_id}")
    @Produces("application/json")
    Set<User> getUser(@PathParam String user_id);

    @GET
    @Path("/{user_id}")
    @Produces("application/json")
    Uni<Set<User>> getUserAsUni(@PathParam String user_id);

    @GET
    @Path("/users")
    @Produces("application/json")
    Set<User> listUsers();

    @POST
    @Path("/user")
    @Produces("application/json")
    Set<User> createUser(User user);

    @PUT
    @Path("/{user_id}")
    @Produces("application/json")
    Set<User> updateUser(@PathParam String user_id);

    @DELETE
    @Path("/{user_id}")
    @Produces("application/json")
    Set<User> deleteUser(@PathParam String user_id);

}
