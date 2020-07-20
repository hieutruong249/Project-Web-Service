package controller;

import com.google.gson.Gson;
import model.Employee;
import model.EmployeeDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "Helloworld", urlPatterns = {"/Helloworld"})
public class Helloworld extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        EmployeeDB db = new EmployeeDB();
        ArrayList<Employee> list = db.layDsNvien();

        request.setAttribute("list", list);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("loadLIst.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
