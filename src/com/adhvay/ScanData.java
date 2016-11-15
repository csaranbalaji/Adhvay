package com.adhvay;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.http.*;
import javax.jdo.PersistenceManager;
import javax.servlet.*;
import com.adhvay.ScanReportsDB;

@SuppressWarnings("serial")
public class ScanData extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		String Aadharno = req.getParameter("patientproofid");
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone (TimeZone.getTimeZone ("IST"));
        String current = sdf.format(now);
    
		String Part = req.getParameter("test");
		String Report = req.getParameter("report");
		PersistenceManager pm = PMF.get().getPersistenceManager();
		ScanReportsDB sr = new ScanReportsDB(Aadharno, Part, Report, current);
		
		try{
			pm.makePersistent(sr);
		}finally{
			pm.close();
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/JSP/Final.html");
		rd.forward(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		doGet(req,resp);
	} 

}
