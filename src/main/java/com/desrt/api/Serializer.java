package com.desrt.api;

import com.desrt.model.Employee;
import com.desrt.model.Projects;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Serializer uses Jackson capabilities
 * to convert plain java object into JSON strings
 */

public class Serializer {
    public String serializeStringEmployee(List<Employee> mainList) {
        ObjectMapper mapper = new ObjectMapper();   //Maps the java object to JSON object according to the fields
        String serializeString = "";

        try {

            serializeString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mainList);
            System.out.println(serializeString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return serializeString;
    }

    public String serializeStringEmployeeNames(List<Employee> mainList) {
        ObjectMapper mapper = new ObjectMapper();   //Maps the java object to JSON object according to the fields
        String serializeString = "";

        try {

            mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
            serializeString = mapper.writerWithView(View.OveralView.class).withDefaultPrettyPrinter().writeValueAsString(mainList);
            System.out.println(serializeString);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return serializeString;
    }

    public String serializeStringEmployeePartial(List<Employee> mainList) {
        ObjectMapper mapper = new ObjectMapper();   //Maps the java object to JSON object according to the fields
        String serializeString = "";

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {

            mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
            serializeString = mapper.setDateFormat(df).writerWithView(View.DetailPartialView.class).withDefaultPrettyPrinter().writeValueAsString(mainList);
            System.out.println(serializeString);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return serializeString;
    }



}
