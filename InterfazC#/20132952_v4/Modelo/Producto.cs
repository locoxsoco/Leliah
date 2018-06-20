using System;
using System.Collections.Generic;
using System.Text;


public class Producto{

    private int idProducto;
    private string nombre;
    private double precio;
    private string marca;
    private string descripcion;
    private int cantMinima;
    private int consumible;

    public Producto(int idProducto, string nombre, float precio, string marca, string descripcion)
    {
        IdProducto = idProducto;
        Nombre = nombre;
        Precio = precio;
        Marca = marca;
        Descripcion = descripcion;
    }

    public Producto()
    {
    }

    public int IdProducto{
        set{
            this.idProducto = value;
        }
        get{
            return idProducto;
        }
    }

    public string Nombre{
        set{
            this.nombre = value;
        }
        get{
            return nombre;
        }
    }

    public double Precio
    {
        set{
            this.precio = value;
        }
        get{
            return precio;
        }
    }

    public string Marca{
        set{
            this.marca = value;
        }
        get{
            return marca;
        }
    }

    public string Descripcion{
        set{
            this.descripcion = value;
        }
        get{
            return descripcion;
        }
    }

    public int CantidadMin
    {
        set
        {
            this.cantMinima = value;
        }
        get
        {
            return cantMinima;
        }
    }

    public int Consumible { get => consumible; set => consumible = value; }





    /*public int IdProducto { get => idProducto; set => idProducto = value; }
    public string Nombre { get => nombre; set => nombre = value; }
    public float Precio { get => precio; set => precio = value; }
    public string Marca { get => marca; set => marca = value; }
    public string Descripcion { get => descripcion; set => descripcion = value; }
    public DateTime Vencimiento { get => vencimiento; set => vencimiento = value; }*/
}

