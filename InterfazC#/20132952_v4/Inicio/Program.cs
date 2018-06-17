using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Inicio
{
    static class Program
    {
        /// <summary>
        /// Punto de entrada principal para la aplicación.
        /// </summary>
        [STAThread]
        static void Main(string[] args)
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            
            if(args.Length == 0)
            {
                Application.Exit();
            }
            else if(args.Length == 2)
            {
                VentanaVendedor v = new VentanaVendedor();
                v.button2.Visible = true;
                Application.Run(v);
            }
            else if (args.Length == 1)
            {
                VentanaVendedor v = new VentanaVendedor();
                v.button2.Visible = false;
                Application.Run(v);
            }
            
        }
    }
}
