package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class Simple{
    private static Simple instancia=null;
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public static Simple laconstructora(){
        if(instancia==null)
        {
            instancia = new Simple();
        }
        return instancia;
    }
    
    public void adicionaremp(String a,String b,String c){
        Empleado nuevo = new Empleado(a,b,c);
        empleados.add(nuevo);
    }

    public String buscaremp(String a){
        String men;
        int c=0;
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).getNombre().equals(a)){
                men = empleados.get(i).toString();
                c++;
            }              
        }

        if(c==0){
            men="no existe";
        }

        return men;
    }
}
