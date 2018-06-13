/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import clases.Departamento;
import clases.DiaSemana;
import clases.Distrito;
import clases.Proveedor;
import clases.Provincia;
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
public class ProveedorDA {
    public ProveedorDA(){
        
    }
    
    public ArrayList<DiaSemana> listarDias() throws ClassNotFoundException, SQLException{
        ArrayList<DiaSemana> lista = new ArrayList<DiaSemana>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_DIAS_SEMANA()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            DiaSemana d = new DiaSemana();
            
            d.setIdDia(rs.getInt("idDiaSemana"));
            d.setNombDia(rs.getString("nombreDiaSemana"));
            
            lista.add(d);
        }
        con.close();
        return lista;
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
    
    public ArrayList<Proveedor> listarProveedores() throws ClassNotFoundException, SQLException{
        ArrayList<Proveedor> lista = new ArrayList<Proveedor>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_PROVEEDORES()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Proveedor p = new Proveedor();
            p.setId(rs.getInt("idProveedor"));
            p.setNombre(rs.getString("razonSocial"));
            p.setRuc(rs.getString("ruc"));
            p.setCorreo(rs.getString("correo"));
            p.setTelefono(rs.getString("telefono"));
            p.setDiaSemana(rs.getInt("Proveedor.FidDiaSemana"), rs.getString("DiaSemana.nombreDiaSemana"));
            p.setDepartamento(rs.getInt("Proveedor.FidDepartamento"), rs.getString("Departamento.nombreDepartamento"));
            p.setProvincia(rs.getInt("Proveedor.FidProvincia"), rs.getString("Provincia.nombreProvincia"));
            p.setDistrito(rs.getInt("Proveedor.FidDistrito"), rs.getString("Distrito.nombreDistrito"));
            p.setDireccion(rs.getString("direccion"));
            
            lista.add(p);
        }
        con.close();
        return lista;
    }
    
    public int registrarProveedor(Proveedor p) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call REGISTRAR_PROVEEDOR(?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setString("_nombre", p.getNombre());
        stmt.setString("_ruc", p.getRuc());
        stmt.setString("_direccion", p.getDireccion());
        stmt.setString("_telefono", p.getTelefono());
        stmt.setString("_correo", p.getCorreo());
        stmt.setInt("_FidDiaSemana", p.getDiaSemana().getIdDia());
        stmt.setInt("_FidDepartamento", p.getDepartamento().getIdDep());
        stmt.setInt("_FidProvincia", p.getProvincia().getIdProv());
        stmt.setInt("_FidDistrito", p.getDistrito().getIdDist());
        stmt.registerOutParameter("_id", java.sql.Types.INTEGER);
        stmt.registerOutParameter("_error", java.sql.Types.INTEGER);
        stmt.executeUpdate();
        
        p.setId(stmt.getInt("_id"));
        int err = stmt.getInt("_error");
        con.close();
        return err;
    }
    
    public int modificarProveedor(Proveedor p) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call MODIFICAR_PROVEEDOR(?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setString("_nombre", p.getNombre());
        stmt.setString("_ruc", p.getRuc());
        stmt.setString("_direccion", p.getDireccion());
        stmt.setString("_telefono", p.getTelefono());
        stmt.setString("_correo", p.getCorreo());
        stmt.setInt("_FidDiaSemana", p.getDiaSemana().getIdDia());
        stmt.setInt("_FidDepartamento", p.getDepartamento().getIdDep());
        stmt.setInt("_FidProvincia", p.getProvincia().getIdProv());
        stmt.setInt("_FidDistrito", p.getDistrito().getIdDist());
        stmt.setInt("_id", p.getId());
        stmt.registerOutParameter("_error", java.sql.Types.INTEGER);
        stmt.executeUpdate();
        
        int err = stmt.getInt("_error");
        con.close();
        return err;
    }
    
    public void eliminarServicio(int id) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call ELIMINAR_PROVEEDOR(?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setInt("_id", id);
        
        stmt.executeUpdate();
        
        con.close();
        
    }
    
    public ArrayList<Proveedor> buscarProveedores(String razon, String ruc) throws ClassNotFoundException, SQLException{
        ArrayList<Proveedor> lista = new ArrayList<Proveedor>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call BUSCAR_PROVEEDOR(?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setString("_razonSocial", razon);
        stmt.setString("_ruc", ruc);
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Proveedor p = new Proveedor();
            p.setId(rs.getInt("idProveedor"));
            p.setNombre(rs.getString("razonSocial"));
            p.setRuc(rs.getString("ruc"));
            p.setCorreo(rs.getString("correo"));
            p.setTelefono(rs.getString("telefono"));
            p.setDiaSemana(rs.getInt("Proveedor.FidDiaSemana"), rs.getString("DiaSemana.nombreDiaSemana"));
            p.setDepartamento(rs.getInt("Proveedor.FidDepartamento"), rs.getString("Departamento.nombreDepartamento"));
            p.setProvincia(rs.getInt("Proveedor.FidProvincia"), rs.getString("Provincia.nombreProvincia"));
            p.setDistrito(rs.getInt("Proveedor.FidDistrito"), rs.getString("Distrito.nombreDistrito"));
            p.setDireccion(rs.getString("direccion"));
            
            lista.add(p);
        }
        con.close();
        return lista;
    }
    
}
