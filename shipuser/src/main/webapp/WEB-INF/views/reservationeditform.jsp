<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://image.cnbcfm.com/api/v1/image/106042801-1564151441390cruiseshot.png?v=1564168367&w=740&h=416) ">
</body>
    <h1>Edit Reservation</h1>
  <form:form method="POST" action="/shipuser/editsave8">
    <table >
    <tr>
     <td>Reservation Id : </td>
     <td><form:input path="reservationId" required="true"/></td>
     </tr>
    <tr>
     <td>Schedule Id : </td>
     <td><form:input path="scheduleId" required="true"/></td>
     </tr>
     <tr>
     <td>User Id :</td>
     <td><form:input path="userId" required="true"/></td>
     </tr>
     <tr>
     <td>Booking Date :</td>
     <td><form:input path="bookingDate" required="true"/></td>
     </tr>
     <tr>
     <td>Journey Date :</td>
     <td><form:input path="journeyDate" required="true"/></td>
     </tr>
     <tr>
     <td>No Of Seats :</td>
     <td><form:input path="noOfSeats" required="true"/></td>
     </tr>
     <tr>
     <td>Total Fare :</td>
     <td><form:input path="totalFare" required="true"/></td>
     </tr>
     <tr>
     <td>Booking Status :</td>
     <td><form:input path="bookingStatus" required="true"/></td>
     </tr>
     
     <tr>
     <td> </td>
     <td><input type="submit" value="Edit Save" /></td>
     </tr>
    </table>
    </form:form>