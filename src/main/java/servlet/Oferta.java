package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Oferta{
    private int codigo;
    private int codigop;
    private int precio;
    private int cantidad;
    private boolean aceptada;
    
    public Usuario(){
        this.codigo = 0;
        this.codigop = 0;
        this.precio = 0;
        this.cantidad = 0;
        this.aceptada = false;
    }

    public Oferta(int codigo, int codigop, int precio, int cantidad) {
        this.codigo = codigo;
        this.codigop = codigop;
        this.precio = precio;
        this.cantidad = cantidad;
        this.aceptada = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigop() {
        return codigop;
    }

    public void setCodigop(int codigop) {
        this.codigop = codigop;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public boolean getAceptada() {
        return aceptada;
    }

    public void setAceptada(boolean aceptada) {
        this.aceptada = aceptada;
    }

    @Override
    public String toString() {
        return this.codigo+","+this.codigop+","+this.precio+","+this.cantidad+";"+this.aceptada;
    }
}