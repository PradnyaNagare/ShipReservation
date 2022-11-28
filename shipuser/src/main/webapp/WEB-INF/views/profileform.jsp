<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://image.shutterstock.com/image-photo/registration-online-membership-network-internet-260nw-604212929.jpg) ">
</body>
    <h1>Registration For New User</h1>
    <form:form method="post" action="save9">
    <table >
    <tr>
    <td>User Id :</td>
     <td>*<form:input path="userId" required="true"/></td>
     </tr>
     <tr>
     <td>First Name : </td>
     <td>*<form:input path="firstName" required="true"/></td>
     </tr>
     <tr>
     <td>Last Name :</td>
     <td>*<form:input path="lastName" required="true"/></td>
     </tr>
     <tr>
     <td>Date Of Birth :</td>
     <td>*<form:input path="dateOfBirth" required="true"/></td>
     </tr>
     <tr>
     <td>Gender :</td>
     <td>Male<form:radiobutton path="Gender" value="Male"/></td>
     <td>Female<form:radiobutton path="Gender" value="Female"/></td>
     </tr>
     <tr>
     <td>Street :</td>
     <td>*<form:input path="street" required="true"/></td>
     </tr>
     <tr>
     <td>Location :</td>
     <td>*<form:input path="location" required="true"/></td>
     </tr>
     <tr>
     <td>City :</td>
     <td>*<form:input path="city" required="true"/></td>
     </tr>
     <tr>
     <td>State :</td>
     <td>*<form:input path="state" required="true"/></td>
     </tr>
     <tr>
     <tr>
     <td>Pincode :</td>
     <td>*<form:input path="pincode" required="true"/></td>
     </tr>
     <tr>
     <td>Mobile No :</td>
     <td>*<form:input path="mobileNo" required="true"/></td>
     </tr>
     <tr>
     <td>Email Id :</td>
     <td>*<form:input path="emailId" required="true"/></td>
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
    </table>
    </form:form>