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
    public partial class frmListarProductos : Form
    {
        private ProductoBL logicaNegocio;
        private StockXProducto productoStockSeleccionado;
        private BindingList<StockXProducto> lista;
        int cons;
        int posicion;
        public frmListarProductos()
        {
            InitializeComponent();
            logicaNegocio = new ProductoBL();
            productoStockSeleccionado = new StockXProducto();
            lista = new BindingList<StockXProducto>();
            lista = logicaNegocio.listarProductosStock(-1, textNombre.Text, textMarca.Text, textCategoria.Text);
            dgvProductos.DataSource = lista;
            btnSeleccionar.Enabled = false;
            //dgvProductos.DataSource = logicaNegocio.listarProductos();
        }

 

        public StockXProducto ProductoStockSeleccionado { get => productoStockSeleccionado; set => productoStockSeleccionado = value; }

        private void btnSeleccionar_Click(object sender, EventArgs e)
        {
            try
            {
                productoStockSeleccionado = (StockXProducto)dgvProductos.CurrentRow.DataBoundItem;
                this.DialogResult = DialogResult.OK;
            }
            catch (Exception ex) {
                MessageBox.Show(this, "Falta seleccionar producto", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            
        }

        private void dgvProductos_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {

            if (radioBtnC.Checked == true) cons = 1;
            else if (radioBtnNC.Checked == true) cons = 0;
            dgvProductos.DataSource = logicaNegocio.listarProductosStock(cons, textNombre.Text,textMarca.Text,textCategoria.Text);

            if (dgvProductos.Rows.Count == 0) btnSeleccionar.Enabled = false;

        }

        private void frmListarProductos_Load(object sender, EventArgs e)
        {

        }

        private void dgvProductos_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            btnSeleccionar.Enabled = true;
            if (dgvProductos.CurrentRow == null) {
                textNombre.Text = "";
                textMarca.Text = "";
                textCategoria.Text = "";
                btnSeleccionar.Enabled = false;
            }
            else {
                posicion = (dgvProductos.CurrentRow.Index);
                textNombre.Text = lista[posicion].Nombre;
                textMarca.Text = lista[posicion].Marca;
                textCategoria.Text = lista[posicion].Categoria;
            }
            

        }

        private void radioBtnNC_CheckedChanged(object sender, EventArgs e)
        {
            textNombre.Text = "";
            textMarca.Text = "";
            textCategoria.Text = "";
        }

        private void radioBtnC_CheckedChanged(object sender, EventArgs e)
        {
            textNombre.Text = "";
            textMarca.Text = "";
            textCategoria.Text = "";
        }

        private void frmListarProductos_MouseClick(object sender, MouseEventArgs e)
        {

        }

        private void dgvProductos_CellMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
        }

        private void dgvProductos_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            return;
        }
    }
}
