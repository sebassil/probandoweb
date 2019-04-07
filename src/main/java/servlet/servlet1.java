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
        name = "MyServlet1", 
        urlPatterns = {"/adicionarusu"}
    )

public class servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Simple sebas = Simple.laconstructora();
        String a,b;
        a=req.getParameter("2a");  
        b=req.getParameter("3a");
        sebas.adicionarusu(a,b);
        req.getRequestDispatcher("/index.html").forward(req,resp);
    }
}

