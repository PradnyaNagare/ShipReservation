<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body style="background-repeat: no-repeat;
  background-size:cover;background-image:url(https://render.fineartamerica.com/images/rendered/default/flat/beach-towel/images-medium-5/1-world-shipping-routes-map-atiketta-sangasaeng.jpg?&targetx=-44&targety=0&imagewidth=1041&imageheight=476&modelwidth=952&modelheight=476&backgroundcolor=7493B0&orientation=1&producttype=beachtowel-32-64) ">
</body>


    <h1>Add New Route Details </h1>

    <form:form method="post" action="save1">

    <table >
    <tr>

     <td>RouteId</td>

     <td>*<form:input path="routeId" required="true"/></td>

     </tr>

     <tr>

     <td>Source</td>

     <td>*<form:input path="source" required="true"/></td>

     </tr>

     <tr>

     <td>Destination</td>

     <td>*<form:input path="destination" required="true"/></td>

     </tr>

     <tr>

     <td>TravelDuration</td>

     <td>*<form:input path="travelDuration" required="true"/></td>

     </tr>
     <tr>

     <td>Fare</td>

     <td>*<form:input path="fare" required="true"/></td>

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
    <a href="helloagain">Admin Home</a><br><br>