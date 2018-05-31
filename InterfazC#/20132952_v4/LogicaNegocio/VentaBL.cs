using AccesoDatos;
using Modelo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LogicaNegocio
{
    public class VentaBL
    {
        private VentaDA accesoDatosVenta;
        private Detalle_VentaDA accedoDatosDetVenta  ;

        public VentaBL()
        {
            accesoDatosVenta = new VentaDA();
            accedoDatosDetVenta = new Detalle_VentaDA();
        }

        public void registrarVenta(VentaAnticipada v)
        {
            v.idVenta = accesoDatosVenta.registrarVenta(v);
            foreach (Detalle_Venta dv in v.Detalles_venta)
            {
                accedoDatosDetVenta.registrarDetVenta(dv,v.idVenta);
            }
        }
    }
}
