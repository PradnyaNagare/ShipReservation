<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://i.guim.co.uk/img/media/e8f6e2839f90aa29229d2cfa92007c4863303e4a/0_0_2740_1959/master/2740.jpg?width=1020&quality=45&auto=format&fit=max&dpr=2&s=f6bb288e725a22cf0e1b9ac5c565f9e8) ">
</body>

<h1>Reservation List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Reservation Id</th><th>Schedule Id</th><th>User Id</th><th>Booking Date</th><th>Journey Date</th><th>No Of Seats</th><th>Total Fare</th><th>Booking Status</th><th>Edit</th><th>Cancel Ticket</th><th>Make Payment</th></tr>
  <c:forEach var="reservation" items="${list}">
  <tr>
  <td>${reservation.reservationId}</td>
  <td>${reservation.scheduleId}</td>
  <td>${reservation.userId}</td>
  <td>${reservation.bookingDate}</td>
  <td>${reservation.journeyDate}</td>
  <td>${reservation.noOfSeats}</td>
  <td>${reservation.totalFare}</td>
  <td>${reservation.bookingStatus}</td>
  <td><a href="editreservation/${reservation.reservationId}">Edit</a></td>
  <td><a href="deletereservation/${reservation.reservationId}">Cancel Ticket</a></td>
  <td><a href="cardform">Make Payment</a></td>
  </tr>
  </c:forEach>
  </table>
  <br/>
  <a href="reservationform">Add New User</a><br><br>
<a href="userhelloagain">Home</a><br><br>