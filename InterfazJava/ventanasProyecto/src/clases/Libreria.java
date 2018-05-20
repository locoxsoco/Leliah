package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Libreria{
	private String nombre;
	private String direccion;
	private int telefono;
	private String correo;
	private List<Cliente> listCliente;
	private List<Venta> listVenta;
	private List<Compra> listCompra;
	private List<Proveedor> listProveedor;
	private List<Trabajador> listTrabajador;

	public String getNombre(){
		return nombre;
	}

	public void setNombre (String _nombre){
		this.nombre=_nombre;
	}

	public String getDireccion(){
		return direccion;
	}

	public void setDireccion (String _direccion){
		this.direccion=_direccion;
	}

	public int getTelefono(){
		return telefono;
	}

	public void setTelefono (int _telefono){
		this.telefono=_telefono;
	}

	public String getCorreo(){
		return correo;
	}

	public void setCorreo (String _correo){
		this.correo=_correo;
	}

	public List<Cliente> getListCliente(){
		return listCliente;
	}

	public void setListCliente (List<Cliente> _listCliente){
		this.listCliente=_listCliente;
	}

	public List<Venta> getListVenta(){
		return listVenta;
	}

	public void setListVenta (List<Venta> _listVenta){
		this.listVenta=_listVenta;
	}

	public List<Compra> getListCompra(){
		return listCompra;
	}

	public void setListCompra (List<Compra> _listCompra){
		this.listCompra=_listCompra;
	}

	public List<Proveedor> getListProveedor(){
		return listProveedor;
	}

	public void setListProveedor (List<Proveedor> _listProveedor){
		this.listProveedor=_listProveedor;
	}

	public List<Trabajador> getListTrabajador(){
		return listTrabajador;
	}

	public void setListTrabajador (List<Trabajador> _listTrabajador){
		this.listTrabajador=_listTrabajador;
	}
	
	public Libreria(String nombre,String direccion,int telefono,String correo){
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		this.correo=correo;
		this.listCliente=new ArrayList<Cliente>();
		this.listCompra=new ArrayList<Compra>();
		this.listProveedor=new ArrayList<Proveedor>();
		this.listTrabajador=new ArrayList<Trabajador>();
		this.listVenta=new ArrayList<Venta>();
	}
	public void agregarCliente (){
		
	}
	public void modificarCliente (){
		
	}
	public void eliminarCliente (){
		
	}
	public void agregarVenta (){
		
	}
	public void modificarVenta (){
		
	}
	public void eliminarVenta(){
		
	}
	public void agregarCompra (){
		
	}
	public void modificarCompra (){
		
	}
	public void eliminarCompra (){
		
	}
	public void agregarProveedor (){
		
	}
	public void modificarProveedor (){
		
	}
	public void eliminarProveedor (){
		
	}
	public void agregarTrabajador (){
		
	}
	public void modificarTrabajador(){
		
	}
	public void eliminarTrabajador(){
		
	}
	public void agregarProyecto (){
		
	}
	public void modificarProyecto (){
		
	}
	public void eliminarProyecto (){
		
	}
	
	
}