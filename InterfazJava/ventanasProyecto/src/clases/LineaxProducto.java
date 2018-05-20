package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class LineaxProducto{
	private int cantidad;
	private float subtotal;
	private Producto producto;

	public int getCantidad(){
		return cantidad;
	}

	public void setCantidad (int _cantidad){
		this.cantidad=_cantidad;
	}

	public float getSubtotal(){
		return subtotal;
	}

	public void setSubtotal (float _subtotal){
		this.subtotal=_subtotal;
	}

	public Producto getProducto(){
		return producto;
	}

	public void setProducto (Producto _producto){
		this.producto=_producto;
	}
	public LineaxProducto(int cantidad,float subtotal,Producto producto){
		this.cantidad=cantidad;
		this.subtotal=subtotal;
		this.producto=producto;
	}
	public void agregarProducto(Producto producto){
		
	}
}