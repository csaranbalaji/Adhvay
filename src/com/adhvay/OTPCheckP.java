package com.adhvay;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@SuppressWarnings(value="serial")
public class OTPCheckP extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String patientproofid = req.getParameter("patientproofid");
		Integer OTPG = (Integer)req.getAttribute("OTPG");
		Integer otp = (Integer)req.getAttribute("otp");
		
		System.out.println(patientproofid);
		System.out.println(OTPG);
		System.out.println(otp);
		
		if(OTPG==otp){
			
			req.setAttribute("patientproofid", patientproofid);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/retrieve_data");
	        rd.forward(req, resp);
		}
		else
			req.getRequestDispatcher("/index.html").forward(req, resp);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
	
		doGet(req,resp);
	}
}
