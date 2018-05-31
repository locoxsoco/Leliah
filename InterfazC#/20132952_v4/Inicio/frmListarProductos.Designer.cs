namespace Inicio
{
    partial class frmListarProductos
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
            this.btnSeleccionar = new System.Windows.Forms.Button();
            this.dgvProductos = new System.Windows.Forms.DataGridView();
            this.Column1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Marca = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Descripcion = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Stock = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.FechaCaducidad = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.textNombre = new System.Windows.Forms.TextBox();
            this.textMarca = new System.Windows.Forms.TextBox();
            this.textCategoria = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.radioBtnC = new System.Windows.Forms.RadioButton();
            this.radioBtnNC = new System.Windows.Forms.RadioButton();
            ((System.ComponentModel.ISupportInitialize)(this.dgvProductos)).BeginInit();
            this.SuspendLayout();
            // 
            // btnSeleccionar
            // 
            this.btnSeleccionar.Location = new System.Drawing.Point(816, 193);
            this.btnSeleccionar.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btnSeleccionar.Name = "btnSeleccionar";
            this.btnSeleccionar.Size = new System.Drawing.Size(100, 28);
            this.btnSeleccionar.TabIndex = 0;
            this.btnSeleccionar.Text = "Seleccionar";
            this.btnSeleccionar.UseVisualStyleBackColor = true;
            this.btnSeleccionar.Click += new System.EventHandler(this.btnSeleccionar_Click);
            // 
            // dgvProductos
            // 
            this.dgvProductos.AllowUserToAddRows = false;
            this.dgvProductos.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvProductos.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Column1,
            this.Column2,
            this.Column3,
            this.Column4,
            this.Marca,
            this.Descripcion,
            this.Stock,
            this.FechaCaducidad});
            this.dgvProductos.Location = new System.Drawing.Point(45, 245);
            this.dgvProductos.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.dgvProductos.Name = "dgvProductos";
            this.dgvProductos.Size = new System.Drawing.Size(883, 192);
            this.dgvProductos.TabIndex = 1;
            this.dgvProductos.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgvProductos_CellContentClick);
            // 
            // Column1
            // 
            this.Column1.DataPropertyName = "IdProducto";
            this.Column1.HeaderText = "Id";
            this.Column1.Name = "Column1";
            // 
            // Column2
            // 
            this.Column2.DataPropertyName = "Nombre";
            this.Column2.HeaderText = "Producto";
            this.Column2.Name = "Column2";
            // 
            // Column3
            // 
            this.Column3.DataPropertyName = "Precio";
            this.Column3.HeaderText = "Precio Unitario";
            this.Column3.Name = "Column3";
            // 
            // Column4
            // 
            this.Column4.DataPropertyName = "Moneda";
            this.Column4.HeaderText = "Moneda";
            this.Column4.Name = "Column4";
            // 
            // Marca
            // 
            this.Marca.DataPropertyName = "Marca";
            this.Marca.HeaderText = "Marca";
            this.Marca.Name = "Marca";
            // 
            // Descripcion
            // 
            this.Descripcion.DataPropertyName = "Descripcion";
            this.Descripcion.HeaderText = "Descripcion";
            this.Descripcion.Name = "Descripcion";
            // 
            // Stock
            // 
            this.Stock.DataPropertyName = "Stock";
            this.Stock.HeaderText = "Stock";
            this.Stock.Name = "Stock";
            // 
            // FechaCaducidad
            // 
            this.FechaCaducidad.DataPropertyName = "FechaVencimiento";
            this.FechaCaducidad.HeaderText = "FechaCaducidad";
            this.FechaCaducidad.Name = "FechaCaducidad";
            // 
            // btnBuscar
            // 
            this.btnBuscar.Location = new System.Drawing.Point(683, 196);
            this.btnBuscar.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(97, 26);
            this.btnBuscar.TabIndex = 2;
            this.btnBuscar.Text = "Buscar";
            this.btnBuscar.UseVisualStyleBackColor = true;
            this.btnBuscar.Click += new System.EventHandler(this.btnBuscar_Click);
            // 
            // textNombre
            // 
            this.textNombre.Location = new System.Drawing.Point(140, 75);
            this.textNombre.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.textNombre.Name = "textNombre";
            this.textNombre.Size = new System.Drawing.Size(97, 22);
            this.textNombre.TabIndex = 4;
            // 
            // textMarca
            // 
            this.textMarca.Location = new System.Drawing.Point(140, 122);
            this.textMarca.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.textMarca.Name = "textMarca";
            this.textMarca.Size = new System.Drawing.Size(103, 22);
            this.textMarca.TabIndex = 5;
            // 
            // textCategoria
            // 
            this.textCategoria.Location = new System.Drawing.Point(140, 167);
            this.textCategoria.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.textCategoria.Name = "textCategoria";
            this.textCategoria.Size = new System.Drawing.Size(103, 22);
            this.textCategoria.TabIndex = 6;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(41, 75);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(58, 17);
            this.label2.TabIndex = 8;
            this.label2.Text = "Nombre";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(41, 122);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(47, 17);
            this.label3.TabIndex = 9;
            this.label3.Text = "Marca";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(41, 167);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(69, 17);
            this.label4.TabIndex = 10;
            this.label4.Text = "Categoria";
            // 
            // radioBtnC
            // 
            this.radioBtnC.AutoSize = true;
            this.radioBtnC.Location = new System.Drawing.Point(57, 24);
            this.radioBtnC.Name = "radioBtnC";
            this.radioBtnC.Size = new System.Drawing.Size(102, 21);
            this.radioBtnC.TabIndex = 11;
            this.radioBtnC.TabStop = true;
            this.radioBtnC.Text = "Consumible";
            this.radioBtnC.UseVisualStyleBackColor = true;
            // 
            // radioBtnNC
            // 
            this.radioBtnNC.AutoSize = true;
            this.radioBtnNC.Location = new System.Drawing.Point(224, 24);
            this.radioBtnNC.Name = "radioBtnNC";
            this.radioBtnNC.Size = new System.Drawing.Size(122, 21);
            this.radioBtnNC.TabIndex = 12;
            this.radioBtnNC.TabStop = true;
            this.radioBtnNC.Text = "No consumible";
            this.radioBtnNC.UseVisualStyleBackColor = true;
            // 
            // frmListarProductos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1120, 507);
            this.Controls.Add(this.radioBtnNC);
            this.Controls.Add(this.radioBtnC);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textCategoria);
            this.Controls.Add(this.textMarca);
            this.Controls.Add(this.textNombre);
            this.Controls.Add(this.btnBuscar);
            this.Controls.Add(this.dgvProductos);
            this.Controls.Add(this.btnSeleccionar);
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "frmListarProductos";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Buscar Producto";
            this.Load += new System.EventHandler(this.frmListarProductos_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dgvProductos)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnSeleccionar;
        private System.Windows.Forms.DataGridView dgvProductos;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.TextBox textNombre;
        private System.Windows.Forms.TextBox textMarca;
        private System.Windows.Forms.TextBox textCategoria;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column2;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column3;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column4;
        private System.Windows.Forms.DataGridViewTextBoxColumn Marca;
        private System.Windows.Forms.DataGridViewTextBoxColumn Descripcion;
        private System.Windows.Forms.DataGridViewTextBoxColumn Stock;
        private System.Windows.Forms.DataGridViewTextBoxColumn FechaCaducidad;
        private System.Windows.Forms.RadioButton radioBtnC;
        private System.Windows.Forms.RadioButton radioBtnNC;
    }
}