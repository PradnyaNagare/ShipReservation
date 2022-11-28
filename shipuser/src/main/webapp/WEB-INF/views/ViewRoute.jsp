<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://thumbs.dreamstime.com/b/simple-world-digital-map-outlined-continents-light-grey-colour-world-digital-outlined-map-background-157304566.jpg) ">
</body>

<h1>Route List</h1>

<table border="2" width="70%" cellpadding="2">

<tr><th>RouteId</th><th>Source</th><th>Destination</th><th>TravelDuration</th><th>Fare</th><th>Edit</th><th>Delete</th></tr>

  <c:forEach var="route" items="${list}">

  <tr>

  <td>${route.routeId}</td>

  <td>${route.source}</td>

  <td>${route.destination}</td>

  <td>${route.travelDuration}</td>
  
  <td>${route.fare}</td>
  

  <td><a href="editsave1/${route.routeId}">Edit</a></td>

  <td><a href="deleteroute/${route.routeId}">Delete</a></td>

  </tr>

  </c:forEach>

  </table>

  <br/>

  <a href="AddRoute">Add New Route Details</a><br><br>
  <a href="helloagain">Admin Home</a><br><br>