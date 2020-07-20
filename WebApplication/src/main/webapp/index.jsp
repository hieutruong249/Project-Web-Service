<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Home</title>
</head>
<body>
<div align="center">
    <h1>Tìm nhân viên</h1>
    <form method="POST" id="frmTim" action="findEmployeeByName">
        Tên nhân viên: <input type="text" id="txtTenNV" name="txtTenNV" placeholder=" nhập tên nhân viên" autofocus>
        <input type="submit" value="Tìm">
        <p id="alert" style="color:red;"></p>
    </form>
</div>
</body>
</html>