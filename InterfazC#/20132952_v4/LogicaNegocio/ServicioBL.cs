using AccesoDatos;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LogicaNegocio
{
    public class ServicioBL
    {
        private ServicioDA accesoDatos;

        public ServicioBL()
        {
            accesoDatos = new ServicioDA();
        }

        public BindingList<Servicio> listarServicios()
        {
            return accesoDatos.listarServicios();
        }

        public BindingList<Servicio> buscarServicios(string nombre)
        {
            return accesoDatos.buscarServicios(nombre);
        }
    }
}
