<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://image.shutterstock.com/image-photo/credit-card-close-shot-selective-260nw-567634105.jpg) ">
</body>
    <h1>Enter Credit Card Details</h1>
    <form:form method="post" action="save7">
    <table >
    <tr>
    <td>Credit Card Number :</td>
     <td>*<form:input path="creditCardNumber" required="true"/></td>
     </tr>
     <tr>
     <td>Valid From : </td>
     <td>*<form:input path="validFrom" required="true"/></td>
     </tr>
     <tr>
     <td>Valid To :</td>
     <td>*<form:input path="validTo" required="true"/></td>
     </tr>
     <tr>
     <td>Balance :</td>
     <td>*<form:input path="balance" required="true"/></td>
     </tr>
     <tr>
     <td>User Id :</td>
     <td>*<form:input path="userId" required="true"/></td>
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