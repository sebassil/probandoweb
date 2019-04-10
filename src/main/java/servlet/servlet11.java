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
        name = "MyServlet11", 
        urlPatterns = {"/misofertas"}
    )

public class servlet11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();        
        Simple sebas = Simple.laconstructora();
        ArrayList<String> mostrar = new ArrayList<String>();
        mostrar=sebas.aceptarCompra();
        for(int i=0;i<mostrar.size();i++){
            out.println(mostrar.get(i));
        }
    }
}

