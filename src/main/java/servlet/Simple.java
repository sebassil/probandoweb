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
    ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();
    ArrayList<Relacion> relaciones = new ArrayList<Relacion>();

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
        String men="";
        int c=0;
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).getCodigo().equals(a)){
                men = empleados.get(i).toString();
                c++;
            }              
        }
        if(c==0){
            men="no existe";
        }
        return men;
    }

    public void adicionarpro(String a,String b,String c,String d, String e){
        Proyecto nuevo = new Proyecto(a,b,c,d,e);
        proyectos.add(nuevo);
    }

    public String buscarpro(String a){
        String men="";
        int c=0;
        for(int i=0;i<proyectos.size();i++){
            if(proyectos.get(i).getCodigo().equals(a)){
                men = proyectos.get(i).toString();
                c++;
            }              
        }
        if(c==0){
            men="no existe";
        }
        return men;
    }

    public String adicionarrel(String a,String b){
        String m="";
        boolean emp = false;
        boolean pro = false;

        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).getCodigo().equals(a)){
                emp=true;
            }              
        }

        for(int j=0;j<proyectos.size();j++){
            if(proyectos.get(i).getCodigo().equals(a)){
                pro=true;
            }              
        }

        if(emp){
            if(pro){
                Relacion nuevo = new Relacion(a,b);
                relaciones.add(nuevo);
                m=nuevo.toString();
            }else{
                m="No existe un proyecto con este codigo";
            }
        }else{
            m="No existe un empleado con este codigo";
        }
        return m;
    }
}
