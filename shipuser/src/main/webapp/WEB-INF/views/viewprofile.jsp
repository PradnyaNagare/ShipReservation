<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://assets.bwbx.io/images/users/iqjWHBFdfxIU/ih0w0wevVwZk/v1/1200x-1.jpg) ">
</body>
<h1>Users List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>User Id</th><th>First Name</th><th>Last Name</th><th>Date Of Birth</th><th>Gender</th><th>Street</th><th>Location</th><th>City</th><th>State</th><th>Pincode</th><th>Mobile No</th><th>Email Id</th><th>Edit</th><th>Delete</th></tr>
  <c:forEach var="profile" items="${list}">
  <tr>
  <td>${profile.userId}</td>
  <td>${profile.firstName}</td>
  <td>${profile.lastName}</td>
  <td>${profile.dateOfBirth}</td>
  <td>${profile.gender}</td>
  <td>${profile.street}</td>
  <td>${profile.location}</td>
  <td>${profile.city}</td>
  <td>${profile.state}</td>
  <td>${profile.pincode}</td>
  <td>${profile.mobileNo}</td>
  <td>${profile.emailId}</td>
  <td><a href="editprofile/${profile.userId}">Edit</a></td>
  <td><a href="deleteprofile/${profile.userId}">Delete</a></td>
  </tr>
  </c:forEach>
  </table>
  <br/>
  <a href="profileform">Add New User</a>
