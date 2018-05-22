package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class NoConsumible extends Producto{
	
	private Categoria_NoConsumible categoria;

	

	public Categoria_NoConsumible getCategoria(){
		return categoria;
	}

	public void setCategoria (Categoria_NoConsumible _categoria){
		this.categoria=_categoria;
	}

	public NoConsumible(int idProducto,String nombre,float precio,int cantMinima,String marca,String descripcion,Categoria_NoConsumible categoria){
		super(idProducto,nombre,precio,cantMinima,marca);
		this.categoria=categoria;
		
	}
        
        public NoConsumible(){
            super();
        }
}