package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Trabajador{
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private int edad;

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

	public int getEdad(){
		return edad;
	}

	public void setEdad (int _edad){
		this.edad=_edad;
	}

	public Trabajador(String nombre,String apPaterno,String apMaterno,int edad){
		this.nombre=nombre;
		this.apPaterno=apPaterno;
		this.apMaterno=apMaterno;
		this.edad=edad;
	}
        public Trabajador(){
            
        }
}