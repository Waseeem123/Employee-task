<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" modelAttribute="employee">
<form:label path="id">ID :</form:label>
<form:input path="id"/>

<form:label path="name">NAME :</form:label>
<form:input path="name"/>

<form:label path="about">ABOUT ME :</form:label>
<form:input path="about"/>

<input type="submit">

</form:form>

</body>
</html>