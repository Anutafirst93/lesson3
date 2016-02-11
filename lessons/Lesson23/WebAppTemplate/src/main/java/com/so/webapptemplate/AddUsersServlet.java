package com.so.webapptemplate;

import com.so.webapptemplate.domain.entity.Users;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author stan
 */
public class AddUsersServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        Users user = new Users();
        user.setFirstname(firstname);
        user.setLastname(lastname);
      
        response.sendRedirect("start");
    }

}
