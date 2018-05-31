/*
 * Nombre: Luis Alberto Carranza Cobenas
 * Codigo: 20151110
 * and open the template in the editor.
 */
package AccesoDatos;

import clases.Compra;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis Alberto Carranza Cobenas <20151110>
 */
public class CompraDA {
    public CompraDA(){
        
    }
    
    
    public void registrarCompras(Compra c) throws ClassNotFoundException, SQLException{
        
    }
    
    public void eliminarCompras(int id) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call ELIMINAR_CLIENTE(?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setInt("_id", id);
        
        stmt.executeUpdate();
        
        con.close();
    }
    
    
}
