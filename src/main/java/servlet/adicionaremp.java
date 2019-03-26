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
        name = "MyServlet", 
        urlPatterns = {"/adicionaremp"}
    )

public class Adicionaremp{
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
    public void Adicionar(String codigo, String nombre, String habilidades){
        Empleado nuevo = new Empleado(codigo,nombre,habilidades);
        empleados.add(nuevo);
        for(int i=0;i<codigos.size();i++){
            out.println(empleados.get(i));
        }    
    }
}
