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
    public partial class formListarClientesJuridicos : Form
    {
        private ClienteBL logicaNegocio;
        private Cliente clienteSeleccionado;
        private BindingList<Cliente> lista;
        private int posicion;
        public formListarClientesJuridicos()
        {
            InitializeComponent();
            logicaNegocio = new ClienteBL();
            lista = new BindingList<Cliente>();
            dgvClientesJuridicos.AutoGenerateColumns = false;
            lista = logicaNegocio.listarClientesJuridicos();
            dgvClientesJuridicos.DataSource = lista;
            btnSeleccionar.Enabled = false;
        }

        public Cliente ClienteSeleccionado { get => clienteSeleccionado; set => clienteSeleccionado = value; }
        private void btnSeleccionar_Click(object sender, EventArgs e)
        {
            try
            {
                clienteSeleccionado = (Cliente)dgvClientesJuridicos.CurrentRow.DataBoundItem;
                this.DialogResult = DialogResult.OK;
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Falta seleccionar cliente", "Mensaje", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
        }


        private void btnBuscar_Click(object sender, EventArgs e)
        {
            dgvClientesJuridicos.DataSource = logicaNegocio.buscarCliente(2, null,null, null, textRUC.Text, textRS.Text, null);
            if (dgvClientesJuridicos.Rows.Count == 0) btnSeleccionar.Enabled = false;
        }

        private void dgvClientesJuridicos_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            if (dgvClientesJuridicos.CurrentRow == null)
            {
                btnSeleccionar.Enabled = true;
            }
            else
            {
                btnSeleccionar.Enabled = true;
                posicion = (dgvClientesJuridicos.CurrentRow.Index);              
            }
        }


    }
}
