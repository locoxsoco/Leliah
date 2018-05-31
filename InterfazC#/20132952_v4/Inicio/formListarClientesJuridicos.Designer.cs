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
            this.btnSeleccionar = new System.Windows.Forms.Button();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.textRUC = new System.Windows.Forms.TextBox();
            this.textRS = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.dgvClientesJuridicos)).BeginInit();
            this.SuspendLayout();
            // 
            // dgvClientesJuridicos
            // 
            this.dgvClientesJuridicos.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvClientesJuridicos.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Column1,
            this.Column2,
            this.Column3});
            this.dgvClientesJuridicos.Location = new System.Drawing.Point(20, 132);
            this.dgvClientesJuridicos.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.dgvClientesJuridicos.Name = "dgvClientesJuridicos";
            this.dgvClientesJuridicos.RowTemplate.Height = 24;
            this.dgvClientesJuridicos.Size = new System.Drawing.Size(538, 122);
            this.dgvClientesJuridicos.TabIndex = 0;
            // 
            // Column1
            // 
            this.Column1.DataPropertyName = "IdCliente";
            this.Column1.HeaderText = "IdCliente";
            this.Column1.Name = "Column1";
            // 
            // Column2
            // 
            this.Column2.DataPropertyName = "Ruc";
            this.Column2.HeaderText = "RUC";
            this.Column2.Name = "Column2";
            // 
            // Column3
            // 
            this.Column3.DataPropertyName = "RazonSocial";
            this.Column3.HeaderText = "Razon Social";
            this.Column3.Name = "Column3";
            // 
            // btnSeleccionar
            // 
            this.btnSeleccionar.Location = new System.Drawing.Point(481, 49);
            this.btnSeleccionar.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.btnSeleccionar.Name = "btnSeleccionar";
            this.btnSeleccionar.Size = new System.Drawing.Size(76, 19);
            this.btnSeleccionar.TabIndex = 1;
            this.btnSeleccionar.Text = "Seleccionar";
            this.btnSeleccionar.UseVisualStyleBackColor = true;
            this.btnSeleccionar.Click += new System.EventHandler(this.btnSeleccionar_Click);
            // 
            // btnBuscar
            // 
            this.btnBuscar.Location = new System.Drawing.Point(375, 47);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(75, 23);
            this.btnBuscar.TabIndex = 2;
            this.btnBuscar.Text = "Buscar";
            this.btnBuscar.UseVisualStyleBackColor = true;
            this.btnBuscar.Click += new System.EventHandler(this.btnBuscar_Click);
            // 
            // textRUC
            // 
            this.textRUC.Location = new System.Drawing.Point(125, 47);
            this.textRUC.Name = "textRUC";
            this.textRUC.Size = new System.Drawing.Size(100, 20);
            this.textRUC.TabIndex = 3;
            // 
            // textRS
            // 
            this.textRS.Location = new System.Drawing.Point(125, 73);
            this.textRS.Name = "textRS";
            this.textRS.Size = new System.Drawing.Size(100, 20);
            this.textRS.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(39, 49);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(30, 13);
            this.label1.TabIndex = 5;
            this.label1.Text = "RUC";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(39, 80);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(70, 13);
            this.label2.TabIndex = 6;
            this.label2.Text = "Razón Social";
            // 
            // formListarClientesJuridicos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(600, 366);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textRS);
            this.Controls.Add(this.textRUC);
            this.Controls.Add(this.btnBuscar);
            this.Controls.Add(this.btnSeleccionar);
            this.Controls.Add(this.dgvClientesJuridicos);
            this.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.Name = "formListarClientesJuridicos";
            this.Text = "Clientes Juridicos";
            this.Load += new System.EventHandler(this.formListarClientesJuridicos_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dgvClientesJuridicos)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dgvClientesJuridicos;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column2;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column3;
        private System.Windows.Forms.Button btnSeleccionar;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.TextBox textRUC;
        private System.Windows.Forms.TextBox textRS;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
    }
}