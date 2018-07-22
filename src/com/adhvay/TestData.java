package com.adhvay;

import com.adhvay.TestReportsDB;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@SuppressWarnings("serial")
public class TestData extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String Aadharno = req.getParameter("patientproofid");

        String Test = req.getParameter("test");
        String Value = req.getParameter("val");
        String Range = req.getParameter("range");
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
        String current = sdf.format(now);

        PersistenceManager pm = PMF.get().getPersistenceManager();
        TestReportsDB tr = new TestReportsDB(Aadharno, Test, Value, Range, current);

        try {
            pm.makePersistent(tr);
        } finally {
            pm.close();
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/JSP/Final.html");
        rd.forward(req, resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req, resp);
    }
}