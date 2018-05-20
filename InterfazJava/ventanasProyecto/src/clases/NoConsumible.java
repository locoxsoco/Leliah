package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
enum Categoria_NoConsumible {Adorno,Juguete,UtilOficina}
public class NoConsumible extends Producto{
	private String descripcion;
	private String categoria;

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion (String _descripcion){
		this.descripcion=_descripcion;
	}

	public String getCategoria(){
		return categoria;
	}

	public void setCategoria (String _categoria){
		this.categoria=_categoria;
	}

	public NoConsumible(int idProducto,String nombre,float precio,int cantMinima,String marca,String descripcion,String categoria){
		super(idProducto,nombre,precio,cantMinima,marca);
		this.descripcion=descripcion;
		this.categoria=categoria;
		
	}
}