/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

/**
 *
 * @author Andres
 */
public class ventanaCompra extends javax.swing.JFrame {

    /**
     * Creates new form ventanaCompra
     */
    public ventanaCompra() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

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
        setTitle("Registrar Compra");
        setMinimumSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jButton1.setText("Nuevo");
        getContentPane().add(jButton1);
        jButton1.setBounds(12, 13, 91, 29);

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButton2.setText("Guardar");
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 20, 103, 29);

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jButton3.setText("Cancelar");
        getContentPane().add(jButton3);
        jButton3.setBounds(240, 20, 120, 29);

        jLabel1.setText("Proveedor:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 63, 16);

        jLabel2.setText("Ruc:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 140, 26, 16);

        jLabel3.setText("Razon Social:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 78, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(110, 110, 132, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(110, 140, 140, 22);

        jLabel5.setText("Producto:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 180, 60, 16);

        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 210, 60, 16);

        jLabel7.setText("Precio Unitario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 240, 100, 16);

        jLabel8.setText("Cantidad:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 270, 70, 16);

        jButton4.setText("...");
        getContentPane().add(jButton4);
        jButton4.setBounds(110, 80, 40, 25);

        jButton5.setText("...");
        getContentPane().add(jButton5);
        jButton5.setBounds(90, 180, 40, 25);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 240, 70, 22);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(130, 270, 70, 22);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(90, 210, 150, 22);

        jButton6.setBackground(new java.awt.Color(255, 255, 204));
        jButton6.setText("Agregar");
        getContentPane().add(jButton6);
        jButton6.setBounds(250, 240, 79, 25);

        jButton7.setBackground(new java.awt.Color(255, 255, 204));
        jButton7.setText("Eliminar");
        getContentPane().add(jButton7);
        jButton7.setBounds(250, 270, 79, 25);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 310, 350, 210);

        jLabel9.setText("Total:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 540, 41, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(250, 540, 110, 22);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        jButton8.setText("Volver");
        getContentPane().add(jButton8);
        jButton8.setBounds(100, 580, 110, 29);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        jButton9.setText("Cerrar Sesión");
        getContentPane().add(jButton9);
        jButton9.setBounds(230, 580, 140, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ventanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}