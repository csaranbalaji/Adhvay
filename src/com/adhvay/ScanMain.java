/*
 * Redirects to scan_main from OTPscan after authentication
 */

package com.adhvay;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ScanMain extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		req.setAttribute("patientproofid", req.getParameter("patientproofid"));
		
		req.getRequestDispatcher("/verifyS").forward(req, resp);

	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req,resp);
	}
	
}
