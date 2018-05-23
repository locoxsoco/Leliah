package clases;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class AdministradorSistema extends Trabajador{
        private double sueldo;
        private String moneda;
        
        public String getMoneda(){
            return moneda;
        }
        
        public void setMoneda(String moneda){
            this.moneda = moneda;
        }
        
	public double getSueldo(){
		return sueldo;
	}

	public void setSueldo (double _sueldo){
		this.sueldo=_sueldo;
	}

	/*public Libreria getLibreria(){
		return libreria;
	}*/

	/*public void setLibreria (Libreria _libreria){
		this.libreria=_libreria;
	}*/

	public AdministradorSistema(String nombre,String apPaterno,String apMaterno,double sueldo, Libreria libreria){
		super(nombre,apPaterno,apMaterno);
		this.sueldo=sueldo;
		//this.libreria=libreria;
	}
        public AdministradorSistema(){
            super();
            
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