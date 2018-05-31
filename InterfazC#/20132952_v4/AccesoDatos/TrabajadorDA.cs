using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;



namespace AccesoDatos
{
    public class TrabajadorDA
    {
        public int validarUsuario(string _username, string _password){

        
            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
                    "user=inf282g9;database=inf282g9;" +
                    "port=3306;password=Yf9bS1;SslMode=none;" +
                    "";
            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "VALIDAR_USUARIO";

            comando.CommandType = System.Data.CommandType.StoredProcedure;

            comando.Parameters.Add("_privilegio", MySqlDbType.Int32).Direction = System.Data.ParameterDirection.Output;
            comando.Parameters.Add("_username", MySqlDbType.VarChar).Value = _username;
            comando.Parameters.Add("_password", MySqlDbType.VarChar).Value = _password;

            comando.ExecuteNonQuery();

            conexion.Close();
            return Int32.Parse
            (comando.Parameters["_privilegio"].Value.ToString());

        }
}
}
