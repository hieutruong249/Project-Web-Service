<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Employee" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 7/15/2020
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
        <td>Ho</td>
        <td>ten lot</td>
        <td>ten</td>
        </thead>
        <tbody>
        <%
            ArrayList<Employee> list = (ArrayList<Employee>)request.getAttribute("list");
            for (Employee e:list ) {
                %>
        <tr>
            <td><%=e.getHonv()%></td>
            <td><%=e.getTenlot()%></td>
            <td><%=e.getTennv()%></td>
        </tr>
                <%
            }
        %>
        </tbody>
    </table>
</body>
</html>
