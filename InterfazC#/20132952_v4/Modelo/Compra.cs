using System.Collections.Generic;
using System.Globalization;
using System.Text;

using System;
public class Compra{
	private int _id_compra;
	private float _monto;
	private DateTime _fecha;
	private List<ProductoxCant> _lista_productos;
	private Proveedor _prov;

	public Compra(int id_compra, float monto, Proveedor prov){
		this._id_compra = id_compra;
		this._monto = monto;
		this._fecha = new DateTime();
		_lista_productos =  new List<ProductoxCant>();
		this._prov = prov;
	}


	public DateTime fecha{
		get{
			return _fecha;
		}
		set{
			_fecha = value;
		}
	}

	public int id_compra{
		get{
			return _id_compra;
		}
		set{
			_id_compra = value;
		}
	}

	public float monto{
		get{
			return _monto;
		}
		set{
			_monto = value;
		}
	}

	public List<ProductoxCant> lista_productos{
		get{
			return _lista_productos;
		}
		set{
			_lista_productos = value;
		}
	}

	public Proveedor prov{
		get{
			return _prov;
		}
		set{
			_prov = value;
		}
	}

	public void agregarProd_Lista(ProductoxCant prod){
		_lista_productos.Add(prod);
	}

	public void eliminarProd_Lista(){

	}

	public void setFechaString(string fecha){
		this._fecha = DateTime.ParseExact(fecha,"dd/MM/yyyy",CultureInfo.InvariantCulture);
	}
}