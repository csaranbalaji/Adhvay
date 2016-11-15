/* Allows Authorized Pharmacists 
 * AUTHORIZED - OTPpharm
 * UNAUTHORIZED - pharmacy_login
 * */

package com.adhvay;

import java.io.IOException;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.adhvay.PMF;
import com.adhvay.PharmDetails;

@SuppressWarnings("serial")
public class LoginPharmAction extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		
		doPost(req, resp);
	}
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	
		resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		resp.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		resp.setHeader("Expires", "0"); // Proxies.
		String EmailP = req.getParameter("Pharmacy-id");
		String PasswordP = req.getParameter("Password");
		
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(PharmDetails.class, "Email == '"+EmailP+"'&& Password == '"+PasswordP+"'");
		List<PharmDetails> result = null;
		
		try{

		     result = (List<PharmDetails>)q.execute(EmailP,PasswordP);
		     if(!result.isEmpty())	
				{
				
			    	 RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/JSP/OTPpharm.jsp");
			    	 rd.forward(req, resp);
			    		
					
				}
				else{
					
					req.getRequestDispatcher("/pharmacy_login.html").forward(req, resp);
					}
		} finally{
			q.closeAll();
			pm.close();
			
		}

		}

	}


