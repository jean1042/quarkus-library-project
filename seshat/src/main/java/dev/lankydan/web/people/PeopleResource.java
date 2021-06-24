package dev.lankydan.web.people;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class PeopleResource {

    @GET //1. URI path of current resource
    @Produces(MediaType.TEXT_PLAIN) // 2. Define the type of return object 

    /*
    ****Produces and Consumes
    * Produces : Define the data format to response 
    * Consumes : Define the data format to receive
    */
    public String hello() { 
        return "heoollo"; //Return plaintext 
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void create(String message){
        System.out.println("Created");
    }
    
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String update(String message){
        System.out.println("Update");
        return message;
    }

    @DELETE
    public void delete(){
        System.out.println("Delete");
    }

}