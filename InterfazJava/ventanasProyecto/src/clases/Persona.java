package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Persona extends Cliente{
	private int dni;
	private String nombre;
	private String apPaterno;
	private String apMaterno;

	public int getDni(){
		return dni;
	}

	public void setDni (int _dni){
		this.dni=_dni;
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

	public Persona(int idCliente,String direccion,String correo,String telefono,int dni,String nombre,String apPaterno,String apMaterno){
		super(idCliente,direccion,correo,telefono);
		this.dni=dni;
		this.nombre=nombre;
		this.apPaterno=this.apMaterno;
	}
}