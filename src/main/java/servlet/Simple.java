package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public ArrayList buscarOferta(String a,String b,String c,String d,int e){
        ArrayList<Producto> busqueda = (ArrayList<Producto>) productos.clone();

        //nombre
        if(!a.equals("")){
            for(int i=0;i<productos.size();i++){
                if(!productos.get(i).getNombrep().equals(a)){
                    busqueda.remove(productos.get(i));
                }
            }
        }
        
        //Lugar
        if(!b.equals("")){
            for(int j=0;j<productos.size();j++){
                if(productos.get(j).getLugar().equals(b)){
                    busqueda.remove(productos.get(j));
                }
            }    
        }


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        try{
            Date date1 = sdf.parse(c); 
            Date date2 = sdf.parse(d);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        
        //Fechas
        if(!c.equals("")){
            for(int j=0;j<productos.size();j++){
                if(productos.get(j).getLugar().equals(b)){
                    busqueda.remove(productos.get(j));
                }
            }    
        }  

        return busqueda;      
    }
}
