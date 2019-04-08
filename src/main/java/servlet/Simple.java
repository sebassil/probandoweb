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
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Producto> productos = new ArrayList<Producto>();
    Usuario activo = new Usuario();

    public static Simple laconstructora(){
        if(instancia==null)
        {
            instancia = new Simple();
        }
        return instancia;
    }
    
    public void adicionarusu(String a,String b){
        Usuario nuevo = new Usuario(a,b);
        usuarios.add(nuevo);
    }

    public boolean ingresar(String correo,String clave){
        boolean s=false;

        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getCorreo().equals(correo)){
                if(usuarios.get(i).getClave().equals(clave)){
                    s=true;
                    activo=usuarios.get(i);
                }
            }              
        }
        return s;
    }

    public void adicionarVenta(String a,String b,String c,String d,int e,String f,int g){
        Producto nuevo = new Producto(productos.size(),a,b,c,d,e,f,g);
        productos.add(nuevo);
    }
}
