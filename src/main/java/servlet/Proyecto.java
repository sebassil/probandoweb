package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Proyecto(){
    private String codigo;
    private String nombre;
    private String descripcion;
    private String tiempo;
    private String plataformas;
    
    public Proyecto(){
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
        this.tiempo = "";
        this.plataformas = "";
    }

    public Proyecto(String codigo,String nombre,String descripcion,String tiempo,String plataformas){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.plataformas = plataformas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }  

    @Override
    public String toString() {
        return this.codigo+","+this.nombre+","+this.descripcion+","+this.tiempo+","+this.plataformas;
    }
}
