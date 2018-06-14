using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Modelo;
using System.ComponentModel;

namespace AccesoDatos
{
    public class VentaDA
    {
        public int registrarVenta(VentaAnticipada v)
        {

            string cadena = "server=quilla.lab.inf.pucp.edu.pe;" +
              "user=inf282g9;database=inf282g9;" +
              "port=3306;password=Yf9bS1;SslMode=none;" +
              "";
            MySqlConnection conexion = new MySqlConnection(cadena);
            conexion.Open();
            MySqlCommand comando = new MySqlCommand();
            comando.Connection = conexion;
            comando.CommandText = "REGISTRAR_VENTA";


            comando.CommandType = System.Data.CommandType.StoredProcedure;

            comando.Parameters.Add("_montoTotal", MySqlDbType.Decimal).Value =
                v.Monto;

            if (v.Adelanto < 0)
            {// es venta directa
                comando.Parameters.Add("_adelanto", MySqlDbType.Decimal).Value = null;
                comando.Parameters.Add("_saldoPendiente", MySqlDbType.Decimal).Value = null;
                comando.Parameters.Add("_fechaEntrega", MySqlDbType.DateTime).Value = null;
                comando.Parameters.Add("_anticipada", MySqlDbType.Int32).Value = 0;
            }
            else
            {// es venta anticipada
                comando.Parameters.Add("_adelanto", MySqlDbType.Decimal).Value = v.Adelanto;
                comando.Parameters.Add("_saldoPendiente", MySqlDbType.Decimal).Value = v.SaldoPendiente;
                comando.Parameters.Add("_fechaEntrega", MySqlDbType.DateTime).Value = v.FechaEntrega;
                comando.Parameters.Add("_anticipada", MySqlDbType.Int32).Value = 1;

            }


            string pago;
            string recibo;

            if (v.TipoPago == TipoPago.EFECTIVO) pago = "EFECTIVO";
            else pago = "TARJETA";

            if (v.tipoDocumentoPago == TipoRecibo.BOLETA) recibo = "BOLETA";
            else recibo = "FACTURA";

            comando.Parameters.Add("_tipoPago", MySqlDbType.VarChar).Value =
                pago;
            comando.Parameters.Add("_tipoDocumentoPago", MySqlDbType.VarChar).Value =
                recibo;

            if (v.Cliente.IdCliente < 0)
            {
                comando.Parameters.Add("_FidCliente", MySqlDbType.Int32).Value = null;
            }
            else {
                comando.Parameters.Add("_FidCliente", MySqlDbType.Int32).Value = v.Cliente.IdCliente;
            }


            comando.Parameters.Add("_id", MySqlDbType.Int32).Direction
                = System.Data.ParameterDirection.Output;

            comando.ExecuteNonQuery();

            conexion.Close();

            return Int32.Parse(comando.Parameters["_id"].Value.ToString());

        }

    }
    
}
