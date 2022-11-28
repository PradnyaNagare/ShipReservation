<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://images.hindustantimes.com/img/2022/01/03/550x309/cordelia-cruise-ship_1641175187041_1641175187288.jpg) ">
</body>

<h1>Ship List</h1>

<table border="2" width="70%" cellpadding="2">

<tr><th>ShipId</th><th>ShipName</th><th>SeatingCapacity</th><th>ReservationCapacity</th><th>Edit</th><th>Delete</th></tr>

  <c:forEach var="ship" items="${list}">

  <tr>

  <td>${ship.shipId}</td>

  <td>${ship.shipName}</td>

  <td>${ship.seatingCapacity}</td>

  <td>${ship.reservationCapacity}</td>

  <td><a href="editsave2/${ship.shipId}">Edit</a></td>

  <td><a href="deleteship/${ship.shipId}">Delete</a></td>

  </tr>

  </c:forEach>

  </table>

  <br/>

  <a href="AddShip">Add New Ship Details</a><br><br>
  
  <a href="helloagain">Admin Home</a><br><br>