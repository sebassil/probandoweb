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

    public String buscarusu(String a){
        String men="";
        int c=0;
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getCorreo().equals(a)){
                men = usuarios.get(i).toString();
                c++;
            }              
        }
        if(c==0){
            men="no existe";
        }
        return men;
    }
}
