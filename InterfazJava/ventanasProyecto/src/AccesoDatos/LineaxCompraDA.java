/*
 * Nombre: Luis Alberto Carranza Cobenas
 * Codigo: 20151110
 * and open the template in the editor.
 */
package AccesoDatos;

import clases.LineaxCompra;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Luis Alberto Carranza Cobenas <20151110>
 */
public class LineaxCompraDA {
    public LineaxCompraDA(){
    
    }
    public void registrarDetCompra(LineaxCompra lineaxProd,int idCompra) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call REGISTRAR_PRODUCTOXCOMPRA(?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String reportDate;
        if(lineaxProd.getFechaCaducidad()!=null){
            reportDate = sdf.format(lineaxProd.getFechaCaducidad());
        }else{
            reportDate="";
        }
        //System.out.print("j");
        stmt.setInt("_FidProducto", lineaxProd.getProducto().getIdProducto());
        stmt.setInt("_FidCompra", idCompra);
        stmt.setInt("_cantidad", lineaxProd.getCantidad());
        stmt.setDouble("_precioUnitario", lineaxProd.getPrecioUnit());
        stmt.setString("_fechaCaducidad", reportDate);
        
        stmt.executeUpdate();
        
        con.close();
    }
    
}
