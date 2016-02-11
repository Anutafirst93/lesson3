<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="adduser">
            <input type="text" name="firstname" />
            <input type="text" name="lastname" />
            <input type="submit" name="submit" value="add user"/>
        </form>
        
        <c:forEach var="item" items="${userlist}"> 
<tr> 
<td><c:out value="${item.id}"/></td> 
<td><c:out value="${item.firstname}"/></td> 
<td><c:out value="${item.lastname}"/></td> 
<!--<td><a href="edituser?id=${item.id}">edit</a></td> 
<td><a href="deleteuser?id=${item.id}">delete</a></td> -->
</tr> 
</c:forEach>
    </body>
</html>
