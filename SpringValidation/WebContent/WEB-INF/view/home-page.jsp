<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="s" %>	
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>homepage</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}


</style>
</head>
<body>
<h1 align="center">Login-Please</h1>
<hr/>
<s:form  method="POST" action="success" modelAttribute="userinfo">
<div align="center">
<p>
<s:label path="username">UserName:</s:label>
<s:input path="username"/>
<s:errors path="username" cssClass="error"></s:errors>

</p>
<br>
<p>
<s:label path="mailid">Mail-Id:</s:label>
<s:input path="mailid"/>
<s:errors path="mailid" cssClass="error"></s:errors>
</p>
<br>
<p>
<s:label path="password">Password:</s:label>
<s:password path="password"/>
<s:errors path="password" cssClass="error"></s:errors>
</p>
<br>
<input type="submit" name="submit" value="Login"/>
</div>
</s:form>
</body>
</html>