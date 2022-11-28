<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://images.hindustantimes.com/img/2022/01/03/550x309/cordelia-cruise-ship_1641175187041_1641175187288.jpg) ">
</body>

    <h1>Edit Ship</h1>

  <form:form method="POST" action="/shipuser/editsave2">

    <table >

    <tr>

    <td></td>

     <td><form:hidden path="ShipId" required="true"/></td>

     </tr>

     <tr>

     <td>ShipName : </td>

     <td><form:input path="ShipName" required="true"/></td>

     </tr>

     <tr>

     <td>Seating Capacity :</td>

     <td><form:input path="SeatingCapacity" required="true"/></td>

     </tr>

    <tr>

     <td>Reservation Capacity :</td>

     <td><form:input path="ReservationCapacity" required="true"/></td>

     </tr>
     <tr>

     <td> </td>

     <td><input type="submit" value="Edit&Save" /></td>

     </tr>

    </table>

    </form:form>

