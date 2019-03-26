package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet(
        name = "MyServlet", 
        urlPatterns = {"/hello"}
    )

public class AdicionarEmp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();

        ArrayList<Empleado> empleados = new ArrayList<Empleado>;

        Empleado sebas = new Empleado("sebas ","es un"," crack"); 
        empleados.add(sebas);
        out.println(sebas.toString());
    }
    
}