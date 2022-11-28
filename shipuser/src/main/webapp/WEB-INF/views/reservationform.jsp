<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://www.marineinsight.com/wp-content/uploads/2019/08/Cruise-ships-1.png.webp) ">
</body>
    <h1>Reservation Details</h1>
    <form:form method="post" action="save8">
    <table >
    <tr>
    <td>Reservation Id :</td>
     <td>*<form:input path="reservationId" required="true"/></td>
     </tr>
     <tr>
     <td>Schedule Id : </td>
     <td>*<form:input path="scheduleId" required="true"/></td>
     </tr>
     <tr>
     <td>User Id :</td>
     <td>*<form:input path="userId" required="true"/></td>
     </tr>
     <tr>
     <td>Booking Date :</td>
     <td>*<form:input path="bookingDate" required="true"/></td>
     </tr>
     <tr>
     <td>Journey Date :</td>
     <td>*<form:input path="journeyDate" required="true"/></td>
     </tr>
     <tr>
     <td>No Of Seats :</td>
     <td>*<form:input path="noOfSeats" required="true"/></td>
     </tr>
     <tr>
     <td>Total Fare :</td>
     <td>*<form:input path="totalFare" required="true"/></td>
     </tr>
     <tr>
     <td>Booking Status :</td>
     <td>*<form:input path="bookingStatus" required="true"/></td>
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
     <a href="userhelloagain">Home</a><br><br>
    </table>
    </form:form>