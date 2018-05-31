using System;
using System.Collections.Generic;
using System.Text;

public class Servicio
{
    private string _nombre;

    public Servicio(string nombre)
    {
        this._nombre = nombre;
    }

    public string Nombre{
		set{
			this._nombre = value;
		}
		get{
			return _nombre;
		}
	}

    //public string Nombre { get => _nombre; set => _nombre = value; }
}
