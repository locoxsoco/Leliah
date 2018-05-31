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
        public formListarClientesNatural()
        {
            InitializeComponent();
            logicaNegocio = new ClienteBL();
            dgvClientesNaturales.DataSource = logicaNegocio.listarClientesNaturales();

        }
        public Cliente ClienteSeleccionado { get => clienteSeleccionado; set => clienteSeleccionado = value; }
        private void dgvClientes_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void btnSeleccionar_Click(object sender, EventArgs e)
        {
            clienteSeleccionado = (Cliente)dgvClientesNaturales.CurrentRow.DataBoundItem;
            this.DialogResult = DialogResult.OK;
        }

        private void formListarClientesNatural_Load(object sender, EventArgs e)
        {

        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {


            dgvClientesNaturales.DataSource = logicaNegocio.buscarCliente(1, textNombre.Text, textApellMat.Text, textApellPat.Text, null, null, textNumDoc.Text);
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }
    }
}
