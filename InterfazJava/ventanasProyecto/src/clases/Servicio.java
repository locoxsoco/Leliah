
package clases;

import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Servicio {
    private String nombre;
    private float precioxUnit;
    private int id;
	
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
	
	public float getprecioxUnit() {
        return precioxUnit;
    }
    public void setprecioxUnit(float precioxUnit) {
        this.nombre = nombre;
    }
	
    public Servicio(String nombre,float precioxUnit){
        this.nombre=nombre;
		this.precioxUnit=precioxUnit;
    }
}
