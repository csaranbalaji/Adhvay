/*
 *  Allows the pharmacist to register
 */
package com.adhvay;

import com.adhvay.PMF;
import com.adhvay.PharmDetails;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

@SuppressWarnings("serial")
public class RegPharm extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        doPost(req, resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String Name = req.getParameter("Name");
        String Mobile = req.getParameter("Mobile");
        String Email = req.getParameter("Email");
        String Password = req.getParameter("Password");

        PersistenceManager pm = PMF.get().getPersistenceManager();

        PharmDetails pd = new PharmDetails(Name, Mobile, Email, Password);

        try {
            pm.makePersistent(pd);
        } finally {
            pm.close();
        }
        req.getRequestDispatcher("/pharmacy_login.html").forward(req, resp);
    }

}

