import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Proyecto{
	private List<Producto> listProducto;
	private String nombre;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;

	public List<Producto> getListProducto(){
		return listProducto;
	}

	public void setListProducto (List<Producto> _listProducto){
		this.listProducto=_listProducto;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre (String _nombre){
		this.nombre=_nombre;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion (String _descripcion){
		this.descripcion=_descripcion;
	}

	public Date getFechaInicio(){
		return fechaInicio;
	}

	public void setFechaInicio (Date _fechaInicio){
		this.fechaInicio=_fechaInicio;
	}

	public Date getFechaFin(){
		return fechaFin;
	}

	public void setFechaFin (Date _fechaFin){
		this.fechaFin=_fechaFin;
	}

	public Proyecto(String nombre,String descripcion,Date fechaInicio,Date fechaFin){
		listProducto= new ArrayList<Producto>();
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		
	}
	public void agregarProducto (Producto prod){
		
	}
	public void modificarProducto (Producto prod){
		
	}
	public void eliminarProducto (Producto prod){
		
	}
}