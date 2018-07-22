/*
 * Store the drug details when entered
 */

package com.adhvay;

import com.adhvay.MedicineDB;

import javax.jdo.PersistenceManager;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


@SuppressWarnings("serial")
public class TabletData extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException, ArrayIndexOutOfBoundsException {

        String Aadharno = req.getParameter("patientproofid");


        String DrugName1 = req.getParameter("tablet1");
        String Quantity1 = req.getParameter("qty1");
        String DrugName2 = req.getParameter("tablet2");
        String Quantity2 = req.getParameter("qty2");
        String DrugName3 = req.getParameter("tablet3");
        String Quantity3 = req.getParameter("qty3");
        String DrugName4 = req.getParameter("tablet4");
        String Quantity4 = req.getParameter("qty4");
        String DrugName5 = req.getParameter("tablet5");
        String Quantity5 = req.getParameter("qty5");

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
        String current = sdf.format(now);
        String DrugName[] = {DrugName1, DrugName2, DrugName3, DrugName4, DrugName5};
        String Quantity[] = {Quantity1, Quantity2, Quantity3, Quantity4, Quantity5};


        for (int i = 0; i < 5; i++) {
            if (DrugName[i] != null) {
                PersistenceManager pm = PMF.get().getPersistenceManager();
                MedicineDB md = new MedicineDB(Aadharno, DrugName[i], Quantity[i], current);
                try {
                    pm.makePersistent(md);

                } finally {

                    pm.close();
                }
            }
        }


        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/JSP/Final.html");
        rd.forward(req, resp);
    }


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException, ArrayIndexOutOfBoundsException {
        doGet(req, resp);
    }

}
