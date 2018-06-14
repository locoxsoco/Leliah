using Modelo;
using System;
using MySql.Data.MySqlClient;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AccesoDatos
{
    public class ProductoDA
    {
        public BindingList<Producto> listarProductos()
        {
            BindingList<Producto> lista = new BindingList<Producto>();
            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
              "user=inf282g9;database=inf282g9;" +
              "port=3306;password=Yf9bS1;SslMode=none;" +
              "";
            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "LISTAR_PRODUCTOS";
            comando.CommandType = System.Data.CommandType.StoredProcedure;
            MySqlDataReader reader = comando.ExecuteReader();
            while (reader.Read())
            {
                Producto p = new Producto();
                p.IdProducto = reader.GetInt32("idProducto");
                p.Nombre = reader.GetString("nombre");
                p.Precio = reader.GetDouble("precioUnitario");
                p.CantidadMin = reader.GetInt32("cantidadMinima");
                p.Marca = reader.GetString("marca");
                int consumible = reader.GetInt32("consumible");
                string categoria = reader.GetString("categoria");
                p.Descripcion = reader.GetString("descripcion");
                lista.Add(p);
            }
            conexion.Close();
            return lista;
        }

       
        public BindingList<StockXProducto> listarProductosStock(int consumible,string nombre,string marca,string categoria) {
            BindingList<StockXProducto> lista = new BindingList<StockXProducto>();
            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
              "user=inf282g9;database=inf282g9;" +
              "port=3306;password=Yf9bS1;SslMode=none;" + "Allow Zero Datetime = True; " + " Convert Zero Datetime = True;";
            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "BUSCAR_PRODUCTO";
            comando.CommandType = System.Data.CommandType.StoredProcedure;

            comando.Parameters.Add("_consumible", MySqlDbType.Int32).Value = consumible;
            comando.Parameters.Add("_nombre", MySqlDbType.VarChar).Value = nombre;
            comando.Parameters.Add("_marca", MySqlDbType.VarChar).Value = marca;
            comando.Parameters.Add("_categoria", MySqlDbType.VarChar).Value = categoria;

            MySqlDataReader reader = comando.ExecuteReader();
            while (reader.Read())
            {
                StockXProducto ps = new StockXProducto();
                ps.IdProducto = reader.GetInt32("idProducto");
                ps.Nombre = reader.GetString("nombre");
                ps.Precio = reader.GetDouble("precioUnitario");
                ps.CantMinima = reader.GetInt32("cantidadMinima");
                ps.Marca = reader.GetString("marca");
                int consum = reader.GetInt32("consumible");
                ps.Descripcion = reader.GetString("descripcion");
                int activo = reader.GetInt32("activo");
                ps.Categoria = reader.GetString("categoria");
                int idLib = reader.GetInt32("FidLibreria");
                ps.Stock = reader.GetInt32("cantidad");
                ps.FechaVencimiento = reader.GetDateTime("fechaCaducidad");

                lista.Add(ps);
            }

            conexion.Close();
            return lista;

        }



    }
}
