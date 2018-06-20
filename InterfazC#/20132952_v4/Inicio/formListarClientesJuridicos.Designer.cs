namespace Inicio
{
    partial class formListarClientesJuridicos
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
            this.dgvClientesJuridicos = new System.Windows.Forms.DataGridView();
            this.Column1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.textRUC = new System.Windows.Forms.TextBox();
            this.textRS = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.btnSeleccionar = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dgvClientesJuridicos)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // dgvClientesJuridicos
            // 
            this.dgvClientesJuridicos.AllowUserToAddRows = false;
            this.dgvClientesJuridicos.AllowUserToDeleteRows = false;
            this.dgvClientesJuridicos.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvClientesJuridicos.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Column1,
            this.Column2,
            this.Column3});
            this.dgvClientesJuridicos.Location = new System.Drawing.Point(37, 186);
            this.dgvClientesJuridicos.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.dgvClientesJuridicos.Name = "dgvClientesJuridicos";
            this.dgvClientesJuridicos.ReadOnly = true;
            this.dgvClientesJuridicos.RowTemplate.Height = 24;
            this.dgvClientesJuridicos.Size = new System.Drawing.Size(424, 150);
            this.dgvClientesJuridicos.TabIndex = 0;
            this.dgvClientesJuridicos.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgvClientesJuridicos_CellClick);
            // 
            // Column1
            // 
            this.Column1.DataPropertyName = "IdCliente";
            this.Column1.HeaderText = "IdCliente";
            this.Column1.Name = "Column1";
            this.Column1.ReadOnly = true;
            // 
            // Column2
            // 
            this.Column2.DataPropertyName = "Ruc";
            this.Column2.HeaderText = "RUC";
            this.Column2.Name = "Column2";
            this.Column2.ReadOnly = true;
            this.Column2.Width = 150;
            // 
            // Column3
            // 
            this.Column3.DataPropertyName = "RazonSocial";
            this.Column3.HeaderText = "Razon Social";
            this.Column3.Name = "Column3";
            this.Column3.ReadOnly = true;
            this.Column3.Width = 150;
            // 
            // textRUC
            // 
            this.textRUC.Location = new System.Drawing.Point(148, 38);
            this.textRUC.Margin = new System.Windows.Forms.Padding(4);
            this.textRUC.MaxLength = 11;
            this.textRUC.Name = "textRUC";
            this.textRUC.Size = new System.Drawing.Size(160, 22);
            this.textRUC.TabIndex = 3;
            // 
            // textRS
            // 
            this.textRS.Location = new System.Drawing.Point(148, 72);
            this.textRS.Margin = new System.Windows.Forms.Padding(4);
            this.textRS.MaxLength = 8;
            this.textRS.Name = "textRS";
            this.textRS.Size = new System.Drawing.Size(160, 22);
            this.textRS.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(34, 41);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(37, 17);
            this.label1.TabIndex = 5;
            this.label1.Text = "RUC";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(34, 72);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(91, 17);
            this.label2.TabIndex = 6;
            this.label2.Text = "Razón Social";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::Inicio.Properties.Resources.cliente2;
            this.pictureBox1.Location = new System.Drawing.Point(343, 29);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(118, 108);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 7;
            this.pictureBox1.TabStop = false;
            // 
            // btnBuscar
            // 
            this.btnBuscar.Image = global::Inicio.Properties.Resources.buscar;
            this.btnBuscar.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnBuscar.Location = new System.Drawing.Point(213, 124);
            this.btnBuscar.Margin = new System.Windows.Forms.Padding(4);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(95, 37);
            this.btnBuscar.TabIndex = 2;
            this.btnBuscar.Text = "Buscar";
            this.btnBuscar.UseVisualStyleBackColor = true;
            this.btnBuscar.Click += new System.EventHandler(this.btnBuscar_Click);
            // 
            // btnSeleccionar
            // 
            this.btnSeleccionar.Image = global::Inicio.Properties.Resources.seleccionar;
            this.btnSeleccionar.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnSeleccionar.Location = new System.Drawing.Point(343, 357);
            this.btnSeleccionar.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btnSeleccionar.Name = "btnSeleccionar";
            this.btnSeleccionar.Size = new System.Drawing.Size(118, 41);
            this.btnSeleccionar.TabIndex = 1;
            this.btnSeleccionar.Text = "Seleccionar";
            this.btnSeleccionar.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.btnSeleccionar.UseVisualStyleBackColor = true;
            this.btnSeleccionar.Click += new System.EventHandler(this.btnSeleccionar_Click);
            // 
            // formListarClientesJuridicos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(509, 422);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textRS);
            this.Controls.Add(this.textRUC);
            this.Controls.Add(this.btnBuscar);
            this.Controls.Add(this.btnSeleccionar);
            this.Controls.Add(this.dgvClientesJuridicos);
            this.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Name = "formListarClientesJuridicos";
            this.Text = "Buscar empresa";
            ((System.ComponentModel.ISupportInitialize)(this.dgvClientesJuridicos)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dgvClientesJuridicos;
        private System.Windows.Forms.Button btnSeleccionar;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.TextBox textRUC;
        private System.Windows.Forms.TextBox textRS;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column2;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column3;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}