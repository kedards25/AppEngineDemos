package com.learning.appengine.datastoredemo;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    String name=request.getParameter("empName");
    String mail=request.getParameter("empMail");
    String dept=request.getParameter("empDept");
   DatastoreService datastoreService=
		   DatastoreServiceFactory.getDatastoreService();
   
   Entity empEntity=new Entity("Employee");
   
   empEntity.setProperty("empName", name);
   empEntity.setProperty("Email", mail);
   empEntity.setProperty("Department", dept);
   
   datastoreService.put(empEntity);
   response.getWriter().println("Data Saved"); 

  }
}