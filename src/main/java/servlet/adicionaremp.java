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
        urlPatterns = {"/adicionaremp"}
    )

public class Adicionaremp extends HttpServlet {
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();

        out.println("sebas");
        String a =request.getParameter("2a");  
        String b =request.getParameter("3a");
        String c =request.getParameter("4a");
        Empleado nuevo = new Empleado(a,b,c);
        empleados.add(nuevo);
        for(int i=0;i<codigos.size();i++){
            out.println(empleados.get(i));
        }    
    }
    
}