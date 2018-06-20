namespace Inicio
{
    partial class Actualizar_Venta_Detallada
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Actualizar_Venta_Detallada));
            this.label1 = new System.Windows.Forms.Label();
            this.textNroComprobante = new System.Windows.Forms.TextBox();
            this.btnBuscarVA = new System.Windows.Forms.Button();
            this.textTotal = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.textSaldo = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.textEstado = new System.Windows.Forms.TextBox();
            this.btnActualizarVD = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.textCliente = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.textMonto = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.btnSalir = new System.Windows.Forms.Button();
            this.radioBtnBoleta = new System.Windows.Forms.RadioButton();
            this.radioBtnFactura = new System.Windows.Forms.RadioButton();
            this.label10 = new System.Windows.Forms.Label();
            this.textAdelanto = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(21, 29);
            this.label1.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(118, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "Nro comprobante";
            // 
            // textNroComprobante
            // 
            this.textNroComprobante.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textNroComprobante.Location = new System.Drawing.Point(143, 29);
            this.textNroComprobante.Margin = new System.Windows.Forms.Padding(2);
            this.textNroComprobante.MaxLength = 6;
            this.textNroComprobante.Name = "textNroComprobante";
            this.textNroComprobante.Size = new System.Drawing.Size(151, 23);
            this.textNroComprobante.TabIndex = 1;
            this.textNroComprobante.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textNroComprobante_KeyPress);
            // 
            // btnBuscarVA
            // 
            this.btnBuscarVA.Image = ((System.Drawing.Image)(resources.GetObject("btnBuscarVA.Image")));
            this.btnBuscarVA.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnBuscarVA.Location = new System.Drawing.Point(333, 43);
            this.btnBuscarVA.Name = "btnBuscarVA";
            this.btnBuscarVA.Size = new System.Drawing.Size(70, 26);
            this.btnBuscarVA.TabIndex = 2;
            this.btnBuscarVA.Text = "Buscar";
            this.btnBuscarVA.UseVisualStyleBackColor = true;
            this.btnBuscarVA.Click += new System.EventHandler(this.btnBuscarVA_Click);
            // 
            // textTotal
            // 
            this.textTotal.Enabled = false;
            this.textTotal.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textTotal.Location = new System.Drawing.Point(143, 162);
            this.textTotal.Margin = new System.Windows.Forms.Padding(2);
            this.textTotal.Name = "textTotal";
            this.textTotal.Size = new System.Drawing.Size(75, 23);
            this.textTotal.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(46, 232);
            this.label2.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(44, 17);
            this.label2.TabIndex = 4;
            this.label2.Text = "Saldo";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(46, 162);
            this.label3.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(40, 17);
            this.label3.TabIndex = 5;
            this.label3.Text = "Total";
            // 
            // textSaldo
            // 
            this.textSaldo.Enabled = false;
            this.textSaldo.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textSaldo.Location = new System.Drawing.Point(143, 229);
            this.textSaldo.Margin = new System.Windows.Forms.Padding(2);
            this.textSaldo.Name = "textSaldo";
            this.textSaldo.Size = new System.Drawing.Size(75, 23);
            this.textSaldo.TabIndex = 6;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(46, 281);
            this.label4.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(52, 17);
            this.label4.TabIndex = 8;
            this.label4.Text = "Estado";
            // 
            // textEstado
            // 
            this.textEstado.Enabled = false;
            this.textEstado.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textEstado.Location = new System.Drawing.Point(143, 275);
            this.textEstado.Margin = new System.Windows.Forms.Padding(2);
            this.textEstado.Name = "textEstado";
            this.textEstado.Size = new System.Drawing.Size(104, 23);
            this.textEstado.TabIndex = 9;
            // 
            // btnActualizarVD
            // 
            this.btnActualizarVD.Enabled = false;
            this.btnActualizarVD.Image = ((System.Drawing.Image)(resources.GetObject("btnActualizarVD.Image")));
            this.btnActualizarVD.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnActualizarVD.Location = new System.Drawing.Point(280, 281);
            this.btnActualizarVD.Margin = new System.Windows.Forms.Padding(2);
            this.btnActualizarVD.Name = "btnActualizarVD";
            this.btnActualizarVD.Size = new System.Drawing.Size(90, 28);
            this.btnActualizarVD.TabIndex = 26;
            this.btnActualizarVD.Text = "Actualizar";
            this.btnActualizarVD.UseVisualStyleBackColor = true;
            this.btnActualizarVD.Click += new System.EventHandler(this.btnActualizarVD_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(46, 124);
            this.label5.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(51, 17);
            this.label5.TabIndex = 27;
            this.label5.Text = "Cliente";
            // 
            // textCliente
            // 
            this.textCliente.Enabled = false;
            this.textCliente.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textCliente.Location = new System.Drawing.Point(143, 118);
            this.textCliente.Margin = new System.Windows.Forms.Padding(2);
            this.textCliente.Name = "textCliente";
            this.textCliente.Size = new System.Drawing.Size(151, 23);
            this.textCliente.TabIndex = 28;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(11, 326);
            this.label6.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(103, 17);
            this.label6.TabIndex = 29;
            this.label6.Text = "Ingresar monto";
            // 
            // textMonto
            // 
            this.textMonto.Enabled = false;
            this.textMonto.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textMonto.Location = new System.Drawing.Point(156, 326);
            this.textMonto.Margin = new System.Windows.Forms.Padding(2);
            this.textMonto.MaxLength = 10;
            this.textMonto.Name = "textMonto";
            this.textMonto.Size = new System.Drawing.Size(91, 23);
            this.textMonto.TabIndex = 30;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(114, 232);
            this.label7.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(25, 17);
            this.label7.TabIndex = 31;
            this.label7.Text = "S/.";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label8.Location = new System.Drawing.Point(114, 165);
            this.label8.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(25, 17);
            this.label8.TabIndex = 32;
            this.label8.Text = "S/.";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label9.Location = new System.Drawing.Point(127, 332);
            this.label9.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(25, 17);
            this.label9.TabIndex = 33;
            this.label9.Text = "S/.";
            // 
            // btnSalir
            // 
            this.btnSalir.Image = global::Inicio.Properties.Resources.salir;
            this.btnSalir.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnSalir.Location = new System.Drawing.Point(383, 332);
            this.btnSalir.Margin = new System.Windows.Forms.Padding(2);
            this.btnSalir.Name = "btnSalir";
            this.btnSalir.Size = new System.Drawing.Size(89, 42);
            this.btnSalir.TabIndex = 34;
            this.btnSalir.Text = "     Salir";
            this.btnSalir.UseVisualStyleBackColor = true;
            this.btnSalir.Click += new System.EventHandler(this.btnSalir_Click);
            // 
            // radioBtnBoleta
            // 
            this.radioBtnBoleta.AutoSize = true;
            this.radioBtnBoleta.Checked = true;
            this.radioBtnBoleta.Location = new System.Drawing.Point(54, 68);
            this.radioBtnBoleta.Name = "radioBtnBoleta";
            this.radioBtnBoleta.Size = new System.Drawing.Size(55, 17);
            this.radioBtnBoleta.TabIndex = 35;
            this.radioBtnBoleta.TabStop = true;
            this.radioBtnBoleta.Text = "Boleta";
            this.radioBtnBoleta.UseVisualStyleBackColor = true;
            this.radioBtnBoleta.CheckedChanged += new System.EventHandler(this.radioBtnBoleta_CheckedChanged);
            // 
            // radioBtnFactura
            // 
            this.radioBtnFactura.AutoSize = true;
            this.radioBtnFactura.Location = new System.Drawing.Point(194, 68);
            this.radioBtnFactura.Name = "radioBtnFactura";
            this.radioBtnFactura.Size = new System.Drawing.Size(61, 17);
            this.radioBtnFactura.TabIndex = 36;
            this.radioBtnFactura.Text = "Factura";
            this.radioBtnFactura.UseVisualStyleBackColor = true;
            this.radioBtnFactura.CheckedChanged += new System.EventHandler(this.radioBtnFactura_CheckedChanged);
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(46, 197);
            this.label10.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(64, 17);
            this.label10.TabIndex = 37;
            this.label10.Text = "Adelanto";
            // 
            // textAdelanto
            // 
            this.textAdelanto.Enabled = false;
            this.textAdelanto.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textAdelanto.Location = new System.Drawing.Point(143, 194);
            this.textAdelanto.Margin = new System.Windows.Forms.Padding(2);
            this.textAdelanto.Name = "textAdelanto";
            this.textAdelanto.Size = new System.Drawing.Size(75, 23);
            this.textAdelanto.TabIndex = 38;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label11.Location = new System.Drawing.Point(114, 200);
            this.label11.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(25, 17);
            this.label11.TabIndex = 39;
            this.label11.Text = "S/.";
            // 
            // Actualizar_Venta_Detallada
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(483, 385);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.textAdelanto);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.radioBtnFactura);
            this.Controls.Add(this.radioBtnBoleta);
            this.Controls.Add(this.btnSalir);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.textMonto);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.textCliente);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.btnActualizarVD);
            this.Controls.Add(this.textEstado);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.textSaldo);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textTotal);
            this.Controls.Add(this.btnBuscarVA);
            this.Controls.Add(this.textNroComprobante);
            this.Controls.Add(this.label1);
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "Actualizar_Venta_Detallada";
            this.Text = "Actualiza venta detallada";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textNroComprobante;
        private System.Windows.Forms.Button btnBuscarVA;
        private System.Windows.Forms.TextBox textTotal;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox textSaldo;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox textEstado;
        private System.Windows.Forms.Button btnActualizarVD;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox textCliente;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox textMonto;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Button btnSalir;
        private System.Windows.Forms.RadioButton radioBtnBoleta;
        private System.Windows.Forms.RadioButton radioBtnFactura;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox textAdelanto;
        private System.Windows.Forms.Label label11;
    }
}