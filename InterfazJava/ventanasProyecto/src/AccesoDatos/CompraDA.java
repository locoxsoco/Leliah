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
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call REGISTRAR_COMPRA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        if(c instanceof Persona){
            //System.out.print("j");
            stmt.setInt("_tipoCliente", 1);
            stmt.setNull("_ruc", java.sql.Types.VARCHAR);
            stmt.setNull("_razonSocial", java.sql.Types.VARCHAR);
            stmt.setString("_nombre", ((Persona) c).getNombre());
            stmt.setString("_apellidoPaterno", ((Persona) c).getApPaterno());
            stmt.setString("_apellidoMaterno", ((Persona) c).getApMaterno());
            stmt.setString("_numeroDocumento", ((Persona) c).getNumDoc());
            stmt.setInt("_FidTipoDocumentoIdentidad", ((Persona) c).getTipoDoc().getIdTipo());
        }else if(c instanceof Empresa){
            //System.out.print("a");
            stmt.setInt("_tipoCliente", 2);
            stmt.setString("_ruc", ((Empresa)c).getRuc());
            stmt.setString("_razonSocial", ((Empresa)c).getNombre());
            stmt.setNull("_nombre", java.sql.Types.VARCHAR);
            stmt.setNull("_apellidoPaterno", java.sql.Types.VARCHAR);
            stmt.setNull("_apellidoMaterno", java.sql.Types.VARCHAR);
            stmt.setNull("_numeroDocumento", java.sql.Types.VARCHAR);
            stmt.setNull("_FidTipoDocumentoIdentidad", java.sql.Types.INTEGER);
        }
        
        stmt.setString("_correo", c.getCorreo());
        stmt.setString("_direccion", c.getDireccion());
        stmt.setString("_telefono", c.getTelefono());
        stmt.setInt("_FidDepartamento", c.getDepartamento().getIdDep());
        stmt.setInt("_FidProvincia", c.getProvincia().getIdProv());
        stmt.setInt("_FidDistrito", c.getDistrito().getIdDist());
        
        
        stmt.registerOutParameter("_id", java.sql.Types.INTEGER); //1
        
        stmt.executeUpdate();
        
        c.setIdCliente(stmt.getInt("_id"));
        con.close();
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
