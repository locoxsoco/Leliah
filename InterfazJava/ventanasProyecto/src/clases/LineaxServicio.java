package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class LineaxServicio{
	private Servicio servicio;
	private float cant;
	private float montoFinal;

	public Servicio getServicio(){
		return servicio;
	}

	public void setServicio (Servicio _servicio){
		this.servicio=_servicio;
	}
	public float getCant(){
		return cant;
	}

	public void setCant (float _cant){
		this.cant=_cant;
	}

	public float getMontoFinal(){
		return montoFinal;
	}

	public void setMontoFinal (float _montoFinal){
		this.montoFinal=_montoFinal;
	}
	public LineaxServicio(Servicio servicio,float cant,float montoFinal){
		this.servicio=servicio;
		this.cant=cant;
		this.montoFinal=montoFinal;
	}
	public void agregarServicio(Servicio servicio){
		
	}
}