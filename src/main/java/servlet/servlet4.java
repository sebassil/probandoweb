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
        name = "MyServlet3", 
        urlPatterns = {"/vender"}
    )

public class servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();        
        Simple sebas = Simple.laconstructora();
        String a,b,c,d; 
        int e;
        a=req.getParameter("2a");  
        b=req.getParameter("3a");
        c=req.getParameter("4a");  
        d=req.getParameter("5a");
        e=req.getParameter("6a");    
        sebas.buscarOfertas(a,b,c,d,e);
        out.println("Guardado");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hola</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
        out.println("</body>");
        out.println("</html>");
    }
}

