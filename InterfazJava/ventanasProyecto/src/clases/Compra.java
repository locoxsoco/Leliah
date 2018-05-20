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
	private List<LineaxProducto> listLineaxProd;

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

	public List<LineaxProducto> getListLineaxProd(){
		return listLineaxProd;
	}

	public void setListLineaxProd (List<LineaxProducto> _listLineaxProd){
		this.listLineaxProd=_listLineaxProd;
	}

	public Compra(int idCompra,float monto,Proveedor proveedor){
		this.idCompra=idCompra;
		this.monto=monto;
		this.proveedor=proveedor;
		this.listLineaxProd=new ArrayList<LineaxProducto>();
	}
	public void agregarLineaxProducto (LineaxProducto lineaxProd){
		
	}
}