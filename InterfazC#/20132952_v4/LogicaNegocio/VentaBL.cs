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
    public class VentaBL
    {
        private VentaDA accesoDatosVenta;
        private Detalle_VentaDA accedoDatosDetVenta;
        private Detalle_Venta_ServicioDA accesoDatosDetVentaServ;
        double monto;

        public VentaBL()
        {
            accesoDatosVenta = new VentaDA();
            accedoDatosDetVenta = new Detalle_VentaDA();
            accesoDatosDetVentaServ = new Detalle_Venta_ServicioDA();
        }

        public void registrarVenta(VentaAnticipada v)
        {
            v.idVenta = accesoDatosVenta.registrarVenta(v);
            //registrar los productos
            foreach (Detalle_Venta dv in v.Detalles_venta)
            {
                accedoDatosDetVenta.registrarDetVenta(dv,v.idVenta);
            }

            //registrar los servicios
            foreach (Detalle_Venta_Servicio dvServ in v.Detalles_servicio)
            {
                accesoDatosDetVentaServ.registrarDetVentaServicio(dvServ, v.idVenta);
            }

        }

        public BindingList<VentaAnticipada> actualizarVentaAnticipada(int numeroComprobante, string tipoDoc)
        {
            return accesoDatosVenta.actualizarVentaAnticipada(numeroComprobante, tipoDoc);
        }
        public void modificarCantidadVentaProducto(int idProd,int cant, BindingList<Detalle_Venta> lista)
        {
            foreach (Detalle_Venta dv in lista)
            {
                if (dv.Producto.IdProducto == idProd)
                {
                    dv.Cantidad = cant;
                    break;
                }                   
            }
        }

        public void actualizarVentaAnticipada(int idVenta)
        {
            accesoDatosVenta.actualizarVentaAnticipada(idVenta);
        }
        public void modificarCantidadVentaServicio(int idServ, int cant, BindingList<Detalle_Venta_Servicio> lista)
        {
            foreach (Detalle_Venta_Servicio dvServ in lista)
            {
                if (dvServ.Servicio.IdServicio == idServ)
                {
                    dvServ.Cantidad = cant;
                    break;
                }
            }
        }

        public double eliminarProducto(int idProd, BindingList<Detalle_Venta> lista)
        {          
            foreach (Detalle_Venta dv in lista)
            {
                if (dv.Producto.IdProducto == idProd)
                {
                    monto = dv.Subtotal;
                    lista.Remove(dv);
                    break;
                }
                    
            }
            return monto;
        }

        public double eliminarServicio(int idServ, BindingList<Detalle_Venta_Servicio> lista)
        {
            foreach (Detalle_Venta_Servicio dvServ in lista)
            {
                if (dvServ.Servicio.IdServicio == idServ)
                {
                    monto = dvServ.Subtotal;
                    lista.Remove(dvServ);
                    break;
                }

            }
            return monto;
        }

        public void modificarPrecioVendidoProducto(int idProd,double precioVend ,BindingList<Detalle_Venta> lista)
        {
            foreach (Detalle_Venta dv in lista)
            {
                if (dv.Producto.IdProducto == idProd)
                {
                    dv.PrecioVendido = precioVend;
                    break;
                }
            }
        }

        public void modificarPrecioVendidoServicio(int idServ, double precioVend, BindingList<Detalle_Venta_Servicio> lista)
        {
            foreach (Detalle_Venta_Servicio dvServ in lista)
            {
                if (dvServ.Servicio.IdServicio == idServ) 
                {
                    dvServ.PrecioVendido = precioVend;
                    break;
                }
            }
        }
    }
}
