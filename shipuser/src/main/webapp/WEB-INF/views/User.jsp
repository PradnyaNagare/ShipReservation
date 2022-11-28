<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>

<style>

.error{
color:red
}
p{
color:#FFA500;
}
a{
color:#FFA500;
}

body{
background-color: #000000;
color:#FFA500;
}



</style>

</head>

<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://wallpaperbat.com/img/230151-free-download-world-of-travel-wallpaper-hd-download-of-famous.jpg) ">
</body>

<form:form action="userhelloagain" modelAttribute="user">

User Id: <form:input path="name" required="true"/> <br><br>

Password(*): <form:password path="pass" required="true"/>

<form:errors path="pass" cssClass="error"/><br><br>

<input type="submit" value="login">

<p>New user? </p>
<a href="profileform">Register Here</a><br><br>


</form:form>

</body>

</html>



