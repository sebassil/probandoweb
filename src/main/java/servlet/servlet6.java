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
        name = "MyServlet6", 
        urlPatterns = {"/relemp"}
    )

public class servlet6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        Simple sebas = Simple.laconstructora();
        ArrayList<String> b = new ArrayList<String>();
        String a;
        a=req.getParameter("2a");    
        b=sebas.buscarrelemp(a);
        for(int i=0;i<b.size();i++){
            out.println(b.get(i));              
        }
    }
}

