package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
enum Categoria_Consumible {Bebida,Caramelo,Snack,Postre}
public class Consumible extends Producto{
	private Date fechaCaducidad;
	private Categoria_Consumible categoria_Consumible;

	public Date getFechaCaducidad(){
		return fechaCaducidad;
	}

	public void setFechaCaducidad (Date _fechaCaducidad){
		this.fechaCaducidad=_fechaCaducidad;
	}

	public Categoria_Consumible getCategoria_Consumible(){
		return categoria_Consumible;
	}

	public void setCategoria_Consumible (Categoria_Consumible _categoria_Consumible){
		this.categoria_Consumible=_categoria_Consumible;
	}

	public Consumible(int idProducto,String nombre,float precio,int cantMinima,String marca,Date fechaCaducidad,Categoria_Consumible categoria_Consumible){
		super(idProducto,nombre,precio,cantMinima,marca);
		this.fechaCaducidad=fechaCaducidad;
		this.categoria_Consumible=categoria_Consumible;
		
	}
}