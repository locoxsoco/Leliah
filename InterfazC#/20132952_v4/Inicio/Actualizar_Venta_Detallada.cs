using LogicaNegocio;
using Modelo;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Inicio
{
    public partial class Actualizar_Venta_Detallada : Form
    {
        private BindingList<VentaAnticipada> lista;
        private VentaBL logicaNegocio;
        private string tipoComp;
        private int idVenta;
        public VentanaVendedor vAnt;

        public Actualizar_Venta_Detallada()
        {
            logicaNegocio = new VentaBL();
            InitializeComponent();
        }

        public void soloNumeros(KeyPressEventArgs e)
        {
            try
            {
                if (Char.IsNumber(e.KeyChar)) e.Handled = false;
                else if (Char.IsControl(e.KeyChar)) e.Handled = false;
                else e.Handled = true;
            }
            catch (Exception ex)
            {
            }
        }

        public void limpiarCampos()
        {
            textCliente.Text = "";
            textSaldo.Text = "";
            textAdelanto.Text = "";
            textMonto.Text = "";
            textTotal.Text = "";
            textEstado.Text = "";
            textNroComprobante.Text = "";
        }
        private void btnActualizarVD_Click(object sender, EventArgs e)
        {
            double saldo;
            double monto;
            saldo = Double.Parse(textSaldo.Text);

            try
            {
                monto = Double.Parse(textMonto.Text);
            }
            catch (Exception ex) {
                MessageBox.Show(this, "ingrese un numero", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            if (textEstado.Text == "CANCELADO") btnActualizarVD.Enabled = false;
            else btnActualizarVD.Enabled = true;

            if (monto == saldo)
            {
                MessageBox.Show(this, "Venta cancelada", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                //procedimiento actualizar
                logicaNegocio.actualizarVentaAnticipada(idVenta);
                textEstado.Text = "CANCELADA";
                textMonto.Enabled = false;
            }
            else {
                MessageBox.Show(this, "No coincide con el saldo", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            limpiarCampos();
        }

        private void btnSalir_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("¿Esta seguro que desear salir de la ventana?", "Confirmacion", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                vAnt.Visible = true;
                this.Dispose();
                
                //VentanaVendedor nuevaVentana = new VentanaVendedor();
                //nuevaVentana.Show();
            }
            else
            {
                return;
            }
        }

        private void btnBuscarVA_Click(object sender, EventArgs e)
        {
            int numComp = Int32.Parse(textNroComprobante.Text);
            lista = new BindingList<VentaAnticipada>();
            lista = logicaNegocio.actualizarVentaAnticipada(numComp, tipoComp);

            if (lista.Count != 0)
            {
                double saldo;
                btnActualizarVD.Enabled = true;
                if (lista[0].Cliente.NumDocumento == null)
                    textCliente.Text = lista[0].Cliente.Ruc;
                else if (lista[0].Cliente.Ruc == null)
                    textCliente.Text = lista[0].Cliente.NumDocumento;

                idVenta = lista[0].idVenta;
                textSaldo.Text = lista[0].SaldoPendiente.ToString();
                textTotal.Text = lista[0].Monto.ToString();
                textAdelanto.Text = lista[0].Adelanto.ToString();

                saldo = lista[0].SaldoPendiente;

                if (saldo > 0)
                {
                    textMonto.Enabled = true;
                    textEstado.Text = "PENDIENTE";
                } 
                else
                {
                    textEstado.Text = "CANCELADO";
                    textMonto.Enabled = false;
                } 

                
            }
            else {
                MessageBox.Show(this, "No existe la venta anticipada", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }          

        }

        private void radioBtnBoleta_CheckedChanged(object sender, EventArgs e)
        {
            tipoComp = "BOLETA";
        }

        private void radioBtnFactura_CheckedChanged(object sender, EventArgs e)
        {
            tipoComp = "FACTURA";
        }


        private void textNroComprobante_KeyPress(object sender, KeyPressEventArgs e)
        {
            soloNumeros(e);
        }
    }
}
