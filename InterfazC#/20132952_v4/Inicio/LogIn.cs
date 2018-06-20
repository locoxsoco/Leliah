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
    public partial class LogIn : Form
    {
        private TrabajadorBL logicaNegocio;
        public LogIn()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {

            logicaNegocio = new TrabajadorBL();
            int privi = logicaNegocio.validarUsuario(txtUsuario.Text, txtContrasenha.Text);
            if (privi==3) {
                //MessageBox.Show("Se ha iniciado sesion");
                this.Hide();
                //this.Dispose();
                VentanaVendedor NuevaVentana = new VentanaVendedor();
                NuevaVentana.Show();
            }
            else {
                MessageBox.Show("Error en el usario o contraseña: Intente de nuevo");
                txtUsuario.Text = "";
                txtContrasenha.Text = "";
                txtUsuario.Focus();
            }
        }
        


        private void btnCerrar_Click(object sender, EventArgs e)
        {

        }

        private void txtUsuario_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click_1(object sender, EventArgs e)
        {

        }

        private void LogIn_Load(object sender, EventArgs e)
        {

        }
    }
}
