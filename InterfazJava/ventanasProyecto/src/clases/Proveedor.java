package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Proveedor{
    private int id;
    private String nombre;
    private String ruc;
    private String correo;
    private String telefono;
    private DiaSemana diaSemana;
    private Departamento departamento;
    private Provincia provincia;
    private Distrito distrito;
    private String direccion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre (String _nombre){
        this.nombre=_nombre;
    }

    public String getRuc(){
        return ruc;
    }

    public void setRuc (String _ruc){
        this.ruc=_ruc;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion (String _direccion){
        this.direccion=_direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono (String _telefono){
        this.telefono=_telefono;
    }

    public String getCorreo(){  
        return correo;
    }

    public void setCorreo (String _correo){
        this.correo=_correo;
    }

    public DiaSemana getDiaSemana(){
        return diaSemana;
    }

    public void setDiaSemana (DiaSemana _diaSemana){
        this.diaSemana=_diaSemana;
    }
    
    public void setDiaSemana (int id, String nomb){
        this.diaSemana.setIdDia(id);
        this.diaSemana.setNombDia(nomb);
    }

    public Proveedor(String nombre,String ruc,String direccion,String telefono,String correo,DiaSemana diaSemana){
        this.nombre=nombre;
        this.ruc=ruc;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
        this.diaSemana=diaSemana;
        this.departamento = new Departamento();
        this.diaSemana = new DiaSemana();
        this.provincia = new Provincia();
        this.distrito = new Distrito();
    }
    public Proveedor(){
        this.departamento = new Departamento();
        this.diaSemana = new DiaSemana();
        this.provincia = new Provincia();
        this.distrito = new Distrito();
    }
}