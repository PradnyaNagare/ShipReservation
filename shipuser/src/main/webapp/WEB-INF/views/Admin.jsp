<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>

<style>

.error{
color:red
}

body{
background-color: #000000;
color:#000000;
}



</style>

</head>

<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://image.shutterstock.com/image-photo/admin-word-written-on-wooden-260nw-1763707634.jpg) ">
</body>

<form:form action="helloagain" modelAttribute="admin">

Admin Id: <form:input path="name" required="true"/> <br><br>

Password(*): <form:password path="pass" required="true"/>

<form:errors path="pass" cssClass="error"/><br><br>

<input type="submit" value="login">



</form:form>

</body>

</html>



