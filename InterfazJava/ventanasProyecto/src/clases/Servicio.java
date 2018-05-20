
package clases;

import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Servicio {
    private String nombre;
    private double precioxUnit;
    private int id;
    private String moneda;
	
    public String getMoneda(){
        return moneda;
    }
    
    public void SetMoneda(String moneda){
        this.moneda = moneda;
    }
    
    public int getId(){
        return id;
    }
    
    public void SetId(int id){
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
	public double getprecioxUnit() {
        return precioxUnit;
    }
    public void setprecioxUnit(double precioxUnit) {
        this.precioxUnit = precioxUnit;
    }
	
    public Servicio(String nombre,float precioxUnit){
        this.nombre=nombre;
		this.precioxUnit=precioxUnit;
    }
    
    public Servicio(){
        
    }
}
