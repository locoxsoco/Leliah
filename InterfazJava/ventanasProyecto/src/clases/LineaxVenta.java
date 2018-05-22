package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class LineaxVenta{
        private static int counter=1;
        private int idLineaxVenta;
	private int cantidad;
	private float precioUnit;
	private Producto producto;

        public int getIdLineaxVenta(){
		return idLineaxVenta;
	}

	public void setIdLineaxVenta (int _idLineaxVenta){
		this.idLineaxVenta= _idLineaxVenta;
	}
        
	public int getCantidad(){
		return cantidad;
	}

	public void setCantidad (int _cantidad){
		this.cantidad=_cantidad;
	}

	public float getPrecioUnit(){
		return precioUnit;
	}

	public void setPrecioUnit (float _subtotal){
		this.precioUnit=_subtotal;
	}

	public Producto getProducto(){
		return producto;
	}

	public void setProducto (Producto _producto){
		this.producto=_producto;
	}
	public LineaxVenta(int cantidad,float subtotal,Producto producto){
		this.cantidad=cantidad;
		this.precioUnit=subtotal;
		this.producto=producto;
	}
	public void agregarProducto(Producto producto){
		
	}
}