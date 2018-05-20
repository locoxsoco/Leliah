package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
enum DiaSemana {Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo}
public class Proveedor{
	private String nombre;
	private String ruc;
	private String direccion;
	private int telefono;
	private String correo;
	private DiaSemana diaSemana;

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

	public int getTelefono(){
		return telefono;
	}

	public void setTelefono (int _telefono){
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

	public Proveedor(String nombre,String ruc,String direccion,int telefono,String correo,DiaSemana diaSemana){
		this.nombre=nombre;
		this.ruc=ruc;
		this.direccion=direccion;
		this.telefono=telefono;
		this.correo=correo;
		this.diaSemana=diaSemana;
	}
}