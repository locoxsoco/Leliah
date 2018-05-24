/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import LogicaNegocio.TrabajadorBL;
import clases.AdministradorSistema;
import clases.Jefe;
import clases.TiempoPago;
import clases.TipoDocumentoIdentidad;
import clases.Trabajador;
import clases.Vendedor;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class ventanaManTrab extends javax.swing.JFrame {

    /**
     * Creates new form ventanaManTrab
     */
    
    private TrabajadorBL LogicaNegocio;
    public ventanaManTrab() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setTitle("Ventana Mantener Trabajadores");
        LogicaNegocio = new TrabajadorBL();
        lista = new ArrayList<Trabajador>();
        llenarComboBoxDoc();
        llenarComboBoxPago();
        listarTrabajadores();
        sueldo.setVisible(false);
        Tsueldo.setVisible(false);
        Thoras.setVisible(false);
        horas.setVisible(false);
        Ttipo.setVisible(false);
        frec.setVisible(false);
        moneda.setVisible(false);
        registrar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        //this.setTitle("Ventana Mantener Trabajadores");
        this.setLocationRelativeTo(null);
    }
    int idU;
    ventanaAdmin anterior;
    private ArrayList<Trabajador> lista;
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
        jLabel9 = new javax.swing.JLabel();
        tipoDoc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        numDoc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mantener Trabajadores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 13, 213, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 51, 54, 16);

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
        jLabel5.setBounds(12, 156, 53, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(12, 191, 80, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Tipo Usuario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 121, 83, 16);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(12, 226, 120, 16);

        Tsueldo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Tsueldo.setText("Pago x Hora");
        getContentPane().add(Tsueldo);
        Tsueldo.setBounds(460, 156, 90, 16);

        Thoras.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Thoras.setText("Horas Semanales:");
        getContentPane().add(Thoras);
        Thoras.setBounds(460, 191, 116, 16);

        Ttipo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Ttipo.setText("Frecuencia Pago:");
        getContentPane().add(Ttipo);
        Ttipo.setBounds(460, 226, 120, 16);
        getContentPane().add(nombre);
        nombre.setBounds(142, 48, 200, 22);
        getContentPane().add(apPat);
        apPat.setBounds(142, 83, 200, 22);
        getContentPane().add(apMat);
        apMat.setBounds(142, 118, 200, 22);
        getContentPane().add(user);
        user.setBounds(142, 153, 200, 22);
        getContentPane().add(fecha);
        fecha.setBounds(140, 223, 200, 22);
        getContentPane().add(pass);
        pass.setBounds(142, 188, 200, 22);

        moneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S./", "$" }));
        getContentPane().add(moneda);
        moneda.setBounds(750, 153, 50, 22);

        sueldo.setMinimumSize(new java.awt.Dimension(850, 650));
        getContentPane().add(sueldo);
        sueldo.setBounds(600, 153, 140, 22);

        getContentPane().add(frec);
        frec.setBounds(600, 223, 140, 22);
        getContentPane().add(horas);
        horas.setBounds(600, 188, 200, 22);

        tipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja...", "Administrador del Sistema", "Jefe", "Vendedor" }));
        tipoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoUserActionPerformed(evt);
            }
        });
        getContentPane().add(tipoUser);
        tipoUser.setBounds(600, 118, 200, 22);

        registrar.setBackground(new java.awt.Color(255, 255, 204));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar);
        registrar.setBounds(12, 270, 90, 25);

        modificar.setBackground(new java.awt.Color(255, 255, 204));
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar);
        modificar.setBounds(132, 270, 90, 25);

        eliminar.setBackground(new java.awt.Color(255, 255, 204));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(252, 270, 90, 25);

        tabla.setBackground(new java.awt.Color(255, 255, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Completo", "Usuario", "Contraseña", "Fecha", "Tipo Usuario"
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
            tabla.getColumnModel().getColumn(5).setMinWidth(100);
            tabla.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 320, 790, 193);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        jButton4.setText("Cerrar Sesión");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(660, 530, 140, 29);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(530, 530, 110, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Tipo Documento:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 51, 110, 16);

        getContentPane().add(tipoDoc);
        tipoDoc.setBounds(600, 48, 200, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Número Documento:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 86, 140, 16);
        getContentPane().add(numDoc);
        numDoc.setBounds(600, 83, 200, 22);

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
    
    private void llenarComboBoxDoc() throws ClassNotFoundException, SQLException{
        ArrayList<TipoDocumentoIdentidad> docs = LogicaNegocio.listarDocumentos();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        int n = docs.size();
        for(int i=0; i<n; i++){
            modelo.addElement(docs.get(i));
        }
        tipoDoc.setModel(modelo);
    }
    
    private void llenarComboBoxPago() throws ClassNotFoundException, SQLException{
        ArrayList<TiempoPago> docs = LogicaNegocio.listarTiempoPago();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        int n = docs.size();
        for(int i=0; i<n; i++){
            modelo.addElement(docs.get(i));
        }
        frec.setModel(modelo);
    }
    
    private void listarTrabajadores() throws ClassNotFoundException, SQLException{
        lista = LogicaNegocio.listarTrabajadores();
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        int n = lista.size();
        int r = model.getRowCount();
        for (int j=0; j<r; j++){
            model.removeRow(0);
        }
        for (int i=0; i<n; i++){
            String tipo = "";
            if(lista.get(i) instanceof Jefe)
                tipo = "Jefe";
            else if(lista.get(i) instanceof AdministradorSistema)
                tipo = "Administrador del Sistema";
            else if(lista.get(i) instanceof Vendedor)
                tipo = "Vendedor";
            Object o[] = {lista.get(i).getId(), lista.get(i).getNombre()+" "+lista.get(i).getApPaterno()+" "+lista.get(i).getApMaterno() , lista.get(i).getUsername(), lista.get(i).getContrasena(), lista.get(i).getFecha().toString(),tipo};
            model.addRow(o);
        }
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
            Ttipo.setVisible(false);
            Tsueldo.setVisible(false);
            Thoras.setVisible(false);
            frec.setVisible(false);
            sueldo.setVisible(false);
            horas.setVisible(false);
            moneda.setVisible(false);
            registrar.setEnabled(false);
        }else if (s == "Jefe"){
            Ttipo.setVisible(false);
            Tsueldo.setVisible(false);
            Thoras.setVisible(false);
            frec.setVisible(false);
            sueldo.setVisible(false);
            horas.setVisible(false);
            registrar.setEnabled(true);
            moneda.setVisible(false);
        }else if (s == "Administrador del Sistema"){
            Ttipo.setVisible(false);
            Tsueldo.setText("Sueldo:");
            Tsueldo.setVisible(true);
            Thoras.setVisible(false);
            frec.setVisible(false);
            sueldo.setText("");
            sueldo.setVisible(true);
            horas.setVisible(false);
            moneda.setSelectedItem(moneda.getItemAt(0));
            moneda.setVisible(true);
            registrar.setEnabled(true);
            
        }else if (s == "Vendedor"){
            Ttipo.setVisible(true);
            Tsueldo.setText("Pago x Hora:");
            Tsueldo.setVisible(true);
            Thoras.setVisible(true);
            frec.setSelectedItem(frec.getItemAt(0));
            frec.setVisible(true);
            sueldo.setText("");
            sueldo.setVisible(true);
            horas.setText("");
            horas.setVisible(true);
            moneda.setSelectedItem(moneda.getItemAt(0));
            moneda.setVisible(true);
            registrar.setEnabled(true);
        }
    }//GEN-LAST:event_tipoUserActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea volver a la ventan anterior?","Volver", JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
            anterior.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed
    javax.swing.table.DefaultTableModel model;
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        boolean a = validarInput();
        if (!a) return;
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Trabajador t = null;
        String tipo = tipoUser.getSelectedItem().toString();
        if(tipo.equals("Jefe")){
            t = new Jefe();
        }else if(tipo.equals("Administrador del Sistema")){
            t = new AdministradorSistema();
            ((AdministradorSistema)t).setSueldo(Double.parseDouble(sueldo.getText()));
            ((AdministradorSistema)t).setMoneda(moneda.getSelectedItem().toString());
        }else if(tipo.equals("Vendedor")){
            t = new Vendedor();
            ((Vendedor)t).setTiempoPago((TiempoPago) frec.getSelectedItem());
            ((Vendedor)t).setHoraxSemana(Integer.parseInt(horas.getText()));
            ((Vendedor)t).setPagoxHora(Double.parseDouble(sueldo.getText()));
            ((Vendedor)t).setMoneda(moneda.getSelectedItem().toString());
        }
        t.setNombre(nombre.getText());
        t.setApPaterno(apPat.getText());
        t.setApMaterno(apMat.getText());
        t.setUsername(user.getText());
        t.setContrasena(pass.getText());
        java.sql.Date sqlDate = new java.sql.Date(fecha.getDate().getTime());
        t.setFecha(sqlDate);
        //System.out.println(sdf.format(t.getFecha()));
        t.setNumDoc(numDoc.getText());
        t.setTipoDoc((TipoDocumentoIdentidad) tipoDoc.getSelectedItem());
        
        try {
            LogicaNegocio.registrarTrabajador(t);
            listarTrabajadores();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManTrab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManTrab.class.getName()).log(Level.SEVERE, null, ex);
        }

        nombre.setText("");
        apPat.setText("");
        apMat.setText("");
        user.setText("");
        pass.setText("");
        java.util.Date fecha1 = new java.util.Date();
        fecha.setDate(fecha1);
        tipoDoc.setSelectedItem(tipoDoc.getItemAt(0));
        numDoc.setText("");
        tipoUser.setSelectedItem(tipoUser.getItemAt(0));
        sueldo.setText("");
        moneda.setSelectedItem(moneda.getItemAt(0));
        horas.setText("");
        frec.setSelectedItem(frec.getItemAt(0));
        registrar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        sueldo.setVisible(false);
        Tsueldo.setVisible(false);
        Thoras.setVisible(false);
        horas.setVisible(false);
        Ttipo.setVisible(false);
        frec.setVisible(false);
        moneda.setVisible(false);

    }//GEN-LAST:event_registrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        boolean a = validarInput();
        if(!a) return;
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        Trabajador t = null;
        String tipo = tipoUser.getSelectedItem().toString();
        if(tipo.equals("Jefe")){
            t = new Jefe();
        }else if(tipo.equals("Administrador del Sistema")){
            t = new AdministradorSistema();
            ((AdministradorSistema)t).setSueldo(Double.parseDouble(sueldo.getText()));
            ((AdministradorSistema)t).setMoneda(moneda.getSelectedItem().toString());
        }else if(tipo.equals("Vendedor")){
            t = new Vendedor();
            ((Vendedor)t).setTiempoPago((TiempoPago) frec.getSelectedItem());
            ((Vendedor)t).setHoraxSemana(Integer.parseInt(horas.getText()));
            ((Vendedor)t).setPagoxHora(Double.parseDouble(sueldo.getText()));
            ((Vendedor)t).setMoneda(moneda.getSelectedItem().toString());
        }
        t.setNombre(nombre.getText());
        t.setApPaterno(apPat.getText());
        t.setApMaterno(apMat.getText());
        t.setUsername(user.getText());
        t.setContrasena(pass.getText());
        java.sql.Date sqlDate = new java.sql.Date(fecha.getDate().getTime());
        t.setFecha(sqlDate);
        //System.out.println(sdf.format(t.getFecha()));
        t.setNumDoc(numDoc.getText());
        t.setTipoDoc((TipoDocumentoIdentidad) tipoDoc.getSelectedItem());
        t.setId(idU);
        try {
            LogicaNegocio.modificarTrabajador(t);
            listarTrabajadores();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManTrab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManTrab.class.getName()).log(Level.SEVERE, null, ex);
        }

        nombre.setText("");
        apPat.setText("");
        apMat.setText("");
        user.setText("");
        pass.setText("");
        java.util.Date fecha1 = new java.util.Date();
        fecha.setDate(fecha1);
        tipoDoc.setSelectedItem(tipoDoc.getItemAt(0));
        numDoc.setText("");
        tipoUser.setSelectedItem(tipoUser.getItemAt(0));
        sueldo.setText("");
        moneda.setSelectedItem(moneda.getItemAt(0));
        horas.setText("");
        frec.setSelectedItem(frec.getItemAt(0));
        registrar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        sueldo.setVisible(false);
        Tsueldo.setVisible(false);
        Thoras.setVisible(false);
        horas.setVisible(false);
        Ttipo.setVisible(false);
        frec.setVisible(false);
        moneda.setVisible(false);

    }//GEN-LAST:event_modificarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int n = tabla.getSelectedRow();
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        //nombre.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 1)));
        //apPat.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 2)));
        //apMat.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 3)));
        //user.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 4)));
        //pass.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 5)));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        nombre.setText(lista.get(n).getNombre());
        apPat.setText(lista.get(n).getApPaterno());
        apMat.setText(lista.get(n).getApMaterno());
        user.setText(lista.get(n).getUsername());
        pass.setText(lista.get(n).getContrasena());
        fecha.setDate(lista.get(n).getFecha());
        tipoDoc.setSelectedItem(lista.get(n).getTipoDoc().toString());
        numDoc.setText(lista.get(n).getNumDoc());
        if(lista.get(n) instanceof Jefe){
            sueldo.setVisible(false);
            Tsueldo.setVisible(false);
            Thoras.setVisible(false);
            horas.setVisible(false);
            Ttipo.setVisible(false);
            frec.setVisible(false);
            moneda.setVisible(false);
            tipoUser.setSelectedItem("Jefe");
        }else if(lista.get(n) instanceof AdministradorSistema){
            sueldo.setVisible(true);
            Tsueldo.setText("Sueldo:");
            Tsueldo.setVisible(true);
            Thoras.setVisible(false);
            horas.setVisible(false);
            Ttipo.setVisible(false);
            frec.setVisible(false);
            moneda.setVisible(true);
            tipoUser.setSelectedItem("Administrador del Sistema");
            sueldo.setText(String.valueOf(((AdministradorSistema)lista.get(n)).getSueldo()));
            moneda.setSelectedItem(((AdministradorSistema)lista.get(n)).getMoneda());
        }else if(lista.get(n) instanceof Vendedor){
            sueldo.setVisible(true);
            Tsueldo.setText("Pago x Hora:");
            Tsueldo.setVisible(true);
            Thoras.setVisible(true);
            horas.setVisible(true);
            Ttipo.setVisible(true);
            frec.setVisible(true);
            moneda.setVisible(true);
            tipoUser.setSelectedItem("Vendedor");
            sueldo.setText(String.valueOf(((Vendedor)lista.get(n)).getPagoxHora()));
            moneda.setSelectedItem(((Vendedor)lista.get(n)).getMoneda());
            horas.setText(String.valueOf(((Vendedor)lista.get(n)).getHoraxSemana()));
            frec.setSelectedItem(((Vendedor)lista.get(n)).getTiempoPago().getNombTiempo());
        }
        
        idU = Integer.parseInt(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 0)));
        /*try {
            fecha.setDate(sdf.parse((model.getValueAt(tabla.getSelectedRow(), 6).toString())));
        } catch (ParseException ex) {
            Logger.getLogger(ventanaManTrab.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        modificar.setEnabled(true);
        eliminar.setEnabled(true);
        /*ComboItem item;
        for (int i=0; i< tipoUser.getItemCount(); i++){
            item = tipoUser.getItemAt(i);
            if(item)
        }*/
    }//GEN-LAST:event_tablaMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try {
            // TODO add your handling code here:
            LogicaNegocio.eliminarTrabajador(idU);
            listarTrabajadores();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManTrab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManTrab.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nombre.setText("");
        apPat.setText("");
        apMat.setText("");
        user.setText("");
        pass.setText("");
        java.util.Date fecha1 = new java.util.Date();
        fecha.setDate(fecha1);
        tipoDoc.setSelectedItem(tipoDoc.getItemAt(0));
        numDoc.setText("");
        tipoUser.setSelectedItem(tipoUser.getItemAt(0));
        sueldo.setText("");
        moneda.setSelectedItem(moneda.getItemAt(0));
        horas.setText("");
        frec.setSelectedItem(frec.getItemAt(0));
        registrar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        sueldo.setVisible(false);
        Tsueldo.setVisible(false);
        Thoras.setVisible(false);
        horas.setVisible(false);
        Ttipo.setVisible(false);
        frec.setVisible(false);
        moneda.setVisible(false);
    }//GEN-LAST:event_eliminarActionPerformed
    ventanaLogin ventanaHome;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?","Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
            ventanaHome.regresar();
            this.dispose();
        }
        
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
    private javax.swing.JTextField numDoc;
    public static javax.swing.JTextField pass;
    private javax.swing.JButton registrar;
    public static javax.swing.JTextField sueldo;
    public static javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipoDoc;
    public static javax.swing.JComboBox<String> tipoUser;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
