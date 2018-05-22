package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Vendedor extends Trabajador{
	private float sueldo;
	private float horaxSemana;
	private Libreria libreria;

	public float getSueldo(){
		return sueldo;
	}

	public void setSueldo (float _sueldo){
		this.sueldo=_sueldo;
	}

	public float getHoraxSemana(){
		return horaxSemana;
	}

	public void setHoraxSemana (float _horaxSemana){
		this.horaxSemana=_horaxSemana;
	}

	public Libreria getLibreria(){
		return libreria;
	}

	public void setLibreria (Libreria _libreria){
		this.libreria=_libreria;
	}

	public Vendedor(String nombre,String apPaterno,String apMaterno,int edad,float sueldo,float horaxSemana,Libreria libreria){
		super(nombre,apPaterno,apMaterno,edad);
		this.sueldo=sueldo;
		this.horaxSemana=horaxSemana;
		this.libreria=libreria;
	}
        public Vendedor(){
            
        }
	public void mantenerVenta (Libreria libreria){
		
	}
	
}