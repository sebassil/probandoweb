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
        name = "MyServlet5", 
        urlPatterns = {"/ofertar"}
    )

public class servlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();        
        Simple sebas = Simple.laconstructora();
        String e;
        int a,b,c; 
        a=Integer.parseInt(req.getParameter("2a"));  
        b=Integer.parseInt(req.getParameter("3a"));
        c=Integer.parseInt(req.getParameter("4a"));   
        e=sebas.adicionarOferta(a,b,c);
        out.println(e);
    }
}

