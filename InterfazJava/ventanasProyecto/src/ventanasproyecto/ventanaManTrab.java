/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class ventanaManTrab extends javax.swing.JFrame {

    /**
     * Creates new form ventanaManTrab
     */
    
    
    public ventanaManTrab() {
        initComponents();
        this.setTitle("Ventana Mantener Trabajadores");
        this.Ttipo.setEnabled(false);
        this.Tsueldo.setEnabled(false);
        Thoras.setEnabled(false);
        frec.setEnabled(false);
        sueldo.setEnabled(false);
        horas.setEnabled(false);
        registrar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        //this.setTitle("Ventana Mantener Trabajadores");
        this.setLocationRelativeTo(null);
        idU = 0;
    }
    int idU;
    ventanaAdmin anterior;

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Tsueldo = new javax.swing.JLabel();
        Thoras = new javax.swing.JLabel();
        Ttipo = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apPat = new javax.swing.JTextField();
        apMat = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        pass = new javax.swing.JTextField();
        moneda = new javax.swing.JComboBox<>();
        sueldo = new javax.swing.JTextField();
        frec = new javax.swing.JComboBox<>();
        horas = new javax.swing.JTextField();
        tipoUser = new javax.swing.JComboBox<>();
        registrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 570));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mantener Trabajadores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 13, 213, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 48, 54, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Apellido Paterno:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 86, 112, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Apellido Materno:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 121, 115, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Usuario:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 161, 53, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(12, 196, 80, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Tipo Usuario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 50, 83, 16);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(12, 236, 120, 16);

        Tsueldo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Tsueldo.setText("Pago x Hora");
        getContentPane().add(Tsueldo);
        Tsueldo.setBounds(470, 90, 90, 16);

        Thoras.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Thoras.setText("Horas Semanales:");
        getContentPane().add(Thoras);
        Thoras.setBounds(470, 120, 116, 16);

        Ttipo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Ttipo.setText("Tipo Pago:");
        getContentPane().add(Ttipo);
        Ttipo.setBounds(470, 160, 70, 16);
        getContentPane().add(nombre);
        nombre.setBounds(142, 48, 200, 22);
        getContentPane().add(apPat);
        apPat.setBounds(142, 83, 200, 22);
        getContentPane().add(apMat);
        apMat.setBounds(142, 118, 200, 22);
        getContentPane().add(user);
        user.setBounds(142, 158, 200, 22);
        getContentPane().add(fecha);
        fecha.setBounds(140, 230, 200, 22);
        getContentPane().add(pass);
        pass.setBounds(142, 193, 200, 22);

        moneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S./", "$" }));
        getContentPane().add(moneda);
        moneda.setBounds(810, 160, 44, 22);
        getContentPane().add(sueldo);
        sueldo.setBounds(600, 83, 200, 22);

        frec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja...", "Semanal", "Mensual" }));
        getContentPane().add(frec);
        frec.setBounds(600, 160, 200, 22);
        getContentPane().add(horas);
        horas.setBounds(600, 118, 200, 22);

        tipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja...", "Administrador del Sistema", "Jefe", "Vendedor" }));
        tipoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoUserActionPerformed(evt);
            }
        });
        getContentPane().add(tipoUser);
        tipoUser.setBounds(600, 48, 200, 22);

        registrar.setBackground(new java.awt.Color(255, 255, 204));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar);
        registrar.setBounds(470, 200, 100, 60);

        modificar.setBackground(new java.awt.Color(255, 255, 204));
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar);
        modificar.setBounds(590, 200, 105, 60);

        eliminar.setBackground(new java.awt.Color(255, 255, 204));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(710, 200, 105, 60);

        tabla.setBackground(new java.awt.Color(255, 255, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Usuario", "Contraseña", "Fecha", "Tipo Usuario", "Pago x Hora S./", "Horas Semanales", "Tipo Pago"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 282, 1029, 193);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/logout.png"))); // NOI18N
        jButton4.setText("Cerrar Sesión");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(880, 500, 140, 29);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/volver.png"))); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(749, 500, 110, 29);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/fondo2.jpg"))); // NOI18N
        jLabel11.setText("jLabel4");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-90, 0, 470, 270);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/fondo2.jpg"))); // NOI18N
        jLabel9.setText("jLabel4");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-90, 260, 470, 310);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/fondo2.jpg"))); // NOI18N
        jLabel13.setText("jLabel4");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(320, 0, 500, 270);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/fondo2.jpg"))); // NOI18N
        jLabel12.setText("jLabel4");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(760, 0, 320, 270);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/fondo2.jpg"))); // NOI18N
        jLabel14.setText("jLabel4");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(320, 260, 500, 310);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/fondo2.jpg"))); // NOI18N
        jLabel10.setText("jLabel4");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(770, 260, 300, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean isDouble(String cadena) {

        boolean resultado;

        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
    private boolean validarInput(){
        String s = this.nombre.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        for (int i=0; i<s.length(); i++){
            if(!((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i) == 'ñ' || s.charAt(i) == 'Ñ' || s.charAt(i)== ' ')){
                JOptionPane.showMessageDialog(null, "campo nombre solo puede contener letras", "Error Nombre", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }
        s = this.apPat.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        for (int i=0; i<s.length(); i++){
            if(!((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i) == 'ñ' || s.charAt(i) == 'Ñ' || s.charAt(i)== ' ')){
                JOptionPane.showMessageDialog(null, "campo apellido paterno solo puede contener letras", "Error Apellido Paterno", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }
        for (int i=0; i<s.length(); i++){
            if(!((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i) == 'ñ' || s.charAt(i) == 'Ñ' || s.charAt(i)== ' ')){
                JOptionPane.showMessageDialog(null, "campo apellido materno solo puede contener letras", "Error Apellido Materno", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }
        s = this.user.getText();
         if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        s = this.pass.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        boolean tieneNum = false;
        boolean tieneMayus = false;
        boolean tieneMinus = false;
        for (int i=0; i<s.length(); i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || s.charAt(i) == 'n'){
                tieneMinus = true;
            }else if((s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i) == 'N'){
                tieneMayus = true;
            }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                tieneNum = true;
            }
        }
        if(s.length()<8){
            JOptionPane.showMessageDialog(null, "Contraseña muy pequeña, mínimo 8 caracteres", "Error Contraseña", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        if(!tieneNum){
            JOptionPane.showMessageDialog(null, "Contraseña necesita almenos un número", "Error Contraseña", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        if(!tieneMayus){
            JOptionPane.showMessageDialog(null, "Contraseña necesita almenos una mayúscula", "Error Contraseña", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        if(!tieneMinus){
            JOptionPane.showMessageDialog(null, "Contraseña necesita almenos una minuscula", "Error Contraseña", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        s = this.tipoUser.getSelectedItem().toString();
        String s1;
        if(s =="Administrador del Sistema"){
            s1 = this.sueldo.getText();
            if((s1).equals("")){
                JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
            if(!isDouble(s1)){
                JOptionPane.showMessageDialog(null, "Sueldo debe ser un valor real", "Error Sueldo", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }else if(s == "Vendedor"){
            s1 = this.sueldo.getText();
            if((s1).equals("")){
                JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
            /*if((s != null && s.matches("[-+]?\\d*\\.?\\d+"))){
                JOptionPane.showMessageDialog(null, "Sueldo debe ser un valor real", "Error Sueldo", JOptionPane.PLAIN_MESSAGE);
                return false;
            }*/
            
            if(!isDouble(s1)){
                JOptionPane.showMessageDialog(null, "Sueldo debe ser un valor real", "Error Sueldo", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
            s1 = this.horas.getText();
            if((s1).equals("")){
                JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
            for (int i=0; i<s1.length(); i++){
                if(!(s1.charAt(i)>='0' && s1.charAt(i)<='9')){
                    JOptionPane.showMessageDialog(null, "Edad debe ser un valor entero positivo", "Error Edad", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
            s1 = this.frec.getSelectedItem().toString();
            if((s1).equals("Escoja...")){
                JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
            for (i=0; i<s1.length(); i++){
                if(!((s1.charAt(i)>='a' && s1.charAt(i)<='z')||(s1.charAt(i)>='A' && s1.charAt(i)<='Z') || s1.charAt(i) == 'n' || s1.charAt(i) == 'N')){
                    JOptionPane.showMessageDialog(null, "campo tipo pago solo puede contener letras", "Error Tipo Pago", JOptionPane.PLAIN_MESSAGE);
                    return false;
                }
        }
            
        }
        }
        return true;
    }
    
    private void tipoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoUserActionPerformed
        // TODO add your handling code here:
        String s = this.tipoUser.getSelectedItem().toString();
        if(s == "Escoja..."){
            Ttipo.setEnabled(false);
            Tsueldo.setEnabled(false);
            Thoras.setEnabled(false);
            frec.setEnabled(false);
            sueldo.setEnabled(false);
            horas.setEnabled(false);
            registrar.setEnabled(false);
        }else if (s == "Jefe"){
            Ttipo.setEnabled(false);
            Tsueldo.setEnabled(false);
            Thoras.setEnabled(false);
            frec.setEnabled(true);
            sueldo.setEnabled(true);
            horas.setEnabled(true);
            frec.setSelectedItem(frec.getItemAt(0));
            sueldo.setText("");
            horas.setText("");
            frec.setEnabled(false);
            sueldo.setEnabled(false);
            horas.setEnabled(false);
            registrar.setEnabled(true);
        }else if (s == "Administrador del Sistema"){
            Ttipo.setEnabled(false);
            Tsueldo.setEnabled(true);
            Thoras.setEnabled(false);
            frec.setEnabled(true);
            sueldo.setEnabled(true);
            horas.setEnabled(true);
            frec.setSelectedItem(frec.getItemAt(0));
            horas.setText("");
            frec.setEnabled(false);
            sueldo.setEnabled(true);
            horas.setEnabled(false);
            registrar.setEnabled(true);
        }else if (s == "Vendedor"){
            Ttipo.setEnabled(true);
            Tsueldo.setEnabled(true);
            Thoras.setEnabled(true);
            frec.setEnabled(true);
            sueldo.setEnabled(true);
            horas.setEnabled(true);
            registrar.setEnabled(true);
        }
    }//GEN-LAST:event_tipoUserActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    javax.swing.table.DefaultTableModel model;
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        boolean a = validarInput();
        if (!a) return;
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        idU++;
        String num = Integer.toString(idU);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Object s[] ={idU, nombre.getText(), apPat.getText(),apMat.getText(), user.getText(), pass.getText(), sdf.format(fecha.getDate()), tipoUser.getSelectedItem().toString(), sueldo.getText(), horas.getText(), frec.getSelectedItem()};
        
        model.addRow(s);
        nombre.setText("");
        apPat.setText("");
        apMat.setText("");
        user.setText("");
        pass.setText("");
        Date fecha1 = new Date();
        fecha.setDate(fecha1);
        tipoUser.setSelectedItem(tipoUser.getItemAt(0));
        sueldo.setText("");
        horas.setText("");
        frec.setSelectedItem(frec.getItemAt(0));
        
    }//GEN-LAST:event_registrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        boolean a = validarInput();
        if(!a) return;
        model.setValueAt(nombre.getText(), tabla.getSelectedRow(), 1);
        model.setValueAt(apPat.getText(), tabla.getSelectedRow(), 2);
        model.setValueAt(apMat.getText(), tabla.getSelectedRow(), 3);
        model.setValueAt(user.getText(), tabla.getSelectedRow(), 4);
        model.setValueAt(pass.getText(), tabla.getSelectedRow(), 5);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        model.setValueAt(sdf.format(fecha.getDate()), tabla.getSelectedRow(), 6);
        model.setValueAt(tipoUser.getSelectedItem().toString(), tabla.getSelectedRow(), 7);
        if(tipoUser.getSelectedItem().toString() == "Jefe"){
            frec.setSelectedItem(frec.getItemAt(0));
            sueldo.setText("");
            horas.setText("");
        }else if(tipoUser.getSelectedItem().toString() == "Administrador del Sistema"){
            frec.setSelectedItem(frec.getItemAt(0));
            horas.setText("");

        }
        model.setValueAt(sueldo.getText(), tabla.getSelectedRow(), 8);
        model.setValueAt(horas.getText(), tabla.getSelectedRow(), 9);
        model.setValueAt(frec.getSelectedItem().toString(), tabla.getSelectedRow(), 10);
        nombre.setText("");
        apPat.setText("");
        apMat.setText("");
        user.setText("");
        pass.setText("");
        Date fecha1 = new Date();
        fecha.setDate(fecha1);
        tipoUser.setSelectedItem(tipoUser.getItemAt(0));
        sueldo.setText("");
        horas.setText("");
        frec.setSelectedItem(frec.getItemAt(0));

    }//GEN-LAST:event_modificarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        nombre.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 1)));
        apPat.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 2)));
        apMat.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 3)));
        user.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 4)));
        pass.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 5)));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fecha.setDate(sdf.parse((model.getValueAt(tabla.getSelectedRow(), 6).toString())));
        } catch (ParseException ex) {
            Logger.getLogger(ventanaManTrab.class.getName()).log(Level.SEVERE, null, ex);
        }
        modificar.setEnabled(true);
        eliminar.setEnabled(true);
        /*ComboItem item;
        for (int i=0; i< tipoUser.getItemCount(); i++){
            item = tipoUser.getItemAt(i);
            if(item)
        }*/
        tipoUser.setSelectedItem(model.getValueAt(tabla.getSelectedRow(), 7));
        if(tipoUser.getSelectedItem().toString() == "Vendedor"){

            Ttipo.setEnabled(true);
            Tsueldo.setEnabled(true);
            Thoras.setEnabled(true);
            frec.setEnabled(true);
            sueldo.setEnabled(true);
            horas.setEnabled(true);
            sueldo.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 8)));
            horas.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 9)));
            frec.setSelectedItem(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 10)));
        }else if(tipoUser.getSelectedItem().toString() == "Administrador del Sistema"){

            Ttipo.setEnabled(false);
            Tsueldo.setEnabled(true);
            Thoras.setEnabled(false);
            frec.setEnabled(false);
            sueldo.setEnabled(true);
            horas.setEnabled(false);
            sueldo.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 8)));
        }else if(tipoUser.getSelectedItem().toString() == "Jefe"){
            Ttipo.setEnabled(false);
            Tsueldo.setEnabled(false);
            Thoras.setEnabled(false);
            frec.setEnabled(false);
            sueldo.setEnabled(false);
            horas.setEnabled(false);
        }

    }//GEN-LAST:event_tablaMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        model.removeRow(tabla.getSelectedRow());
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        nombre.setText("");
        apPat.setText("");
        apMat.setText("");
        user.setText("");
        pass.setText("");
        Date fecha1 = new Date();
        fecha.setDate(fecha1);
        tipoUser.setSelectedItem(tipoUser.getItemAt(0));
        sueldo.setText("");
        horas.setText("");
        frec.setSelectedItem(frec.getItemAt(0));
    }//GEN-LAST:event_eliminarActionPerformed
    ventanaLogin ventanaHome;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ventanaHome.regresar();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Thoras;
    public static javax.swing.JLabel Tsueldo;
    public static javax.swing.JLabel Ttipo;
    public static javax.swing.JTextField apMat;
    public static javax.swing.JTextField apPat;
    private javax.swing.JButton eliminar;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JComboBox<String> frec;
    public static javax.swing.JTextField horas;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox<String> moneda;
    public static javax.swing.JTextField nombre;
    public static javax.swing.JTextField pass;
    private javax.swing.JButton registrar;
    public static javax.swing.JTextField sueldo;
    public static javax.swing.JTable tabla;
    public static javax.swing.JComboBox<String> tipoUser;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
