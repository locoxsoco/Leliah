package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class LineaxCompra{
        private static int counter=0;
        private int idLineaxCompra;
	private int cantidad;
	private float precioUnit;
	private Producto producto;
        
        public int getIdLineaxCompra(){
		return idLineaxCompra;
	}

	public void setIdLineaxCompra (int _idLineaxCompra){
		this.idLineaxCompra= _idLineaxCompra;
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
	public LineaxCompra(int cantidad,float subtotal,Producto producto){
		this.cantidad=cantidad;
		this.precioUnit=subtotal;
		this.producto=producto;
                this.idLineaxCompra=counter++;
	}
        public LineaxCompra(){
            
        }
	public void agregarProducto(Producto producto){
		
	}
}