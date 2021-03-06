package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.ParseException;
import java.util.Date;
public class Trabajador{
    private int id;
    private String numDoc;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private Date fecha;
    private String username;
    private String contrasena;
    private TipoDocumentoIdentidad tipoDoc;
    
    public TipoDocumentoIdentidad getTipoDoc(){
        return tipoDoc;
    }
    
    public void setTipoDoc(TipoDocumentoIdentidad tipo){
        this.tipoDoc.setIdTipo(tipo.getIdTipo());
        this.tipoDoc.setNombTipo(tipo.getNombTipo());
    }
    
    public void setTipoDoc(int id, String nomb, int cant){
        this.tipoDoc.setIdTipo(id);
        this.tipoDoc.setNombTipo(nomb);
        this.tipoDoc.setCantChar(cant);
    }
    
    public String getUsername(){
        return username;
    }

    public void setUsername (String username){
        this.username = username;
    }
    
    public String getContrasena(){
        return contrasena;
    }

    public void setContrasena (String contrasena){
        this.contrasena = contrasena;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public void setFecha(Date f){
        this.fecha = f;
    }
    
    public String getNumDoc(){
        return numDoc;
    }
    
    public void setNumDoc(String num){
        this.numDoc = num;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre (String _nombre){
        this.nombre=_nombre;
    }

    public String getApPaterno(){
        return apPaterno;
    }

    public void setApPaterno (String _apPaterno){
        this.apPaterno=_apPaterno;
    }

    public String getApMaterno(){
        return apMaterno;
    }

    public void setApMaterno (String _apMaterno){
        this.apMaterno=_apMaterno;
    }

    public Trabajador(String nombre,String apPaterno,String apMaterno){
        this.nombre=nombre;
        this.apPaterno=apPaterno;
        this.apMaterno=apMaterno;
        this.tipoDoc = new TipoDocumentoIdentidad();
    }
    
    public Trabajador(){
        this.tipoDoc = new TipoDocumentoIdentidad();
    }
}