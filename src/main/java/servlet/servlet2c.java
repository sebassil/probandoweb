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
        name = "MyServlet2c", 
        urlPatterns = {"/ingresarc"}
    )

public class servlet2c extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();        
        Simple sebas = Simple.laconstructora();
        String a,b;
        boolean c=false;
        a=req.getParameter("2a");  
        b=req.getParameter("3a");
        c=sebas.ingresarC(a,b);
        if(c)
        {
            req.getRequestDispatcher("/MenuC.html").forward(req,resp);
        }else{
            out.println("Usuario y contraseña no coinciden");
        }
        
    }
}

