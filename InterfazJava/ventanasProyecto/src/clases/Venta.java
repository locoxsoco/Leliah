package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
enum TipoDocumento {Boleta, Factura}
enum TipoPago {Efectivo,Tarjeta}
public class Venta{
	private int idVenta;
	private Date fechaVenta;
	private float montoTotal;
	private ArrayList<LineaxServicio> listLineaxServicio;
	private ArrayList<LineaxVenta> listLineaxProducto;
	private TipoDocumento tipoDocumento;
	private TipoPago tipoPago;
	private Cliente cliente;

	public int getIdVenta(){
		return idVenta;
	}

	public void setIdVenta (int _idVenta){
		this.idVenta=_idVenta;
	}

	public Date getFechaVenta(){
		return fechaVenta;
	}

	public void setFechaVenta (Date _fechaVenta){
		this.fechaVenta=_fechaVenta;
	}

	public float getMontoTotal(){
		return montoTotal;
	}

	public void setMontoTotal (float _montoTotal){
		this.montoTotal=_montoTotal;
	}

	public List<LineaxServicio> getLineaxServicio(){
		return listLineaxServicio;
	}

	public void setLineaxServicio (ArrayList<LineaxServicio> _lineaxServicio){
		this.listLineaxServicio=_lineaxServicio;
	}

	public List<LineaxVenta> getLineaxProducto(){
		return listLineaxProducto;
	}

	public void setLineaxProducto (ArrayList<LineaxVenta> _lineaxProducto){
		this.listLineaxProducto=_lineaxProducto;
	}

	public TipoDocumento getTipoDocumento(){
		return tipoDocumento;
	}

	public void setTipoDocumento (TipoDocumento _tipoDocumento){
		this.tipoDocumento=_tipoDocumento;
	}

	public TipoPago getTipoPago(){
		return tipoPago;
	}

	public void setTipoPago (TipoPago _tipoPago){
		this.tipoPago=_tipoPago;
	}

	public Cliente getCliente(){
		return cliente;
	}

	public void setCliente (Cliente _cliente){
		this.cliente=_cliente;
	}
	public Venta(int idVenta,Date fechaVenta,float montoTotal,TipoDocumento tipoDocumento,TipoPago tipoPago,Cliente cliente){
		this.idVenta=idVenta;
		this.fechaVenta=fechaVenta;
		this.montoTotal=montoTotal;
		this.listLineaxServicio=new ArrayList<LineaxServicio>();
		this.listLineaxProducto=new ArrayList<LineaxVenta>();
		this.tipoDocumento=tipoDocumento;
		this.tipoPago=tipoPago;
		this.cliente=cliente;		
	}
        public Venta(int idVenta,Date fechaVenta,float montoTotal,ArrayList<LineaxServicio> listLineaxServicio,ArrayList<LineaxVenta> listLineaxProducto,TipoDocumento tipoDocumento,TipoPago tipoPago,Cliente cliente){
		this.idVenta=idVenta;
		this.fechaVenta=fechaVenta;
		this.montoTotal=montoTotal;
		this.listLineaxServicio=listLineaxServicio;
		this.listLineaxProducto=listLineaxProducto;
		this.tipoDocumento=tipoDocumento;
		this.tipoPago=tipoPago;
		this.cliente=cliente;		
	}
        
        public Venta(){
            
        }
	public void agregarLineaxProducto(LineaxVenta lineaxProducto){
		
	}
	public void agregarLineaxServicio(LineaxServicio lineaxServicio){
		
	}
	
}