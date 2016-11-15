/*
 * Allows Scan centers to register
 */
package com.adhvay;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.adhvay.PMF;
import com.adhvay.ScanDetails;

@SuppressWarnings("serial")
public class RegScan extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		
		doPost(req, resp);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	
		String Name = req.getParameter("Name");
		String Mobile = req.getParameter("Mobile");
		String Email = req.getParameter("Email");
		String Password = req.getParameter("Password");
		
		  PersistenceManager pm = PMF.get().getPersistenceManager();

	     ScanDetails sd = new ScanDetails(Name, Mobile, Email, Password);

	     try {
	         pm.makePersistent(sd);
	     } finally {
	         pm.close();
	     }
			req.getRequestDispatcher("/report_login.html").forward(req, resp);
		}

	}

