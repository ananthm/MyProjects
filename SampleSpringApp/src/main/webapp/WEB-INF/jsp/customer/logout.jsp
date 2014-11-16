<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div id="ct">
	<h1><spring:message code="logout.header" /></h1>
	<form class="form-horizontal" action="/otaretail/search/logout" id="empLogin" method="POST">
		<fieldset>
			<legend><spring:message code="login.msg" /></legend>
			<c:if test="${not empty errorMessage}">
				<div class="alert inform" id="loginAlertMessage">${errorMessage}</div>	
			</c:if>
			<div class="formRow"><label for="empId">Employee ID</label><input type="text" id="empId" name="empId"></div>
			<div class="formRow"><label for="password">Password</label><input type="password" id="password" name="password"></div>
			<div class="formRow"><label for="branchCode">Branch code</label><input type="text" id="branchCode" name="branchCode"></div>
			<div class="formRow"><label for="cashId">Cash ID</label><input type="text" id="cashId" name="cashId"></div>
			<%--<label class="checkbox" for=""><input type="checkbox" id="loggedInFlag" name="loggedInFlag"> Keep me logged in</label> --%>
			<button class="btn"> Back to Login</button>
		</fieldset>
	</form>
	<%-- <form class="form-horizontal" action="login.shtml" id="forgotPassword">
		<fieldset>
			<legend>Forgotten password</legend>
			<p>To obtain a new password, please enter your Employee ID and details will be emailed to you.</p>
			<div class="alert success"><strong>Thanks!</strong> Details have been sent to your account email address.</div>
			<div class="formRow"><label for="empId">Employee ID</label><input type="text" id="empId"></div>
			<button class="btn">Send</button>
		</fieldset>
	</form> --%>
</div>
