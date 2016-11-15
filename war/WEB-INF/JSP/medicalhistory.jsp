<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.util.List" %>
<%@ page import="com.adhvay.*" %>
<html>
    <head>
    <title>Patient's Medical History</title>

    <style>
        body {
            
            background-color: #dff8eb;
            color: #000; 
            background: -webkit-linear-gradient(200deg, #ec315e , #ab1035); /* For Safari 5.1 to 6.0 */
            background: -o-linear-gradient(200deg, #ec315e , #ab1035); /* For Opera 11.1 to 12.0 */
            background: -moz-linear-gradient(200deg, #ec315e , #ab1035); /* For Firefox 3.6 to 15 */
            background: linear-gradient(200deg, #ec315e , #ab1035); /* Standard syntax */
            margin: 0px;
            padding: 0px;
        }
        .titleDiv{
            background-color: #0a0103;
            color: #dff8eb;
            float: left;
            margin: 0px;
            padding: 0px;
            width: 100%;
            overflow: hidden;
            height: 10%;
            display: table;
            box-shadow: 0px 1px 3px rgba(0,0,0,0.7);
            -webkit-box-shadow: 0px 1px 3px rgba(0,0,0,0.7);
            -moz-box-shadow: 0px 1px 3px rgba(0,0,0,0.7);
        }
        .title {
            display: table-cell;
            vertical-align: middle;
            font-size: 2em;
        }

    ul.tab {
        list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;
        border: 1px solid #ccc;
        background-color: #cdc5b4;
        box-shadow: 0px 1px 3px rgba(0,0,0,0.7);
            -webkit-box-shadow: 0px 1px 3px rgba(0,0,0,0.7);
            -moz-box-shadow: 0px 1px 3px rgba(0,0,0,0.7);
    }

    ul.tab li {float: left;}

    ul.tab li a {
        display: inline-block;
        color: #5c0e1b;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        transition: 0.3s;
        font-size: 17px;
    }

    ul.tab li a:hover {
        background-color: #0a0103;
        color: #f7fff7;
    }

    ul.tab li a:focus, .active {
        background-color: #0a0103;
        color: #f7fff7;
    }

    .tabcontent {
        margin: 5% 5% 15% 5%;
        display: none;
        padding: 6px 12px;
        border: 1px solid #ccc;
        border-top: none;
        background-color: #b9ffb7;
    }

    table {
        border-collapse: collapse;
        width: 100%;
    }
    tr a { 
       display: block;  
    }
    td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    th {
        padding: 8px;
        text-align: left;
        background-color: #5c0e1b;
        border-bottom: 1px solid #ddd;
        color: beige;
    }
    tr:hover{
        background-color:#a30b37;
        color: beige;
    }


 

    </style>
    </head>
    <body>
    <div class="titleDiv">
            &nbsp;&nbsp;<div class="title"><b>Adhvay</b></div>
        </div>
        <br><br>
<ul class="tab">
  <li><a href="#" class="tablinks" onclick="openTab(event, 'Medicare')">Medi care</a></li>
  <li><a href="#" class="tablinks" onclick="openTab(event, 'SReport')">Scan Report</a></li>
  <li><a href='#' class="tablinks" onclick="openTab(event,'TReport')">Test Report</a></li>
</ul>

<div id="Medicare" class="tabcontent">
	<br>
  <table>
	<tr>
    <th>Date</th>
    <th>Tablet name</th>
    <th>Quantity</th>
  </tr>
    <%

		if(request.getAttribute("medicineList")!=null){

			List<MedicineDB> med =
                           (List<MedicineDB>)request.getAttribute("medicineList");

			if(!med.isEmpty()){
				 for(MedicineDB m : med){
					 if(m.getDrugName()!=null){

		%>
  <tr>
	<td><%=m.getDate() %></td>
    <td><%=m.getDrugName() %></td>
    <td><%=m.getQuantity() %></td>
   </tr>
   <%}}}}%>
</table>
</div>

<div id="SReport" class="tabcontent">
	<br>
  <table>
	<tr>
    <th>Date</th>
    <th>ScanPart</th>
    <th>Report</th>
  </tr>
  <%

		if(request.getAttribute("sreportList")!=null){

			List<ScanReportsDB> srd =
                           (List<ScanReportsDB>)request.getAttribute("sreportList");

			if(!srd.isEmpty()){
				 for(ScanReportsDB s : srd){

		%>
  
  <tr onclick="document.location = 'links.html';">
	<td><%=s.getDate() %></td>
    <td><%=s.getScanPart() %></td>
    <td><%=s.getReport() %></td>
   </tr>
  <%}}} %>
</table>
</div>
<div id="TReport" class="tabcontent">
	<br>
  <table>
	<tr>
    <th>Date</th>
    <th>Test</th>
    <th>Value</th>
    <th>Range</th>
  </tr>
  <%

		if(request.getAttribute("treportList")!=null){

			List<TestReportsDB> trd =
                           (List<TestReportsDB>)request.getAttribute("treportList");

			if(!trd.isEmpty()){
				 for(TestReportsDB t : trd){

		%>
  
  <tr>
	<td><%=t.getDate() %></td>
    <td><%=t.getTest() %></td>
    <td><%=t.getValue() %></td>
    <td><%=t.getRange() %></td>
   </tr>
 <%}}} %> 
</table>
</div>



    <script>
    function openTab(evt, tabName) {
        var i, tabcontent, tablinks;
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
        }
        document.getElementById(tabName).style.display = "block";
        evt.currentTarget.className += " active";
    }
    </script>
    </body>
</html>
