import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Jefe extends Trabajador{
	private Libreria libreria;


	public Libreria getLibreria(){
		return libreria;
	}

	public void setLibreria (Libreria _libreria){
		this.libreria=_libreria;
	}

	public Jefe(String nombre,String apPaterno,String apMaterno,int edad,LogIn login,Libreria libreria){
		super(nombre,apPaterno,apMaterno,edad,login);
		this.libreria=libreria;
	}
	public void mantenerProyecto (Libreria libreria){
		
	}
	public void revisarFechaVisitaProveedores (Libreria libreria){
		
	}
	public void mantenerCompra (Libreria libreria){
		
	}
	public void generarReporteClienteFrec (Libreria libreria){
		
	}
	public void generarReporteProd (Libreria libreria){
		
	}
	public void generarReporteMensual (Libreria libreria){
		
	}
	public void generarReporteContabilidad (Libreria libreria){
		
	}
	public void generarBalance (Libreria libreria){
		
	}
	
}