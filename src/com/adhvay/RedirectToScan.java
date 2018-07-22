package com.adhvay;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@SuppressWarnings("serial")
public class RedirectToScan extends HttpServlet {


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String patientproofid = req.getParameter("patientproofid");
        req.setAttribute("patientproofid", patientproofid);
        RequestDispatcher rd = req.getRequestDispatcher("/scanreport.jsp");
        rd.forward(req, resp);
    }

}
