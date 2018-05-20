import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class AdministradorSistema extends Trabajador{
	private float sueldo;
	private Libreria libreria;

	public float getSueldo(){
		return sueldo;
	}

	public void setSueldo (float _sueldo){
		this.sueldo=_sueldo;
	}

	public Libreria getLibreria(){
		return libreria;
	}

	public void setLibreria (Libreria _libreria){
		this.libreria=_libreria;
	}

	public AdministradorSistema(String nombre,String apPaterno,String apMaterno,int edad,LogIn login,float sueldo, Libreria libreria){
		super(nombre,apPaterno,apMaterno,edad,login);
		this.sueldo=sueldo;
		this.libreria=libreria;
	}
	public void mantenerTrabajador (String accion,Libreria libreria){
		
	}
	public void mantenerCliente (String accion,Libreria libreria){
		
	}
	public void mantenerServicio (String accion,Libreria libreria){
		
	}
	public void mantenerProveedor (String accion,Libreria libreria){
		
	}
	public void mantenerProducto (String accion,Libreria libreria){
		
	}
}