<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <title>Pharmacy</title>
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
            .titleSub {
                text-align: center;
                text-shadow: 1px 1px #17b890;
                font-family: 'Open Sans Condensed', sans-serif; font-size: 25px;
            }
            .chooseTabletUpload {
                clear: both;
                margin: 5% 20%;
                width: 60%;
                border: 2px solid #5c0e1b;
                background-color: #b9ffb7;
                -moz-box-shadow:    3px 3px 5px 6px #5c0e1b;
                -webkit-box-shadow: 3px 3px 5px 6px #5c0e1b;
                box-shadow:         3px 3px 5px 6px #5c0e1b;
                padding-left: 30px;
                padding-top: 20px;
            }
            input[type=submit] {
                    width: 20%;
                    color: white;
                    padding: 14px 20px;
                    margin: 8px 35%;
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

            td {
                padding: 5px;
                text-align: left;
            }
            input[type=text],[type=number] {
                width: 100%;
                    padding: 6px 20px;
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
            input[type=text]:focus,[type=number]:focus {
                box-shadow: 0px 1px 8px #5c0e1b;
                -webkit-box-shadow: 0px 1px 8px #5c0e1b;
                -moz-box-shadow: 0px 1px 8px #5c0e1b;
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
        <div class="titleDiv">
                &nbsp;&nbsp;<div class="title"><b>Adhvay</b></div>
        </div>
        <br><br><br>
        <div class="chooseTabletUpload">
             <div class="titleSub">Pharmacy Home Page</div>
             <br><br>
             
<% String patientproofid = (String) request.getAttribute("patientproofid");
    %>
<br>
Aadhar no : ${patientproofid}
<br><br>

	    <form action="/tablet" method="post" >
	    <input type="hidden" name="patientproofid" value='<%=patientproofid%>' >
	 	    <table width=100%>
                <tr></tr><tr></tr>
                <tr>
                    <td width=10% align="center">1</td>
                  <td width=60%><input id="tablet1" type="text" name="tablet1" placeholder="Tablet 1" required maxlength="30" /></td>
                  <td width=5%></td>
                  <td width=20%><input id="qty1" type="number" name="qty1"  placeholder="Quantity" required  /></td>	   
                    <td width=5%></td>
               </tr>
               <tr>
                   <td width=10% align="center">2</td>
                  <td width=60%><input id="tablet2" type="text" name="tablet2" placeholder="Tablet 2"  maxlength="30" /></td>
                  <td width=5%></td>
                  <td width=20%><input id="qty2" type="number" name="qty2"  placeholder="Quantity"  /></td>	   
                    <td width=5%></td>
               </tr>
               <tr>
                    <td width=10% align="center">3</td>
                  <td width=60%><input id="tablet3" type="text" name="tablet3" placeholder="Tablet 3"  maxlength="30" /></td>
                  <td width=5%></td>
                  <td width=20%><input id="qty3" type="number" name="qty3"  placeholder="Quantity"   /></td>	   
                    <td width=5%></td>
               </tr>
               <tr>
                    <td width=10% align="center">4</td>
                  <td width=60%><input id="tablet4" type="text" name="tablet4" placeholder="Tablet 4"  maxlength="30" /></td>
                  <td width=5%></td>
                  <td width=20%><input id="qty4" type="number" name="qty4"  placeholder="Quantity"   /></td>	   
                    <td width=5%></td>
               </tr>
               <tr>
                    <td width=10% align="center">5</td>
                  <td width=60%><input id="tablet5" type="text" name="tablet5" placeholder="Tablet 5" maxlength="30" /></td>
                  <td width=5%></td>
                  <td width=20%><input id="qty5" type="number" name="qty5"  placeholder="Quantity"   /></td>	   
                    <td width=5%></td>
               </tr>
            </table>
            <br><br>
            <div align="center">
                <input id="btnSubmit" type="submit" name="btnSubmit"  value="Submit"/>
            </div>
        </form>
        <br><br>
        </div>
    </body>
</html>
