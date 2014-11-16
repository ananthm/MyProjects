<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div id="ct">
	<h1><spring:message code="login.header" /></h1>
	<form class="form-horizontal" action="/otaretail/search/forgotpassword" id="forgotPassword">
		<fieldset>
			<legend>Forgotten password</legend>
			<p>To obtain a new password, please enter your Employee ID and details will be emailed to you.</p>
			<!-- <div class="alert success"><strong>Thanks!</strong> Details have been sent to your account email address.</div> -->
			<div class="formRow"><label for="empId">Employee ID</label><input type="text" id="empId"></div>
			<button class="btn">Send</button>
		</fieldset>
	</form>
</div>
