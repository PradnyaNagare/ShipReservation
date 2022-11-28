<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://www.itfseafarers.org/sites/default/files/styles/node_main/public/node/issues/image/Cruise%20Ship.jpg?itok=H5WzDqy3) ">
</body>
    <h1>  Add New Schedule</h1>
    <form:form method="post" action="save3">
    <table >
    <tr>
    <td>Schedule Id:</td>
    <td>*<form:input path="scheduleId" required="true"/></td>
    </tr>
    <tr>
     <td>ShipId : </td>
     <td>*<form:input path="shipId" required="true"/></td>
     </tr>
     <tr>
     <td>RouteId :</td>
     <td>*<form:input path="routeId" required="true"/></td>
     </tr>
     <tr>
     <td>StartDate :</td>
     <td>*<form:input path="startDate" required="true"/></td>
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