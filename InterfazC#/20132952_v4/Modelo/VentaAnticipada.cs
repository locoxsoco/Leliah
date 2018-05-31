using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Modelo
{
    public class VentaAnticipada: Venta
    {
        private static int counter = 1;
        private int idAnticipada;
        private double adelanto;
        private DateTime fechaEntrega;
        private double saldoPendiente;

        public VentaAnticipada()
        {

        }
        public VentaAnticipada(int idVenta, DateTime fechaVenta, double montoTotal, TipoRecibo tipoDocumento, TipoPago tipoPago, Cliente cliente, double adelanto, DateTime fechaEntrega, double saldoPendiente):
            base(idVenta, fechaVenta, montoTotal, tipoDocumento, tipoPago, cliente)
        {
          
            this.adelanto = adelanto;
            this.fechaEntrega = fechaEntrega;
            this.saldoPendiente = saldoPendiente;
            this.idAnticipada = counter++;
        }

        public int IdAnticipada { get => idAnticipada; set => idAnticipada = value; }
        public double Adelanto { get => adelanto; set => adelanto = value; }
        public DateTime FechaEntrega { get => fechaEntrega; set => fechaEntrega = value; }
        public double SaldoPendiente { get => saldoPendiente; set => saldoPendiente = value; }
    }
}
