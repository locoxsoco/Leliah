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
    public partial class formListarClientesNatural : Form
    {
        private ClienteBL logicaNegocio;
        private Cliente clienteSeleccionado;
        private BindingList<Cliente> lista;
        private int posicion;
        public formListarClientesNatural()
        {
            InitializeComponent();
            logicaNegocio = new ClienteBL();
            lista = new BindingList<Cliente>();
            dgvClientesNaturales.AutoGenerateColumns = false;
            lista = logicaNegocio.listarClientesNaturales();
            dgvClientesNaturales.DataSource = lista;
            btnSeleccionar.Enabled = false;

        }
        public Cliente ClienteSeleccionado { get => clienteSeleccionado; set => clienteSeleccionado = value; }
        private void dgvClientes_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void btnSeleccionar_Click(object sender, EventArgs e)
        {
            try {
                clienteSeleccionado = (Cliente)dgvClientesNaturales.CurrentRow.DataBoundItem;
                this.DialogResult = DialogResult.OK;
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Falta seleccionar cliente", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return;
            }
            
        }

        private void formListarClientesNatural_Load(object sender, EventArgs e)
        {

        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {


            dgvClientesNaturales.DataSource = logicaNegocio.buscarCliente(1, textNombre.Text, textApellMat.Text, textApellPat.Text, null, null, textNumDoc.Text);
            if (dgvClientesNaturales.Rows.Count == 0) btnSeleccionar.Enabled = false;
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void dgvClientesNaturales_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            btnSeleccionar.Enabled = true;
            if (dgvClientesNaturales.CurrentRow == null)
            {
                textNombre.Text = "";
                textNumDoc.Text = "";
                textApellMat.Text = "";
                textApellPat.Text = "";
                btnSeleccionar.Enabled = false;
            }
            else
            {
                posicion = (dgvClientesNaturales.CurrentRow.Index);
                textNombre.Text = lista[posicion].Nombre;
                textNumDoc.Text = lista[posicion].NumDocumento;
                textApellMat.Text = lista[posicion].ApellidoMaterno;
                textApellPat.Text = lista[posicion].ApellidoPaterno;
            }
        }
    }
}
