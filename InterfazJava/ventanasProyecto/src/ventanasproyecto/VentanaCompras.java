/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import java.awt.Component;
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

/**
 *
 * @author VikAle
 */
public class VentanaCompras extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCompras
     */
    double total = 0;
    ArrayList<producto> listaCmp = new ArrayList<producto>(); 
    ArrayList<producto> lista = new ArrayList<producto>();
    VentanaPrincipal vAnterior;
    ventanaLogin ventanaHome;
    public VentanaCompras() {
        initComponents();
        producto p1 = new producto("Lapicero", 0, 1.5f);
        producto p2 = new producto("Borrador", 0, 1.5f);
        producto p3 = new producto("Cartulina", 0, 1.5f);
        producto p4 = new producto("Tajador", 0, 1.5f);
        producto p5 = new producto("Regla", 0, 1.5f);
        producto p6 = new producto("Colores", 0, 1.5f);
        producto p7 = new producto("Chequeo", 0, 1.5f);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        agregarProds();
        
//        CombBoxProds.getEditor().getEditorComponent().addKeyListener(new KeyAdapter(){
//        
//            public void kerReleased(KeyEvent evt){
//                
//            }
//        });
    }

    public void agregarProds(){
        CombBoxProds.removeAllItems();
        Iterator<producto> itr = lista.iterator();
        while (itr.hasNext()) {
            producto p = itr.next();
            CombBoxProds.addItem(p.getNombre());
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

        jLabel1 = new javax.swing.JLabel();
        prodIngresado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        acceptButtonCmp = new javax.swing.JButton();
        CantLabel = new javax.swing.JLabel();
        cantIngresada = new javax.swing.JTextField();
        PreUnitLabel = new javax.swing.JLabel();
        PreUnitIngresada = new javax.swing.JTextField();
        TotalCmpLabel = new javax.swing.JLabel();
        TotalMostradoCmp = new java.awt.Label();
        CmpCerrarButton = new javax.swing.JButton();
        ButtModificarCmp = new javax.swing.JButton();
        ButtEliminarCmp = new javax.swing.JButton();
        CombBoxProds = new javax.swing.JComboBox<>();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compras");

        jLabel1.setText("Producto");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Sub Total"
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
        TablaProductos.setRowHeight(20);
        TablaProductos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                TablaProductosComponentRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);
        if (TablaProductos.getColumnModel().getColumnCount() > 0) {
            TablaProductos.getColumnModel().getColumn(0).setResizable(false);
            TablaProductos.getColumnModel().getColumn(0).setPreferredWidth(150);
            TablaProductos.getColumnModel().getColumn(1).setResizable(false);
            TablaProductos.getColumnModel().getColumn(1).setPreferredWidth(1);
            TablaProductos.getColumnModel().getColumn(2).setResizable(false);
            TablaProductos.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        acceptButtonCmp.setText("Ingresar");
        acceptButtonCmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonCmpActionPerformed(evt);
            }
        });

        CantLabel.setText("Cantidad");

        cantIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantIngresadaActionPerformed(evt);
            }
        });

        PreUnitLabel.setText("Precio Unitario");

        PreUnitIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreUnitIngresadaActionPerformed(evt);
            }
        });

        TotalCmpLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TotalCmpLabel.setText("Total");
        TotalCmpLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        TotalCmpLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        TotalMostradoCmp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        CmpCerrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/volver.png"))); // NOI18N
        CmpCerrarButton.setText("Volver");
        CmpCerrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmpCerrarButtonMouseClicked(evt);
            }
        });

        ButtModificarCmp.setLabel("Modificar");
        ButtModificarCmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtModificarCmpMouseClicked(evt);
            }
        });

        ButtEliminarCmp.setLabel("Eliminar");
        ButtEliminarCmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtEliminarCmpMouseClicked(evt);
            }
        });

        CombBoxProds.setEditable(true);
        CombBoxProds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CombBoxProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombBoxProdsActionPerformed(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/logout.png"))); // NOI18N
        logout.setText("Cerrar Sesión");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(CombBoxProds, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(prodIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantIngresada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CantLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PreUnitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PreUnitIngresada))
                        .addGap(132, 132, 132))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acceptButtonCmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtModificarCmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtEliminarCmp))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(137, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CmpCerrarButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TotalCmpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalMostradoCmp, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CantLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PreUnitLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PreUnitIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CombBoxProds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prodIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButtonCmp)
                    .addComponent(ButtModificarCmp)
                    .addComponent(ButtEliminarCmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TotalMostradoCmp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(TotalCmpLabel))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmpCerrarButton)
                    .addComponent(logout))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantIngresadaActionPerformed

    private void PreUnitIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreUnitIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreUnitIngresadaActionPerformed

    private void acceptButtonCmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonCmpActionPerformed
        String auxst1 = prodIngresado.getText();
        String auxst2 = cantIngresada.getText();
        String auxst3 = PreUnitIngresada.getText();
        if(!(auxst1.equals("")) && !(auxst2.equals("")) && !(auxst3.equals(""))){
            producto auxProdIng = new producto(prodIngresado.getText(),Integer.parseInt(cantIngresada.getText()),Float.parseFloat(PreUnitIngresada.getText()));
            listaCmp.add(auxProdIng);
            total = total + (Double.parseDouble(PreUnitIngresada.getText())*(Double.parseDouble(cantIngresada.getText())));
            mostrar();
            prodIngresado.setText("");
            cantIngresada.setText("");
            PreUnitIngresada.setText("");
        }
        else{
           JOptionPane.showMessageDialog(null,"¡No puedes dejar espacios vacíos!"); 
        }
    }//GEN-LAST:event_acceptButtonCmpActionPerformed

    public void mostrar(){
        TotalMostradoCmp.setText(String.valueOf(total));
        String matriz[][] = new String[listaCmp.size()][3];
        for(int i=0;i<listaCmp.size();i++){
            matriz[i][0] = listaCmp.get(i).getNombre();
            matriz[i][1] = String.valueOf(listaCmp.get(i).getCantidad());
            matriz[i][2] = String.valueOf(listaCmp.get(i).getPreUnit()*listaCmp.get(i).getCantidad());
        }
        
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Producto", "Cantidad", "Sub Total"
            }
        ) {
            
        });
    }
    private void TablaProductosComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TablaProductosComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaProductosComponentRemoved

    private void CmpCerrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmpCerrarButtonMouseClicked
        vAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CmpCerrarButtonMouseClicked

    private void ButtModificarCmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtModificarCmpMouseClicked
        int filaSelect = TablaProductos.getSelectedRow();   
        if(filaSelect>=0){
            double num = Double.parseDouble(TablaProductos.getValueAt(filaSelect,2).toString());
            total = total - num;
            prodIngresado.setText(TablaProductos.getValueAt(filaSelect,0).toString());
            cantIngresada.setText(TablaProductos.getValueAt(filaSelect,1).toString());
            PreUnitIngresada.setText(TablaProductos.getValueAt(filaSelect,2).toString());            
            ((DefaultTableModel)TablaProductos.getModel()).removeRow(filaSelect);
            
            listaCmp.remove(filaSelect);
            mostrar();
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Debe seleccionar una fila!"); 
        }
    }//GEN-LAST:event_ButtModificarCmpMouseClicked

    private void ButtEliminarCmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtEliminarCmpMouseClicked
        int filaSelect = TablaProductos.getSelectedRow();   
        if(filaSelect>=0){
            double num = Double.parseDouble(TablaProductos.getValueAt(filaSelect,2).toString());
            total = total - num;                       
            ((DefaultTableModel)TablaProductos.getModel()).removeRow(filaSelect);            
            listaCmp.remove(filaSelect);
            mostrar();
        }
        else{
            JOptionPane.showMessageDialog(null,"¡Debe seleccionar una fila!"); 
        }
    }//GEN-LAST:event_ButtEliminarCmpMouseClicked

    private void CombBoxProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombBoxProdsActionPerformed
        try{
            String prod = CombBoxProds.getSelectedItem().toString();
            prodIngresado.setText(prod);
        }
        catch (Exception e){
            
        }
       
    }//GEN-LAST:event_CombBoxProdsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        ventanaHome.regresar();
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtEliminarCmp;
    private javax.swing.JButton ButtModificarCmp;
    private javax.swing.JLabel CantLabel;
    private javax.swing.JButton CmpCerrarButton;
    private javax.swing.JComboBox<String> CombBoxProds;
    private javax.swing.JTextField PreUnitIngresada;
    private javax.swing.JLabel PreUnitLabel;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JLabel TotalCmpLabel;
    private java.awt.Label TotalMostradoCmp;
    private javax.swing.JButton acceptButtonCmp;
    private javax.swing.JTextField cantIngresada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField prodIngresado;
    // End of variables declaration//GEN-END:variables
}
