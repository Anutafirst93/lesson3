package com.so.webapptemplate;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;

/**
 *
 * @author Нюта
 */
public class AddUsersServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        Users user = new Users();
        user.setFirstname(firstname);
        user.setLastnam(lastname);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try{
            session.save(user);
            session.getTransaction().commit(); 
        }catch (Exception exception){
                session.getTransaction().rollback();
        }
        response.sendRedirect("start");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
