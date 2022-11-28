<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://i.guim.co.uk/img/media/9fab8429b3c8cf779aa8297e2ac1f48aaffac1fd/0_123_3504_2102/master/3504.jpg?width=1020&quality=45&auto=format&fit=max&dpr=2&s=26a8e156af2306433074030e9e62b238) ">
</body>
<h1>Schedule List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>ScheduleId</th><th>ShipId</th><th>RouteId</th><th>StartDate</th><th>Edit</th><th>Delete</th></tr>
  <c:forEach var="schedule" items="${list}">
  <tr>
  <td>${schedule.scheduleId}</td>
  <td>${schedule.shipId}</td>
  <td>${schedule.routeId}</td>
  <td>${schedule.startDate}</td>
  
  <td><a href="editschedule/${schedule.scheduleId}">Edit</a></td>
  <td><a href="deleteschedule/${schedule.scheduleId}">Delete</a></td>
  </tr>
  </c:forEach>
  </table>
  <br/>
  <a href="ScheduleForm">Add New Schedule</a><br><br>
  <a href="helloagain">Admin Home</a><br><br>
