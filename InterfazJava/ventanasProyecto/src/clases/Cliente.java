package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Cliente{
    private int idCliente;
    private String correo;
    private String telefono;
    private Departamento departamento;
    private Provincia provincia;
    private Distrito distrito;
    private String direccion;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void setDepartamento(int id, String nomb) {
        this.departamento.setIdDep(id);
        this.departamento.setNombDep(nomb);
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    public void setProvincia(int id, String nomb) {
        this.provincia.setIdProv(id);
        this.provincia.setNombProv(nomb);
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public void setDistrito(int id, String nomb) {
        this.distrito.setIdDist(id);
        this.distrito.setNombDist(nomb);
    }
    
    public int getIdCliente(){
        return idCliente;
    }

    public void setIdCliente (int _idCliente){
        this.idCliente=_idCliente;
    }

    public String getDireccion(){
        return direccion;
    }   
    public void setDireccion (String _direccion){
        this.direccion=_direccion;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo (String _correo){
        this.correo=_correo;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono (String _telefono){
        this.telefono=_telefono;
    }
        
    public Cliente(){
            
    }
}