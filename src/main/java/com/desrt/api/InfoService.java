package com.desrt.api;

import com.desrt.db.Repository;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONException;
import org.json.JSONObject;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/info")
public class InfoService {

    private Repository repository = new Repository();
    private Serializer serializer = new Serializer();




    @GET
    @Path("/employees")
    public Response getEmployees() {

        System.out.println(" InfoService.getUsers from:");// + repository + ":end");
        // String output = "Jersey has processed your message" + repository.getUsers();
        System.out.println(repository.getEmployees());
        String output = "" + serializer.serializeStringEmployee(repository.getEmployees());//+obj.run4(repository.getUnits2());

        return Response.status(200)
                .entity(output)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .build();
    }

    @GET
    @Path("/employees/{id}")
    public Response getUsersId(@PathParam("id") int id) {
        String output = "";

        if (repository.getEmployeesByPID(id).isEmpty()) {
            output = "There is no records for your search!";
        } else {

            output = "" + serializer.serializeStringEmployee(repository.getEmployeesByPID(id));

        }
        return Response.status(200)
                .entity(output)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .build();
    }

    @GET
    @Path("/employeesNames")
    public Response getEmployeesNames() {

        System.out.println(" InfoService.getUsers from:");// + repository + ":end");
        // String output = "Jersey has processed your message" + repository.getUsers();
        System.out.println(repository.getEmployeeNames());
        String output =""+ serializer.serializeStringEmployeeNames(repository.getEmployeeNames());//+obj.run4(repository.getUnits2());

        return Response.status(200)
                .entity(output)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .build();
    }
    @GET
    @Path("/employeesNames10/{ofs}/{lmt}")
    public Response getEmployeesNamesBy10(@PathParam("ofs") int ofs,@PathParam("lmt") int lmt) {

        System.out.println(" InfoService.getUsers from:");// + repository + ":end");
        // String output = "Jersey has processed your message" + repository.getUsers();
        System.out.println(repository.getEmployeeNames());
        String output =""+ serializer.serializeStringEmployeePartial(repository.getEmployeeNamesBy10(ofs,lmt));//+obj.run4(repository.getUnits2());

        return Response.status(200)
                .entity(output)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .build();
    }


}
