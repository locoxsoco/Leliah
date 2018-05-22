package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Consumible extends Producto{
	private Categoria_Consumible categoria;

	public Categoria_Consumible getCategoria(){
		return categoria;
	}

	public void setCategoria(Categoria_Consumible _categoria){
		this.categoria=_categoria;
	}

	public Consumible(int idProducto,String nombre,float precio,int cantMinima,String marca,Date fechaCaducidad,Categoria_Consumible categoria){
		super(idProducto,nombre,precio,cantMinima,marca);
		this.categoria=categoria;
		
	}
        
        public Consumible(){
            super();
        }
}