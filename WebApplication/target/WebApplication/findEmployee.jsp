<%@ page import="model.Employee" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 7/20/2020
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tìm nhân viên</title>
</head>
<body>
<div align="center">

    <h1>Kết quả tìm nhân viên: <%= request.getAttribute("tenNV")%></h1>
    <%
        ArrayList<Employee> list = (ArrayList<Employee>)request.getAttribute("list");
        //utils_employee ue = new utils_employee();
        if(list.size()>0){
            %>
    <table style='border:1px solid black; border-collapse: collapse; width: 100%;'>
        <tr>
            <th style='border:1px solid black;'>Mã nhân viên</th>
            <th style='border:1px solid black;'>Họ và tên</th>
            <th style='border:1px solid black;'>Ngày sinh</th>
            <th style='border:1px solid black;'>Địa chỉ</th>
            <th style='border:1px solid black;'>Phái</th>
            <th style='border:1px solid black;'>Lương</th>
            <th style='border:1px solid black;'>Mã NQL</th>
            <th style='border:1px solid black;'>Phòng</th>
        </tr>

    <%
            for(Employee nv:list){
                %>
        <tr>
            <td style='border:1px solid black;'> <%=nv.getManv()%> </td>
            <td style='border:1px solid black;'> <%=(new String(nv.getHonv().getBytes(),"UTF-8")+" "+new String(nv.getTenlot().getBytes(),"UTF-8")+" "+new String(nv.getTennv().getBytes(),"UTF-8"))%> </td>
            <td style='border:1px solid black;'> <%=nv.getNgsinh()%> </td>
            <td style='border:1px solid black;'> <%=nv.getDchi()%> </td>
            <td style='border:1px solid black;'> <%=nv.getPhai()%> </td>
            <td style='border:1px solid black;'> <%=nv.getLuong()%> </td>
            <td style='border:1px solid black;'> <%=nv.getMa_nql()%> </td>
            <td style='border:1px solid black;'> <%=nv.getPhg()%> </td>
        </tr>
    <%
            }
        }
    %>
    </table>
    <%
        if(list.size()<0)
    %>
    <h3>Không tồn tại nhân viên này</h3>
</div>
</body>
</html>

