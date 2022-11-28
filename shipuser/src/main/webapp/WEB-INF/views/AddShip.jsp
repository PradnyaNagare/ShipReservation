<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://hdwallpaperim.com/wp-content/uploads/2017/08/31/148931-sailing_ship.jpg) ">
</body>

    <h1>Add New Ship Details </h1>

    <form:form method="post" action="save2">

    <table >
    <tr>

     <td>ShipId</td>

     <td>*<form:input path="ShipId" required="true"/></td>

     </tr>

     <tr>

     <td>ShipName</td>

     <td>*<form:input path="ShipName" required="true"/></td>

     </tr>

     <tr>

     <td>SeatingCapacity</td>

     <td>*<form:input path="SeatingCapacity" required="true"/></td>

     </tr>

     <tr>

     <td>ReservationsCapacity</td>

     <td>*<form:input path="ReservationCapacity" required="true"/></td>

     </tr>
     
     <tr>
     <td>
     <p style="color:red;">* field is mandatory required.</p>
     </td>
     </tr>

     <tr>

     <td> </td>

     <td><input type="submit" value="Save" /></td>

     </tr>

    </table>

    </form:form>
<a href="helloagain">Admin Home</a><br><br>