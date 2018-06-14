using Modelo;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AccesoDatos
{
    public class Detalle_Venta_ServicioDA
    {
        public void registrarDetVentaServicio(Detalle_Venta_Servicio dvServ, int id_Venta)
        {
            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
              "user=inf282g9;database=inf282g9;" +
              "port=3306;password=Yf9bS1;SslMode=none;" +
              "";

            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "REGISTRAR_SERVICIOXVENTA";
            comando.CommandType = System.Data.CommandType.StoredProcedure;
            comando.Parameters.Add("_FidVenta", MySqlDbType.Int32).Value =
                id_Venta;
            comando.Parameters.Add("_FidServicio", MySqlDbType.Int32).Value =
                dvServ.Servicio.IdServicio;
            comando.Parameters.Add("_cantidad", MySqlDbType.Int32).Value =
                dvServ.Cantidad;
            comando.Parameters.Add("_montoFinal", MySqlDbType.Double).Value =
                dvServ.PrecioVendido;
            comando.ExecuteNonQuery();
            conexion.Close();
        }
    }
}
