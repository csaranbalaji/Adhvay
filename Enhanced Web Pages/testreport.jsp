<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  <!DOCTYPE html>
  <html>
    <head>
      <!--Import Google Icon Font-->
      <link href="fonts/icons.css" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
	  <title>Test Report</title>
      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
      <style>
      	body{
      		font-family:'Segoe UI';
      	}
      </style>
    </head>

    <body>
		<% String patientproofid =(String) request.getAttribute("patientproofid");
        request.setAttribute("patientproofid",patientproofid); %>
		  <nav>
			<div class="nav-wrapper">
			  <a href="index.html" class="brand-logo">&nbsp;&nbsp;Adhvay</a>
			  <ul id="nav-mobile" class="right hide-on-med-and-down">
				<li><a href="patient_login.html">Patient</a></li>
				<li><a href="report_login.html">Diagnostic Centre</a></li>
				<li><a href="pharmacy_login.html">Pharmacist</a></li>
			  </ul>
			</div>
		  </nav>
	<div class="row">
		<div class="col s12 m8 offset-m2 l4 offset-l4" style="padding-top: 6%;">
        <div class="card-panel grey lighten-5 z-depth-1">
			<h4 class="header2" style="vertical-align:center;">Test Report</h4>
			<form>
			  <div class="row">
				<div class="input-field col s12">
				  <i class="material-icons prefix">invert_colors</i>
				  <input id="test" type="text" class="validate" autofocus>
				  <label for="test">Test</label>
				</div>
				<div class="input-field col s12">
				  <i class="material-icons prefix">description</i>
				  <input id="value" type="tel" class="validate">
				  <label for="value">Value</label>
				</div>
				<div class="input-field col s12">
				  <i class="material-icons prefix">equalizer</i>
				  <input id="range" type="tel" class="validate">
				  <label for="range">Range</label>
				</div>
				<div class="input-field col s12">
					<button class="btn waves-effect waves-light right submit" type="submit" name="action">Submit
					  <i class="mdi-content-send right"></i>
					</button>
				</div>
			  </div>
			  
			</form>
        </div>
    </div>
	  
      <!--Import jQuery & materialize.js-->
      <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
  </html>
        
