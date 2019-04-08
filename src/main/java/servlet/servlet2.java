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
        name = "MyServlet2", 
        urlPatterns = {"/ingresar"}
    )

public class servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();        
        Simple sebas = Simple.laconstructora();
        String a,b,c;
        a=req.getParameter("2a");  
        b=req.getParameter("3a");
        c=sebas.ingresar(a,b);
        req.getRequestDispatcher("/Ingresar.html").forward(req,resp);
        out.println("hola");
    }
}

