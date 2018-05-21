/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

/**
 *
 * @author VikAle
 */

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import static javafx.beans.binding.Bindings.or;
import static javax.management.Query.and;
import static javax.management.Query.or;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaCompras extends javax.swing.JFrame {

    
    double totalCons = 0;
    double totalNoCons = 0;
    ArrayList<producto> listaCmpNoCons = new ArrayList<producto>(); 
    ArrayList<producto> listaCmpCons = new ArrayList<producto>(); 
    ArrayList<producto> listaUtiles = new ArrayList<producto>();
    ArrayList<producto> listaAdornos = new ArrayList<producto>();
    ArrayList<producto> listaJuguetes = new ArrayList<producto>();
    ArrayList<producto> listaBebidas = new ArrayList<producto>();
    ArrayList<producto> listaHelados = new ArrayList<producto>();
    ArrayList<producto> listaSnacks = new ArrayList<producto>();
    VentanaPrincipal vAnterior;
    ventanaLogin ventanaHome;
    public VentanaCompras() {
        initComponents();
        this.setTitle("Compras");
        producto p1 = new producto("Lapicero", 0, 1.5f,0);
        producto p2 = new producto("Borrador", 0, 1.5f,0);
        producto p3 = new producto("Cartulina", 0, 1.5f,0);
        producto p4 = new producto("Tajador", 0, 1.5f,0);
        producto p5 = new producto("Regla", 0, 1.5f,0);
        producto p6 = new producto("Colores", 0, 1.5f,0);
        producto p7 = new producto("Chequeo", 0, 1.5f,0);
        listaUtiles.add(p1);
        listaUtiles.add(p2);
        listaUtiles.add(p3);
        listaUtiles.add(p4);
        listaUtiles.add(p5);
        listaUtiles.add(p6);
        listaUtiles.add(p7);
        
        producto pA1 = new producto("Florero", 0, 1.5f,0);
        producto pA2 = new producto("Cuadro", 0, 1.5f,0);
        producto pA3 = new producto("Flores", 0, 1.5f,0);
        producto pA4 = new producto("Estatuilla", 0, 1.5f,0);
        producto pA5 = new producto("Cartera", 0, 1.5f,0);
        producto pA6 = new producto("Billetera", 0, 1.5f,0);
        producto pA7 = new producto("Lampara", 0, 1.5f,0);
        listaAdornos.add(pA1);
        listaAdornos.add(pA2);
        listaAdornos.add(pA3);
        listaAdornos.add(pA4);
        listaAdornos.add(pA5);
        listaAdornos.add(pA6);
        listaAdornos.add(pA7);
        
        producto pJ1 = new producto("Carrito", 0, 1.5f,0);
        producto pJ2 = new producto("Barbie", 0, 1.5f,0);
        producto pJ3 = new producto("Rompecabeza", 0, 1.5f,0);
        producto pJ4 = new producto("Robot", 0, 1.5f,0);
        producto pJ5 = new producto("Burbujero", 0, 1.5f,0);
        producto pJ6 = new producto("Castillo", 0, 1.5f,0);
        producto pJ7 = new producto("Dinosaurio", 0, 1.5f,0);
        listaJuguetes.add(pJ1);
        listaJuguetes.add(pJ2);
        listaJuguetes.add(pJ3);
        listaJuguetes.add(pJ4);
        listaJuguetes.add(pJ5);
        listaJuguetes.add(pJ6);
        listaJuguetes.add(pJ7);
        
        //COnsumibles
        
        producto c1 = new producto("Coca Cola Mediana", 0, 1.5f,0);
        producto c2 = new producto("Inka Kola Mediana", 0, 1.5f,0);
        producto c3 = new producto("Pepsi Mediana", 0, 1.5f,0);
        producto c4 = new producto("Guaraná Mediana", 0, 1.5f,0);
        producto c5 = new producto("Gaterade", 0, 1.5f,0);
        producto c6 = new producto("Powerade", 0, 1.5f,0);
        producto c7 = new producto("Frugos Chico", 0, 1.5f,0);
        listaBebidas.add(c1);
        listaBebidas.add(c2);
        listaBebidas.add(c3);
        listaBebidas.add(c4);
        listaBebidas.add(c5);
        listaBebidas.add(c6);
        listaBebidas.add(c7);
        
        producto cS1 = new producto("Chizito Natural", 0, 1.5f,0);
        producto cS2 = new producto("Chizito Picante", 0, 1.5f,0);
        producto cS3 = new producto("Nachos Natural", 0, 1.5f,0);
        producto cS4 = new producto("Nachos Picante", 0, 1.5f,0);
        producto cS5 = new producto("Papas Lays Chico", 0, 1.5f,0);
        producto cS6 = new producto("Papas Lays Grande", 0, 1.5f,0);
        producto cS7 = new producto("Galleta Oreo", 0, 1.5f,0);
        listaSnacks.add(cS1);
        listaSnacks.add(cS2);
        listaSnacks.add(cS3);
        listaSnacks.add(cS4);
        listaSnacks.add(cS5);
        listaSnacks.add(cS6);
        listaSnacks.add(cS7);
        
        producto cH1 = new producto("Trika", 0, 1.5f,0);
        producto cH2 = new producto("Bebe", 0, 1.5f,0);
        producto cH3 = new producto("Jet", 0, 1.5f,0);
        producto cH4 = new producto("Sandwich Grande", 0, 1.5f,0);
        producto cH5 = new producto("Dolcetto", 0, 1.5f,0);
        producto cH6 = new producto("Sublime", 0, 1.5f,0);
        producto cH7 = new producto("Huracán", 0, 1.5f,0);
        listaHelados.add(cH1);
        listaHelados.add(cH2);
        listaHelados.add(cH3);
        listaHelados.add(cH4);
        listaHelados.add(cH5);
        listaHelados.add(cH6);
        listaHelados.add(cH7);
    }

    public void agregarProds(int id){
        BoxProductos.removeAllItems();
        BoxProductoCons.removeAllItems();
        switch(id){
            case 0:
                Iterator<producto> itrU = listaUtiles.iterator();
                while (itrU.hasNext()) {
                    producto p = itrU.next();
                    BoxProductos.addItem(p.toString());
                }
                break;
            case 1:
                Iterator<producto> itrA = listaAdornos.iterator();
                while (itrA.hasNext()) {
                    producto p = itrA.next();
                    BoxProductos.addItem(p.toString());
                }
                break;
            case 2:
                Iterator<producto> itrJ = listaJuguetes.iterator();
                while (itrJ.hasNext()) {
                    producto p = itrJ.next();
                    BoxProductos.addItem(p.toString());
                }
                break;
            case 3:
                Iterator<producto> itrB = listaBebidas.iterator();
                while (itrB.hasNext()) {
                    producto p = itrB.next();
                    BoxProductoCons.addItem(p.toString());
                }
                break;
            case 4:
                Iterator<producto> itrS = listaSnacks.iterator();
                while (itrS.hasNext()) {
                    producto p = itrS.next();
                    BoxProductoCons.addItem(p.toString());
                }
                break;
            case 5:
                Iterator<producto> itrH = listaHelados.iterator();
                while (itrH.hasNext()) {
                    producto p = itrH.next();
                    BoxProductoCons.addItem(p.toString());
                }
                break;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelCompras = new javax.swing.JTabbedPane();
        TabNoConsumible = new javax.swing.JPanel();
        LabelProductoNoCons = new javax.swing.JLabel();
        BoxProductos = new javax.swing.JComboBox<>();
        LabelCantidadNoCons = new javax.swing.JLabel();
        LabelPrecioUnitNoCons = new javax.swing.JLabel();
        txtCantidadNoCons = new javax.swing.JTextField();
        txtPrecioUnitNoCons = new javax.swing.JTextField();
        txtProductoNoCons = new javax.swing.JTextField();
        ButtIngresarNoCons = new javax.swing.JButton();
        ButtModificarNoCons = new javax.swing.JButton();
        ButtEliminarNoCons = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaNoCons = new javax.swing.JTable();
        LabelTotal = new javax.swing.JLabel();
        LabelTotalMostrado = new java.awt.Label();
        ButtVolver = new javax.swing.JButton();
        ButtCerrarSesion = new javax.swing.JButton();
        LabelTipoNoCons = new javax.swing.JLabel();
        BoxTipoNoCons = new javax.swing.JComboBox<>();
        TabConsumible = new javax.swing.JPanel();
        LabelTipoCons = new javax.swing.JLabel();
        BoxTipoCons = new javax.swing.JComboBox<>();
        LabelProductoCons = new javax.swing.JLabel();
        BoxProductoCons = new javax.swing.JComboBox<>();
        txtProductoCons = new javax.swing.JTextField();
        ButtIngresarCons = new javax.swing.JButton();
        ButtModificarCons = new javax.swing.JButton();
        ButtEliminarCons = new javax.swing.JButton();
        LabelLote = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        LabelCantidadCons = new javax.swing.JLabel();
        LabelPrecioUnitCons = new javax.swing.JLabel();
        txtPrecioUnitCons = new javax.swing.JTextField();
        txtCantidadCons = new javax.swing.JTextField();
        LabelVencimiento = new javax.swing.JLabel();
        CalendarVencimiento = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaCons = new javax.swing.JTable();
        LabelTotalCons = new javax.swing.JLabel();
        LabelTotalMostradoCons = new java.awt.Label();
        ButtVolverCons = new javax.swing.JButton();
        ButtCerrarSesionCons = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(676, 485));

        PanelCompras.setName("Compras"); // NOI18N

        LabelProductoNoCons.setText("Producto");

        BoxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxProductosActionPerformed(evt);
            }
        });

        LabelCantidadNoCons.setText("Cantidad");

        LabelPrecioUnitNoCons.setText("Precio Unitario");

        ButtIngresarNoCons.setText("Ingresar");
        ButtIngresarNoCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtIngresarNoConsActionPerformed(evt);
            }
        });

        ButtModificarNoCons.setText("Modificar");
        ButtModificarNoCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtModificarNoConsMouseClicked(evt);
            }
        });
        ButtModificarNoCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtModificarNoConsActionPerformed(evt);
            }
        });

        ButtEliminarNoCons.setText("Eliminar");
        ButtEliminarNoCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtEliminarNoConsMouseClicked(evt);
            }
        });

        TablaNoCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaNoCons);
        if (TablaNoCons.getColumnModel().getColumnCount() > 0) {
            TablaNoCons.getColumnModel().getColumn(0).setPreferredWidth(150);
            TablaNoCons.getColumnModel().getColumn(1).setPreferredWidth(1);
            TablaNoCons.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        LabelTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelTotal.setText("Total");

        ButtVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        ButtVolver.setText("Volver");
        ButtVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtVolverActionPerformed(evt);
            }
        });

        ButtCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        ButtCerrarSesion.setText("Cerrar Sesión");
        ButtCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtCerrarSesionActionPerformed(evt);
            }
        });

        LabelTipoNoCons.setText("Tipo");

        BoxTipoNoCons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Utiles Escolares", "Regalos", "Juguetes" }));
        BoxTipoNoCons.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BoxTipoNoConsItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout TabNoConsumibleLayout = new javax.swing.GroupLayout(TabNoConsumible);
        TabNoConsumible.setLayout(TabNoConsumibleLayout);
        TabNoConsumibleLayout.setHorizontalGroup(
            TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabNoConsumibleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTotal)
                .addGap(20, 20, 20)
                .addComponent(LabelTotalMostrado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(TabNoConsumibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabNoConsumibleLayout.createSequentialGroup()
                        .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TabNoConsumibleLayout.createSequentialGroup()
                                .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelProductoNoCons)
                                    .addComponent(LabelTipoNoCons))
                                .addGap(18, 18, 18)
                                .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BoxProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BoxTipoNoCons, 0, 133, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                                .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelCantidadNoCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCantidadNoCons))
                                .addGap(52, 52, 52)
                                .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelPrecioUnitNoCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecioUnitNoCons)))
                            .addGroup(TabNoConsumibleLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButtVolver)
                                .addGap(30, 30, 30)
                                .addComponent(ButtCerrarSesion)))
                        .addGap(56, 56, 56))
                    .addGroup(TabNoConsumibleLayout.createSequentialGroup()
                        .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TabNoConsumibleLayout.createSequentialGroup()
                                .addComponent(ButtIngresarNoCons)
                                .addGap(18, 18, 18)
                                .addComponent(ButtModificarNoCons)
                                .addGap(18, 18, 18)
                                .addComponent(ButtEliminarNoCons))
                            .addComponent(txtProductoNoCons, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        TabNoConsumibleLayout.setVerticalGroup(
            TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabNoConsumibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabNoConsumibleLayout.createSequentialGroup()
                        .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCantidadNoCons)
                            .addComponent(LabelPrecioUnitNoCons)
                            .addComponent(LabelTipoNoCons)
                            .addComponent(BoxTipoNoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadNoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioUnitNoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabNoConsumibleLayout.createSequentialGroup()
                        .addGap(0, 136, Short.MAX_VALUE)
                        .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelProductoNoCons, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BoxProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addComponent(txtProductoNoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtIngresarNoCons)
                    .addComponent(ButtModificarNoCons)
                    .addComponent(ButtEliminarNoCons))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelTotalMostrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(TabNoConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtVolver)
                    .addComponent(ButtCerrarSesion))
                .addGap(22, 22, 22))
        );

        PanelCompras.addTab("No Consumible", TabNoConsumible);

        LabelTipoCons.setText("Tipo");

        BoxTipoCons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Snacks", "Helados" }));
        BoxTipoCons.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BoxTipoConsItemStateChanged(evt);
            }
        });

        LabelProductoCons.setText("Producto");

        BoxProductoCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxProductoConsActionPerformed(evt);
            }
        });

        txtProductoCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoConsActionPerformed(evt);
            }
        });

        ButtIngresarCons.setText("Ingresar");
        ButtIngresarCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtIngresarConsMouseClicked(evt);
            }
        });

        ButtModificarCons.setText("Modificar");
        ButtModificarCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtModificarConsMouseClicked(evt);
            }
        });

        ButtEliminarCons.setText("Eliminar");
        ButtEliminarCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtEliminarConsMouseClicked(evt);
            }
        });

        LabelLote.setText("N° Lote");

        LabelCantidadCons.setText("Cantidad");

        LabelPrecioUnitCons.setText("Precio Unitario");

        LabelVencimiento.setText("F. Vencimiento");

        TablaCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Lote", "Cantidad", "Sub Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaCons);
        if (TablaCons.getColumnModel().getColumnCount() > 0) {
            TablaCons.getColumnModel().getColumn(0).setResizable(false);
            TablaCons.getColumnModel().getColumn(0).setPreferredWidth(150);
            TablaCons.getColumnModel().getColumn(1).setResizable(false);
            TablaCons.getColumnModel().getColumn(2).setResizable(false);
            TablaCons.getColumnModel().getColumn(3).setResizable(false);
        }

        LabelTotalCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelTotalCons.setText("Total");

        LabelTotalMostradoCons.setAlignment(java.awt.Label.CENTER);

        ButtVolverCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        ButtVolverCons.setText("Volver");
        ButtVolverCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtVolverConsActionPerformed(evt);
            }
        });

        ButtCerrarSesionCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        ButtCerrarSesionCons.setText("Cerrar Sesión");
        ButtCerrarSesionCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtCerrarSesionConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabConsumibleLayout = new javax.swing.GroupLayout(TabConsumible);
        TabConsumible.setLayout(TabConsumibleLayout);
        TabConsumibleLayout.setHorizontalGroup(
            TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabConsumibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TabConsumibleLayout.createSequentialGroup()
                            .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TabConsumibleLayout.createSequentialGroup()
                                    .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(TabConsumibleLayout.createSequentialGroup()
                                            .addComponent(LabelTipoCons)
                                            .addGap(42, 42, 42)
                                            .addComponent(BoxTipoCons, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TabConsumibleLayout.createSequentialGroup()
                                            .addComponent(LabelProductoCons)
                                            .addGap(18, 18, 18)
                                            .addComponent(BoxProductoCons, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(99, 99, 99)
                                    .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(TabConsumibleLayout.createSequentialGroup()
                                            .addComponent(LabelPrecioUnitCons)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtPrecioUnitCons, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TabConsumibleLayout.createSequentialGroup()
                                            .addComponent(LabelLote)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TabConsumibleLayout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addComponent(LabelCantidadCons)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCantidadCons, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(TabConsumibleLayout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(LabelVencimiento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(CalendarVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(txtProductoCons, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(TabConsumibleLayout.createSequentialGroup()
                                    .addComponent(ButtIngresarCons)
                                    .addGap(18, 18, 18)
                                    .addComponent(ButtModificarCons)
                                    .addGap(18, 18, 18)
                                    .addComponent(ButtEliminarCons))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabConsumibleLayout.createSequentialGroup()
                            .addComponent(LabelTotalCons)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LabelTotalMostradoCons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(106, 106, 106)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabConsumibleLayout.createSequentialGroup()
                        .addComponent(ButtVolverCons)
                        .addGap(18, 18, 18)
                        .addComponent(ButtCerrarSesionCons)
                        .addGap(93, 93, 93))))
        );
        TabConsumibleLayout.setVerticalGroup(
            TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabConsumibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelVencimiento)
                        .addComponent(LabelLote)
                        .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelTipoCons)
                        .addComponent(BoxTipoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CalendarVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxProductoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelProductoCons)
                    .addComponent(LabelPrecioUnitCons)
                    .addComponent(txtPrecioUnitCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCantidadCons)
                    .addComponent(txtCantidadCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TabConsumibleLayout.createSequentialGroup()
                        .addComponent(txtProductoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtIngresarCons)
                            .addComponent(ButtModificarCons)
                            .addComponent(ButtEliminarCons))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(LabelTotalCons))
                    .addComponent(LabelTotalMostradoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(TabConsumibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtVolverCons)
                    .addComponent(ButtCerrarSesionCons))
                .addGap(74, 74, 74))
        );

        PanelCompras.addTab("Consumible", TabConsumible);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCompras)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCompras)
        );

        PanelCompras.getAccessibleContext().setAccessibleName("tabPanelCmp");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtCerrarSesionActionPerformed
        ventanaHome.regresar();
        this.dispose();
    }//GEN-LAST:event_ButtCerrarSesionActionPerformed

    private void ButtVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtVolverActionPerformed
        vAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtVolverActionPerformed

    private void ButtEliminarNoConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtEliminarNoConsMouseClicked
        int filaSelect = TablaNoCons.getSelectedRow();
        if(filaSelect>=0){
            double num = Double.parseDouble(TablaNoCons.getValueAt(filaSelect,2).toString());
            totalNoCons = totalNoCons - num;
            ((DefaultTableModel)TablaNoCons.getModel()).removeRow(filaSelect);
            listaCmpNoCons.remove(filaSelect);
            mostrar(0);
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Debe seleccionar una fila!");
        }
    }//GEN-LAST:event_ButtEliminarNoConsMouseClicked

    private void ButtModificarNoConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtModificarNoConsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtModificarNoConsActionPerformed

    private void ButtModificarNoConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtModificarNoConsMouseClicked
        int filaSelect = TablaNoCons.getSelectedRow();
        if(filaSelect>=0){
            double num = Double.parseDouble(TablaNoCons.getValueAt(filaSelect,2).toString());
            totalNoCons = totalNoCons - num;
            txtProductoNoCons.setText(TablaNoCons.getValueAt(filaSelect,0).toString());
            txtCantidadNoCons.setText(TablaNoCons.getValueAt(filaSelect,1).toString());
            float sub = Float.parseFloat(TablaNoCons.getValueAt(filaSelect,2).toString());
            int cant = Integer.parseInt(TablaNoCons.getValueAt(filaSelect,1).toString());
            float unit = sub/cant;
            txtPrecioUnitNoCons.setText(String.valueOf(unit));
            ((DefaultTableModel)TablaNoCons.getModel()).removeRow(filaSelect);

            listaCmpNoCons.remove(filaSelect);
            mostrar(0);
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Debe seleccionar una fila!");
        }
    }//GEN-LAST:event_ButtModificarNoConsMouseClicked

    private void ButtIngresarNoConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtIngresarNoConsActionPerformed
        String auxst1 = txtProductoNoCons.getText();
        String auxst2 = txtCantidadNoCons.getText();
        String auxst3 = txtPrecioUnitNoCons.getText();
        if(!(auxst1.equals("")) && !(auxst2.equals("")) && !(auxst3.equals(""))){
            producto auxProdIng = new producto(txtProductoNoCons.getText(),Integer.parseInt(txtCantidadNoCons.getText()),Float.parseFloat(txtPrecioUnitNoCons.getText()),0);
            listaCmpNoCons.add(auxProdIng);
            totalNoCons = totalNoCons + (Double.parseDouble(txtPrecioUnitNoCons.getText())*(Double.parseDouble(txtCantidadNoCons.getText())));
            mostrar(0);
            txtProductoNoCons.setText("");
            txtCantidadNoCons.setText("");
            txtPrecioUnitNoCons.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"¡No puedes dejar espacios vacíos!");
        }
    }//GEN-LAST:event_ButtIngresarNoConsActionPerformed

    private void BoxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxProductosActionPerformed
        try{
            String prod = BoxProductos.getSelectedItem().toString();
            txtProductoNoCons.setText(prod);
        }
        catch (Exception e){

        }
    }//GEN-LAST:event_BoxProductosActionPerformed

    private void BoxTipoNoConsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BoxTipoNoConsItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(this.BoxTipoNoCons.getSelectedIndex()==0)
                agregarProds(0);
            if(this.BoxTipoNoCons.getSelectedIndex()==1)
                agregarProds(1);
            if(this.BoxTipoNoCons.getSelectedIndex()==2)
                agregarProds(2);
        }
    }//GEN-LAST:event_BoxTipoNoConsItemStateChanged

    private void txtProductoConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoConsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoConsActionPerformed

    private void ButtIngresarConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtIngresarConsMouseClicked
        String auxst1 = txtProductoCons.getText();
        String auxst2 = txtCantidadCons.getText();
        String auxst3 = txtPrecioUnitCons.getText();
        String auxst4 = txtLote.getText();
        if(!(auxst1.equals("")) && !(auxst2.equals("")) && !(auxst3.equals("")) && !(auxst4.equals(""))){
            producto auxProdIng = new producto(txtProductoCons.getText(),Integer.parseInt(txtCantidadCons.getText()),Float.parseFloat(txtPrecioUnitCons.getText()),Integer.parseInt(txtLote.getText()));
            listaCmpCons.add(auxProdIng);
            totalCons = totalCons + (Double.parseDouble(txtPrecioUnitCons.getText())*(Double.parseDouble(txtCantidadCons.getText())));
            mostrar(1);
            txtProductoCons.setText("");
            txtCantidadCons.setText("");
            txtPrecioUnitCons.setText("");
            txtLote.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"¡No puedes dejar espacios vacíos!");
        }
    }//GEN-LAST:event_ButtIngresarConsMouseClicked

    private void BoxTipoConsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BoxTipoConsItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(this.BoxTipoCons.getSelectedIndex()==0)
                agregarProds(3);
            if(this.BoxTipoCons.getSelectedIndex()==1)
                agregarProds(4);
            if(this.BoxTipoCons.getSelectedIndex()==2)
                agregarProds(5);
        }
    }//GEN-LAST:event_BoxTipoConsItemStateChanged

    private void BoxProductoConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxProductoConsActionPerformed
        try{
            String prod = BoxProductoCons.getSelectedItem().toString();
            txtProductoCons.setText(prod);
        }
        catch (Exception e){

        }
    }//GEN-LAST:event_BoxProductoConsActionPerformed

    private void ButtVolverConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtVolverConsActionPerformed
        vAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtVolverConsActionPerformed

    private void ButtCerrarSesionConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtCerrarSesionConsActionPerformed
        ventanaHome.regresar();
        this.dispose();
    }//GEN-LAST:event_ButtCerrarSesionConsActionPerformed

    private void ButtModificarConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtModificarConsMouseClicked
        int filaSelect = TablaCons.getSelectedRow();
        if(filaSelect>=0){
            double num = Double.parseDouble(TablaCons.getValueAt(filaSelect,3).toString());
            totalCons = totalCons - num;
            txtProductoCons.setText(TablaCons.getValueAt(filaSelect,0).toString());
            txtCantidadCons.setText(TablaCons.getValueAt(filaSelect,2).toString());
            float sub = Float.parseFloat(TablaCons.getValueAt(filaSelect,3).toString());
            int cant = Integer.parseInt(TablaCons.getValueAt(filaSelect,2).toString());
            float unit = sub/cant;
            txtPrecioUnitCons.setText(String.valueOf(unit));
            txtLote.setText(TablaCons.getValueAt(filaSelect, 1).toString());
            ((DefaultTableModel)TablaCons.getModel()).removeRow(filaSelect);

            listaCmpCons.remove(filaSelect);
            mostrar(1);
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Debe seleccionar una fila!");
        }
    }//GEN-LAST:event_ButtModificarConsMouseClicked

    private void ButtEliminarConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtEliminarConsMouseClicked
        int filaSelect = TablaCons.getSelectedRow();
        if(filaSelect>=0){
            double num = Double.parseDouble(TablaCons.getValueAt(filaSelect,3).toString());
            totalCons = totalCons - num;
            ((DefaultTableModel)TablaCons.getModel()).removeRow(filaSelect);
            listaCmpCons.remove(filaSelect);
            mostrar(1);
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Debe seleccionar una fila!");
        }
    }//GEN-LAST:event_ButtEliminarConsMouseClicked

    public void mostrar(int id){
        String matriz[][];
        switch (id){
            case 0:
                LabelTotalMostrado.setText(String.valueOf(totalNoCons));
                matriz = new String[listaCmpNoCons.size()][3];
                for(int i=0;i<listaCmpNoCons.size();i++){
                    matriz[i][0] = listaCmpNoCons.get(i).getNombre();
                    matriz[i][1] = String.valueOf(listaCmpNoCons.get(i).getCantidad());
                    matriz[i][2] = String.valueOf(listaCmpNoCons.get(i).getPreUnit()*listaCmpNoCons.get(i).getCantidad());
                }

                TablaNoCons.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String [] {
                        "Producto", "Cantidad", "Sub Total"
                    }
                ) {

                });
                break;
            case 1:
                LabelTotalMostradoCons.setText(String.valueOf(totalCons));
                matriz = new String[listaCmpCons.size()][4];
                for(int i=0;i<listaCmpCons.size();i++){
                    matriz[i][0] = listaCmpCons.get(i).getNombre();
                    matriz[i][1] = String.valueOf(listaCmpCons.get(i).getLote());
//                    matriz[i][2] = CalendarVencimiento.;
                    matriz[i][2] = String.valueOf(listaCmpCons.get(i).getCantidad());                    
                    matriz[i][3] = String.valueOf(listaCmpCons.get(i).getPreUnit()*listaCmpCons.get(i).getCantidad());
                    
                    
                }

                TablaCons.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String [] {
                        "Producto", "Lote","Cantidad", "Sub Total"
                    }
                ) {

                });
                break;
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxProductoCons;
    private javax.swing.JComboBox<String> BoxProductos;
    private javax.swing.JComboBox<String> BoxTipoCons;
    private javax.swing.JComboBox<String> BoxTipoNoCons;
    private javax.swing.JButton ButtCerrarSesion;
    private javax.swing.JButton ButtCerrarSesionCons;
    private javax.swing.JButton ButtEliminarCons;
    private javax.swing.JButton ButtEliminarNoCons;
    private javax.swing.JButton ButtIngresarCons;
    private javax.swing.JButton ButtIngresarNoCons;
    private javax.swing.JButton ButtModificarCons;
    private javax.swing.JButton ButtModificarNoCons;
    private javax.swing.JButton ButtVolver;
    private javax.swing.JButton ButtVolverCons;
    private com.toedter.calendar.JDateChooser CalendarVencimiento;
    private javax.swing.JLabel LabelCantidadCons;
    private javax.swing.JLabel LabelCantidadNoCons;
    private javax.swing.JLabel LabelLote;
    private javax.swing.JLabel LabelPrecioUnitCons;
    private javax.swing.JLabel LabelPrecioUnitNoCons;
    private javax.swing.JLabel LabelProductoCons;
    private javax.swing.JLabel LabelProductoNoCons;
    private javax.swing.JLabel LabelTipoCons;
    private javax.swing.JLabel LabelTipoNoCons;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JLabel LabelTotalCons;
    private java.awt.Label LabelTotalMostrado;
    private java.awt.Label LabelTotalMostradoCons;
    private javax.swing.JLabel LabelVencimiento;
    private javax.swing.JTabbedPane PanelCompras;
    private javax.swing.JPanel TabConsumible;
    private javax.swing.JPanel TabNoConsumible;
    private javax.swing.JTable TablaCons;
    private javax.swing.JTable TablaNoCons;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidadCons;
    private javax.swing.JTextField txtCantidadNoCons;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtPrecioUnitCons;
    private javax.swing.JTextField txtPrecioUnitNoCons;
    private javax.swing.JTextField txtProductoCons;
    private javax.swing.JTextField txtProductoNoCons;
    // End of variables declaration//GEN-END:variables
}
