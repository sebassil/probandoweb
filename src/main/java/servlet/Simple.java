package servlet;
//sjsoa
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
    ArrayList<Oferta> ofertas = new ArrayList<Oferta>();
    ArrayList<Relacionpv> relacionespv = new ArrayList<Relacionpv>();
    ArrayList<Relacionpof> relacionespof = new ArrayList<Relacionpof>();

    Usuario activo = new Usuario();
    int con=0,con2=0;

    public static Simple laconstructora(){
        if(instancia==null)
        {
            instancia = new Simple();
        }
        return instancia;
    }
    
    public void adicionarusu(String a,String b,String c){
        Usuario nuevo = new Usuario(a,b,c);
        usuarios.add(nuevo);
    }

    public boolean ingresarV(String correo,String clave){
        boolean s=false;
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getCorreo().equals(correo)){
                if(usuarios.get(i).getClave().equals(clave)){
                    if(usuarios.get(i).getVoc().equals("vendedor")){
                        s=true;
                        activo=usuarios.get(i);
                    }
                }
            }              
        }
        return s;
    }

    public boolean ingresarC(String correo,String clave){
        boolean s=false;
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getCorreo().equals(correo)){
                if(usuarios.get(i).getClave().equals(clave)){
                    if(usuarios.get(i).getVoc().equals("comprador")){
                        s=true;
                        activo=usuarios.get(i);
                    }
                }
            }              
        }
        return s;
    }

    public void adicionarVenta(String a,String b,String c,String d,int e,String f,int g){
        Producto nuevo = new Producto(con,a,b,c,d,e,f,g);
        productos.add(nuevo);
        Relacionpv rela = new Relacionpv(con,activo.getCorreo());
        relacionespv.add(rela);
        con++;
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

    public String adicionarOferta(int a,int b,int c){
        String d="";
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).getCodigo()==a){
                if(productos.get(i).getPrecio()>=b){
                    d="El precio ofertado es menor que el del producto";
                }else if(productos.get(i).getCantidad()<=c){
                    d="La cantidad ofertada es mayor que las disponibles";
                }else{
                    Oferta nuevo = new Oferta(con2,a,b,c);
                    ofertas.add(nuevo);
                    Relacionpof rela = new Relacionpof(con2,activo.getCorreo());
                    relacionespof(rela);
                    con2++;
                    d="has ofertado por este producto";
                }
            }
        }
        
        return d;
    }
    //sebas

    public ArrayList verOfertas(){
        ArrayList<String> mandar = new ArrayList<String>();
        ArrayList<Integer> codigosp = new ArrayList<Integer>();
        boolean s=false;

        String c = activo.getCorreo();

        for(int i=0;i<relacionespv.size();i++){
            if(relacionespv.get(i).getCorreo().equals(c)){
                codigosp.add(relacionespv.get(i).getCodigo());
            }
        }

        for(int j=0;j<ofertas.size();j++){
            for(int k=0;k<codigosp.size();k++){
                if(ofertas.get(j).getCodigop()==codigosp.get(k)){
                    mandar.add(ofertas.get(j).toString());
                }
            }
        }        
        return mandar;
    }

    public void aceptarOferta(int a){
        for(int j=0;j<ofertas.size();j++){
            if(ofertas.get(j).getCodigo()==a){
                ofertas.get(j).setAceptada(true);
            }
        }
    }

    public void cancelarOferta(int a){
        ArrayList<Oferta> eliminar = (ArrayList<Oferta>) ofertas.clone();
        
        for(int j=0;j<eliminar.size();j++){
            if(eliminar.get(j).getCodigo()==a){
                ofertas.remove(eliminar.get(j));
            }
        }
    }

    public void modificarOferta(int a,int b){
        for(int j=0;j<ofertas.size();j++){
            if(ofertas.get(j).getCodigo()==a){
                ofertas.get(j).setPrecio(b);
            }
        }
    }

    public String aceptarCompra(int a){
        Oferta compra = new Oferta();
        Producto pro = new Producto();
        String d;
        int e,b,c;
        boolean esta=false;

        for(int j=0;j<ofertas.size();j++){
            if(ofertas.get(j).getCodigo()==a){
                if(ofertas.get(j).getAceptada()){
                    compra=ofertas.get(j);
                    esta=true;
                }
            }
        }

        //codigo producto

        if(esta){
            for(int k=0;k<productos.size();k++){
                if(productos.get(k).getCodigo()==compra.getCodigo()){
                    e=productos.get(k).getCantidad();
                    b=compra.getCantidad();
                    c=e-b;
                    productos.get(k).setCantidad(c);
                    pro=productos.get(k);
                    c=0;
                    e=0;
                    b=0;
                }
            }
            d = "Vendido por: "+pro.getNombrev();
            for(int i=0;i<relacionespv.size();i++){
                if(relacionespv.get(i).getCodigo()==pro.getCodigo()){
                    d = d+" Correo: "+relacionespv.get(i).getCorreo();
                }
            }
            d=d+" vendido";
        }else{
            d="El vendedor no ha aceptado tu oferta";
        }
        return d;     
    }

    public ArrayList misOfertas(){
        ArrayList<String> mandar = new ArrayList<String>();
        ArrayList<Integer> codigosof = new ArrayList<Integer>();
        boolean s=false;

        String c = activo.getCorreo();

        for(int i=0;i<relacionespof.size();i++){
            if(relacionespof.get(i).getCorreo().equals(c)){
                codigosof.add(relacionespof.get(i).getCodigo());
            }
        }

        for(int j=0;j<ofertas.size();j++){
            for(int k=0;k<codigosof.size();k++){
                if(ofertas.get(j).getCodigo()==codigosof.get(k)){
                    mandar.add(ofertas.get(j).toString());
                }
            }
        }        
        return mandar;
    }
}
