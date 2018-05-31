using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Modelo
{
    public class Detalle_Venta
    {
        private Producto _producto;
        private int _cantidad;
        private double precioVendido;
        private double _subtotal;

        public Detalle_Venta() { }
        public Detalle_Venta(Producto producto, int cantidad, double subtotal)
        {
            _producto = producto;
            _cantidad = cantidad;
            _subtotal = subtotal;
        }

        public Producto Producto { get => _producto; set => _producto = value; }
        public int Cantidad { get => _cantidad; set => _cantidad = value; }
        public double Subtotal { get => _subtotal; set => _subtotal = value; }

        public string NombreProd { get => _producto.Nombre; }
        
         public double costoUnit { get => _producto.Precio; }
        public double PrecioVendido { get => precioVendido; set => precioVendido = value; }
    }
}
