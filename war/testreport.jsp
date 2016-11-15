<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Test Report</title>
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
        label{
            font-size:110%;
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
        .titleForm {
            text-align: center;
            text-shadow: 1px 1px #17b890;
            font-family: 'Open Sans Condensed', sans-serif; font-size: 25px;
        }
        .testReport {
            clear: both;
            margin: 5% 28%;
            width: 40%;
            border: 2px solid #5c0e1b;
            background-color: #b9ffb7;
            -moz-box-shadow:    3px 3px 5px 6px #5c0e1b;
            -webkit-box-shadow: 3px 3px 5px 6px #5c0e1b;
            box-shadow:         3px 3px 5px 6px #5c0e1b;
            padding-left: 30px;
            padding-top: 20px;
            padding-right: 30px;
        }
        tr{
            margin: 5%;
        }
        input[type=text],[type=textarea],[type=number] {
            padding: 6px 8px;
            width: 100%;
            margin: 8px 0;
            display: inline-block;
            border-radius: 4px;
            box-sizing: border-box;
            background-color: #eee;
            background: -webkit-gradient(linear, center top, center bottom, color-stop(0%, #fff), color-stop(100%, #efefef));
            background: -moz-linear-gradient(top, #fff, #efefef);
            border-radius: 3px;
            -webkit-border-radius: 3px 3px 3px 3px;
            -moz-border-radius: 3px 3px 3px 3px;
            box-shadow: 0px 1px 3px rgba(0,0,0,0.7);
            -webkit-box-shadow: 0px 1px 3px rgba(0,0,0,0.7);
            -moz-box-shadow: 0px 1px 3px rgba(0,0,0,0.7);
            border: solid 1px #efefef;
            text-shadow: 0px 1px 1px white;
        }
        input[type=text]:focus,[type=textarea]:focus,[type=number]:focus {
            box-shadow: 0px 1px 8px #5c0e1b;
            -webkit-box-shadow: 0px 1px 8px #5c0e1b;
            -moz-box-shadow: 0px 1px 8px #5c0e1b;
        }
        input[type=submit] {
            width: 20%;
            color: white;
            padding: 14px 20px;
            margin: 8px 40%;
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
        }
        td{
            padding: 10px;
            text-align: left;
        }
        input[type=submit]:hover {
            background: #ec315e;
            box-shadow: 0px 4px 8px #5c0e1b;
            -webkit-box-shadow: 0px 4px 8px #5c0e1b;
            -moz-box-shadow: 0px 4px 8px #5c0e1b;
            cursor: pointer;
        }
    input[type=number]::-webkit-outer-spin-button,
    input[type=number]::-webkit-inner-spin-button {
        -webkit-appearance: none;
        margin: 0;
    }
    input[type=number] {
        -moz-appearance:textfield;
    }
</style>
<body>
     <% String patientproofid =(String) request.getAttribute("patientproofid");
        request.setAttribute("patientproofid",patientproofid);
     %>
         <div class="titleDiv">
            &nbsp;&nbsp;<div class="title"><b>Adhvay</b></div>
        </div>
        <br><br>
        <div class="testReport">
         <div class="titleForm">Test Report</div><br>
            
	    <form action="/test" method="post">
	    <input type="hidden" name="patientproofid" value='<%=patientproofid%>' >
	    
	       <table>
                   <tr> 
                        <td width=10%>Test</td>
                        <td><input id="test" type="text" name="test"  required/></td>	   
                   </tr>
                   <tr> 
                        <td width=10%>Value</td>
                        <td><input id="val" type="text" name="val"  required  /></td>	   
                   </tr>
                   <tr> 
                        <td width=10%>Range</td>
                       <td><input id="range" type="text" name="range" placeholder="Min - Max" required  /></td>
	    		   </tr>
                   <tr></tr>
                </table>
                <input id="btnSubmit" type="submit" name="btnSubmit"  value="Submit"/>
            </form>
        </div>
        <br><br><br>
</body>
</html>
