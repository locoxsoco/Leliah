using Modelo;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AccesoDatos
{
    public class ClienteDA
    {
        public BindingList<Cliente> listarClientesNaturales()
        {
            BindingList<Cliente> lista = new BindingList<Cliente>();
            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
              "user=inf282g9;database=inf282g9;" +
              "port=3306;password=Yf9bS1;SslMode=none;" +
              "";
            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "LISTAR_CLIENTES_NATURALES";
            comando.CommandType = System.Data.CommandType.StoredProcedure;
            MySqlDataReader reader = comando.ExecuteReader();
            while (reader.Read())
            {
                Cliente c = new Cliente();
                c.IdCliente = reader.GetInt32("idCliente");
                c.Direccion = reader.GetString("direccion");
                c.Correo = reader.GetString("correo");
                c.Telefono = reader.GetString("telefono");


                c.Nombre = reader.GetString("nombre");
                c.ApellidoPaterno = reader.GetString("apellidoPaterno");
                c.ApellidoMaterno = reader.GetString("apellidoMaterno");
               
                c.NumDocumento = reader.GetString("numeroDocumento");
                int tipoCliente = reader.GetInt32("tipoCliente");
                string nombDoc = reader.GetString("nombreDocumentoIdentidad");
                string nombDep = reader.GetString("nombreDepartamento");
                string nombProv = reader.GetString("nombreProvincia");
                string nombDist = reader.GetString("nombreDistrito");
                lista.Add(c);
            }
            conexion.Close();
            return lista;
        }

        public BindingList<Cliente> listarClientesJuridicos()
        {
            BindingList<Cliente> lista = new BindingList<Cliente>();
            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
              "user=inf282g9;database=inf282g9;" +
              "port=3306;password=Yf9bS1;SslMode=none;" +
              "";
            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "LISTAR_CLIENTES_JURIDICOS";
            comando.CommandType = System.Data.CommandType.StoredProcedure;
            MySqlDataReader reader = comando.ExecuteReader();
            while (reader.Read())
            {
                Cliente c = new Cliente();
                c.IdCliente = reader.GetInt32("idCliente");
                c.Direccion = reader.GetString("direccion");
                c.Correo = reader.GetString("correo");
                c.Telefono = reader.GetString("telefono");
                int tipoCliente = reader.GetInt32("tipoCliente");

                c.Ruc = reader.GetString("ruc");
                c.RazonSocial = reader.GetString("razonSocial");

                string nombDep = reader.GetString("nombreDepartamento");
                string nombProv = reader.GetString("nombreProvincia");
                string nombDist = reader.GetString("nombreDistrito");
                lista.Add(c);
            }
            conexion.Close();
            return lista;
        }

        public BindingList<Cliente> buscarCliente(int tipoCliente, string nombre, string apellMat, string apellPat, string RUC,string razonSocial, string numDoc)
        {
            BindingList<Cliente> lista = new BindingList<Cliente>();
            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
              "user=inf282g9;database=inf282g9;" +
              "port=3306;password=Yf9bS1;SslMode=none;" +
              "Allow Zero Datetime = True; " + " Convert Zero Datetime = True;";
            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "BUSCAR_CLIENTE";
            comando.CommandType = System.Data.CommandType.StoredProcedure;

            comando.Parameters.Add("_tipoCliente", MySqlDbType.Int32).Value = tipoCliente;
            comando.Parameters.Add("_nombre", MySqlDbType.VarChar).Value = nombre;
            comando.Parameters.Add("_apellidoPaterno", MySqlDbType.VarChar).Value = apellPat;
            comando.Parameters.Add("_apellidoMaterno", MySqlDbType.VarChar).Value = apellMat;
            comando.Parameters.Add("_ruc", MySqlDbType.VarChar).Value = RUC;
            comando.Parameters.Add("_razonSocial", MySqlDbType.VarChar).Value = razonSocial;
            comando.Parameters.Add("_numeroDocumento", MySqlDbType.VarChar).Value = numDoc;



            MySqlDataReader reader = comando.ExecuteReader();
            while (reader.Read())
            {
                Cliente c = new Cliente();
                c.IdCliente = reader.GetInt32("idCliente");
                if (tipoCliente==1)
                {
                    c.Nombre = reader.GetString("nombre");
                    c.ApellidoPaterno = reader.GetString("apellidoPaterno");
                    c.ApellidoMaterno = reader.GetString("apellidoMaterno");
                    c.NumDocumento = reader.GetString("numeroDocumento");
                    c.Direccion = reader.GetString("direccion");
                    c.Correo = reader.GetString("correo");
                    c.Telefono = reader.GetString("telefono");

                }
                else if (tipoCliente == 2)
                {
                    c.Ruc = reader.GetString("ruc");
                    c.RazonSocial = reader.GetString("razonSocial");
                }

                lista.Add(c);
            }

            conexion.Close();
            return lista;

        }
    }
}
