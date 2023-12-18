<%@page import="com.example.Person.entity.Person"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Users List</h1>
    <table border="1">
        <tr>
            <th>Employee Id</th>
             <th>Employee Name</th>
           
            
     <%
                            List<Person> li = (List<Person>) request.getAttribute("read");

                                                               
                                                                    for(Person obj : li) 
                                                                    {
                            %>
           
                
            <tr>
            
            <td><%= obj.getId() %></td>
            <td><%= obj.getName() %></td> 
       
           
            </tr>
            <%
             }
            %>
    </table>
</body>
</html>