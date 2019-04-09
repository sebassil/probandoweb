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
        urlPatterns = {"/verofertas"}
    )

public class servlet6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();        
        Simple sebas = Simple.laconstructora();
        ArrayList<String> e = new ArrayList<String>();
        int a; 
        a=Integer.parseInt(req.getParameter("2a"));  
        e=sebas.verOfertas(a);
        for(int i=0;i<e.size();i++){
            out.println(e.get(i));
        }
    }
}

