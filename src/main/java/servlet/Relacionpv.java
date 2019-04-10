package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Relacionpv{
    private int codigo;
    private String correo;

    public Relacionpv() {
        this.codigo = 0;
        this.correo = "";
    }

    public Relacionpv(int codigo, String correo) {
        this.codigo = codigo;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString() {
        return "Codigo: "+this.codigo+" Correo:"+this.correo; 
    }
}