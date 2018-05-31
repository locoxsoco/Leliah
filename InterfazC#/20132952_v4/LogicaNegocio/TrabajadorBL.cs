using AccesoDatos;
using Modelo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LogicaNegocio
{
    public class TrabajadorBL
    {
        private TrabajadorDA accesoDatosTrabajador;
        public int validarUsuario(string _username,string _password)
        {
            accesoDatosTrabajador = new TrabajadorDA();
            return accesoDatosTrabajador.validarUsuario(_username, _password);
        }
    }
}
