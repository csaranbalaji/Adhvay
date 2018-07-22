package com.adhvay;

import com.adhvay.MedicineDB;
import com.adhvay.ScanReportsDB;
import com.adhvay.TestReportsDB;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;


@SuppressWarnings("serial")
public class RetrieveData extends HttpServlet {

    @SuppressWarnings("unchecked")
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        PersistenceManager pm1 = PMF.get().getPersistenceManager();

        PersistenceManager pm2 = PMF.get().getPersistenceManager();

        PersistenceManager pm3 = PMF.get().getPersistenceManager();

        String AadharnoP = req.getParameter("patientproofid");

        Query q1 = pm1.newQuery(MedicineDB.class, "AadharNo=='" + AadharnoP + "'");
        Query q2 = pm2.newQuery(ScanReportsDB.class, "AadharNo=='" + AadharnoP + "'");
        Query q3 = pm3.newQuery(TestReportsDB.class, "AadharNo=='" + AadharnoP + "'");
        List<MedicineDB> result1 = null;
        List<ScanReportsDB> result2 = null;
        List<TestReportsDB> result3 = null;
        System.out.println(result1);
        try {

            result1 = (List<MedicineDB>) q1.execute(AadharnoP);
            result2 = (List<ScanReportsDB>) q2.execute(AadharnoP);
            result3 = (List<TestReportsDB>) q3.execute(AadharnoP);


            if (result1.isEmpty()) {

                System.out.println("yes");
                req.setAttribute("medicineList", null);

            } else {

                System.out.println("no");
                req.setAttribute("medicineList", result1);

            }
        } finally {
            q1.closeAll();
            pm1.close();
        }

        try {

            result2 = (List<ScanReportsDB>) q2.execute(AadharnoP);


            if (result2.isEmpty()) {

                System.out.println("yes");
                req.setAttribute("sreportList", null);

            } else {

                System.out.println("no");
                req.setAttribute("sreportList", result2);

            }
        } finally {
            q2.closeAll();
            pm2.close();
        }

        try {

            result3 = (List<TestReportsDB>) q3.execute(AadharnoP);


            if (result3.isEmpty()) {

                System.out.println("yes");
                req.setAttribute("treportList", null);

            } else {

                System.out.println("no");
                req.setAttribute("treportList", result3);

            }
        } finally {
            q3.closeAll();
            pm3.close();
        }


        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/JSP/medicalhistory.jsp");
        rd.forward(req, resp);
    }


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
