/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import LogicaNegocio.ProveedorBL;
import clases.Proveedor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres
 */
public class ventanaBuscarProv extends javax.swing.JFrame {

    /**
     * Creates new form ventanaBuscarProv
     */
    public ventanaCompra ventanaAnterior;
    private ProveedorBL LogicaNegocio;
    private ArrayList<Proveedor> lista;
    
    public ventanaBuscarProv() {
        addWindowListener(new java.awt.event.WindowAdapter(){
            
            public void windowClosing(java.awt.event.WindowEvent evt){
                cerrar();
            }
        });
        initComponents();
        LogicaNegocio = new ProveedorBL();
        lista = new ArrayList<Proveedor>();
        tabla.getColumnModel().getColumn(0).setPreferredWidth(30);
        seleccionar.setEnabled(false);
        buscar.doClick();
    }
    private void cerrar(){
        ventanaAnterior.setEnabled(true);
        this.dispose();
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
        jLabel2 = new javax.swing.JLabel();
        razon = new javax.swing.JTextField();
        ruc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        seleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Buscar Proveedor");
        setMinimumSize(new java.awt.Dimension(400, 420));
        getContentPane().setLayout(null);

        jLabel1.setText("Razon Social:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(23, 35, 90, 16);

        jLabel2.setText("RUC:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(23, 75, 60, 16);
        getContentPane().add(razon);
        razon.setBounds(119, 32, 210, 22);
        getContentPane().add(ruc);
        ruc.setBounds(119, 72, 111, 22);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUC", "Razon Social"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 160, 320, 190);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.setMaximumSize(new java.awt.Dimension(952444, 29243));
        buscar.setMinimumSize(new java.awt.Dimension(200, 300));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(70, 120, 100, 29);

        seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seleccionar.png"))); // NOI18N
        seleccionar.setText("Seleccionar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionar);
        seleccionar.setBounds(210, 120, 123, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        seleccionar.setEnabled(true);
    }//GEN-LAST:event_tablaMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            lista = LogicaNegocio.buscarProveedores(razon.getText(), ruc.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        int n = lista.size();
        int r = model.getRowCount();
        for (int j=0; j<r; j++){
            model.removeRow(0);
        }
        for (int i=0; i<n; i++){
            Object o[] = {lista.get(i).getRuc(), lista.get(i).getNombre(),lista.get(i).getId() , lista.get(i).getCorreo(), lista.get(i).getTelefono(),lista.get(i).getDiaSemana().toString(), lista.get(i).getDireccion()+", "+lista.get(i).getDistrito().toString()+", "+lista.get(i).getProvincia().toString()+", "+lista.get(i).getDepartamento().toString()};
            model.addRow(o);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        // TODO add your handling code here:
        int n = tabla.getSelectedRow();
        //this.ventanaAnterior.prov = lista.get(n);
        ventanaAnterior.razon.setText(lista.get(n).getNombre());
        ventanaAnterior.ruc.setText(lista.get(n).getRuc());
        ventanaAnterior.idProv = lista.get(n).getId();
        ventanaAnterior.comp.setProveedor( lista.get(n));
        ventanaAnterior.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_seleccionarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField razon;
    private javax.swing.JTextField ruc;
    private javax.swing.JButton seleccionar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
