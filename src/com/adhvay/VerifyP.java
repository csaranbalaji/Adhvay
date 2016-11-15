package com.adhvay;

import com.adhvay.PatientProofs;

import java.util.List;

import javax.servlet.http.*;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.*;

import java.io.*;


@SuppressWarnings("serial")
public class VerifyP extends HttpServlet {
	
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String patientproofid = req.getParameter("patientproofid");
		req.setAttribute("patientproofid", patientproofid);
		System.out.println(patientproofid);
		String num;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
        Query q = pm.newQuery(PatientProofs.class,"Aadharno=='"+patientproofid+"'");
		List<PatientProofs> result = null;

		try{
			
			result = (List<PatientProofs>)q.execute(patientproofid);
			
			if(result.isEmpty()){
				PrintWriter out = resp.getWriter();
				resp.setContentType("text/html");
                out.println("<html>");	
                out.println("<body>");
                out.println("Invalid Aadhar No");
                out.println("</body>");
                out.println("</html>");
      			}
			else{
				 for(PatientProofs pp: result) {
					 
					 num = pp.getMobileno();
					 System.out.println(num);
				     req.setAttribute("num", num);
				     req.getRequestDispatcher("/rogenP").forward(req, resp);
				 }
				/*RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/JSP/PharmOTPE.jsp");
			    rd.forward(req, resp);*/
			    
			}	
		}finally{
			q.closeAll();
			pm.close();
		}
	}

}
