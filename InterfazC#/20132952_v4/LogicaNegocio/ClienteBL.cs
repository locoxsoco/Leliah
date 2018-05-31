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
    public class ClienteBL
    {
        private ClienteDA accesoDatos;

        public ClienteBL() {
            accesoDatos = new ClienteDA();
        }

        public BindingList<Cliente> listarClientesNaturales() {
            return accesoDatos.listarClientesNaturales();
        }

        public BindingList<Cliente> listarClientesJuridicos()
        {
            return accesoDatos.listarClientesJuridicos();
        }

        public BindingList<Cliente> buscarCliente(int tipoCliente, string nombre, string apellMat, string apellPat, string RUC, string razonSocial, string numDoc)
        {
            return accesoDatos.buscarCliente(tipoCliente, nombre, apellMat, apellPat, RUC, razonSocial, numDoc);
        }
    }
}
