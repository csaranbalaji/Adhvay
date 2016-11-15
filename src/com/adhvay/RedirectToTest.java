package com.adhvay;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RedirectToTest extends HttpServlet  {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String patientproofid = req.getParameter("patientproofid");
		req.setAttribute("patientproofid", patientproofid);
		RequestDispatcher rd = req.getRequestDispatcher("/testreport.jsp");
		rd.forward(req,resp);
	}

}
