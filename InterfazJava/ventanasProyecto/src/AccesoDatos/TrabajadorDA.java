/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import clases.AdministradorSistema;
import clases.Jefe;
import clases.TiempoPago;
import clases.TipoDocumentoIdentidad;
import clases.Trabajador;
import clases.Vendedor;
import clases.usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
                ((Vendedor) t).setTiempoPago(rs.getInt("FidTiempoPago"),rs.getString("TiempoPago.nombreTiempoPago"));
            }
            t.setId(rs.getInt("idTrabajador"));
            //System.out.println(s.getId());
            t.setNumDoc(rs.getString("numeroDocumento"));
            t.setNombre(rs.getString("nombre"));
            t.setApPaterno(rs.getString("apellidoPaterno"));
            t.setApMaterno(rs.getString("apellidoMaterno"));
            t.setFecha(rs.getDate("fechaNacimiento"));
            t.setUsername(rs.getString("username"));
            t.setContrasena(rs.getString("contrasena"));
            t.setTipoDoc(rs.getInt("FidTipoDocumentoIdentidad"),rs.getString("TipoDocumentoIdentidad.nombreDocumentoIdentidad"));

            lista.add(t);
        }
        con.close();
        return lista;
    }
    
    public void registrarTrabajador(Trabajador t) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call REGISTRAR_TRABAJADOR(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        if(t instanceof Jefe){
            //System.out.print("j");
            stmt.setInt("_privilegio", 1);
            stmt.setNull("_moneda", java.sql.Types.VARCHAR);
            stmt.setNull("_sueldo", java.sql.Types.DOUBLE);
            stmt.setNull("_pagoxhora", java.sql.Types.DOUBLE);
            stmt.setNull("_horasxsemana", java.sql.Types.INTEGER);
            stmt.setNull("_FidTiempoPago", java.sql.Types.INTEGER);
        }else if(t instanceof AdministradorSistema){
            //System.out.print("a");
            stmt.setInt("_privilegio", 2);
            stmt.setString("_moneda", ((AdministradorSistema) t).getMoneda());
            stmt.setDouble("_sueldo", ((AdministradorSistema) t).getSueldo());
            stmt.setNull("_pagoxhora", java.sql.Types.DOUBLE);
            stmt.setNull("_horasxsemana", java.sql.Types.INTEGER);
            stmt.setNull("_FidTiempoPago", java.sql.Types.INTEGER);
        }else if(t instanceof Vendedor){
            //System.out.print("v");
            stmt.setInt("_privilegio", 3);
            stmt.setNull("_sueldo", java.sql.Types.DOUBLE);
            stmt.setString("_moneda", ((Vendedor) t).getMoneda());
            stmt.setDouble("_pagoxhora", ((Vendedor) t).getPagoxHora());
            stmt.setDouble("_horasxsemana", ((Vendedor) t).getHoraxSemana());
            stmt.setInt("_FidTiempoPago", ((Vendedor) t).getTiempoPago().getIdTiempo());
        }
        
        stmt.setString("_numeroDocumento", t.getNumDoc()); //2
        stmt.setString("_nombre", t.getNombre()); //3
        stmt.setString("_apellidoPaterno", t.getApPaterno()); //4
        stmt.setString("_apellidoMaterno", t.getApMaterno()); //5
        //java.sql.Timestamp f = new java.sql.Timestamp(t.getFecha().getTime());
        //stmt.setTimestamp("_fechaNacimiento", f);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        stmt.setString("_fechaNacimiento", sdf.format(t.getFecha())); //6
        stmt.setString("_username", t.getUsername()); //7
        stmt.setString("_contrasena", t.getContrasena()); //8
        stmt.setInt("_FidTipoDocumentoIdentidad", t.getTipoDoc().getIdTipo());
        
        stmt.registerOutParameter("_id", java.sql.Types.INTEGER); //1
        
        stmt.executeUpdate();
        
        t.setId(stmt.getInt("_id"));
        con.close();
    }
    
    public void modificarTrabajador(Trabajador t) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call MODIFICAR_TRABAJADOR(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        if(t instanceof Jefe){
            //System.out.print("j");
            stmt.setInt("_privilegio", 1);
            stmt.setNull("_moneda", java.sql.Types.VARCHAR);
            stmt.setNull("_sueldo", java.sql.Types.DOUBLE);
            stmt.setNull("_pagoxhora", java.sql.Types.DOUBLE);
            stmt.setNull("_horasxsemana", java.sql.Types.INTEGER);
            stmt.setNull("_FidTiempoPago", java.sql.Types.INTEGER);
        }else if(t instanceof AdministradorSistema){
            //System.out.print("a");
            stmt.setInt("_privilegio", 2);
            stmt.setString("_moneda", ((AdministradorSistema) t).getMoneda());
            stmt.setDouble("_sueldo", ((AdministradorSistema) t).getSueldo());
            stmt.setNull("_pagoxhora", java.sql.Types.DOUBLE);
            stmt.setNull("_horasxsemana", java.sql.Types.INTEGER);
            stmt.setNull("_FidTiempoPago", java.sql.Types.INTEGER);
        }else if(t instanceof Vendedor){
            //System.out.print("v");
            stmt.setInt("_privilegio", 3);
            stmt.setNull("_sueldo", java.sql.Types.DOUBLE);
            stmt.setString("_moneda", ((Vendedor) t).getMoneda());
            stmt.setDouble("_pagoxhora", ((Vendedor) t).getPagoxHora());
            stmt.setDouble("_horasxsemana", ((Vendedor) t).getHoraxSemana());
            stmt.setInt("_FidTiempoPago", ((Vendedor) t).getTiempoPago().getIdTiempo());
        }
        
        stmt.setString("_numeroDocumento", t.getNumDoc()); //2
        stmt.setString("_nombre", t.getNombre()); //3
        stmt.setString("_apellidoPaterno", t.getApPaterno()); //4
        stmt.setString("_apellidoMaterno", t.getApMaterno()); //5
        //java.sql.Timestamp f = new java.sql.Timestamp(t.getFecha().getTime());
        //stmt.setTimestamp("_fechaNacimiento", f);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        stmt.setString("_fechaNacimiento", sdf.format(t.getFecha())); //6
        stmt.setString("_username", t.getUsername()); //7
        stmt.setString("_contrasena", t.getContrasena()); //8
        stmt.setInt("_FidTipoDocumentoIdentidad", t.getTipoDoc().getIdTipo());
        stmt.setInt("_id", t.getId());
        
        stmt.executeUpdate();

        con.close();
    }
    
    public void eliminarTrabajador(int id) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call ELIMINAR_TRABAJADOR(?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setInt("_id", id);
        
        stmt.executeUpdate();
        
        con.close();
    }
    
    public ArrayList<TipoDocumentoIdentidad> listarDocumentos() throws ClassNotFoundException, SQLException{
        ArrayList<TipoDocumentoIdentidad> lista = new ArrayList<TipoDocumentoIdentidad>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_TIPOS_DOCUMENTO_IDENTIDAD()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            TipoDocumentoIdentidad t = new TipoDocumentoIdentidad();
            
            t.setIdTipo(rs.getInt("idTipoDocumentoIdentidad"));
            t.setNombTipo(rs.getString("nombreDocumentoIdentidad"));
            
            lista.add(t);
        }
        con.close();
        return lista;
    }
    
     public ArrayList<TiempoPago> listarTiempoPago() throws ClassNotFoundException, SQLException{
        ArrayList<TiempoPago> lista = new ArrayList<TiempoPago>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_TIEMPOS_PAGO()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            TiempoPago t = new TiempoPago();
            
            t.setIdTiempo(rs.getInt("idTiempoPago"));
            t.setNombTiempo(rs.getString("nombreTiempoPago"));
            
            lista.add(t);
        }
        con.close();
        return lista;
     }
     
     public usuario validarUsuario(String _username,String _password) throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call VALIDAR_USUARIO(?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        stmt.registerOutParameter("_privilegio",java.sql.Types.INTEGER );
        stmt.setString("_username", _username);
        stmt.setString("_password", _password);
        stmt.registerOutParameter("_NOMBRE", java.sql.Types.VARCHAR);
        
        ResultSet rs = stmt.executeQuery();
        //priv=stmt.getInt("_privilegio");
        usuario u = new usuario();
        u.setPriv(stmt.getInt("_privilegio"));
        u.setNomb(stmt.getString("_NOMBRE"));
        con.close();
        return u;
    }
     
    public ArrayList<Trabajador> buscarTrabajadores(String nombre, String apPat, String apMat, String user, int privI, String numDoc) throws ClassNotFoundException, SQLException{
        ArrayList<Trabajador> lista = new ArrayList<Trabajador>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call BUSCAR_TRABAJADOR(?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setString("_nombre", nombre);
        stmt.setString("_apellidoPaterno", apPat);
        stmt.setString("_apellidoMaterno", apMat);
        stmt.setString("_username", user);
        stmt.setString("_numeroDocumento", numDoc);
        stmt.setInt("_privilegio", privI);
        
        
        
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
                ((Vendedor) t).setTiempoPago(rs.getInt("FidTiempoPago"),rs.getString("TiempoPago.nombreTiempoPago"));
            }
            t.setId(rs.getInt("idTrabajador"));
            //System.out.println(s.getId());
            t.setNumDoc(rs.getString("numeroDocumento"));
            t.setNombre(rs.getString("nombre"));
            t.setApPaterno(rs.getString("apellidoPaterno"));
            t.setApMaterno(rs.getString("apellidoMaterno"));
            t.setFecha(rs.getDate("fechaNacimiento"));
            t.setUsername(rs.getString("username"));
            t.setContrasena(rs.getString("contrasena"));
            t.setTipoDoc(rs.getInt("FidTipoDocumentoIdentidad"),rs.getString("TipoDocumentoIdentidad.nombreDocumentoIdentidad"));

            lista.add(t);
        }
        con.close();
        return lista;
    }
    
}
