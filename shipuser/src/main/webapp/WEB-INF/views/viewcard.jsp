<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://media.istockphoto.com/photos/stack-of-multicolored-credit-cards-closeup-view-with-selective-focus-picture-id682285434?k=20&m=682285434&s=612x612&w=0&h=CuIygCQMl5tn_QAn3_hToGvr2k4DO2mZV1t09OikMW4=) ">
</body>
<h1>Payment Done</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Credit Card Number</th><th>Valid From</th><th>Valid To</th><th>Balance</th><th>User Id</th><th>Delete</th></tr>
  <c:forEach var="card" items="${list}">
  <tr>
  <td>${card.creditCardNumber}</td>
  <td>${card.validFrom}</td>
  <td>${card.validTo}</td>
  <td>${card.balance}</td>
  <td>${card.userId}</td>
  <td><a href="editcard/${card.userId}">Edit</a></td>
  <td><a href="deletecard/${card.userId}">Delete</a></td>
  </tr>
  </c:forEach>
  </table>
  <br/>
  <a href="cardform">Add New User</a><br><br>
  <a href="userhelloagain">Home</a><br><br>
