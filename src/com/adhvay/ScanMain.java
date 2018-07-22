/*
 * Redirects to scan_main from OTPscan after authentication
 */

package com.adhvay;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

@SuppressWarnings("serial")
public class ScanMain extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        req.setAttribute("patientproofid", req.getParameter("patientproofid"));

        req.getRequestDispatcher("/verifyS").forward(req, resp);

    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }

}
