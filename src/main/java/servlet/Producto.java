package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Producto{
    private int codigo;
    private String nombrep;
    private String lugar;
    private String nombrev;
    private String descripcion;
    private int cantidad;
    private String fecha;
    private int precio;

    
    public Producto() {
        this.codigo = "";
        this.nombrep = "";
        this.lugar = "";
        this.nombrev = "";
        this.descripcion = "";
        this.cantidad = "";
        this.fecha = "";
        this.precio = "";
    }

    public Producto(int codigo,String nombrep, String lugar, String nombrev, String descripcion, int cantidad, String fecha, int precio) {
        this.codigo = codigo;
        this.nombrep = nombrep;
        this.lugar = lugar;
        this.nombrev = nombrev;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombrev() {
        return nombrev;
    }

    public void setNombrev(String nombrev) {
        this.nombrev = nombrev;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return this.nombrep+","+this.lugar+","+this.nombrev+","+this.descripcion+","+this.cantidad+","+this.fecha+","+this.precio; 
    }
}