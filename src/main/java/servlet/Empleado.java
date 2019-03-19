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
        urlPatterns = {"/empleado"}
    )

public class Empleado(){
    private String id;
    private String nombre;
    private String habilidades;
    
    public Empleado(){
        this.id = "";
        this.nombre = "";
        this.habilidades = "";
    }

    public Empleado(String id,String nombre,String habilidades){
        this.id = id;
        this.nombre = nombre;
        this.habilidades = habilidades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return this.id+","+this.nombre+","+this.habilidades;
    }
}

