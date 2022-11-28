<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://i.guim.co.uk/img/media/9fab8429b3c8cf779aa8297e2ac1f48aaffac1fd/0_123_3504_2102/master/3504.jpg?width=1020&quality=45&auto=format&fit=max&dpr=2&s=26a8e156af2306433074030e9e62b238) ">
</body>
    <h1>Edit Schedule</h1>
  <form:form method="POST" action="/shipuser/editsave3">
    <table >
    <tr>
     <td>ScheduleId :</td>
     <td><form:input path="scheduleId" required="true"/></td>
     </tr>
    <tr>
     <td>ShipId : </td>
     <td><form:input path="shipId" required="true"/></td>
     </tr>
     <tr>
     <td>RouteId :</td>
     <td><form:input path="routeId" required="true"/></td>
     </tr>
     <tr>
     <td>StartDate :</td>
     <td><form:input path="startDate" required="true"/></td>
     </tr>
     
     <tr>
     <td> </td>
     <td><input type="submit" value="Edit Save" /></td>
     </tr>
    </table>
    </form:form>