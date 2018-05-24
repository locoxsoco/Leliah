/*
 * Nombre: Luis Alberto Carranza Cobenas
 * Codigo: 20151110
 * and open the template in the editor.
 */
package AccesoDatos;

import clases.Departamento;
import clases.Distrito;
import clases.Provincia;
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
public class ClienteDA {
    public ClienteDA(){
        
    }
    
    public ArrayList<Departamento> listarDepartamentos() throws ClassNotFoundException, SQLException{
        ArrayList<Departamento> lista = new ArrayList<Departamento>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_DEPARTAMENTOS()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Departamento d = new Departamento();
            
            d.setIdDep(rs.getInt("idDepartamento"));
            d.setNombDep(rs.getString("nombreDepartamento"));
            
            lista.add(d);
        }
        con.close();
        return lista;
    }
    
    public ArrayList<Provincia> listarProvincias(int idDep) throws ClassNotFoundException, SQLException{
        ArrayList<Provincia> lista = new ArrayList<Provincia>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_PROVINCIAS(?)}";
        CallableStatement stmt = con.prepareCall(sql);
        stmt.setInt("_FidDepartamento", idDep);
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Provincia p = new Provincia();
            
            p.setIdProv(rs.getInt("idProvincia"));
            p.setNombProv(rs.getString("nombreProvincia"));
            
            lista.add(p);
        }
        con.close();
        return lista;
    }
    
    public ArrayList<Distrito> listarDistritos(int idProv) throws ClassNotFoundException, SQLException{
        ArrayList<Distrito> lista = new ArrayList<Distrito>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_DISTRITOS(?)}";
        CallableStatement stmt = con.prepareCall(sql);
        stmt.setInt("_FidProvincia", idProv);
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Distrito d = new Distrito();
            
            d.setIdDist(rs.getInt("idDistrito"));
            d.setNombDist(rs.getString("nombreDistrito"));
            
            lista.add(d);
        }
        con.close();
        return lista;
    }
}
