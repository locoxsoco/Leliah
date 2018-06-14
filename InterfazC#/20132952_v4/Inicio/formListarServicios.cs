using LogicaNegocio;
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
    public partial class formListarServicios : Form
    {
        private ServicioBL logicaNegocio;
        private Servicio servicioSeleccionado;
        public formListarServicios()
        {
            InitializeComponent();
            logicaNegocio = new ServicioBL();
            servicioSeleccionado = new Servicio();
            dgvServicios.AutoGenerateColumns = false;
            dgvServicios.DataSource = logicaNegocio.listarServicios();
        }

        private void dgvProductos_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
        public Servicio ServicioSeleccionado { get => servicioSeleccionado; set => servicioSeleccionado = value; }
        private void btnSeleccionar_Click(object sender, EventArgs e)
        {
            servicioSeleccionado = (Servicio)dgvServicios.CurrentRow.DataBoundItem;
            this.DialogResult = DialogResult.OK;
        }

        private void formListarServicios_Load(object sender, EventArgs e)
        {

        }
    }
}
