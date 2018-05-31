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
    public partial class VentanaVendedor : Form
    {
       
        
        public VentanaVendedor()
        {
            InitializeComponent();
        }

        private void btnRegVenta_Click(object sender, EventArgs e)
        {
            this.Hide();
            Registrar_Venta NuevaVentana = new Registrar_Venta();
            NuevaVentana.Show();
        }

        private void labelBienvenida_Click(object sender, EventArgs e)
        {

        }

        private void VentanaVendedor_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

        }
    }
}
