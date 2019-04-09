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

    public Producto adicionarVenta(String a,String b,String c,String d,int e,String f,int g){
        Producto nuevo = new Producto(productos.size(),a,b,c,d,e,f,g);
        productos.add(nuevo);
        return nuevo;
    }

    public ArrayList buscarOferta(String a,String b,String c,String d,int e,int f){
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
                if(!productos.get(j).getLugar().equals(b)){
                    busqueda.remove(productos.get(j));
                }
            }    
        }

        //fecha
        if(c.equals("") || d.equals("")){
            for(int k=0;k<productos.size();k++){
                if((antes(c,productos.get(k).getFecha()))){
                    if((despues(d,productos.get(k).getFecha()))){
                    }else{
                        busqueda.remove(productos.get(k));
                    }
                }else{
                    busqueda.remove(productos.get(k));
                }
            }  
        }
        

        //precios
        for(int l=0;l<productos.size();l++){
            if((e<=productos.get(l).getPrecio())){
                if((f>=productos.get(l).getPrecio())){ 
                }else{
                    busqueda.remove(productos.get(l));
                }    
            }else{
                busqueda.remove(productos.get(l));
            }
        }            

        return busqueda;      
    }

    private boolean antes(String a,String b){
        //a antes del b
        boolean si=false;
        String[] fecha = a.split("-");
        String[] fecha2 = b.split("-");
        //d,m,a
        int dia1 = Integer.parseInt(fecha[0]);
        int mes1 = Integer.parseInt(fecha[1]);
        int a1 = Integer.parseInt(fecha[2]);
        int dia2 = Integer.parseInt(fecha2[0]);
        int mes2 = Integer.parseInt(fecha2[1]);
        int a2 = Integer.parseInt(fecha2[2]);

        if(a1<=a2){
            if(mes1<=mes2){
                if(dia1<=dia2){
                    si=true;    
                }
            }
        }
        return si;
    }

    private boolean despues(String a,String b){
        //a antes del b
        boolean si=false;
        String[] fecha = a.split("-");
        String[] fecha2 = b.split("-");
        //d,m,a
        int dia1 = Integer.parseInt(fecha[0]);
        int mes1 = Integer.parseInt(fecha[1]);
        int a1 = Integer.parseInt(fecha[2]);
        int dia2 = Integer.parseInt(fecha2[0]);
        int mes2 = Integer.parseInt(fecha2[1]);
        int a2 = Integer.parseInt(fecha2[2]);

        if(a1>=a2){
            if(mes1>=mes2){
                if(dia1>=dia2){
                    si=true;    
                }
            }
        }
        return si;
    }
}
