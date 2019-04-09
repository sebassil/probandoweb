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
        name = "MyServlet9", 
        urlPatterns = {"/modificarofertas"}
    )

public class servlet9 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();        
        Simple sebas = Simple.laconstructora();
        int a,b;
        a=Integer.parseInt(req.getParameter("2a"));
        b=Integer.parseInt(req.getParameter("3a"));
        sebas.modificarOferta(a,b);
        out.println("oferta modificada");
    }
}

