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
        public formListarClientesJuridicos()
        {
            InitializeComponent();
            logicaNegocio = new ClienteBL();
            dgvClientesJuridicos.DataSource = logicaNegocio.listarClientesJuridicos();
        }

        public Cliente ClienteSeleccionado { get => clienteSeleccionado; set => clienteSeleccionado = value; }
        private void btnSeleccionar_Click(object sender, EventArgs e)
        {
            clienteSeleccionado = (Cliente)dgvClientesJuridicos.CurrentRow.DataBoundItem;
            this.DialogResult = DialogResult.OK;
        }

        private void formListarClientesJuridicos_Load(object sender, EventArgs e)
        {

        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            dgvClientesJuridicos.DataSource = logicaNegocio.buscarCliente(2, null,null, null, textRUC.Text, textRS.Text, null);
        }
    }
}
