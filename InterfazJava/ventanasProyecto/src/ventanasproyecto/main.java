/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import java.sql.SQLException;

/**
 *
 * @author Andres
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        int n = args.length;
        ventanaLogin v1 = new ventanaLogin();
        v1.setVisible(false);
        if(n==0){
            v1.setVisible(true);
        }else if(n==1){
            VentanaPrincipal v2 = new VentanaPrincipal();
            v2.ventanaHome = v1;
            v2.setLocationRelativeTo(null);
            v2.setVisible(true);
            v2.nomb1.setText("");
            v1.setVisible(false);
        }
        
    }
    
}
