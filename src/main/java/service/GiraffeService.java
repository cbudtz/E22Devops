package service;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Path("giraffes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GiraffeService {
    public static List<String> giraffes = new ArrayList<>(Arrays.asList("Melman","Marius"));

    @GET
    public List<String> getAll(){
        return giraffes;
    }

    @POST
    public void create(String name){
        giraffes.add(name);
    }
}
