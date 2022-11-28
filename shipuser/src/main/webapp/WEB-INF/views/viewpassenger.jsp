<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://akm-img-a-in.tosshub.com/indiatoday/images/story/201902/book_a_meal_in_train_.jpeg?HSauvs4BzjIe_Vi1Ro_YkTj.ewieYAL4&size=770:433) ">
</body>
<h1>Passengers List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Reservation Id</th><th>Schedule Id</th><th>Name</th><th>Age</th><th>Gender</th><th>Edit</th><th>Delete</th></tr>
  <c:forEach var="passenger" items="${list}">
  <tr>
  <td>${passenger.reservationId}</td>
  <td>${passenger.scheduleId}</td>
  <td>${passenger.name}</td>
  <td>${passenger.age}</td>
  <td>${passenger.gender}</td>
  <td><a href="editpassenger/${passenger.reservationId}">Edit</a></td>
  <td><a href="deletepassenger/${passenger.reservationId}">Delete</a></td>
  </tr>
  </c:forEach>
  </table>
  <br/>
  <a href="passengerform">Add New User</a><br><br>
<a href="userhelloagain">Home</a><br><br>