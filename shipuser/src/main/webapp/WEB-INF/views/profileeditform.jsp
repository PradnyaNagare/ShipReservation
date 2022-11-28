<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://assets.bwbx.io/images/users/iqjWHBFdfxIU/ih0w0wevVwZk/v1/1200x-1.jpg) ">
</body>
    <h1>Edit Employee</h1>
  <form:form method="POST" action="/shipuser/editsave9">
    <table >
    <tr>
     <td>User Id : </td>
     <td><form:input path="userId" required="true"/></td>
     </tr>
    <tr>
     <td>First Name : </td>
     <td><form:input path="firstName" required="true"/></td>
     </tr>
     <tr>
     <td>Last Name :</td>
     <td><form:input path="lastName" required="true"/></td>
     </tr>
     <tr>
     <td>Date Of Birth :</td>
     <td><form:input path="dateOfBirth" required="true"/></td>
     </tr>
     <tr>
     <td>Gender :</td>
     <td>Male<form:radiobutton path="Gender" value="Male"/></td>
     <td>Female<form:radiobutton path="Gender" value="Female"/></td>
     </tr>
     <tr>
     <td>Street :</td>
     <td><form:input path="street" required="true"/></td>
     </tr>
     <tr>
     <td>Location :</td>
     <td><form:input path="location" required="true"/></td>
     </tr>
     <tr>
     <td>City :</td>
     <td><form:input path="city" required="true"/></td>
     </tr>
     <tr>
     <td>State :</td>
     <td><form:input path="state" required="true"/></td>
     </tr>
     <tr>
     <tr>
     <td>Pincode :</td>
     <td><form:input path="pincode" required="true"/></td>
     </tr>
     <tr>
     <td>Mobile No :</td>
     <td><form:input path="mobileNo" required="true"/></td>
     </tr>
     <tr>
     <td>Email Id :</td>
     <td><form:input path="emailId" required="true"/></td>
     </tr>
     <tr>
     <td> </td>
     <td><input type="submit" value="Edit Save" /></td>
     </tr>
    </table>
    </form:form>

