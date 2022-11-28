<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://www.puertocartagena.com/sites/default/files/pasajeros.jpg) ">
</body>
    <h1>Enter Passenger Details</h1>
    <form:form method="post" action="save10">
    <table >
    <tr>
    <td>Reservation Id :</td>
     <td>*<form:input path="reservationId" required="true"/></td>
     </tr>
     <tr>
     <td>Schedule Id :</td>
     <td>*<form:input path="scheduleId" required="true"/></td>
     </tr>
     <tr>
     <td>Name :</td>
     <td>*<form:input path="name" required="true"/></td>
     </tr>
     <tr>
     <td>Age :</td>
     <td>*<form:input path="age" required="true"/></td>
     </tr>
     <tr>
     <td>Gender :</td>
     <td>Male<form:radiobutton path="Gender" value="Male"/></td>
     <td>Female<form:radiobutton path="Gender" value="Female"/></td>
     </tr>
     <tr>
     <td>
     <p style="color:red;">* fields are mandatory to fill.</p>
     </td>
     </tr>
     <tr>
     <td> </td>
     <td><input type="submit" value="Save" /></td>
     </tr>
     <tr>
     <a href="userhelloagain">Home</a><br><br>
     </tr>
    </table>
    </form:form>
    