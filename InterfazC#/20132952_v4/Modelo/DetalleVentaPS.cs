using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Modelo
{
    public class DetalleVentaPS
    {
        private char tipo;
        private int idPS;
        private int consumible;
        private string nombrePS;
        private double precio;
        private double descuento;
        private int stock;
        private double precioVendido;
        private int cantidad;
        private double subtotal;
        private DateTime fechaVencimiento;

        public char Tipo { get => tipo; set => tipo = value; }
        public string NombrePS { get => nombrePS; set => nombrePS = value; }
        public double Precio { get => precio; set => precio = value; }
        public double PrecioVendido { get => precioVendido; set => precioVendido = value; }
        public int Cantidad { get => cantidad; set => cantidad = value; }
        public double Subtotal { get => subtotal; set => subtotal = value; }
        public int IdPS { get => idPS; set => idPS = value; }
        public double Descuento { get => descuento; set => descuento = value; }
        public int Stock { get => stock; set => stock = value; }
        public int Consumible { get => consumible; set => consumible = value; }
        public DateTime FechaVencimiento { get => fechaVencimiento; set => fechaVencimiento = value; }
    }
}
