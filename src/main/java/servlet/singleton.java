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

public class Simple{
    private static singleton instancia=null;
    
    public static singleton laconstructora(){
        if(instancia==null)
        {
            instancia = new instancia();
        }
        return instancia;
    }
}
