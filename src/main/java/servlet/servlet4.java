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
        name = "MyServlet4", 
        urlPatterns = {"/buscarOfertas"}
    )

public class servlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();        
        Simple sebas = Simple.laconstructora();

        ArrayList<Producto> mostrar = new ArrayList<Producto>();
        String a,b,c,d; 
        int e;
        a=req.getParameter("2a");  
        b=req.getParameter("3a");
        c=req.getParameter("4a");  
        d=req.getParameter("5a");
        e=Integer.parseInt(req.getParameter("6a"));    
        mostrar = sebas.buscarOferta(a,b,c,d,e);
    }
}

