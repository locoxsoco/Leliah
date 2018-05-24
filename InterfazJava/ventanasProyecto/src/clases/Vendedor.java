package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Vendedor extends Trabajador{
	private double pagoxHora;
	private int horaxSemana;
        private String moneda;
        private TiempoPago tiempoPago;
        
        public TiempoPago getTiempoPago(){
            return tiempoPago;
        }
        
        public void setTiempoPago(TiempoPago t){
            this.tiempoPago.setIdTiempo(t.getIdTiempo());
            this.tiempoPago.setNombTiempo(t.getNombTiempo());
            //this.tiempoPago = t;
        }
        
        public void setTiempoPago(int id, String nomb){
            this.tiempoPago.setIdTiempo(id);
            this.tiempoPago.setNombTiempo(nomb);
            //this.tiempoPago = t;
        }
        
        public String getMoneda(){
            return moneda;
        }
        
        public void setMoneda(String moneda){
            this.moneda = moneda;
        }

	public double getPagoxHora(){
		return pagoxHora;
	}

	public void setPagoxHora (double pagoxHora){
		this.pagoxHora=pagoxHora;
	}

	public int getHoraxSemana(){
		return horaxSemana;
	}

	public void setHoraxSemana (int _horaxSemana){
		this.horaxSemana=_horaxSemana;
	}

	public Vendedor(String nombre,String apPaterno,String apMaterno,double pagoxHora,int horaxSemana){
		super(nombre,apPaterno,apMaterno);
		this.pagoxHora=pagoxHora;
		this.horaxSemana=horaxSemana;
	}
        public Vendedor(){
            super();
            this.tiempoPago = new TiempoPago();
            //this.tipoDoc = new TipoDocumentoIdentidad();
        }
	public void mantenerVenta (Libreria libreria){
		
	}
	
}