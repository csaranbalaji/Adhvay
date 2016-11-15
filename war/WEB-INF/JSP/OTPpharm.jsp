<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Patient Details</title>
<style>
    html{
        margin: 0px;
        padding: 0px;
    }
    body {
        
        background-color: #dff8eb;
        color: #000; 
        background: -webkit-linear-gradient(200deg, #ec315e , #ab1035)); /* For Safari 5.1 to 6.0 */
        background: -o-linear-gradient(200deg, #ec315e , #ab1035)); /* For Opera 11.1 to 12.0 */
        background: -moz-linear-gradient(200deg, #ec315e , #ab1035)); /* For Firefox 3.6 to 15 */
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
    .titleForm {
        text-align: center;
        text-shadow: 1px 1px #17b890;
        font-family: 'Open Sans Condensed', sans-serif; font-size: 25px;
    }
    .formPatient {
        clear: both;
        margin: 5% 30%;
        width: 35%;
        border: 2px solid #5c0e1b;
        background-color: #b9ffb7;
        -moz-box-shadow:    3px 3px 5px 6px #5c0e1b;
        -webkit-box-shadow: 3px 3px 5px 6px #5c0e1b;
        box-shadow:         3px 3px 5px 6px #5c0e1b;
        padding-left: 30px;
        padding-top: 20px;
        }
    
    .button:hover {
        background: #ec315e;
        box-shadow: 0px 4px 8px #5c0e1b;
        -webkit-box-shadow: 0px 4px 8px #5c0e1b;
        -moz-box-shadow: 0px 4px 8px #5c0e1b;
        cursor: pointer;
    }
    .button{
        width: 30%;
        background-color: #4CAF50;
        color: white;
        border: none;
        padding: 5px;
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
        margin-left: 33%;
    }
    input[type=text], select {
        //width: 100%;
        padding: 12px 20px;
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
    input[type=text]:focus {
        box-shadow: 0px 1px 8px #5c0e1b;
        -webkit-box-shadow: 0px 1px 8px #5c0e1b;
        -moz-box-shadow: 0px 1px 8px #5c0e1b;
    }
    label{
        font-size:110%;    

     }
</style>	

</head> 
<body>
    <div class="titleDiv">
        &nbsp;&nbsp;<div class="title"><b>Adhvay</b></div>
    </div>
    <br><br><br><br><br>
    <div class="formPatient">
        <div class="titleForm">Patient Details</div> 
        <br><br>
        <form action="/pharm-main" method="get" >
            <label>Patient Id:</label> <input type="text" name="patientproofid" required >  
            <select name="Proofs">
					<option value="Aadhar">Aadhar</option>
					<option value="licence">Licence</option>
					<option value="voter">Voter</option>
					<option value="pan">Pan</option>
					<option value="passport">Passport</option>
			</select>  
            <br><br><br>
            <input type="submit" class="button" value="Generate OTP"><br><br><br>
        </form>
    </div>
    <br><br><br><br><br><br>
</body>
</html>
