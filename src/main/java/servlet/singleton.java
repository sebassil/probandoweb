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
        urlPatterns = {"/simple"}
    )

public static class Simple{
    private static Simple instancia=null;
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public static Simple laconstructora(){
        if(instancia==null)
        {
            instancia = new instancia();
        }
        return instancia;
    }
    
    public void adicionaremp(){
        String cod,nomb,hab;
        a=request.getParameter("2a");  
        b=request.getParameter("3a");
        c=request.getParameter("4a");

        Empleado nuevo = new Empleado(a,b,c);
        empleados.add(nuevo);
        out.println(nuevo.toString());
    }
}
