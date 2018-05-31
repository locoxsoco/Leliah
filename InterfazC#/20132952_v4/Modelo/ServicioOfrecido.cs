using System.Collections.Generic;
using System.Text;
using System;
public class ServicioOfrecido: Servicio{
	private string _descripcion;
	private float _monto;

	public ServicioOfrecido(string nombre, string descripcion, float monto): base(nombre){
        this._descripcion = descripcion;
        this._monto = monto;
    }

	public float Monto{
		set{
			this._monto = value;
		}
		get{
			return _monto;
		}
	}

	public string Descripcion{
		set{
			this._descripcion = value;
		}
		get{
			return _descripcion;
		}
	}
}