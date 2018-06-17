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
        private Servicio servTemp;
        private BindingList<DetalleVentaPS> detalleVentaProdServ;
        private int posicion;

        double descMax = 20;
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

            venta.Detalles_venta = new BindingList<Detalle_Venta>();
            venta.Detalles_servicio = new BindingList<Detalle_Venta_Servicio>();
            detalleVentaProdServ = new BindingList<DetalleVentaPS>();
            dgvDetalleVenta.AutoGenerateColumns = false;
            dgvDetalleVenta.DataSource = detalleVentaProdServ;
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
                    radioBtnEfectivo.Enabled = false;
                    radioBtnTarjeta.Enabled = false;
                    labelSoles.Visible = false;
                    label8.Visible = false;
                    textAdelanto.Visible = false;
                    
                    textDNI.Enabled = false;
                    textRUC.Enabled = false;
                    radioBtnInmediata.Enabled = false;
                    radioBtnAntcipada.Enabled = false;
                    //dgvDetalleVenta.Enabled = false;
                    btnListaClientesN.Enabled = false;
                    btnListaClientesJ.Enabled = false;
                    btnListaProd.Enabled = false;
                    btnListaServ.Enabled = false;
                    textCantidad.Enabled = false;
                    textDescuento.Enabled = false;
                    textPrecioVendido.Enabled = false;
                    textCantServ.Enabled = true;
                    textDescServ.Enabled = true;

                    btnAgregar.Enabled = false;
                    btnModificar.Enabled = false;
                    btnEliminar.Enabled = false;

                    btnAgregarServ.Enabled = false;
                    btnModificarServ.Enabled = false;
                    btnEliminarServ.Enabled = false;

                    toolStripCancelar.Enabled = false;
                    limpiarCamposProducto();
                    limpiarCamposServicio();
                    dgvDetalleVenta.Rows.Clear();
                    limpiarCampos();
                    panelProductoServicio.Visible = false;
                    break;

                case estado.Nuevo:
                    TooStripNuevo.Enabled = false;
                    ToolStripGuardar.Enabled = true;
                    radioBtnBoleta.Enabled = true;
                    btnListaClientesN.Enabled = true;
                    radioBtnFactura.Enabled = true;
                    radioBtnEfectivo.Enabled = true;
                    radioBtnTarjeta.Enabled = true;
                    radioBtnInmediata.Enabled = true;
                    radioBtnAntcipada.Enabled = true;
                    textPrecioVendido.Enabled = false; ;
                    dgvDetalleVenta.Enabled = true;
                    btnListaProd.Enabled = true;
                    btnListaServ.Enabled = true;                   

                    toolStripCancelar.Enabled = true;
                    dgvDetalleVenta.Rows.Clear();
                    limpiarCampos();
                    panelProductoServicio.Visible = false;
                    acum = 0.0F;
                    break;
                case estado.Guardar:
                    TooStripNuevo.Enabled = true;
                    ToolStripGuardar.Enabled = false;
                    textDNI.Enabled = false;
                    textRUC.Enabled = false;
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
            textSubtotal.Text = "";
            textIGV.Text = "";
            textTotal.Text = "";
            textAdelanto.Text = "";
            textDNI.Text = "";
            textRUC.Text = "";
        }
        public void limpiarCamposProducto()
        {
            textBoxNombre.Text = "";
            textBoxCU.Text = "";
            textPrecioVendido.Text = "";
            textDescuento.Text = "";
            textCantidad.Text = "";
            textStock.Text = "";
            textFV.Text = "";
        }

        public void limpiarCamposServicio()
        {
            textNombServ.Text = "";
            textCUserv.Text = "";
            textPVserv.Text = "";
            textDescServ.Text = "";
            textCantServ.Text = "";
        }

        private bool productoAgregado(int idProd, BindingList<DetalleVentaPS> lista)
        {
            foreach (DetalleVentaPS detVentPS in lista)
            {
                if (detVentPS.Tipo == 'P' && detVentPS.IdPS == idProd)
                    return true;
            }
            return false;

        }
        private bool servicioAgregado(int idServ, BindingList<DetalleVentaPS> lista)
        {
            foreach (DetalleVentaPS detVentPS in lista)
            {
                if (detVentPS.Tipo == 'S' && detVentPS.IdPS == idServ)
                    return true;
            }
            return false;

        }
      

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("¿Esta seguro que desea salir?", "Confirmacion", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                this.Hide();
                VentanaVendedor nuevaVentana = new VentanaVendedor();
                nuevaVentana.Show();

            }
            else
            {
                return;
            }
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
                prodTemp.Precio = prdoStock.Precio;

                textBoxNombre.Text = prodTemp.Nombre;               
                textBoxCU.Text= prodTemp.Precio.ToString();
                textStock.Text = prdoStock.Stock.ToString();
                textFV.Text = prdoStock.FechaVencimiento.ToString();

                btnAgregar.Enabled = true;
                textCantidad.Enabled = true;
                textDescuento.Enabled = true;

                textDescuento.Text = "";
                textPrecioVendido.Text = "";
                textCantidad.Text = "";
            }

        }

    
       

        private void radioBtnAntcipada_CheckedChanged(object sender, EventArgs e)
        {
            label8.Visible = true;
            labelSoles.Visible = true;
            textAdelanto.Visible = true;
            textAdelanto.Enabled = true;
            dateTimeEntrega.Enabled = true;
            dateTimeVenta.Enabled = false;
        }

     

        private void radioBtnInmediata_CheckedChanged(object sender, EventArgs e)
        {
            dateTimeVenta.Enabled = false;
            textAdelanto.Enabled = false;
            dateTimeEntrega.Enabled = false;
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            double monto;
            int idProd = detalleVentaProdServ[posicion].IdPS;
            monto = logicaNegocio.eliminarProducto(idProd, venta.Detalles_venta);


            acum = acum - monto;
            acum = Math.Round(acum, 4);
            venta.IGV = acum * valorIGV;
            venta.Monto = venta.IGV + acum;

            textSubtotal.Text = Math.Round(acum, 4).ToString();
            textIGV.Text = Math.Round(venta.IGV, 4).ToString();
            textTotal.Text = Math.Round(venta.Monto, 4).ToString();

            detalleVentaProdServ.RemoveAt(posicion);
            btnEliminar.Enabled = false;
            btnModificar.Enabled = false;
            limpiarCamposProducto();
        }





        private void btnAgregar_Click(object sender, EventArgs e)
        {
            int cant = 0;
            int desc;


            //validaciones 
            if (textBoxNombre.Text == "")
            {
                MessageBox.Show(this, "Falta seleccionar producto", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            if (textCantidad.Text == "")
            {
                MessageBox.Show(this, "Faltan ingresar cantidad", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            bool result = int.TryParse(textCantidad.Text, out cant);
            if (result == false)
            {
                MessageBox.Show(this, "Ingrese un numero entero", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            int stockProd = Int32.Parse(textStock.Text);
            if (cant > stockProd)
            {
                MessageBox.Show(this, "No hay producto suficiente", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            else
            {
                stockProd = stockProd - cant;
                textStock.Text = stockProd.ToString();
            }

            if (textDescuento.Text == "") desc = 0;
            else
            {
                bool resultDes = Int32.TryParse(textDescuento.Text, out desc);
                if (resultDes == false)
                {
                    MessageBox.Show(this, "Ingrese un numero entero en descuento", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    return;
                }
                else
                {
                    if (desc > descMax)
                    {
                        MessageBox.Show(this, "Porcenatje muy grande en descuento", "Error", MessageBoxButtons.OK, MessageBoxIcon.Information);
                        return;
                    }
                }

            }

            //verificar que el producto no este antes en el datagridview
            if (productoAgregado(prodTemp.IdProducto, detalleVentaProdServ) == true)
            {
                MessageBox.Show(this, "Producto ya agregado", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {

                //Se maneja el detalle de productos por separado
                Detalle_Venta dv = new Detalle_Venta();

                double descAux;
                descAux = desc;
                dv.Producto = prodTemp;
                dv.Cantidad = Int32.Parse(textCantidad.Text);
                dv.PrecioVendido = dv.Producto.Precio * (1 - descAux / 100);
                dv.Subtotal = dv.Cantidad * dv.PrecioVendido;
                venta.Detalles_venta.Add(dv);

                acum = acum + dv.Subtotal;
                acum = Math.Round(acum, 4);
                venta.IGV = acum * valorIGV;
                venta.Monto = acum + venta.IGV;

                textIGV.Text = Math.Round(venta.IGV, 4).ToString();
                textSubtotal.Text = Math.Round(acum, 4).ToString();
                textTotal.Text = Math.Round(venta.Monto, 4).ToString();


                //solo para mostrar en la tabla
                DetalleVentaPS dvPS = new DetalleVentaPS();

                dvPS.Tipo = 'P';
                dvPS.IdPS = prodTemp.IdProducto;
                dvPS.NombrePS = textBoxNombre.Text;
                dvPS.Precio = prodTemp.Precio;
                dvPS.Descuento = descAux/100;
                dvPS.Stock = prdoStock.Stock;
                dvPS.Cantidad = Int32.Parse(textCantidad.Text);
                dvPS.PrecioVendido = Math.Round(dvPS.Precio * (1 - descAux / 100), 4);
                dvPS.Subtotal = Math.Round(dvPS.Cantidad * dvPS.PrecioVendido, 4);

                textPrecioVendido.Text = Math.Round(dvPS.PrecioVendido, 4).ToString();
                detalleVentaProdServ.Add(dvPS);

                limpiarCamposProducto();
                btnAgregar.Enabled = false;
            }
         
            
        }

     
   

        private void TooStripNuevo_Click(object sender, EventArgs e)
        {
            estadoComponentes(estado.Nuevo);
        }

        private void ToolSGuardar_Click(object sender, EventArgs e)
        {
            if (radioBtnAntcipada.Checked == true)
            {
                if (textAdelanto.Text == "")
                {
                    MessageBox.Show(this, "Faltan ingresar adelanto", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    return;
                }
                venta.Adelanto = double.Parse(textAdelanto.Text);
                venta.FechaEntrega = dateTimeEntrega.Value;
                venta.SaldoPendiente = venta.Monto - venta.Adelanto;
            }
            else
            {
                venta.Adelanto = -1;
                venta.SaldoPendiente = 0.0F;
            }


            if (((radioBtnAntcipada.Checked==true) && textAdelanto.Text=="" ) || textTotal.Text == ""){
                MessageBox.Show(this, "Faltan llenar campos obligatorios", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
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

                
                logicaNegocio.registrarVenta(venta);
                estadoComponentes(estado.Guardar);

                if (radioBtnInmediata.Checked == true)
                {
                    MessageBox.Show("Se ha registrado correctamente la venta: \n Tiene una venta de " + textTotal.Text + " soles", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else if (radioBtnAntcipada.Checked == true) {
                    
                    MessageBox.Show("Se ha registrado correctamente la venta: \n Tiene una venta de " + textTotal.Text + " soles con un saldo pendiente de " + Math.Round(venta.SaldoPendiente,4).ToString(), "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
              
            }
            else {
                return;
            }

            return;
        }

      
        private void toolStripCancelar_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("¿Esta seguro que desear cancelar la venta?", "Confirmacion", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                estadoComponentes(estado.Inicial);
            
            }
            else
            {
                return;
            }
        }

        private void radioBtnBoleta_CheckedChanged(object sender, EventArgs e)
        {
            btnListaClientesN.Enabled = true;
            btnListaClientesJ.Enabled = false;
            textRUC.Text = "";
        }

        private void radioBtnFactura_CheckedChanged(object sender, EventArgs e)
        {
            btnListaClientesJ.Enabled = true;
            btnListaClientesN.Enabled = false;
            textDNI.Text = "";
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


        private void btnListaServ_Click(object sender, EventArgs e)
        {
            formListarServicios frm = new formListarServicios();
            if (frm.ShowDialog() == DialogResult.OK)
            {
                servTemp = frm.ServicioSeleccionado;
                textNombServ.Text = servTemp.Nombre;
                textCUserv.Text = servTemp.Precio.ToString();

                btnAgregarServ.Enabled = true;
                textDescServ.Enabled = true;
                textCantServ.Enabled = true;

                textDescuento.Text = "";
                textPrecioVendido.Text = "";
                textCantidad.Text = "";
            }
        }

        private void btnAgregarServ_Click(object sender, EventArgs e)
        {
            int cant = 0;
            int desc;

            //validaciones 
            if (textNombServ.Text == "")
            {
                MessageBox.Show(this, "Falta seleccionar producto", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            if (textCantServ.Text == "")
            {
                MessageBox.Show(this, "Faltan ingresar cantidad", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            bool result = int.TryParse(textCantServ.Text, out cant);
            if (result == false)
            {
                MessageBox.Show(this, "Ingrese un numero entero", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            if (textDescServ.Text == "") desc = 0;
            else
            {
                bool resultDes = Int32.TryParse(textDescServ.Text, out desc);
                if (resultDes == false)
                {
                    MessageBox.Show(this, "Ingrese un numero entero en el campo descuento", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    return;
                }
                else
                {
                    if (desc > descMax)
                    {
                        MessageBox.Show(this, "Porcenatje mayor al 20% en descuento", "Error", MessageBoxButtons.OK, MessageBoxIcon.Information);
                        return;
                    }
                }
            }


            //verificar que el servicio no este en el datagridview
            if (servicioAgregado(servTemp.IdServicio, detalleVentaProdServ) == true)
            {
                MessageBox.Show(this, "Servicio ya agregado", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                //Se maneja el detalle de servicios por separado
                Detalle_Venta_Servicio dvServ = new Detalle_Venta_Servicio();

                double descAux;
                descAux = desc;
                dvServ.Servicio = servTemp;
                dvServ.PrecioVendido = dvServ.Servicio.Precio * (1 - descAux / 100);
                dvServ.Cantidad = cant;
                dvServ.Subtotal = dvServ.Cantidad * dvServ.PrecioVendido;
                venta.Detalles_servicio.Add(dvServ);

                acum = acum + dvServ.Subtotal;
                acum = Math.Round(acum, 4);
                venta.IGV = acum * valorIGV;
                venta.Monto = acum + venta.IGV;

                textIGV.Text = Math.Round(venta.IGV, 4).ToString();
                textSubtotal.Text = Math.Round(acum, 4).ToString();
                textTotal.Text = Math.Round(venta.Monto, 4).ToString();


                //solo para mostar en la tabla
                DetalleVentaPS dvPS = new DetalleVentaPS();

                dvPS.Tipo = 'S';
                dvPS.IdPS = servTemp.IdServicio;
                dvPS.NombrePS = textNombServ.Text;
                dvPS.Precio = servTemp.Precio;
                dvPS.Descuento = descAux/100;
                dvPS.PrecioVendido = Math.Round(dvPS.Precio * (1 - descAux / 100), 4);
                dvPS.Cantidad = Int32.Parse(textCantServ.Text);
                dvPS.Subtotal = Math.Round(dvPS.Cantidad * dvPS.PrecioVendido, 4);

                textPVserv.Text = Math.Round(dvPS.PrecioVendido, 4).ToString();

                detalleVentaProdServ.Add(dvPS);
                limpiarCamposServicio();
                btnAgregarServ.Enabled = false;
            }
        }

        private void btnModificar_Click(object sender, EventArgs e)
        {
            int cant = 0;
            double desc;

            //validaciones 
            if (textCantidad.Text == "")
            {
                MessageBox.Show(this, "Faltan ingresar cantidad", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            bool result = int.TryParse(textCantidad.Text, out cant);
            if (result == false)
            {
                MessageBox.Show(this, "Ingrese un numero entero", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            detalleVentaProdServ[posicion].Cantidad = cant;
            detalleVentaProdServ.ResetBindings();

            //modificar en la lista de productos vendidos
            int idProd = detalleVentaProdServ[posicion].IdPS;
            logicaNegocio.modificarCantidadVentaProducto(idProd, cant, venta.Detalles_venta);

            limpiarCamposProducto();
            btnModificar.Enabled = false;
            btnEliminar.Enabled = false;
            btnAgregar.Enabled = true;
        }

        private void btnModificarServ_Click(object sender, EventArgs e)
        {
            int cant = 0;
            double desc;

            //validaciones 
            if (textCantServ.Text == "")
            {
                MessageBox.Show(this, "Faltan ingresar cantidad", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            bool result = int.TryParse(textCantServ.Text, out cant);
            if (result == false)
            {
                MessageBox.Show(this, "Ingrese un numero entero", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }

            detalleVentaProdServ[posicion].Cantidad = cant;
            detalleVentaProdServ.ResetBindings();

            //modificar en la lista de servicios ofrecidos
            int idServ = detalleVentaProdServ[posicion].IdPS;
            logicaNegocio.modificarCantidadVentaServicio(idServ, cant, venta.Detalles_servicio);

            limpiarCamposServicio();
            btnModificarServ.Enabled = false;
            btnEliminarServ.Enabled = false;
            btnAgregarServ.Enabled = true;
        }
        
        private void btnSiguiente_Click(object sender, EventArgs e)
        {
            if (textDNI.Text == "" && textRUC.Text == "")
            {
                MessageBox.Show(this, "Faltan ingresar campos obligatorios", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            else
            {
                panelProductoServicio.Visible = true;
            }
            
        }

        private void btnAnterior_Click(object sender, EventArgs e)
        {
            panelProductoServicio.Visible = false;
        }

        private void btnSalirPC_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("¿Esta seguro que desea salir de la ventana?", "Confirmacion", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                this.Hide();
                VentanaVendedor nuevaVentana = new VentanaVendedor();
                nuevaVentana.Show();

            }
            else
            {
                return;
            }
            
        }

        private void dgvDetalleVenta_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            try
            {
                posicion = dgvDetalleVenta.CurrentRow.Index;
                if (detalleVentaProdServ[posicion].Tipo == 'P')
                {
                    textBoxNombre.Text = detalleVentaProdServ[posicion].NombrePS;
                    textBoxCU.Text = detalleVentaProdServ[posicion].Precio.ToString();
                    textCantidad.Text = detalleVentaProdServ[posicion].Cantidad.ToString();
                    textDescuento.Text = (detalleVentaProdServ[posicion].Descuento*100).ToString();
                    textStock.Text = detalleVentaProdServ[posicion].Stock.ToString();
                    textPrecioVendido.Text = detalleVentaProdServ[posicion].PrecioVendido.ToString();
                    btnAgregar.Enabled = false;
                    btnModificar.Enabled = true;
                    btnEliminar.Enabled = true;
                    btnModificarServ.Enabled = false;
                    btnEliminarServ.Enabled = false; ;
                    limpiarCamposServicio();

                    //producto.Presentaciones.RemoveAt(indice);
                }
                else
                {
                    textNombServ.Text = detalleVentaProdServ[posicion].NombrePS;
                    textCUserv.Text = detalleVentaProdServ[posicion].Precio.ToString();
                    textCantServ.Text = detalleVentaProdServ[posicion].Cantidad.ToString();
                    textDescServ.Text = (detalleVentaProdServ[posicion].Descuento*100).ToString();
                    textPVserv.Text = detalleVentaProdServ[posicion].PrecioVendido.ToString();
                    btnAgregarServ.Enabled = false;
                    btnModificarServ.Enabled = true;
                    btnEliminarServ.Enabled = true;
                    btnModificar.Enabled = false;
                    btnEliminar.Enabled = false;
                    limpiarCamposProducto();

                }


            }
            catch (Exception ex) { MessageBox.Show("Debe seleccionar una presentacion a modificar", "Mensaje de Error", MessageBoxButtons.OK, MessageBoxIcon.Warning); }
        }

        private void btnEliminarServ_Click(object sender, EventArgs e)
        {
            double monto;
            int idServ = detalleVentaProdServ[posicion].IdPS;
            monto = logicaNegocio.eliminarServicio(idServ, venta.Detalles_servicio);

            acum = acum - monto;
            acum = Math.Round(acum, 4);
            venta.IGV = acum * valorIGV;
            venta.Monto = venta.IGV + acum;

            textSubtotal.Text = Math.Round(acum, 4).ToString();
            textIGV.Text = Math.Round(venta.IGV, 4).ToString();
            textTotal.Text = Math.Round(venta.Monto, 4).ToString();

            detalleVentaProdServ.RemoveAt(posicion);
            btnEliminarServ.Enabled = false;
            btnModificarServ.Enabled = false;
            limpiarCamposServicio();
        }

        private void textDescuento_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (textDescuento.Text != "")
            {
                if (e.KeyChar == Convert.ToChar(Keys.Enter))
                {
                    int desc;
                    bool resultDes = Int32.TryParse(textDescuento.Text, out desc);
                    if (resultDes == false)
                    {
                        MessageBox.Show(this, "Ingrese un numero entero en el campo Descuento", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                        return;
                    }
                    else
                    {
                        if (desc > descMax)
                        {
                            MessageBox.Show(this, "Porcenatje mayor al 20% en descuento", "Error", MessageBoxButtons.OK, MessageBoxIcon.Information);
                            return;
                        }
                    }
                    double descAux;
                    descAux = desc;
                    textPrecioVendido.Text = (prdoStock.Precio * (1 - descAux/100)).ToString();
                }
            }
        }

        private void textDescServ_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (textDescServ.Text != "")
            {
                if (e.KeyChar == Convert.ToChar(Keys.Enter))
                {
                    int desc;
                    bool resultDes = Int32.TryParse(textDescServ.Text, out desc);
                    if (resultDes == false)
                    {
                        MessageBox.Show(this, "Ingrese un numero entero en el campos Descuento", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                        return;
                    }
                    else
                    {
                        if (desc > descMax)
                        {
                            MessageBox.Show(this, "Porcenatje mayor al 20% en descuento", "Error", MessageBoxButtons.OK, MessageBoxIcon.Information);
                            return;
                        }
                    }
                    double descAux;
                    descAux = desc;
                    textPVserv.Text = (servTemp.Precio * (1 - descAux/100)).ToString();
                }
            }
        }

    }
}

