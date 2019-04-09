package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Usuario{
    private String correo;
    private String clave;
    private String voc;
    
    public Usuario(){
        this.correo = "";
        this.clave = "";
        this.voc = "";
    }

    public Usuario(String correo,String clave,String voc){
        this.correo = correo;
        this.clave = clave;
        this.voc = voc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public String getVoc() {
        return voc;
    }
    
    public void setVoc(String voc) {
        this.voc = voc;
    }
    
    @Override
    public String toString() {
        return this.correo+","+this.clave+","+this.voc;
    }
}