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

        private void BtnVentaInmediata_Click(object sender, EventArgs e)
        {
            this.Hide();
            formVentaInmediata NuevaVentana = new formVentaInmediata();
            NuevaVentana.Show();
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            System.Diagnostics.Process process = new System.Diagnostics.Process();
            System.Diagnostics.ProcessStartInfo startInfo = new System.Diagnostics.ProcessStartInfo();
            startInfo.WindowStyle = System.Diagnostics.ProcessWindowStyle.Hidden;
            startInfo.FileName = "cmd.exe";
            startInfo.Arguments = "/C java -jar ventanasProyecto.jar";
            process.StartInfo = startInfo;
            process.Start();
            Application.Exit();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process process = new System.Diagnostics.Process();
            System.Diagnostics.ProcessStartInfo startInfo = new System.Diagnostics.ProcessStartInfo();
            startInfo.WindowStyle = System.Diagnostics.ProcessWindowStyle.Hidden;
            startInfo.FileName = "cmd.exe";
            startInfo.Arguments = "/C java -jar ventanasProyecto.jar 1";
            process.StartInfo = startInfo;
            process.Start();
            Application.Exit();
        }
    }
}
