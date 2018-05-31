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
    public partial class Registrar_Venta : Form
    {

        private VentaAnticipada  venta;
        private Producto prodTemp;
        private StockXProducto prdoStock;
        private VentaBL logicaNegocio;
        private ProductoBL logicaNegocioP;
        double acum;
        double valorIGV = 0.18F;
        double tipoCambio = 3.24F;
        public enum estado
        {
            Inicial, Nuevo, Guardar
        }
        public Registrar_Venta()
        {
            InitializeComponent();
            logicaNegocio = new VentaBL();
            logicaNegocioP = new ProductoBL();
            estadoComponentes(estado.Inicial);
            venta = new VentaAnticipada();
            dgvDetalleVenta.AutoGenerateColumns = false;
            venta.Detalles_venta = new BindingList<Detalle_Venta>();
            dgvDetalleVenta.DataSource = venta.Detalles_venta;
        }

        public void estadoComponentes(estado e)
        {
            switch (e)
            {
                case estado.Inicial:
                    TooStripNuevo.Enabled = true;
                    ToolStripGuardar.Enabled = false;
                    radioBtnBoleta.Enabled = false;
                    radioBtnFactura.Enabled = false;
                    comboBoxMoneda.Enabled = false;
                    radioBtnSi.Enabled = false;
                    radioBtnNo.Enabled = false;
                    radioBtnEfectivo.Enabled = false;
                    radioBtnTarjeta.Enabled = false;
                    textDNI.Enabled = false;
                    textRUC.Enabled = false;
                    comboBoxMoneda.Enabled = false;
                    radioBtnInmediata.Enabled = false;
                    radioBtnAntcipada.Enabled = false;
                    dgvDetalleVenta.Enabled = false;
                    btnListaClientesN.Enabled = false;
                    btnListaClientesJ.Enabled = false;
                    btnListaProd.Enabled = false;
                    textCantidad.Enabled = false;
                    textDescuento.Enabled = false;
                    textPrecioVendido.Enabled = false;
                    btnAgregar.Enabled = false;
                    btnEliminar.Enabled = false;
                    toolStripCancelar.Enabled = false;
                    limpiarCampos();
                    
                    break;

                case estado.Nuevo:
                    comboBoxMoneda.Enabled = true;
                    TooStripNuevo.Enabled = false;
                    ToolStripGuardar.Enabled = true;
                    radioBtnBoleta.Enabled = true;
                    radioBtnSi.Enabled = true;
                    radioBtnNo.Enabled = true;
                    radioBtnFactura.Enabled = true;
                    radioBtnEfectivo.Enabled = true;
                    radioBtnTarjeta.Enabled = true;
                    comboBoxMoneda.Enabled = true;
                    radioBtnInmediata.Enabled = true;
                    radioBtnAntcipada.Enabled = true;
                    textCantidad.Enabled = true;
                    textDescuento.Enabled = true;
                    textPrecioVendido.Enabled = true;
                    dgvDetalleVenta.Enabled = true;
                    btnListaProd.Enabled = true;
                    btnAgregar.Enabled = true;
                    btnEliminar.Enabled = true;
                    toolStripCancelar.Enabled = true;
                    dgvDetalleVenta.Rows.Clear();
                    limpiarCampos();
                    acum = 0.0F;
                    break;
                case estado.Guardar:
                    TooStripNuevo.Enabled = true;
                    ToolStripGuardar.Enabled = false;
                    textDNI.Enabled = false;
                    textRUC.Enabled = false;
                    comboBoxMoneda.Enabled = false;
                    textBoxNombre.Enabled = false;
                    textFV.Enabled = false;
                    textAdelanto.Enabled = false;
                    textCantidad.Enabled = false;
                    textDescuento.Enabled = false;
                    textPrecioVendido.Enabled = false;
                    dgvDetalleVenta.Enabled = false;
                    btnListaProd.Enabled = false;
                    btnAgregar.Enabled = false;
                    btnEliminar.Enabled = false;
                    toolStripCancelar.Enabled = false;
                    //limpiarCampos();
                    break;
            }
        }

        public void limpiarCampos()
        {
            
            textDNI.Text = "";
            textRUC.Text = "";
            textBoxNombre.Text = "";
            textBoxCU.Text = "";
            textDescuento.Text = "";
            textAdelanto.Text = "";
            textFV.Text = "";
            textCantidad.Text = "";
        }
        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            this.Hide();
            VentanaVendedor nuevaVentana = new VentanaVendedor();
            nuevaVentana.Show();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void textBoxCU_TextChanged(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {

        }

        private void toolStripLabel1_Click(object sender, EventArgs e)
        {
        }

        private void btnListaProd_Click(object sender, EventArgs e)
        {
            frmListarProductos frm = new frmListarProductos();
            if (frm.ShowDialog() == DialogResult.OK)
            {
                prdoStock = frm.ProductoStockSeleccionado;

                prodTemp = new Producto();
                prodTemp.IdProducto = prdoStock.IdProducto;
                prodTemp.Nombre = prdoStock.Nombre;
                prodTemp.Marca = prdoStock.Marca;
                prodTemp.Descripcion = prdoStock.Descripcion;
                prodTemp.Moneda = prdoStock.Moneda;
                prodTemp.Precio = prdoStock.Precio;


                textBoxNombre.Text = prodTemp.Nombre;
                if (comboBoxMoneda.Text == "Sol")
                {
                    if (prodTemp.Moneda == "Dólares")
                        prodTemp.Precio = prodTemp.Precio*tipoCambio;
                }
                else { 
                    if (prodTemp.Moneda == "Soles")
                        prodTemp.Precio = prodTemp.Precio /tipoCambio;
                }
                textBoxCU.Text= prodTemp.Precio.ToString();
                textStock.Text = prdoStock.Stock.ToString();
                textFV.Text = prdoStock.FechaVencimiento.ToString();
            }
        }

        private void textBoxNombre_TextChanged(object sender, EventArgs e)
        {

        }

        private void Registrar_Venta_Load(object sender, EventArgs e)
        {

        }

        private void groupProducto_Enter(object sender, EventArgs e)
        {

        }

        private void groupCliente_Enter(object sender, EventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void textNombCli_TextChanged(object sender, EventArgs e)
        {

        }

        private void radioBtnAntcipada_CheckedChanged(object sender, EventArgs e)
        {

            textAdelanto.Enabled = true;
            dateTimeEntrega.Enabled = true;
            dateTimeVenta.Enabled = false;
        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {

        }

        private void radioBtnInmediata_CheckedChanged(object sender, EventArgs e)
        {
            dateTimeVenta.Enabled = true;
            textAdelanto.Enabled = false;
            dateTimeEntrega.Enabled = false;
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            int i = dgvDetalleVenta.CurrentRow.Index;
            venta.Monto = venta.Monto - venta.Detalles_venta[i].Subtotal;
            venta.Detalles_venta.RemoveAt(i);
            textTotal.Text = venta.Monto.ToString();
        }


        private void dgvDetalleVenta_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }


        private void btnAgregar_Click(object sender, EventArgs e)
        {
            

            if (textCantidad.Text == "")
            {
                MessageBox.Show(this, "Faltan ingresar cantidad", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            int cant = Int32.Parse(textCantidad.Text);
            int stockProd= Int32.Parse(textStock.Text);
            if (cant > stockProd)
            {
                MessageBox.Show(this, "No hay producto suficiente", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            else {
                stockProd = stockProd - cant;
                textStock.Text = stockProd.ToString();
            }

            if (radioBtnAntcipada.Checked == true) {
                if (textAdelanto.Text == "") {
                    MessageBox.Show(this, "Faltan ingresar adelanto", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    return;
                }
            }

            //verificar los stock de los productos


            Detalle_Venta dv = new Detalle_Venta();
            double desc;
            
            dv.Producto = prodTemp;
            dv.Cantidad = Int32.Parse(textCantidad.Text);
           

            if (textDescuento.Text == "") desc = 0.0F;
            else desc = double.Parse(textDescuento.Text);

            dv.PrecioVendido = dv.Producto.Precio * (1 - desc);
            dv.Subtotal = dv.Cantidad * dv.PrecioVendido;
            textPrecioVendido.Text = dv.PrecioVendido.ToString();

            venta.Detalles_venta.Add(dv);
            //actualizar el stock
            string date = textFV.Text;
            DateTime fechaVencimiento = Convert.ToDateTime(date);
            int idProd = prodTemp.IdProducto;
            logicaNegocioP.actualizarStock(idProd, stockProd, fechaVencimiento);

            acum = acum + dv.Subtotal;
            acum = Math.Round(acum,4);
            textSubtotal.Text = acum.ToString();
            venta.IGV = acum * valorIGV;
            textIGV.Text = Math.Round(venta.IGV, 4).ToString();
            venta.Monto = acum+ venta.IGV;

            textTotal.Text = Math.Round(venta.Monto, 4).ToString();

            if (radioBtnAntcipada.Checked == true)
            {
                venta.Adelanto = double.Parse(textAdelanto.Text);
                venta.FechaEntrega = dateTimeEntrega.Value;
                venta.SaldoPendiente = venta.Monto - venta.Adelanto;
            }
            else {
                venta.Adelanto = -1;
                venta.SaldoPendiente = 0.0F;
            }
                            
            textSaldo.Text = venta.SaldoPendiente.ToString();
            
            
        }

        private void toolStrip1_ItemClicked(object sender, ToolStripItemClickedEventArgs e)
        {

        }

   

        private void TooStripNuevo_Click(object sender, EventArgs e)
        {
            estadoComponentes(estado.Nuevo);
        }

        private void ToolSGuardar_Click(object sender, EventArgs e)
        {
 
            

            if (textBoxNombre.Text=="" || ((textAdelanto.Enabled is true) && textAdelanto.Text=="" )) {
                MessageBox.Show(this, "Faltan datos", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            if (MessageBox.Show("¿Esta seguro que desear guadar los datos?", "Confirmacion", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                
                if (radioBtnBoleta.Checked==true)
                    venta.tipoDocumentoPago = TipoRecibo.BOLETA;
                else
                    venta.tipoDocumentoPago = TipoRecibo.FACTURA;

                if (radioBtnEfectivo.Checked == true)
                    venta.TipoPago = TipoPago.EFECTIVO;
                else
                    venta.TipoPago = TipoPago.TARJETA;


                if (radioBtnNo.Checked == true) {
                    venta.Cliente = new Cliente();
                    venta.Cliente.IdCliente = -1;
                }
                
                logicaNegocio.registrarVenta(venta);
                estadoComponentes(estado.Guardar);
                MessageBox.Show("Se ha realizado correctamente el registro", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
              
            }
            else {
                return;
            }

            return;
        }

        private void toolStrip1_ItemClicked_1(object sender, ToolStripItemClickedEventArgs e)
        {

        }

        private void dgvDetalleVenta_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void toolStripLabel1_Click_1(object sender, EventArgs e)
        {

        }

        private void toolStripCancelar_Click(object sender, EventArgs e)
        {
            estadoComponentes(estado.Inicial);
        }

        private void radioBtnBoleta_CheckedChanged(object sender, EventArgs e)
        {
          

        }

        private void radioBtnFactura_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void textBoxId_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnListaClientes_Click(object sender, EventArgs e)
        {
            formListarClientesNatural frm = new formListarClientesNatural();
            if (frm.ShowDialog() == DialogResult.OK)
            {
                venta.Cliente = frm.ClienteSeleccionado;
                textDNI.Text = venta.Cliente.NumDocumento;
            }
        }

        private void btnListaClientesJ_Click(object sender, EventArgs e)
        {
            formListarClientesJuridicos frm = new formListarClientesJuridicos();
            if (frm.ShowDialog() == DialogResult.OK)
            {
                venta.Cliente = frm.ClienteSeleccionado;
                textRUC.Text = venta.Cliente.Ruc;

            }

        }

        private void textAdelanto_TextChanged(object sender, EventArgs e)
        {

        }

        private void label15_Click(object sender, EventArgs e)
        {

        }

        private void label16_Click(object sender, EventArgs e)
        {

        }

        private void textDescuento_TextChanged(object sender, EventArgs e)
        {

        }

        private void label17_Click(object sender, EventArgs e)
        {

        }

        private void btnNo_CheckedChanged(object sender, EventArgs e)
        {
            btnListaClientesN.Enabled = false;
            btnListaClientesJ.Enabled = false;
            venta.Cliente = new Cliente();
        }

        private void radioBtnTarjeta_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void radioBtnSi_CheckedChanged(object sender, EventArgs e)
        {
            if (radioBtnBoleta.Checked == true) {
                btnListaClientesN.Enabled = true;
                btnListaClientesJ.Enabled = false;
                textRUC.Text = "";
            }
            if (radioBtnFactura.Checked == true) {
                btnListaClientesN.Enabled = false;
                btnListaClientesJ.Enabled = true;
                textDNI.Text = "";
            }

        }
    }
}

