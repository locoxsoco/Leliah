package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Compra{
	private int idCompra;
	private float monto;
	private Proveedor proveedor;
	private List<LineaxCompra> listLineaxCompra;

	public int getIdCompra(){
		return idCompra;
	}

	public void setIdCompra (int _idCompra){
		this.idCompra=_idCompra;
	}

	public float getMonto(){
		return monto;
	}

	public void setMonto (float _monto){
		this.monto=_monto;
	}

	public Proveedor getProveedor(){
		return proveedor;
	}

	public void setProveedor (Proveedor _proveedor){
		this.proveedor=_proveedor;
	}

	public List<LineaxCompra> getListLineaxProd(){
		return listLineaxCompra;
	}

	public void setListLineaxProd (List<LineaxCompra> _listLineaxProd){
		this.listLineaxCompra=_listLineaxProd;
	}

	public Compra(int idCompra,float monto,Proveedor proveedor){
		this.idCompra=idCompra;
		this.monto=monto;
		this.proveedor=proveedor;
		this.listLineaxCompra=new ArrayList<LineaxCompra>();
	}
        public Compra(){
            
        }
	public void agregarLineaxProducto (LineaxVenta lineaxProd){
		
	}
}