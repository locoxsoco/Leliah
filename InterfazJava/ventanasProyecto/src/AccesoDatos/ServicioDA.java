/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import clases.Servicio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class ServicioDA {
    public ServicioDA(){
        
    }
    
    public ArrayList<Servicio> listarServicios() throws ClassNotFoundException, SQLException{
        ArrayList<Servicio> lista = new ArrayList<Servicio>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_SERVICIOS()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            //agregar elementos a lista
            Servicio s = new Servicio();
            s.SetId(rs.getInt("idServicio"));
            //System.out.println(s.getId());
            s.setNombre(rs.getString("nombre"));
            s.setprecioxUnit(rs.getDouble("precioUnitario"));
            lista.add(s);
        }
        con.close();
        return lista;
    }
    
    public int registrarServicio(Servicio s) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call REGISTRAR_SERVICIO(?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setString("_nombre", s.getNombre());
        stmt.setDouble("_precioUnitario", s.getprecioxUnit());
        stmt.registerOutParameter("_id", java.sql.Types.INTEGER);
        stmt.registerOutParameter("_error", java.sql.Types.INTEGER);
        
        stmt.executeUpdate();
        
        s.SetId(stmt.getInt("_id"));
        int err = stmt.getInt("_error");
        con.close();
        return err;
    }
    
    public int modificarServicio(Servicio s) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call MODIFICAR_SERVICIO(?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setString("_nombre", s.getNombre());
        stmt.setDouble("_precioUnitario", s.getprecioxUnit());
        stmt.setInt("_id", s.getId());
        stmt.registerOutParameter("_error", java.sql.Types.INTEGER);
        
        stmt.executeUpdate();
        
        int err = stmt.getInt("_error");
        con.close();
        return err;
    }
    
    public void eliminarServicio(int id) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call ELIMINAR_SERVICIO(?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setInt("_id", id);
        
        stmt.executeUpdate();
        
        con.close();
        
    }
    
    public ArrayList<Servicio> buscarServicio(String nomb) throws ClassNotFoundException, SQLException{
        ArrayList<Servicio> lista = new ArrayList<Servicio>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call BUSCAR_SERVICIO(?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setString("_nombre", nomb);
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            //agregar elementos a lista
            Servicio s = new Servicio();
            s.SetId(rs.getInt("idServicio"));
            //System.out.println(s.getId());
            s.setNombre(rs.getString("nombre"));
            s.setprecioxUnit(rs.getDouble("precioUnitario"));
            lista.add(s);
        }
        con.close();
        return lista;
    }
    
}
