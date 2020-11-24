package com.learning.appenginedemos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    String userName=request.getParameter("usernm");
    String userPass=request.getParameter("userpass");
    
    PrintWriter out=response.getWriter();
    out.println("Welcome "+userName+"<br/>Your password: "+userPass);

  }
}