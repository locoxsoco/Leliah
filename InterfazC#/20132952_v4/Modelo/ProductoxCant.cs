using System;
using System.Collections.Generic;
using System.Text;

public class ProductoxCant{
    private Producto _prod;
    private int _cant;

    public ProductoxCant(Producto prod, int cant)
    {
        _prod = prod;
        _cant = cant;
    }

    public Producto Prod{
        set{
            this._prod = value;
        }
        get{
            return _prod;
        }
    }

    public int Cant{
        set{
            this._cant = value;
        }
        get{
            return _cant;
        }
    }

    /*public Producto prod { get => _prod; set => _prod = value; }
    public int cant { get => _cant; set => _cant = value; }*/
}

