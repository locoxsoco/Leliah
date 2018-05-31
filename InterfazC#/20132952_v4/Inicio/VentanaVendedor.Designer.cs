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
            this.btnRegVenta = new System.Windows.Forms.Button();
            this.labelBienvenida = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // btnRegVenta
            // 
            this.btnRegVenta.Location = new System.Drawing.Point(21, 247);
            this.btnRegVenta.Name = "btnRegVenta";
            this.btnRegVenta.Size = new System.Drawing.Size(103, 23);
            this.btnRegVenta.TabIndex = 0;
            this.btnRegVenta.Text = "Registrar venta";
            this.btnRegVenta.UseVisualStyleBackColor = true;
            this.btnRegVenta.Click += new System.EventHandler(this.btnRegVenta_Click);
            // 
            // labelBienvenida
            // 
            this.labelBienvenida.AutoSize = true;
            this.labelBienvenida.BackColor = System.Drawing.Color.Transparent;
            this.labelBienvenida.Font = new System.Drawing.Font("Trebuchet MS", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelBienvenida.Location = new System.Drawing.Point(0, 4);
            this.labelBienvenida.Name = "labelBienvenida";
            this.labelBienvenida.Size = new System.Drawing.Size(173, 22);
            this.labelBienvenida.TabIndex = 1;
            this.labelBienvenida.Text = "Bienvenido vendedor ";
            this.labelBienvenida.Click += new System.EventHandler(this.labelBienvenida_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(-15, 48);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(454, 143);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 2;
            this.pictureBox1.TabStop = false;
            // 
            // VentanaVendedor
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlLight;
            this.ClientSize = new System.Drawing.Size(428, 334);
            this.Controls.Add(this.labelBienvenida);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.btnRegVenta);
            this.Name = "VentanaVendedor";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "VentanaVendedor";
            this.Load += new System.EventHandler(this.VentanaVendedor_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnRegVenta;
        private System.Windows.Forms.Label labelBienvenida;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}