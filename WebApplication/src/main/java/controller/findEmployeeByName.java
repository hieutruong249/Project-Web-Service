package controller;

import model.Employee;
import model.EmployeeDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/findEmployeeByName")
public class findEmployeeByName extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String tenNV = request.getParameter("txtTenNV");

        EmployeeDB dao = new EmployeeDB();

        ArrayList<Employee> list = dao.findEmployeeByName(tenNV);

        request.setAttribute("tenNV", new String(tenNV.getBytes("ISO-8859-1"),"UTF-8"));
        request.setAttribute("list", list);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("/findEmployee.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}
