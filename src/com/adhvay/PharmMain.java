/* Redirects to pharm_main from OTPpharm after authentication*/
package com.adhvay;

import java.io.IOException;


import javax.jdo.PersistenceManager;
import javax.servlet.*;
import javax.servlet.http.*;

import com.adhvay.PatientProofs;
import com.adhvay.DoctorDB;

@SuppressWarnings("serial")
public class PharmMain extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
	    
		String patientproofid =  req.getParameter("patientproofid");
		req.setAttribute("patientproofid", patientproofid);
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
        
		PatientProofs pp1 = new PatientProofs("856835345917", "Manthu Lavanya", "18", "Female", "O+", "Triplicane", "9940113817", "8939514415", "TN0220150007853", "ABQ1397209", "GLYPS3461P", "Z3381821");
		PatientProofs pp2 = new PatientProofs("916835431452", "Shri Ranjani", "18", "Female", "O+", "Villivakkam", "8939514415", "9940137951","TN0220150008295", "ABQ1391209", "GLYPS3167P", "Z3380821");
        
		DoctorDB d1 = new DoctorDB("64862","111"); 
        DoctorDB d2 = new DoctorDB("61567","12");
		
		try{
        	pm.makePersistentAll(pp1,pp2);
        	pm.makePersistentAll(d1,d2);
        }finally{
        	pm.close();
        }
		
        req.getRequestDispatcher("/verifyPh").forward(req, resp);
	    /*RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/JSP/pharm_main.jsp");
		rd.forward(req, resp);
*/
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req,resp);
	}
	
}
