package dev.lankydan.web.people;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.validation.constraints.NotBlank;
import javax.ws.rs. *;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/greeting")
public class GreetingResource {

    public static enum Order {
        desc,
        asc;
    }

    @GET //1. URI path of current resource
    @Produces(MediaType.TEXT_PLAIN) // Define the type of return object
    public String greeting(
        @Context UriInfo uriInfo,
        // How to get QueryParam !! 
        // Get UriInfo request / note) UriInfo: A part of JAX-RS, which let us to get request URI information from application.
                @QueryParam("order")Order order,
        // How to get HeaderParam !!
        // Get Order params by Enum type
                @NotBlank @HeaderParam("authorization")String authorization //Get authorization header param integrated with Bean validation
    ) {
        return String.format(
            "URI: %s - Order %s - Authorization : %s",
            uriInfo.getAbsolutePath(),
            order,
            authorization
        );
    }

}
