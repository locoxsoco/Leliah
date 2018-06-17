namespace Inicio
{
    partial class VentanaVendedor
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(VentanaVendedor));
            this.panelMenu = new System.Windows.Forms.Panel();
            this.btnRegVenta = new System.Windows.Forms.Button();
            this.BtnVentaInmediata = new System.Windows.Forms.Button();
            this.panelCabecera = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.button2 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.panelMenu.SuspendLayout();
            this.panelCabecera.SuspendLayout();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // panelMenu
            // 
            this.panelMenu.BackColor = System.Drawing.Color.RosyBrown;
            this.panelMenu.Controls.Add(this.pictureBox2);
            this.panelMenu.Controls.Add(this.btnRegVenta);
            this.panelMenu.Controls.Add(this.BtnVentaInmediata);
            this.panelMenu.Dock = System.Windows.Forms.DockStyle.Left;
            this.panelMenu.Location = new System.Drawing.Point(0, 0);
            this.panelMenu.Name = "panelMenu";
            this.panelMenu.Size = new System.Drawing.Size(277, 632);
            this.panelMenu.TabIndex = 6;
            // 
            // btnRegVenta
            // 
            this.btnRegVenta.FlatAppearance.BorderSize = 0;
            this.btnRegVenta.FlatAppearance.MouseOverBackColor = System.Drawing.Color.SeaShell;
            this.btnRegVenta.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnRegVenta.Font = new System.Drawing.Font("Segoe UI Emoji", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRegVenta.Image = ((System.Drawing.Image)(resources.GetObject("btnRegVenta.Image")));
            this.btnRegVenta.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnRegVenta.Location = new System.Drawing.Point(4, 450);
            this.btnRegVenta.Margin = new System.Windows.Forms.Padding(4);
            this.btnRegVenta.Name = "btnRegVenta";
            this.btnRegVenta.Size = new System.Drawing.Size(324, 51);
            this.btnRegVenta.TabIndex = 0;
            this.btnRegVenta.Text = "Venta Detallada";
            this.btnRegVenta.UseVisualStyleBackColor = true;
            this.btnRegVenta.Click += new System.EventHandler(this.btnRegVenta_Click);
            // 
            // BtnVentaInmediata
            // 
            this.BtnVentaInmediata.FlatAppearance.BorderSize = 0;
            this.BtnVentaInmediata.FlatAppearance.MouseOverBackColor = System.Drawing.Color.SeaShell;
            this.BtnVentaInmediata.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.BtnVentaInmediata.Font = new System.Drawing.Font("Segoe UI Emoji", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BtnVentaInmediata.Image = ((System.Drawing.Image)(resources.GetObject("BtnVentaInmediata.Image")));
            this.BtnVentaInmediata.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.BtnVentaInmediata.Location = new System.Drawing.Point(0, 377);
            this.BtnVentaInmediata.Name = "BtnVentaInmediata";
            this.BtnVentaInmediata.Size = new System.Drawing.Size(328, 53);
            this.BtnVentaInmediata.TabIndex = 3;
            this.BtnVentaInmediata.Text = "Venta rapida";
            this.BtnVentaInmediata.UseVisualStyleBackColor = true;
            this.BtnVentaInmediata.Click += new System.EventHandler(this.BtnVentaInmediata_Click);
            // 
            // panelCabecera
            // 
            this.panelCabecera.BackColor = System.Drawing.Color.Brown;
            this.panelCabecera.Controls.Add(this.label1);
            this.panelCabecera.Location = new System.Drawing.Point(0, 39);
            this.panelCabecera.Name = "panelCabecera";
            this.panelCabecera.Size = new System.Drawing.Size(898, 78);
            this.panelCabecera.TabIndex = 7;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Segoe UI Emoji", 22.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.label1.Location = new System.Drawing.Point(394, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(345, 51);
            this.label1.TabIndex = 0;
            this.label1.Text = "Sistema de Ventas";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.pictureBox1);
            this.panel1.Controls.Add(this.button2);
            this.panel1.Controls.Add(this.button1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel1.Location = new System.Drawing.Point(277, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(620, 632);
            this.panel1.TabIndex = 8;
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = global::Inicio.Properties.Resources.libreria;
            this.pictureBox2.InitialImage = global::Inicio.Properties.Resources.libreria;
            this.pictureBox2.Location = new System.Drawing.Point(-7, 165);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(284, 160);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 6;
            this.pictureBox2.TabStop = false;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(135, 178);
            this.pictureBox1.Margin = new System.Windows.Forms.Padding(4);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(401, 308);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 2;
            this.pictureBox1.TabStop = false;
            // 
            // button2
            // 
            this.button2.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.button2.Font = new System.Drawing.Font("Segoe UI Emoji", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button2.Image = global::Inicio.Properties.Resources.volver;
            this.button2.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button2.Location = new System.Drawing.Point(254, 557);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(95, 48);
            this.button2.TabIndex = 5;
            this.button2.Text = "Volver";
            this.button2.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.button2.UseVisualStyleBackColor = false;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.button1.Font = new System.Drawing.Font("Segoe UI Emoji", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Image = global::Inicio.Properties.Resources.logout;
            this.button1.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button1.Location = new System.Drawing.Point(422, 557);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(159, 48);
            this.button1.TabIndex = 4;
            this.button1.Text = "  Cerrar Sesión";
            this.button1.UseVisualStyleBackColor = false;
            this.button1.Click += new System.EventHandler(this.button1_Click_1);
            // 
            // VentanaVendedor
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlLight;
            this.ClientSize = new System.Drawing.Size(897, 632);
            this.Controls.Add(this.panelCabecera);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.panelMenu);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "VentanaVendedor";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "VentanaVendedor";
            this.Load += new System.EventHandler(this.VentanaVendedor_Load);
            this.panelMenu.ResumeLayout(false);
            this.panelCabecera.ResumeLayout(false);
            this.panelCabecera.PerformLayout();
            this.panel1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnRegVenta;
        private System.Windows.Forms.Button BtnVentaInmediata;
        private System.Windows.Forms.Button button1;
        public System.Windows.Forms.Button button2;
        private System.Windows.Forms.Panel panelMenu;
        private System.Windows.Forms.Panel panelCabecera;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.PictureBox pictureBox2;
    }
}