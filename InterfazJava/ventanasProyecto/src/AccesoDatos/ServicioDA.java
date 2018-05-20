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
        String sql = "{call CANT_NOMBRE_MED_ESP()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            //agregar elementos a lista
            Servicio s = new Servicio();
            s.SetId(rs.getInt("ID_SERVICIO"));
            s.setNombre(rs.getString("NOMBRE"));
            s.setprecioxUnit(rs.getDouble("PRECIO_U"));
        }
        con.close();
        return lista;
    }
}
