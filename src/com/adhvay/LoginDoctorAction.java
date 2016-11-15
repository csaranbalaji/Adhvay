package com.adhvay;

import java.io.*;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginDoctorAction extends HttpServlet {
	
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		resp.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		resp.setHeader("Expires", "0"); // Proxies.
		
    	String Did = req.getParameter("doctorid");
    	String Password = req.getParameter("password");
	    String patientproofid = req.getParameter("patientproofid");
    	req.setAttribute(patientproofid, "patientproofid");
	
	    PersistenceManager pm = PMF.get().getPersistenceManager();
	    Query q = pm.newQuery(DoctorDB.class, "DoctorID == '"+Did+"'&& Password == '"+Password+"'");
	    List<DoctorDB> result = null;
	
	    try{

	         result = (List<DoctorDB>)q.execute(Did,Password);
	         System.out.println(result.isEmpty());
	         if(!result.isEmpty()){
			
		    	 	req.getRequestDispatcher("/retrieve_data").forward(req, resp);
				
		                    	}
			 else{
				
			     	req.getRequestDispatcher("/index.html").forward(req, resp);
				}
	     } finally{
		     q.closeAll();
		     pm.close();
		
	  }

	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		doGet(req,resp);
	}
	
	}


