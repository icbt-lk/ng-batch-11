/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.my.rest.app.resources;

import com.google.gson.Gson;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
/**
 *
 * @author icbt
 */
@Path("students")
public class StudentResource {
    Gson gson = new Gson();
    
   @GET
   @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents(){
          return Response
                .ok(gson.toJson(Utils.students))
                .build();
    }
    
   @GET
   @Path("{id}")
   @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(@PathParam("id") int id){
        
        Student student = null;
        
        for (Student st : Utils.students) {
            if (st.getId() == id) {
                student = st;
                break;
            }
        }
        
        if (student == null) {
            return Response
                .status(Response.Status.NOT_FOUND)
                .build();
        } else {
         return Response
                .ok(gson.toJson(student))
                .build();
        }
        
 
    }
    
   @POST
   @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(String json){
        Student student = gson.fromJson(json, Student.class);
        Utils.students.add(student);
          return Response
                .status(Response.Status.CREATED)
                .build();
    }
    
   @PUT
   @Path("{id}")
   @Consumes(MediaType.APPLICATION_JSON)
    public Response updateStudent(String json, @PathParam("id") int id){
        Student student = null;
        
        for (Student st : Utils.students) {
            if (st.getId() == id) {
                student = st;
                break;
            }
        }
        
        if (student == null) {
            return Response
                .status(Response.Status.NOT_FOUND)
                .build();
        } else {
          Student studentRequest = gson.fromJson(json, Student.class);
          
          student.setDateOfBirth(studentRequest.getDateOfBirth());
          student.setName(studentRequest.getName());
          
          return Response
                .status(Response.Status.OK)
                .build();
        }
    }
    
   @DELETE
   @Path("{id}")
    public Response deleteStudent(@PathParam("id") int id){    
        for (Student st : Utils.students) {
            if (st.getId() == id) {
                Utils.students.remove(st);
                return Response
                    .status(Response.Status.OK)
                    .build();
            }
        }

        return Response
            .status(Response.Status.NOT_FOUND)
            .build();

    }
}
