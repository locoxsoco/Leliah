/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import clases.AdministradorSistema;
import clases.Jefe;
import clases.Trabajador;
import clases.Vendedor;
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
public class TrabajadorDA {
    public TrabajadorDA(){
        
    }
    
    public ArrayList<Trabajador> listarTrabajadores() throws ClassNotFoundException, SQLException{
        ArrayList<Trabajador> lista = new ArrayList<Trabajador>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_TRABAJADORES()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            //agregar elementos a lista
            Trabajador t = null;
            int priv = rs.getInt("privilegio");
            if(priv == 1){
                t = new Jefe();
            }else if(priv == 2){
                t = new AdministradorSistema();
                ((AdministradorSistema) t).setSueldo(rs.getDouble("sueldo"));
                ((AdministradorSistema) t).setMoneda(rs.getString("moneda"));
            }else if(priv == 3){
                t = new Vendedor();
                ((Vendedor) t).setPagoxHora(rs.getDouble("pagoxhora"));
                ((Vendedor) t).setHoraxSemana(rs.getInt("horasxsemana"));
                ((Vendedor) t).setMoneda(rs.getString("moneda"));
                ((Vendedor) t).setTiempoPago(rs.getString("FidTiempoPago"));
            }
            t.setId(rs.getInt("idTrabajador"));
            //System.out.println(s.getId());
            t.setNumDoc(rs.getInt("numeroDocumento"));
            t.setNombre(rs.getString("nombre"));
            t.setApPaterno(rs.getString("apellidoPaterno"));
            t.setApMaterno(rs.getString("apellidoMaterno"));
            t.setFecha(rs.getDate("fechaNacimiento"));
            t.setUsername(rs.getString("username"));
            t.setContrasena(rs.getString("contrasena"));
            t.setTipoDoc(rs.getString("FidDocumentoIdentidad"));

            lista.add(t);
        }
        con.close();
        return lista;
    }
    
}
