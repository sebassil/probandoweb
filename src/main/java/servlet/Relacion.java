package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Relacion{
    private String id;
    private String codigo;
   
    
    public Relacion(){
        this.id = "";
        this.codigo = "";
    }

    public Relacion(String id,String codigo){
        this.id = id;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return this.id+","+this.codigo;
    }
}
