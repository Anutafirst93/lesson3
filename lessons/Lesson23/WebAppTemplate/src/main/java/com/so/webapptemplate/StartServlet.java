package com.so.webapptemplate;

import com.inm.school.domain.UserService;
import com.inm.school.domain.UserServiceImpl;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stan
 */
public class StartServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //request.setAttribute("curDate", new Date(System.currentTimeMillis()).toString());
//        request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
        UserService u = new UserServiceImpl();
        request.setAttribute("userlist", u.getUsersList());
        request.getRequestDispatcher("WEB-INF/users.jsp").forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


}
