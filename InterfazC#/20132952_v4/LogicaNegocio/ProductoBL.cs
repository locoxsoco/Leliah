using AccesoDatos;
using Modelo;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LogicaNegocio
{
    public class ProductoBL
    {
        private ProductoDA accesoDatos;

        public ProductoBL() {
            accesoDatos = new ProductoDA();
        }
        public BindingList<Producto> listarProductos() {
            return accesoDatos.listarProductos();
        }

        public BindingList<StockXProducto> listarProductosStock(int consumible, string nombre, string marca, string categoria) {
            return accesoDatos.listarProductosStock(consumible, nombre, marca, categoria);
        }

    }
}
