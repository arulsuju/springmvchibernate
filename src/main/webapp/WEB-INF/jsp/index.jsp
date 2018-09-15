<%--
  Created by IntelliJ IDEA.
  User: JWL
  Date: 09/09/2018
  Time: 4:01
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
Hello
<!--  <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aspects</artifactId>
            <version>5.0.6.RELEASE</version>
        </dependency> should be added if modelAttribute Fails -->
<form:form action="processForm" modelAttribute="student">
    First Name<form:input path="firstName"/><br/>
    Last Name<form:input path="lastName"/><br/>
    Address<form:input path="address"/><br>
    <input type="submit" />
</form:form>

</body>
</html>
