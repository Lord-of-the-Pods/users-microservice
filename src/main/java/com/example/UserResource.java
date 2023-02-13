package com.example;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/api")
public class UserResource {

    private static List<User> users = new ArrayList<>();

    static{
        User user = new User() ;
        user.setFirstName("abhishek");
        user.setLastName("vishnoi");
        user.setEmail("abhishek.vishnoi@hotmail.com");
        user.setPassword("password1");

        User user1 = new User() ;
        user1.setFirstName("arushi");
        user1.setLastName("vishnoi");
        user1.setEmail("arushi.goyal@hotmail.com");
        user1.setPassword("password1");

        users.add(user);
        users.add(user1);
    }

    @GET
    @Path("/getUsers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() {
        return users;
    }


    @POST
    @Path("/addUser")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> addUsers(User user) {
        users.add(user);
        return users;
    }


   /* @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CriminalRecord getUserCriminalRecord() {

        CriminalRecord cr = new CriminalRecord() ;

        cr.setFirstName("Arushi");
        cr.setLastName("Goyal");
        cr .setFirstTimeOffender(false);

        ArrayList<String> offences = new ArrayList<>();
        offences.add("drink and drive");
        offences.add("loot");

        cr.setOffences(offences);
        return cr;
    }*/

}
