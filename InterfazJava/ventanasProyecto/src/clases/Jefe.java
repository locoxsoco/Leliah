package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Jefe extends Trabajador{
    private static int counter=1;
    private int idJefe;
    //private Libreria libreria;

    public int getIdJefe(){
		return idJefe;
	}

	public void setIdJefe (int _idJefe){
		this.idJefe= _idJefe;
	}
    /*public Libreria getLibreria(){
            return libreria;
    }

    public void setLibreria (Libreria _libreria){
            this.libreria=_libreria;
    }*/

    public Jefe(String nombre,String apPaterno,String apMaterno,int edad,Libreria libreria){
            super(nombre,apPaterno,apMaterno,edad);
            this.idJefe=counter++;
            //this.libreria=libreria;
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
    public Jefe(){
        super();
        this.idJefe=counter++;        
    }
	
}