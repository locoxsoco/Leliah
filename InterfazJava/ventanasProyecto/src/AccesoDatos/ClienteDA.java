/*
 * Nombre: Luis Alberto Carranza Cobenas
 * Codigo: 20151110
 * and open the template in the editor.
 */
package AccesoDatos;

import clases.Cliente;
import clases.Departamento;
import clases.Distrito;
import clases.Empresa;
import clases.Persona;
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
    
    public ArrayList<Cliente> listarClientes() throws ClassNotFoundException, SQLException{
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_CLIENTES()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            //agregar elementos a lista
            Cliente c = null;
            String priv = rs.getString("tipoCliente");
            if(priv.equals("N")){
                c = new Persona();
                ((Persona) c).setNombre(rs.getString("nombre"));
                ((Persona) c).setApPaterno(rs.getString("apellidoPaterno"));
                ((Persona) c).setApMaterno(rs.getString("apellidoMaterno"));
                ((Persona) c).setNumDoc(rs.getString("numeroDocumento"));
                ((Persona) c).setTipoDoc(rs.getInt("FidTipoDocumentoIdentidad"), rs.getString("nombreDocumentoIdentidad"));
            }else if(priv.equals("J")){
                c = new Empresa();
                ((Empresa) c).setNombre(rs.getString("razonSocial"));
                ((Empresa) c).setRuc(rs.getString("ruc"));
            }
            c.setCorreo(rs.getString("correo"));
            c.setDepartamento(rs.getInt("Cliente.FidDepartamento"), rs.getString("Departamento.nombreDepartamento"));
            c.setDireccion(rs.getString("direccion"));
            c.setDistrito(rs.getInt("Cliente.FidDistrito"), rs.getString("Distrito.nombreDistrito"));
            c.setIdCliente(rs.getInt("idCliente"));
            c.setProvincia(rs.getInt("Cliente.FidProvincia"),rs.getString("Provincia.nombreProvincia"));
            c.setTelefono(rs.getString("telefono"));
            
            lista.add(c);
        }
        con.close();
        return lista;
    }
    
    public void registrarCliente(Cliente c) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call REGISTRAR_TRABAJADOR(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        if(c instanceof Persona){
            //System.out.print("j");
            stmt.setString("tipoCliente", "N");
            stmt.setNull("_ruc", java.sql.Types.VARCHAR);
            stmt.setNull("_razonSocial", java.sql.Types.VARCHAR);
            stmt.setString("_nombre", ((Persona) c).getNombre());
            stmt.setString("_apellidoPaterno", ((Persona) c).getApPaterno());
            stmt.setString("_apellidoMaterno", ((Persona) c).getApMaterno());
            stmt.setString("_numeroDocumento", ((Persona) c).getNumDoc());
            stmt.setInt("_FidTipoDocumentoIdentidad", ((Persona) c).getTipoDoc().getIdTipo());
        }else if(c instanceof Empresa){
            //System.out.print("a");
            stmt.setString("_tipoCliente", "J");
            stmt.setNull("_ruc", java.sql.Types.VARCHAR);
            stmt.setNull("_razonSocial", java.sql.Types.VARCHAR);
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
    
    public void modificarCliente(Cliente c) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call MODIFICAR_CLIENTE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        if(c instanceof Persona){
            //System.out.print("j");
            stmt.setString("tipoCliente", "N");
            stmt.setNull("_ruc", java.sql.Types.VARCHAR);
            stmt.setNull("_razonSocial", java.sql.Types.VARCHAR);
            stmt.setString("_nombre", ((Persona) c).getNombre());
            stmt.setString("_apellidoPaterno", ((Persona) c).getApPaterno());
            stmt.setString("_apellidoMaterno", ((Persona) c).getApMaterno());
            stmt.setString("_numeroDocumento", ((Persona) c).getNumDoc());
            stmt.setInt("_FidTipoDocumentoIdentidad", ((Persona) c).getTipoDoc().getIdTipo());
        }else if(c instanceof Empresa){
            //System.out.print("a");
            stmt.setString("_tipoCliente", "J");
            stmt.setNull("_ruc", java.sql.Types.VARCHAR);
            stmt.setNull("_razonSocial", java.sql.Types.VARCHAR);
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
        stmt.setInt("_id", c.getIdCliente());
        
        stmt.executeUpdate();
        con.close();
    }
    
    public void eliminarCliente(int id) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call ELIMINAR_CLIENTE(?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setInt("_id", id);
        
        stmt.executeUpdate();
        
        con.close();
    }
}
