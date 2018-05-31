namespace Inicio
{
    partial class Registrar_Venta
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Registrar_Venta));
            this.radioBtnBoleta = new System.Windows.Forms.RadioButton();
            this.radioBtnFactura = new System.Windows.Forms.RadioButton();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.textTotal = new System.Windows.Forms.TextBox();
            this.btnRegresar = new System.Windows.Forms.Button();
            this.groupProducto = new System.Windows.Forms.GroupBox();
            this.label3 = new System.Windows.Forms.Label();
            this.textFV = new System.Windows.Forms.TextBox();
            this.label20 = new System.Windows.Forms.Label();
            this.textStock = new System.Windows.Forms.TextBox();
            this.label17 = new System.Windows.Forms.Label();
            this.textPrecioVendido = new System.Windows.Forms.TextBox();
            this.textDescuento = new System.Windows.Forms.TextBox();
            this.label16 = new System.Windows.Forms.Label();
            this.label15 = new System.Windows.Forms.Label();
            this.btnEliminar = new System.Windows.Forms.Button();
            this.btnAgregar = new System.Windows.Forms.Button();
            this.label6 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.textCantidad = new System.Windows.Forms.TextBox();
            this.textBoxCU = new System.Windows.Forms.TextBox();
            this.textBoxNombre = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.btnListaProd = new System.Windows.Forms.Button();
            this.dgvDetalleVenta = new System.Windows.Forms.DataGridView();
            this.NombreProd = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Column4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.groupCliente = new System.Windows.Forms.GroupBox();
            this.label7 = new System.Windows.Forms.Label();
            this.btnListaClientesJ = new System.Windows.Forms.Button();
            this.btnListaClientesN = new System.Windows.Forms.Button();
            this.textRUC = new System.Windows.Forms.TextBox();
            this.label13 = new System.Windows.Forms.Label();
            this.textDNI = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.groupTipoVenta = new System.Windows.Forms.GroupBox();
            this.radioBtnInmediata = new System.Windows.Forms.RadioButton();
            this.radioBtnAntcipada = new System.Windows.Forms.RadioButton();
            this.dateTimeVenta = new System.Windows.Forms.DateTimePicker();
            this.label10 = new System.Windows.Forms.Label();
            this.dateTimeEntrega = new System.Windows.Forms.DateTimePicker();
            this.textAdelanto = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.TooStripNuevo = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.ToolStripGuardar = new System.Windows.Forms.ToolStripButton();
            this.toolStripCancelar = new System.Windows.Forms.ToolStripButton();
            this.label14 = new System.Windows.Forms.Label();
            this.comboBoxMoneda = new System.Windows.Forms.ComboBox();
            this.textSaldo = new System.Windows.Forms.TextBox();
            this.label12 = new System.Windows.Forms.Label();
            this.textSubtotal = new System.Windows.Forms.TextBox();
            this.label18 = new System.Windows.Forms.Label();
            this.label19 = new System.Windows.Forms.Label();
            this.textIGV = new System.Windows.Forms.TextBox();
            this.radioBtnSi = new System.Windows.Forms.RadioButton();
            this.radioBtnNo = new System.Windows.Forms.RadioButton();
            this.groupBoxC = new System.Windows.Forms.GroupBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.radioBtnTarjeta = new System.Windows.Forms.RadioButton();
            this.radioBtnEfectivo = new System.Windows.Forms.RadioButton();
            this.groupProducto.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvDetalleVenta)).BeginInit();
            this.groupCliente.SuspendLayout();
            this.groupTipoVenta.SuspendLayout();
            this.toolStrip1.SuspendLayout();
            this.groupBoxC.SuspendLayout();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // radioBtnBoleta
            // 
            this.radioBtnBoleta.AutoSize = true;
            this.radioBtnBoleta.Checked = true;
            this.radioBtnBoleta.Enabled = false;
            this.radioBtnBoleta.Location = new System.Drawing.Point(259, 48);
            this.radioBtnBoleta.Margin = new System.Windows.Forms.Padding(4);
            this.radioBtnBoleta.Name = "radioBtnBoleta";
            this.radioBtnBoleta.Size = new System.Drawing.Size(69, 21);
            this.radioBtnBoleta.TabIndex = 1;
            this.radioBtnBoleta.TabStop = true;
            this.radioBtnBoleta.Text = "Boleta";
            this.radioBtnBoleta.UseVisualStyleBackColor = true;
            this.radioBtnBoleta.CheckedChanged += new System.EventHandler(this.radioBtnBoleta_CheckedChanged);
            // 
            // radioBtnFactura
            // 
            this.radioBtnFactura.AutoSize = true;
            this.radioBtnFactura.Enabled = false;
            this.radioBtnFactura.Location = new System.Drawing.Point(413, 48);
            this.radioBtnFactura.Margin = new System.Windows.Forms.Padding(4);
            this.radioBtnFactura.Name = "radioBtnFactura";
            this.radioBtnFactura.Size = new System.Drawing.Size(77, 21);
            this.radioBtnFactura.TabIndex = 2;
            this.radioBtnFactura.Text = "Factura";
            this.radioBtnFactura.UseVisualStyleBackColor = true;
            this.radioBtnFactura.CheckedChanged += new System.EventHandler(this.radioBtnFactura_CheckedChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(36, 48);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(107, 17);
            this.label1.TabIndex = 3;
            this.label1.Text = "Tipo de recibo: ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(1208, 562);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(40, 17);
            this.label2.TabIndex = 6;
            this.label2.Text = "Total";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // textTotal
            // 
            this.textTotal.Location = new System.Drawing.Point(1286, 547);
            this.textTotal.Margin = new System.Windows.Forms.Padding(4);
            this.textTotal.Name = "textTotal";
            this.textTotal.ReadOnly = true;
            this.textTotal.Size = new System.Drawing.Size(101, 22);
            this.textTotal.TabIndex = 7;
            this.textTotal.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // btnRegresar
            // 
            this.btnRegresar.Location = new System.Drawing.Point(1436, 607);
            this.btnRegresar.Margin = new System.Windows.Forms.Padding(4);
            this.btnRegresar.Name = "btnRegresar";
            this.btnRegresar.Size = new System.Drawing.Size(100, 28);
            this.btnRegresar.TabIndex = 8;
            this.btnRegresar.Text = "Salir";
            this.btnRegresar.UseVisualStyleBackColor = true;
            this.btnRegresar.Click += new System.EventHandler(this.btnRegresar_Click);
            // 
            // groupProducto
            // 
            this.groupProducto.BackColor = System.Drawing.Color.SeaShell;
            this.groupProducto.Controls.Add(this.label3);
            this.groupProducto.Controls.Add(this.textFV);
            this.groupProducto.Controls.Add(this.label20);
            this.groupProducto.Controls.Add(this.textStock);
            this.groupProducto.Controls.Add(this.label17);
            this.groupProducto.Controls.Add(this.textPrecioVendido);
            this.groupProducto.Controls.Add(this.textDescuento);
            this.groupProducto.Controls.Add(this.label16);
            this.groupProducto.Controls.Add(this.label15);
            this.groupProducto.Controls.Add(this.btnEliminar);
            this.groupProducto.Controls.Add(this.btnAgregar);
            this.groupProducto.Controls.Add(this.label6);
            this.groupProducto.Controls.Add(this.label5);
            this.groupProducto.Controls.Add(this.textCantidad);
            this.groupProducto.Controls.Add(this.textBoxCU);
            this.groupProducto.Controls.Add(this.textBoxNombre);
            this.groupProducto.Controls.Add(this.label4);
            this.groupProducto.Controls.Add(this.btnListaProd);
            this.groupProducto.Location = new System.Drawing.Point(625, 85);
            this.groupProducto.Margin = new System.Windows.Forms.Padding(4);
            this.groupProducto.Name = "groupProducto";
            this.groupProducto.Padding = new System.Windows.Forms.Padding(4);
            this.groupProducto.Size = new System.Drawing.Size(945, 139);
            this.groupProducto.TabIndex = 10;
            this.groupProducto.TabStop = false;
            this.groupProducto.Text = "Prducto";
            this.groupProducto.Enter += new System.EventHandler(this.groupProducto_Enter);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(22, 32);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(52, 17);
            this.label3.TabIndex = 24;
            this.label3.Text = "Buscar";
            // 
            // textFV
            // 
            this.textFV.Enabled = false;
            this.textFV.Location = new System.Drawing.Point(534, 99);
            this.textFV.Margin = new System.Windows.Forms.Padding(4);
            this.textFV.Name = "textFV";
            this.textFV.Size = new System.Drawing.Size(183, 22);
            this.textFV.TabIndex = 23;
            // 
            // label20
            // 
            this.label20.AutoSize = true;
            this.label20.Location = new System.Drawing.Point(531, 74);
            this.label20.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label20.Name = "label20";
            this.label20.Size = new System.Drawing.Size(128, 17);
            this.label20.TabIndex = 22;
            this.label20.Text = "Fecha Vencimiento";
            // 
            // textStock
            // 
            this.textStock.Enabled = false;
            this.textStock.Location = new System.Drawing.Point(525, 39);
            this.textStock.Margin = new System.Windows.Forms.Padding(4);
            this.textStock.Name = "textStock";
            this.textStock.Size = new System.Drawing.Size(101, 22);
            this.textStock.TabIndex = 21;
            // 
            // label17
            // 
            this.label17.AutoSize = true;
            this.label17.Location = new System.Drawing.Point(521, 20);
            this.label17.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label17.Name = "label17";
            this.label17.Size = new System.Drawing.Size(43, 17);
            this.label17.TabIndex = 20;
            this.label17.Text = "Stock";
            // 
            // textPrecioVendido
            // 
            this.textPrecioVendido.Enabled = false;
            this.textPrecioVendido.Location = new System.Drawing.Point(396, 90);
            this.textPrecioVendido.Margin = new System.Windows.Forms.Padding(4);
            this.textPrecioVendido.Name = "textPrecioVendido";
            this.textPrecioVendido.Size = new System.Drawing.Size(101, 22);
            this.textPrecioVendido.TabIndex = 19;
            // 
            // textDescuento
            // 
            this.textDescuento.Enabled = false;
            this.textDescuento.Location = new System.Drawing.Point(396, 59);
            this.textDescuento.Margin = new System.Windows.Forms.Padding(4);
            this.textDescuento.Name = "textDescuento";
            this.textDescuento.Size = new System.Drawing.Size(101, 22);
            this.textDescuento.TabIndex = 18;
            this.textDescuento.TextChanged += new System.EventHandler(this.textDescuento_TextChanged);
            // 
            // label16
            // 
            this.label16.AutoSize = true;
            this.label16.Location = new System.Drawing.Point(260, 90);
            this.label16.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label16.Name = "label16";
            this.label16.Size = new System.Drawing.Size(89, 17);
            this.label16.TabIndex = 17;
            this.label16.Text = "Precio Venta";
            this.label16.Click += new System.EventHandler(this.label16_Click);
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Location = new System.Drawing.Point(259, 59);
            this.label15.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(76, 17);
            this.label15.TabIndex = 16;
            this.label15.Text = "Descuento";
            this.label15.Click += new System.EventHandler(this.label15_Click);
            // 
            // btnEliminar
            // 
            this.btnEliminar.AllowDrop = true;
            this.btnEliminar.Location = new System.Drawing.Point(836, 90);
            this.btnEliminar.Margin = new System.Windows.Forms.Padding(4);
            this.btnEliminar.Name = "btnEliminar";
            this.btnEliminar.Size = new System.Drawing.Size(93, 28);
            this.btnEliminar.TabIndex = 15;
            this.btnEliminar.Text = "Eliminar";
            this.btnEliminar.UseVisualStyleBackColor = true;
            this.btnEliminar.Click += new System.EventHandler(this.btnEliminar_Click);
            // 
            // btnAgregar
            // 
            this.btnAgregar.Location = new System.Drawing.Point(836, 48);
            this.btnAgregar.Margin = new System.Windows.Forms.Padding(4);
            this.btnAgregar.Name = "btnAgregar";
            this.btnAgregar.Size = new System.Drawing.Size(96, 28);
            this.btnAgregar.TabIndex = 14;
            this.btnAgregar.Text = "Agregar";
            this.btnAgregar.UseVisualStyleBackColor = true;
            this.btnAgregar.Click += new System.EventHandler(this.btnAgregar_Click);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(723, 19);
            this.label6.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(64, 17);
            this.label6.TabIndex = 13;
            this.label6.Text = "Cantidad";
            this.label6.Click += new System.EventHandler(this.label6_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(259, 28);
            this.label5.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(97, 17);
            this.label5.TabIndex = 12;
            this.label5.Text = "Costo Unitario";
            // 
            // textCantidad
            // 
            this.textCantidad.Enabled = false;
            this.textCantidad.Location = new System.Drawing.Point(716, 41);
            this.textCantidad.Margin = new System.Windows.Forms.Padding(4);
            this.textCantidad.Name = "textCantidad";
            this.textCantidad.Size = new System.Drawing.Size(101, 22);
            this.textCantidad.TabIndex = 11;
            // 
            // textBoxCU
            // 
            this.textBoxCU.Location = new System.Drawing.Point(396, 28);
            this.textBoxCU.Margin = new System.Windows.Forms.Padding(4);
            this.textBoxCU.Name = "textBoxCU";
            this.textBoxCU.ReadOnly = true;
            this.textBoxCU.Size = new System.Drawing.Size(101, 22);
            this.textBoxCU.TabIndex = 10;
            this.textBoxCU.TextChanged += new System.EventHandler(this.textBoxCU_TextChanged);
            // 
            // textBoxNombre
            // 
            this.textBoxNombre.Location = new System.Drawing.Point(100, 71);
            this.textBoxNombre.Margin = new System.Windows.Forms.Padding(4);
            this.textBoxNombre.Name = "textBoxNombre";
            this.textBoxNombre.ReadOnly = true;
            this.textBoxNombre.Size = new System.Drawing.Size(101, 22);
            this.textBoxNombre.TabIndex = 9;
            this.textBoxNombre.TextChanged += new System.EventHandler(this.textBoxNombre_TextChanged);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(19, 75);
            this.label4.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(66, 17);
            this.label4.TabIndex = 2;
            this.label4.Text = "Nombre: ";
            // 
            // btnListaProd
            // 
            this.btnListaProd.Location = new System.Drawing.Point(100, 23);
            this.btnListaProd.Margin = new System.Windows.Forms.Padding(4);
            this.btnListaProd.Name = "btnListaProd";
            this.btnListaProd.Size = new System.Drawing.Size(37, 32);
            this.btnListaProd.TabIndex = 0;
            this.btnListaProd.Text = "...";
            this.btnListaProd.UseVisualStyleBackColor = true;
            this.btnListaProd.Click += new System.EventHandler(this.btnListaProd_Click);
            // 
            // dgvDetalleVenta
            // 
            this.dgvDetalleVenta.AllowUserToAddRows = false;
            this.dgvDetalleVenta.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvDetalleVenta.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.NombreProd,
            this.Column3,
            this.Column1,
            this.Column2,
            this.Column4});
            this.dgvDetalleVenta.Location = new System.Drawing.Point(625, 253);
            this.dgvDetalleVenta.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.dgvDetalleVenta.Name = "dgvDetalleVenta";
            this.dgvDetalleVenta.ReadOnly = true;
            this.dgvDetalleVenta.RowTemplate.Height = 24;
            this.dgvDetalleVenta.Size = new System.Drawing.Size(945, 198);
            this.dgvDetalleVenta.TabIndex = 16;
            this.dgvDetalleVenta.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgvDetalleVenta_CellContentClick_1);
            // 
            // NombreProd
            // 
            this.NombreProd.DataPropertyName = "NombreProd";
            this.NombreProd.HeaderText = "Producto";
            this.NombreProd.Name = "NombreProd";
            this.NombreProd.ReadOnly = true;
            // 
            // Column3
            // 
            this.Column3.DataPropertyName = "costoUnit";
            this.Column3.HeaderText = "Precio";
            this.Column3.Name = "Column3";
            this.Column3.ReadOnly = true;
            // 
            // Column1
            // 
            this.Column1.DataPropertyName = "PrecioVendido";
            this.Column1.HeaderText = "Precio Venta";
            this.Column1.Name = "Column1";
            this.Column1.ReadOnly = true;
            // 
            // Column2
            // 
            this.Column2.DataPropertyName = "Cantidad";
            this.Column2.HeaderText = "Cantidad";
            this.Column2.Name = "Column2";
            this.Column2.ReadOnly = true;
            // 
            // Column4
            // 
            this.Column4.DataPropertyName = "Subtotal";
            this.Column4.HeaderText = "Subtotal";
            this.Column4.Name = "Column4";
            this.Column4.ReadOnly = true;
            // 
            // groupCliente
            // 
            this.groupCliente.BackColor = System.Drawing.Color.SeaShell;
            this.groupCliente.Controls.Add(this.label7);
            this.groupCliente.Controls.Add(this.btnListaClientesJ);
            this.groupCliente.Controls.Add(this.btnListaClientesN);
            this.groupCliente.Controls.Add(this.textRUC);
            this.groupCliente.Controls.Add(this.label13);
            this.groupCliente.Controls.Add(this.textDNI);
            this.groupCliente.Controls.Add(this.label11);
            this.groupCliente.Location = new System.Drawing.Point(39, 290);
            this.groupCliente.Margin = new System.Windows.Forms.Padding(4);
            this.groupCliente.Name = "groupCliente";
            this.groupCliente.Padding = new System.Windows.Forms.Padding(4);
            this.groupCliente.Size = new System.Drawing.Size(550, 111);
            this.groupCliente.TabIndex = 11;
            this.groupCliente.TabStop = false;
            this.groupCliente.Text = "Cliente";
            this.groupCliente.Enter += new System.EventHandler(this.groupCliente_Enter);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(8, 29);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(52, 17);
            this.label7.TabIndex = 25;
            this.label7.Text = "Buscar";
            // 
            // btnListaClientesJ
            // 
            this.btnListaClientesJ.Location = new System.Drawing.Point(345, 21);
            this.btnListaClientesJ.Margin = new System.Windows.Forms.Padding(4);
            this.btnListaClientesJ.Name = "btnListaClientesJ";
            this.btnListaClientesJ.Size = new System.Drawing.Size(37, 32);
            this.btnListaClientesJ.TabIndex = 21;
            this.btnListaClientesJ.Text = "...";
            this.btnListaClientesJ.UseVisualStyleBackColor = true;
            this.btnListaClientesJ.Click += new System.EventHandler(this.btnListaClientesJ_Click);
            // 
            // btnListaClientesN
            // 
            this.btnListaClientesN.Location = new System.Drawing.Point(124, 14);
            this.btnListaClientesN.Margin = new System.Windows.Forms.Padding(4);
            this.btnListaClientesN.Name = "btnListaClientesN";
            this.btnListaClientesN.Size = new System.Drawing.Size(37, 32);
            this.btnListaClientesN.TabIndex = 20;
            this.btnListaClientesN.Text = "...";
            this.btnListaClientesN.UseVisualStyleBackColor = true;
            this.btnListaClientesN.Click += new System.EventHandler(this.btnListaClientes_Click);
            // 
            // textRUC
            // 
            this.textRUC.Enabled = false;
            this.textRUC.Location = new System.Drawing.Point(345, 71);
            this.textRUC.Margin = new System.Windows.Forms.Padding(4);
            this.textRUC.Name = "textRUC";
            this.textRUC.Size = new System.Drawing.Size(132, 22);
            this.textRUC.TabIndex = 19;
            // 
            // label13
            // 
            this.label13.AutoSize = true;
            this.label13.Location = new System.Drawing.Point(300, 71);
            this.label13.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(37, 17);
            this.label13.TabIndex = 18;
            this.label13.Text = "RUC";
            // 
            // textDNI
            // 
            this.textDNI.Enabled = false;
            this.textDNI.Location = new System.Drawing.Point(124, 68);
            this.textDNI.Margin = new System.Windows.Forms.Padding(4);
            this.textDNI.Name = "textDNI";
            this.textDNI.Size = new System.Drawing.Size(132, 22);
            this.textDNI.TabIndex = 16;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(8, 71);
            this.label11.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(107, 17);
            this.label11.TabIndex = 15;
            this.label11.Text = "Nro Documento";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(23, 137);
            this.label8.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(64, 17);
            this.label8.TabIndex = 9;
            this.label8.Text = "Adelanto";
            this.label8.Click += new System.EventHandler(this.label8_Click);
            // 
            // groupTipoVenta
            // 
            this.groupTipoVenta.BackColor = System.Drawing.Color.SeaShell;
            this.groupTipoVenta.Controls.Add(this.radioBtnInmediata);
            this.groupTipoVenta.Controls.Add(this.radioBtnAntcipada);
            this.groupTipoVenta.Controls.Add(this.dateTimeVenta);
            this.groupTipoVenta.Controls.Add(this.label10);
            this.groupTipoVenta.Controls.Add(this.dateTimeEntrega);
            this.groupTipoVenta.Controls.Add(this.textAdelanto);
            this.groupTipoVenta.Controls.Add(this.label9);
            this.groupTipoVenta.Controls.Add(this.label8);
            this.groupTipoVenta.Location = new System.Drawing.Point(39, 443);
            this.groupTipoVenta.Margin = new System.Windows.Forms.Padding(4);
            this.groupTipoVenta.Name = "groupTipoVenta";
            this.groupTipoVenta.Padding = new System.Windows.Forms.Padding(4);
            this.groupTipoVenta.Size = new System.Drawing.Size(550, 192);
            this.groupTipoVenta.TabIndex = 12;
            this.groupTipoVenta.TabStop = false;
            this.groupTipoVenta.Text = "Tipo de venta";
            // 
            // radioBtnInmediata
            // 
            this.radioBtnInmediata.AutoSize = true;
            this.radioBtnInmediata.Location = new System.Drawing.Point(26, 52);
            this.radioBtnInmediata.Margin = new System.Windows.Forms.Padding(4);
            this.radioBtnInmediata.Name = "radioBtnInmediata";
            this.radioBtnInmediata.Size = new System.Drawing.Size(90, 21);
            this.radioBtnInmediata.TabIndex = 15;
            this.radioBtnInmediata.TabStop = true;
            this.radioBtnInmediata.Text = "Inmediata";
            this.radioBtnInmediata.UseVisualStyleBackColor = true;
            this.radioBtnInmediata.CheckedChanged += new System.EventHandler(this.radioBtnInmediata_CheckedChanged);
            // 
            // radioBtnAntcipada
            // 
            this.radioBtnAntcipada.AutoSize = true;
            this.radioBtnAntcipada.Location = new System.Drawing.Point(26, 87);
            this.radioBtnAntcipada.Margin = new System.Windows.Forms.Padding(4);
            this.radioBtnAntcipada.Name = "radioBtnAntcipada";
            this.radioBtnAntcipada.Size = new System.Drawing.Size(95, 21);
            this.radioBtnAntcipada.TabIndex = 14;
            this.radioBtnAntcipada.TabStop = true;
            this.radioBtnAntcipada.Text = "Anticipada";
            this.radioBtnAntcipada.UseVisualStyleBackColor = true;
            this.radioBtnAntcipada.CheckedChanged += new System.EventHandler(this.radioBtnAntcipada_CheckedChanged);
            // 
            // dateTimeVenta
            // 
            this.dateTimeVenta.Enabled = false;
            this.dateTimeVenta.Location = new System.Drawing.Point(247, 72);
            this.dateTimeVenta.Margin = new System.Windows.Forms.Padding(4);
            this.dateTimeVenta.Name = "dateTimeVenta";
            this.dateTimeVenta.Size = new System.Drawing.Size(265, 22);
            this.dateTimeVenta.TabIndex = 13;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(244, 42);
            this.label10.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(106, 17);
            this.label10.TabIndex = 12;
            this.label10.Text = "Fecha de venta";
            // 
            // dateTimeEntrega
            // 
            this.dateTimeEntrega.Enabled = false;
            this.dateTimeEntrega.Location = new System.Drawing.Point(247, 137);
            this.dateTimeEntrega.Margin = new System.Windows.Forms.Padding(4);
            this.dateTimeEntrega.Name = "dateTimeEntrega";
            this.dateTimeEntrega.Size = new System.Drawing.Size(265, 22);
            this.dateTimeEntrega.TabIndex = 11;
            this.dateTimeEntrega.ValueChanged += new System.EventHandler(this.dateTimePicker1_ValueChanged);
            // 
            // textAdelanto
            // 
            this.textAdelanto.Enabled = false;
            this.textAdelanto.Location = new System.Drawing.Point(112, 137);
            this.textAdelanto.Margin = new System.Windows.Forms.Padding(4);
            this.textAdelanto.Name = "textAdelanto";
            this.textAdelanto.Size = new System.Drawing.Size(88, 22);
            this.textAdelanto.TabIndex = 10;
            this.textAdelanto.TextChanged += new System.EventHandler(this.textAdelanto_TextChanged);
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(244, 116);
            this.label9.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(120, 17);
            this.label9.TabIndex = 10;
            this.label9.Text = "Fecha de entrega";
            // 
            // toolStrip1
            // 
            this.toolStrip1.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.TooStripNuevo,
            this.toolStripSeparator1,
            this.ToolStripGuardar,
            this.toolStripCancelar});
            this.toolStrip1.Location = new System.Drawing.Point(0, 0);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(1593, 27);
            this.toolStrip1.TabIndex = 13;
            this.toolStrip1.Text = "toolStrip1";
            this.toolStrip1.ItemClicked += new System.Windows.Forms.ToolStripItemClickedEventHandler(this.toolStrip1_ItemClicked_1);
            // 
            // TooStripNuevo
            // 
            this.TooStripNuevo.Image = ((System.Drawing.Image)(resources.GetObject("TooStripNuevo.Image")));
            this.TooStripNuevo.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.TooStripNuevo.Name = "TooStripNuevo";
            this.TooStripNuevo.Size = new System.Drawing.Size(76, 24);
            this.TooStripNuevo.Text = "&Nuevo";
            this.TooStripNuevo.Click += new System.EventHandler(this.TooStripNuevo_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(6, 27);
            // 
            // ToolStripGuardar
            // 
            this.ToolStripGuardar.Image = ((System.Drawing.Image)(resources.GetObject("ToolStripGuardar.Image")));
            this.ToolStripGuardar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.ToolStripGuardar.Name = "ToolStripGuardar";
            this.ToolStripGuardar.Size = new System.Drawing.Size(86, 24);
            this.ToolStripGuardar.Text = "&Guardar";
            this.ToolStripGuardar.Click += new System.EventHandler(this.ToolSGuardar_Click);
            // 
            // toolStripCancelar
            // 
            this.toolStripCancelar.Image = ((System.Drawing.Image)(resources.GetObject("toolStripCancelar.Image")));
            this.toolStripCancelar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.toolStripCancelar.Name = "toolStripCancelar";
            this.toolStripCancelar.Size = new System.Drawing.Size(90, 24);
            this.toolStripCancelar.Text = "Cancelar";
            this.toolStripCancelar.Click += new System.EventHandler(this.toolStripCancelar_Click);
            // 
            // label14
            // 
            this.label14.AutoSize = true;
            this.label14.Location = new System.Drawing.Point(36, 85);
            this.label14.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(119, 17);
            this.label14.TabIndex = 14;
            this.label14.Text = "Tipo de moneda: ";
            // 
            // comboBoxMoneda
            // 
            this.comboBoxMoneda.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.comboBoxMoneda.FormattingEnabled = true;
            this.comboBoxMoneda.Items.AddRange(new object[] {
            "Sol",
            "Dolar"});
            this.comboBoxMoneda.Location = new System.Drawing.Point(255, 85);
            this.comboBoxMoneda.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.comboBoxMoneda.Name = "comboBoxMoneda";
            this.comboBoxMoneda.Size = new System.Drawing.Size(121, 24);
            this.comboBoxMoneda.TabIndex = 19;
            // 
            // textSaldo
            // 
            this.textSaldo.Location = new System.Drawing.Point(1013, 488);
            this.textSaldo.Margin = new System.Windows.Forms.Padding(4);
            this.textSaldo.Name = "textSaldo";
            this.textSaldo.ReadOnly = true;
            this.textSaldo.Size = new System.Drawing.Size(101, 22);
            this.textSaldo.TabIndex = 20;
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(935, 490);
            this.label12.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(44, 17);
            this.label12.TabIndex = 21;
            this.label12.Text = "Saldo";
            // 
            // textSubtotal
            // 
            this.textSubtotal.Location = new System.Drawing.Point(1286, 485);
            this.textSubtotal.Margin = new System.Windows.Forms.Padding(4);
            this.textSubtotal.Name = "textSubtotal";
            this.textSubtotal.ReadOnly = true;
            this.textSubtotal.Size = new System.Drawing.Size(101, 22);
            this.textSubtotal.TabIndex = 22;
            // 
            // label18
            // 
            this.label18.AutoSize = true;
            this.label18.Location = new System.Drawing.Point(1208, 522);
            this.label18.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label18.Name = "label18";
            this.label18.Size = new System.Drawing.Size(31, 17);
            this.label18.TabIndex = 23;
            this.label18.Text = "IGV";
            // 
            // label19
            // 
            this.label19.AutoSize = true;
            this.label19.Location = new System.Drawing.Point(1208, 493);
            this.label19.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label19.Name = "label19";
            this.label19.Size = new System.Drawing.Size(60, 17);
            this.label19.TabIndex = 24;
            this.label19.Text = "Subtotal";
            // 
            // textIGV
            // 
            this.textIGV.Location = new System.Drawing.Point(1286, 517);
            this.textIGV.Margin = new System.Windows.Forms.Padding(4);
            this.textIGV.Name = "textIGV";
            this.textIGV.ReadOnly = true;
            this.textIGV.Size = new System.Drawing.Size(101, 22);
            this.textIGV.TabIndex = 25;
            // 
            // radioBtnSi
            // 
            this.radioBtnSi.AutoSize = true;
            this.radioBtnSi.Location = new System.Drawing.Point(195, 16);
            this.radioBtnSi.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.radioBtnSi.Name = "radioBtnSi";
            this.radioBtnSi.Size = new System.Drawing.Size(41, 21);
            this.radioBtnSi.TabIndex = 28;
            this.radioBtnSi.TabStop = true;
            this.radioBtnSi.Text = "Si";
            this.radioBtnSi.UseVisualStyleBackColor = true;
            this.radioBtnSi.CheckedChanged += new System.EventHandler(this.radioBtnSi_CheckedChanged);
            // 
            // radioBtnNo
            // 
            this.radioBtnNo.AutoSize = true;
            this.radioBtnNo.Location = new System.Drawing.Point(364, 18);
            this.radioBtnNo.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.radioBtnNo.Name = "radioBtnNo";
            this.radioBtnNo.Size = new System.Drawing.Size(47, 21);
            this.radioBtnNo.TabIndex = 29;
            this.radioBtnNo.TabStop = true;
            this.radioBtnNo.Text = "No";
            this.radioBtnNo.UseVisualStyleBackColor = true;
            this.radioBtnNo.CheckedChanged += new System.EventHandler(this.btnNo_CheckedChanged);
            // 
            // groupBoxC
            // 
            this.groupBoxC.Controls.Add(this.radioBtnSi);
            this.groupBoxC.Controls.Add(this.radioBtnNo);
            this.groupBoxC.Location = new System.Drawing.Point(39, 143);
            this.groupBoxC.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.groupBoxC.Name = "groupBoxC";
            this.groupBoxC.Padding = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.groupBoxC.Size = new System.Drawing.Size(550, 43);
            this.groupBoxC.TabIndex = 30;
            this.groupBoxC.TabStop = false;
            this.groupBoxC.Text = "¿Registrar cliente?";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.radioBtnTarjeta);
            this.groupBox1.Controls.Add(this.radioBtnEfectivo);
            this.groupBox1.Location = new System.Drawing.Point(39, 210);
            this.groupBox1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Padding = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.groupBox1.Size = new System.Drawing.Size(550, 47);
            this.groupBox1.TabIndex = 31;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Tipo de pago";
            // 
            // radioBtnTarjeta
            // 
            this.radioBtnTarjeta.AutoSize = true;
            this.radioBtnTarjeta.Location = new System.Drawing.Point(365, 20);
            this.radioBtnTarjeta.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.radioBtnTarjeta.Name = "radioBtnTarjeta";
            this.radioBtnTarjeta.Size = new System.Drawing.Size(74, 21);
            this.radioBtnTarjeta.TabIndex = 30;
            this.radioBtnTarjeta.TabStop = true;
            this.radioBtnTarjeta.Text = "Tarjeta";
            this.radioBtnTarjeta.UseVisualStyleBackColor = true;
            this.radioBtnTarjeta.CheckedChanged += new System.EventHandler(this.radioBtnTarjeta_CheckedChanged);
            // 
            // radioBtnEfectivo
            // 
            this.radioBtnEfectivo.AutoSize = true;
            this.radioBtnEfectivo.Location = new System.Drawing.Point(192, 20);
            this.radioBtnEfectivo.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.radioBtnEfectivo.Name = "radioBtnEfectivo";
            this.radioBtnEfectivo.Size = new System.Drawing.Size(79, 21);
            this.radioBtnEfectivo.TabIndex = 29;
            this.radioBtnEfectivo.TabStop = true;
            this.radioBtnEfectivo.Text = "Efectivo";
            this.radioBtnEfectivo.UseVisualStyleBackColor = true;
            // 
            // Registrar_Venta
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(1593, 659);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.groupBoxC);
            this.Controls.Add(this.textIGV);
            this.Controls.Add(this.label19);
            this.Controls.Add(this.label18);
            this.Controls.Add(this.textSubtotal);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.textSaldo);
            this.Controls.Add(this.comboBoxMoneda);
            this.Controls.Add(this.dgvDetalleVenta);
            this.Controls.Add(this.label14);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.groupTipoVenta);
            this.Controls.Add(this.groupCliente);
            this.Controls.Add(this.groupProducto);
            this.Controls.Add(this.btnRegresar);
            this.Controls.Add(this.textTotal);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.radioBtnFactura);
            this.Controls.Add(this.radioBtnBoleta);
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "Registrar_Venta";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Registrar Venta";
            this.Load += new System.EventHandler(this.Registrar_Venta_Load);
            this.groupProducto.ResumeLayout(false);
            this.groupProducto.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvDetalleVenta)).EndInit();
            this.groupCliente.ResumeLayout(false);
            this.groupCliente.PerformLayout();
            this.groupTipoVenta.ResumeLayout(false);
            this.groupTipoVenta.PerformLayout();
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.groupBoxC.ResumeLayout(false);
            this.groupBoxC.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.RadioButton radioBtnBoleta;
        private System.Windows.Forms.RadioButton radioBtnFactura;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox textTotal;
        private System.Windows.Forms.Button btnRegresar;
        private System.Windows.Forms.GroupBox groupProducto;
        private System.Windows.Forms.Button btnListaProd;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox textCantidad;
        private System.Windows.Forms.TextBox textBoxCU;
        private System.Windows.Forms.TextBox textBoxNombre;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button btnEliminar;
        private System.Windows.Forms.Button btnAgregar;
        private System.Windows.Forms.GroupBox groupCliente;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.GroupBox groupTipoVenta;
        private System.Windows.Forms.TextBox textAdelanto;
        private System.Windows.Forms.DateTimePicker dateTimeEntrega;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.RadioButton radioBtnInmediata;
        private System.Windows.Forms.RadioButton radioBtnAntcipada;
        private System.Windows.Forms.DateTimePicker dateTimeVenta;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.ToolStripButton TooStripNuevo;
        private System.Windows.Forms.ToolStripButton ToolStripGuardar;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.Label label13;
        private System.Windows.Forms.TextBox textDNI;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label label14;
        private System.Windows.Forms.TextBox textRUC;
        private System.Windows.Forms.DataGridView dgvDetalleVenta;
        private System.Windows.Forms.ToolStripButton toolStripCancelar;
        private System.Windows.Forms.Button btnListaClientesN;
        private System.Windows.Forms.Button btnListaClientesJ;
        private System.Windows.Forms.ComboBox comboBoxMoneda;
        private System.Windows.Forms.TextBox textSaldo;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.Label label15;
        private System.Windows.Forms.Label label16;
        private System.Windows.Forms.TextBox textPrecioVendido;
        private System.Windows.Forms.TextBox textDescuento;
        private System.Windows.Forms.TextBox textSubtotal;
        private System.Windows.Forms.Label label18;
        private System.Windows.Forms.Label label19;
        private System.Windows.Forms.TextBox textIGV;
        private System.Windows.Forms.RadioButton radioBtnSi;
        private System.Windows.Forms.RadioButton radioBtnNo;
        private System.Windows.Forms.GroupBox groupBoxC;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton radioBtnTarjeta;
        private System.Windows.Forms.RadioButton radioBtnEfectivo;
        private System.Windows.Forms.TextBox textStock;
        private System.Windows.Forms.Label label17;
        private System.Windows.Forms.DataGridViewTextBoxColumn NombreProd;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column3;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column1;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column2;
        private System.Windows.Forms.DataGridViewTextBoxColumn Column4;
        private System.Windows.Forms.TextBox textFV;
        private System.Windows.Forms.Label label20;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label7;
    }
}