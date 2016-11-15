package com.adhvay;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RandomOTPGenS extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String num =(String)req.getAttribute("num");
		//String num = "9094701215";
		Integer OTPG = (int)(Math.random() * 8999) + 1000;
		req.setAttribute("OTPG", OTPG);
		System.out.println(OTPG);
		URL obj = new URL("http://bulksms.mysmsmantra.com:8080/WebSMS/SMSAPI.jsp?username=shriramn8&password=401458084&sendername=Adhvay&mobileno=91" +num+ "&message=" + OTPG);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		String inputLine;

		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {

		response.append(inputLine);

		}

		in.close();
        System.out.println(OTPG);
		String rsp = (response.toString());
		System.out.println(rsp);
		if(!rsp.equals("DND")){
			resp.setContentType("text/html");
			req.setAttribute("patientproofid",(String)req.getAttribute("patientproofid"));
			System.out.println((String)req.getAttribute("patientproofid"));
		    RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/JSP/ScanOTPE.jsp"); 
		    rd.forward(req, resp);
		}
		else
		{
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("DND");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

}
