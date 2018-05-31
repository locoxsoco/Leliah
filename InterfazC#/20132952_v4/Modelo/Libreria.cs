using System.Collections.Generic;
using System.Text;
using System;
public class Libreria{
	private string _nombre;
	private string _direccion;
	private int _telefono;
	private List<Venta> _lista_ventas;
	private List<Producto> _lista_productos;
	private List<Compra> _lista_compras;

	public Libreria(string nombre, string direccion, int telefono){
		this._nombre = nombre;
		this._direccion = direccion;
		this._telefono = telefono;
		_lista_productos =  new List<Producto>();
		_lista_ventas =  new List<Venta>();
		_lista_compras =  new List<Compra>();
	}

	public string nombre{
		get{
			return _nombre;
		}
		set{
			_nombre = value;
		}
	}

	public string direccion{
		get{
			return _direccion;
		}
		set{
			_direccion = value;
		}
	}

	public int telefono{
		get{
			return _telefono;
		}
		set{
			_telefono = value;
		}
	}

	public List<Venta> lista_ventas{
		get{
			return _lista_ventas;
		}
		set{
			_lista_ventas = value;
		}
	}

	public List<Producto> lista_productos{
		get{
			return _lista_productos;
		}
		set{
			_lista_productos = value;
		}
	}

	public List<Compra> lista_compras{
		get{
			return _lista_compras;
		}
		set{
			_lista_compras = value;
		}
	}

	public void reporteVentas(string nombArch, DateTime fecha){

	}

	public void reporteGanancias(string nombArch, DateTime fecha){
		
	}

	public void agregarProd_Lista(Producto prod){
		this.lista_productos.Add(prod);
	}

	public void agregarVenta_Lista(Venta v){
		this.lista_ventas.Add(v);
	}

	public void agregarCompra_Lista(Compra c){
		this.lista_compras.Add(c);
	}

	public void alertarCaducidad(){
		
	}
	public void alertarFaltaStock(){
		
	}

	public void reporteProds(){

	}

	public void eliminarVenta_Lista(Venta v){
		
	}

	public void eliminarProd_Lista(Producto p){
		
	}

	public void eliminarCompra_Lista(Compra c){
		
	}


}