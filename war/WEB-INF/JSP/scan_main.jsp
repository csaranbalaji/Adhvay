<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Diagnostic Center</title>
</head>
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
        .titleSub {
            text-align: center;
            text-shadow: 1px 1px #17b890;
            font-family: 'Open Sans Condensed', sans-serif; font-size: 25px;
        }
        .chooseChoice{
            clear: both;
            margin: 5% 20%;
            width: 59%;
            border: 2px solid #5c0e1b;
            background-color: #b9ffb7;
            -moz-box-shadow:    3px 3px 5px 6px #5c0e1b;
            -webkit-box-shadow: 3px 3px 5px 6px #5c0e1b;
            box-shadow:         3px 3px 5px 6px #5c0e1b;
            padding-left: 30px;
            padding-top: 20px;
        }
        td {
            padding: 5px;
            text-align: center;
        }
        .button {
            color: white;
            padding: 14px 150px;
            margin: 8px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            background: #ec315e;
            border-radius: 8px;
            -webkit-border-radius: 8px;
            -moz-border-radius: 8px;
            box-shadow: 0px 1px 3px #5c0e1b;
            -webkit-box-shadow: 0px 1px 3px #5c0e1b;
            -moz-box-shadow: 0px 1px 3px #5c0e1b;
            border: solid 2px #ec315e;
            display: inline-block;
        }
        .button:hover {
            background: #ec315e;
            box-shadow: 0px 4px 8px #5c0e1b;
            -webkit-box-shadow: 0px 4px 8px #5c0e1b;
            -moz-box-shadow: 0px 4px 8px #5c0e1b;
            cursor: pointer;
        }
        a{
            text-decoration:none;

        }
</style>
<body>
<% String patientproofid = (String) request.getAttribute("patientproofid");
   request.setAttribute("patientproofid",patientproofid);
    %>

	<div class="titleDiv">
            &nbsp;&nbsp;<div class="title"><b>Adhvay</b></div>
        </div>
        <br><br><br>
        <div class="chooseChoice">
         <div class="titleSub">Diagnostic Center Home Page</div><br>
         <div>
               <br><br>
               <table width=100%>
               <form action="/redirectS" method="get">
                <input type="hidden" name="patientproofid" value=<%=patientproofid%>>
                  <tr>
                     <td>Click for Scan/X-rays:
                     </td>
                     <td>
                        <div>
                            <input type="submit" class="button" value="Click me!">
                        </div>
                     </td>
                </tr>
               </form> 
           <form action="/redirectT" method="get">     
                <input type="hidden" name="patientproofid" value=<%=patientproofid%>>
	 	   
                <tr>
                    <td>Click for Test Reports:
                    </td>
                    <td>
                        <div>
                            <input type="submit" class="button" value="Click me!">
                        </div>
                    </td>
                </tr>
             </form>
               </table>
              <br><br><br><br>
            </div>
        </div>
        <br><br><br>
</body>
</html>    
