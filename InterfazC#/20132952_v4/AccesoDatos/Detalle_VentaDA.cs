using Modelo;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AccesoDatos
{
    public class Detalle_VentaDA
    {
        public void registrarDetVenta(Detalle_Venta dv, int id_Venta)
        {
            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
              "user=inf282g9;database=inf282g9;" +
              "port=3306;password=Yf9bS1;SslMode=none;" +
              "";

            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "REGISTRAR_PRODUCTOXVENTA";
            comando.CommandType = System.Data.CommandType.StoredProcedure;
            comando.Parameters.Add("_FidVenta", MySqlDbType.Int32).Value =
                id_Venta;
            comando.Parameters.Add("_FidProducto", MySqlDbType.Int32).Value =
                dv.Producto.IdProducto;
            comando.Parameters.Add("_cantidad", MySqlDbType.Int32).Value =
                dv.Cantidad;
            comando.Parameters.Add("_precioUnitario", MySqlDbType.Double).Value =
                dv.PrecioVendido;
            comando.ExecuteNonQuery();
            conexion.Close();
        }

        
    }

    
 
}
