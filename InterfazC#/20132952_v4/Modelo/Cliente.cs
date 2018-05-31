using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Modelo
{
    public class Cliente
    {
        private int idCliente;
        private string direccion;
        private string correo;
        private string telefono;
        private string ruc;
        private string razonSocial;
        private string nombre;
        private string apellidoPaterno;
        private string apellidoMaterno;
        private string numDocumento;
        public int IdCliente { get => idCliente; set => idCliente = value; }
        public string Direccion { get => direccion; set => direccion = value; }
        public string Correo { get => correo; set => correo = value; }
        public string Telefono { get => telefono; set => telefono = value; }
        public string Ruc { get => ruc; set => ruc = value; }
        public string RazonSocial { get => razonSocial; set => razonSocial = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public string ApellidoPaterno { get => apellidoPaterno; set => apellidoPaterno = value; }
        public string ApellidoMaterno { get => apellidoMaterno; set => apellidoMaterno = value; }
        public string NumDocumento { get => numDocumento; set => numDocumento = value; }
    }
}
