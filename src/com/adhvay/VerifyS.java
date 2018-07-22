package com.adhvay;

import com.adhvay.PatientProofs;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;


@SuppressWarnings("serial")
public class VerifyS extends HttpServlet {

    @SuppressWarnings("unchecked")
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String patientproofid = (String) req.getAttribute("patientproofid");
        req.setAttribute("patientproofid", patientproofid);
        System.out.println(patientproofid);
        String num;

        PersistenceManager pm = PMF.get().getPersistenceManager();
        Query q = pm.newQuery(PatientProofs.class, "Aadharno=='" + patientproofid + "'");
        List<PatientProofs> result = null;

        try {

            result = (List<PatientProofs>) q.execute(patientproofid);

            if (result.isEmpty()) {
                PrintWriter out = resp.getWriter();
                resp.setContentType("text/html");
                out.println("<html>");
                out.println("<body>");
                out.println("Invalid Aadhar No");
                out.println("</body>");
                out.println("</html>");
            } else {
                for (PatientProofs pp : result) {

                    num = pp.getMobileno();
                    System.out.println(num);
                    req.setAttribute("num", num);
                    req.getRequestDispatcher("/rogenS").forward(req, resp);
                }
				/*RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/JSP/PharmOTPE.jsp");
			    rd.forward(req, resp);*/

            }
        } finally {
            q.closeAll();
            pm.close();
        }
    }

}
