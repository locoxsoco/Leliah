namespace Inicio
{
    partial class formListarClientesNatural
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
            this.dgvClientesNaturales = new System.Windows.Forms.DataGridView();
            this.Column1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column5 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.btnSeleccionar = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.textNumDoc = new System.Windows.Forms.TextBox();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.textApellPat = new System.Windows.Forms.TextBox();
            this.textApellMat = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.textNombre = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.dgvClientesNaturales)).BeginInit();
            this.SuspendLayout();
            // 
            // dgvClientesNaturales
            // 
            this.dgvClientesNaturales.AllowUserToAddRows = false;
            this.dgvClientesNaturales.AllowUserToDeleteRows = false;
            this.dgvClientesNaturales.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvClientesNaturales.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Column1,
            this.Column2,
            this.Column3,
            this.Column5,
            this.Column4});
            this.dgvClientesNaturales.Location = new System.Drawing.Point(28, 198);
            this.dgvClientesNaturales.Name = "dgvClientesNaturales";
            this.dgvClientesNaturales.ReadOnly = true;
            this.dgvClientesNaturales.Size = new System.Drawing.Size(649, 150);
            this.dgvClientesNaturales.TabIndex = 0;
            this.dgvClientesNaturales.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgvClientes_CellContentClick);
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
            this.Column2.DataPropertyName = "NumDocumento";
            this.Column2.HeaderText = "Documento";
            this.Column2.Name = "Column2";
            this.Column2.ReadOnly = true;
            // 
            // Column3
            // 
            this.Column3.DataPropertyName = "Nombre";
            this.Column3.HeaderText = "Nombre";
            this.Column3.Name = "Column3";
            this.Column3.ReadOnly = true;
            // 
            // Column5
            // 
            this.Column5.DataPropertyName = "ApellidoPaterno";
            this.Column5.HeaderText = "Apellido Paterno";
            this.Column5.Name = "Column5";
            this.Column5.ReadOnly = true;
            // 
            // Column4
            // 
            this.Column4.DataPropertyName = "ApellidoMaterno";
            this.Column4.HeaderText = "Apellido Materno";
            this.Column4.Name = "Column4";
            this.Column4.ReadOnly = true;
            // 
            // btnSeleccionar
            // 
            this.btnSeleccionar.Location = new System.Drawing.Point(441, 46);
            this.btnSeleccionar.Name = "btnSeleccionar";
            this.btnSeleccionar.Size = new System.Drawing.Size(75, 23);
            this.btnSeleccionar.TabIndex = 1;
            this.btnSeleccionar.Text = "Seleccionar";
            this.btnSeleccionar.UseVisualStyleBackColor = true;
            this.btnSeleccionar.Click += new System.EventHandler(this.btnSeleccionar_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 48);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(108, 13);
            this.label1.TabIndex = 2;
            this.label1.Text = "Numero Docuemento";
            // 
            // textNumDoc
            // 
            this.textNumDoc.Location = new System.Drawing.Point(144, 48);
            this.textNumDoc.Name = "textNumDoc";
            this.textNumDoc.Size = new System.Drawing.Size(100, 20);
            this.textNumDoc.TabIndex = 3;
            // 
            // btnBuscar
            // 
            this.btnBuscar.Location = new System.Drawing.Point(332, 46);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(75, 23);
            this.btnBuscar.TabIndex = 4;
            this.btnBuscar.Text = "Buscar";
            this.btnBuscar.UseVisualStyleBackColor = true;
            this.btnBuscar.Click += new System.EventHandler(this.btnBuscar_Click);
            // 
            // textApellPat
            // 
            this.textApellPat.Location = new System.Drawing.Point(144, 103);
            this.textApellPat.Name = "textApellPat";
            this.textApellPat.Size = new System.Drawing.Size(100, 20);
            this.textApellPat.TabIndex = 5;
            // 
            // textApellMat
            // 
            this.textApellMat.Location = new System.Drawing.Point(144, 136);
            this.textApellMat.Name = "textApellMat";
            this.textApellMat.Size = new System.Drawing.Size(100, 20);
            this.textApellMat.TabIndex = 6;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(16, 106);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(84, 13);
            this.label2.TabIndex = 7;
            this.label2.Text = "Apellido Paterno";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(14, 136);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(86, 13);
            this.label3.TabIndex = 8;
            this.label3.Text = "Apellido Materno";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(14, 73);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(44, 13);
            this.label4.TabIndex = 9;
            this.label4.Text = "Nombre";
            this.label4.Click += new System.EventHandler(this.label4_Click);
            // 
            // textNombre
            // 
            this.textNombre.Location = new System.Drawing.Point(144, 74);
            this.textNombre.Name = "textNombre";
            this.textNombre.Size = new System.Drawing.Size(100, 20);
            this.textNombre.TabIndex = 10;
            // 
            // formListarClientesNatural
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(763, 451);
            this.Controls.Add(this.textNombre);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textApellMat);
            this.Controls.Add(this.textApellPat);
            this.Controls.Add(this.btnBuscar);
            this.Controls.Add(this.textNumDoc);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnSeleccionar);
            this.Controls.Add(this.dgvClientesNaturales);
            this.Name = "formListarClientesNatural";
            this.Text = "Cliente Naturales";
            this.Load += new System.EventHandler(this.formListarClientesNatural_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dgvClientesNaturales)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dgvClientesNaturales;
        private System.Windows.Forms.Button btnSeleccionar;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column2;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column3;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column5;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column4;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textNumDoc;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.TextBox textApellPat;
        private System.Windows.Forms.TextBox textApellMat;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox textNombre;
    }
}