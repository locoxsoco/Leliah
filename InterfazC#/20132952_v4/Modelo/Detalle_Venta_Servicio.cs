using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Modelo
{
    public class Detalle_Venta_Servicio
    {
        private Servicio _servicio;
        private int _cantidad;
        private double precioVendido;
        private double _subtotal;

        public Detalle_Venta_Servicio() { }
        public Servicio Servicio { get => _servicio; set => _servicio = value; }
        public int Cantidad { get => _cantidad; set => _cantidad = value; }
        public double PrecioVendido { get => precioVendido; set => precioVendido = value; }
        public double Subtotal { get => _subtotal; set => _subtotal = value; }
    }
}
