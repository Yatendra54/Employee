<%@page import="com.employee.Entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="align-content: center;">Employee List</h1>
    <table border="1">
        <tr>
            <th>Id</th>
             <th>Name</th>
             <th>Age</th>
             <th>Salary</th>
             
         </tr>
            
     <% 
        List<Employee> objectList = (List<Employee>) request.getAttribute("read");

       
            for (Employee obj : objectList) 
            {
        %>
           
                
            <tr>
            
            <td><%= obj.getId() %></td>
            <td><%= obj.getName() %></td> 
            <td><%= obj.getAge() %></td>
            <td><%= obj.getSalary() %></td>
            
           
           
            </tr>
            <%
             }
            %>
    </table>
</body>
</html>