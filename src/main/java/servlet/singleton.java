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
    private static Simple instancia=null;
    
    public static Simple laconstructora(){
        if(instancia==null)
        {
            instancia = new instancia();
        }
        return instancia;
    }
    
}
