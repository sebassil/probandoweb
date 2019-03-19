package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MyServlet", 
        urlPatterns = {"/relacion"}
    )

public class Relacion(){
    private String codigo;
    private String id;
    
    public Relacion(){
        this.codigo = "";
        this.id = "";
    }

    public Relacion(String codigo,String id){
        this.codigo = codigo;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.codigo+","+this.id;
    }
}
