using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AccesoDatos
{
    public class ServicioDA
    {
        public BindingList<Servicio> listarServicios()
        {
            BindingList<Servicio> lista = new BindingList<Servicio>();
            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
              "user=inf282g9;database=inf282g9;" +
              "port=3306;password=Yf9bS1;SslMode=none;" +
              "";
            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "LISTAR_SERVICIOS";
            comando.CommandType = System.Data.CommandType.StoredProcedure;
            MySqlDataReader reader = comando.ExecuteReader();
            while (reader.Read())
            {
                Servicio s = new Servicio();
                s.IdServicio = reader.GetInt32("idServicio");
                s.Nombre = reader.GetString("nombre");
                s.Precio = reader.GetDouble("precioUnitario");

                lista.Add(s);
            }
            conexion.Close();
            return lista;
        }
    }
}
