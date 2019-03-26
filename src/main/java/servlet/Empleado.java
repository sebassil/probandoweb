package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Empleado{
    private String codigo;
    private String nombre;
    private String habilidades;
    
    public Empleado(){
        this.codigo = "";
        this.nombre = "";
        this.habilidades = "";
    }

    public Empleado(String codigo,String nombre,String habilidades){
        this.codigo = codigo;
        this.nombre = nombre;
        this.habilidades = habilidades;
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

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return this.codigo+","+this.nombre+","+this.habilidades;
    }
}