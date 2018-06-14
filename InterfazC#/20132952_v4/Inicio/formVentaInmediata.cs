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
    public partial class formVentaInmediata : Form
    {
        private VentaAnticipada venta;
        private Producto prodTemp;
        private StockXProducto prdoStock;
        private Servicio servTemp;
        private VentaBL logicaNegocio;
        private BindingList<DetalleVentaPS> detalleVentaProdServ;
        private ProductoBL logicaNegocioP;
        private int posicion;


        double acum;
        double valorIGV = 0.18F;
        double tipoCambio = 3.24F;
        public enum estado
        {
            Inicial, Nuevo, Guardar
        }
        public formVentaInmediata()
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
            //Enumerable<DetalleVentaPS> query = detalleVentaProdServ.OrderBy(detVentaPS => detVentaPS.NombrePS);
            //detalleVentaProdServ.OrderBy<DetalleVentaPS>;
            dgvDetalleVenta.DataSource = detalleVentaProdServ;

        }

        public void limpiarCamposProducto() {
            textBoxNombre.Text = "";
            textBoxCU.Text = "";
            textPrecioVendido.Text = "";
            textDescuento.Text = "";
            textCantidad.Text = "";
            textStock.Text = "";
            textFV.Text="";
        }

        public void limpiarCamposServicio()
        {
            textNombServ.Text = "";
            textCUserv.Text = "";
            textPVserv.Text = "";
            textDescServ.Text = "";
            textCantServ.Text = "";
        }
        public void limpiarCampos()
        {
            textSubtotal.Text = "";
            textIGV.Text = "";
            textTotal.Text = "";
        }
        public void estadoComponentes(estado e)
        {
            switch (e)
            {
                case estado.Inicial:
                    TooStripNuevo.Enabled = true;
                    ToolStripGuardar.Enabled = false;
                    toolStripCancelar.Enabled = false;
                    dgvDetalleVenta.Enabled = false;
                    btnListaProd.Enabled = false;
                    btnListaServ.Enabled = false;
                    textCantidad.Enabled = false;
                    textCantServ.Enabled = false;
                    textDescuento.Enabled = false;
                    textDescServ.Enabled = false;
                    textPrecioVendido.Enabled = false;

                    btnAgregar.Enabled = false;
                    btnAgregarServ.Enabled = false;
                    btnModificarProd.Enabled = false;
                    btnModificarServ.Enabled = false;
                    btnEliminar.Enabled = false;
                    btnEliminarServ.Enabled = false;

                    limpiarCamposProducto();
                    limpiarCamposServicio();
                    dgvDetalleVenta.Rows.Clear();
                    limpiarCampos();
                    break;

                case estado.Nuevo:
                    TooStripNuevo.Enabled = false;
                    ToolStripGuardar.Enabled = true;
                    toolStripCancelar.Enabled = true;
                                       
                    textPrecioVendido.Enabled = false;
                    dgvDetalleVenta.Enabled = true;
                    btnListaProd.Enabled = true;
                    btnListaServ.Enabled = true;
                    
                    btnAgregar.Enabled = false;                   
                    btnAgregarServ.Enabled = false;
                    btnModificarProd.Enabled = false;
                    btnModificarServ.Enabled = false;
                    btnEliminar.Enabled = false;
                    btnEliminarServ.Enabled = false;
                    dgvDetalleVenta.Rows.Clear();
                    limpiarCamposProducto();
                    limpiarCamposServicio();
                    acum = 0.0F;
                    break;
                case estado.Guardar:
                    TooStripNuevo.Enabled = true;
                    ToolStripGuardar.Enabled = false;
                    toolStripCancelar.Enabled = false;
                    textBoxNombre.Enabled = false;
                    textFV.Enabled = false;
                    textPrecioVendido.Enabled = false;
                    dgvDetalleVenta.Enabled = false;
                    btnListaProd.Enabled = false;
                    btnAgregar.Enabled = false;
                    btnEliminar.Enabled = false;
                    limpiarCamposProducto();
                    limpiarCamposServicio();
                    break;
            }
        }

        
        private void formVentaInmediata_Load(object sender, EventArgs e)
        {

        }

        private void TooStripNuevo_Click(object sender, EventArgs e)
        {
            estadoComponentes(estado.Nuevo);
        }

        private void btnSalir_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("¿Esta seguro que desear salir de la ventana?", "Confirmacion", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
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
                textBoxCU.Text = prodTemp.Precio.ToString();
                textStock.Text = prdoStock.Stock.ToString();
                textFV.Text = prdoStock.FechaVencimiento.ToString();

                btnAgregar.Enabled = true;
                textCantidad.Enabled = true;               
                textDescuento.Enabled = true;               

            }

        }

        private bool productoAgregado(int idProd, BindingList<DetalleVentaPS> lista)
        {
            foreach (DetalleVentaPS detVentPS in lista) {
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
        private void btnAgregar_Click(object sender, EventArgs e)
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

            if (textDescuento.Text == "") desc = 0.0F;
            else {
                bool resultDes = double.TryParse(textDescuento.Text, out desc);
                if (resultDes == false)
                {
                    MessageBox.Show(this, "Ingrese un numero decimal en descuento", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    return;
                }
                else
                {
                    if (desc > 0.5)
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
            else {

                //Se maneja el detalle de productos por separado
                Detalle_Venta dv = new Detalle_Venta();

                dv.Producto = prodTemp;
                dv.Cantidad = Int32.Parse(textCantidad.Text);
                dv.PrecioVendido = dv.Producto.Precio * (1 - desc);
                dv.Subtotal = dv.Cantidad * dv.PrecioVendido;
                venta.Detalles_venta.Add(dv);

                //string date = textFV.Text;
                //DateTime fechaVencimiento = Convert.ToDateTime(date);
                //int idProd = prodTemp.IdProducto;

                acum = acum + dv.Subtotal;
                acum = Math.Round(acum, 4);
                venta.IGV = acum * valorIGV;
                venta.Monto = acum + venta.IGV;

                textIGV.Text = Math.Round(venta.IGV, 4).ToString();
                textSubtotal.Text = Math.Round(acum,4).ToString();
                textTotal.Text = Math.Round(venta.Monto, 4).ToString();


                //solo para mostrar en la tabla
                DetalleVentaPS dvPS = new DetalleVentaPS();

                dvPS.Tipo = 'P';
                dvPS.IdPS = prodTemp.IdProducto;
                dvPS.NombrePS = textBoxNombre.Text;
                dvPS.Precio = prodTemp.Precio;
                dvPS.Cantidad = Int32.Parse(textCantidad.Text);
                dvPS.PrecioVendido = Math.Round(dvPS.Precio * (1 - desc),4);
                dvPS.Subtotal = Math.Round(dvPS.Cantidad * dvPS.PrecioVendido,4);

                textPrecioVendido.Text = Math.Round(dvPS.PrecioVendido,4).ToString();
                detalleVentaProdServ.Add(dvPS);

                limpiarCamposProducto();

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
            }
            
        }

        private void btnAgregarServ_Click(object sender, EventArgs e)
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

            if (textDescServ.Text == "") desc = 0.0F;
            else
            {
                bool resultDes = double.TryParse(textDescServ.Text, out desc);
                if (resultDes == false)
                {
                    MessageBox.Show(this, "Ingrese un numero decimal en descuento", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    return;
                }
                else
                {
                    if (desc > 0.5)
                    {
                        MessageBox.Show(this, "Porcenatje muy grande en descuento", "Error", MessageBoxButtons.OK, MessageBoxIcon.Information);
                        return;
                    }
                }
            }
            


            //verificar que el servicio no este en el datagridview
            if (servicioAgregado(servTemp.IdServicio, detalleVentaProdServ) == true)
            {
                MessageBox.Show(this, "Servicio ya agregado", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else{
                //Se maneja el detalle de servicios por separado
                Detalle_Venta_Servicio dvServ = new Detalle_Venta_Servicio();

                dvServ.Servicio = servTemp;
                dvServ.PrecioVendido = dvServ.Servicio.Precio * (1 - desc);
                dvServ.Cantidad = cant;
                dvServ.Subtotal = dvServ.Cantidad * dvServ.PrecioVendido;
                venta.Detalles_servicio.Add(dvServ);

                acum = acum + dvServ.Subtotal;
                acum = Math.Round(acum, 4);
                venta.IGV = acum * valorIGV;
                venta.Monto = acum + venta.IGV;

                textIGV.Text = Math.Round(venta.IGV, 4).ToString();
                textSubtotal.Text = Math.Round(acum,4).ToString();
                textTotal.Text = Math.Round(venta.Monto, 4).ToString();


                //solo para mostar en la tabla
                DetalleVentaPS dvPS = new DetalleVentaPS();

                dvPS.Tipo = 'S';
                dvPS.IdPS = servTemp.IdServicio;
                dvPS.NombrePS = textNombServ.Text;
                dvPS.Precio = servTemp.Precio;
                dvPS.PrecioVendido = Math.Round(dvPS.Precio * (1 - desc),4);
                dvPS.Cantidad = Int32.Parse(textCantServ.Text);              
                dvPS.Subtotal = Math.Round(dvPS.Cantidad * dvPS.PrecioVendido,4);

                textPVserv.Text = Math.Round(dvPS.PrecioVendido,4).ToString();

                detalleVentaProdServ.Add(dvPS);
                limpiarCamposServicio();
            }
            
        }

        

        private void btnModificarProd_Click(object sender, EventArgs e)
        {
            
            int cant=0;
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
            btnAgregar.Enabled = true;
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
                    btnAgregar.Enabled = false;
                    btnModificarProd.Enabled = true;
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
                    btnAgregarServ.Enabled = false;
                    btnModificarServ.Enabled = true;
                    btnEliminarServ.Enabled = true;
                    btnModificarProd.Enabled = false;
                    btnEliminar.Enabled = false;
                    limpiarCamposProducto();

                }


            }
            catch (Exception ex) { MessageBox.Show("Debe seleccionar una presentacion a modificar", "Mensaje de Error", MessageBoxButtons.OK, MessageBoxIcon.Warning); }
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            double monto;
            int idProd = detalleVentaProdServ[posicion].IdPS;
            monto = logicaNegocio.eliminarProducto(idProd, venta.Detalles_venta);


            acum = acum - monto;
            acum = Math.Round(acum, 4);
            venta.IGV= acum * valorIGV;           
            venta.Monto = venta.IGV + acum;

            textSubtotal.Text = Math.Round(acum,4).ToString();
            textIGV.Text = Math.Round(venta.IGV, 4).ToString();
            textTotal.Text = Math.Round(venta.Monto,4).ToString();

            detalleVentaProdServ.RemoveAt(posicion);
            limpiarCamposProducto();
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
            limpiarCamposServicio();
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
            btnAgregarServ.Enabled = true;
        }

        private void ToolStripGuardar_Click(object sender, EventArgs e)
        {

            if (textTotal.Text == "")
            {
                MessageBox.Show(this, "Faltan llenar campos obligatorios", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                
            }
            else
            {
                if (MessageBox.Show("¿Esta seguro que desear guadar los datos?", "Confirmacion", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                {

                    venta.Adelanto = -1;
                    venta.SaldoPendiente = 0.0F;
                    venta.TipoPago = TipoPago.EFECTIVO;
                    venta.tipoDocumentoPago = TipoRecibo.BOLETA;
                    venta.Cliente = new Cliente();
                    venta.Cliente.IdCliente = -1;

                    logicaNegocio.registrarVenta(venta);
                    estadoComponentes(estado.Guardar);
                    MessageBox.Show("Se ha registrado correctamente la venta: \n Tiene una venta de " + textTotal.Text + " soles", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);

                }
                else
                {
                    return;
                }
            }

            return;

        }

        private void toolStripCancelar_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("¿Esta seguro que desear cancelar la venta?", "Confirmacion", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                estadoComponentes(estado.Inicial);
                
            }
            else {
                return;
            }
                
        }
    }
}
