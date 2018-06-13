/*
 * Nombre: Luis Alberto Carranza Cobenas
 * Codigo: 20151110
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.ClienteDA;
import clases.Cliente;
import clases.Departamento;
import clases.Distrito;
import clases.Provincia;
import clases.TipoDocumentoIdentidad;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis Alberto Carranza Cobenas <20151110>
 */
public class ClienteBL {
    private ClienteDA accesoDatos;
    public ClienteBL(){
        accesoDatos = new ClienteDA();
    }
    
    public ArrayList<TipoDocumentoIdentidad> listarTipoDocumento() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarTipoDocumento();
    }
    
    public ArrayList<Departamento> listarDepartamentos() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarDepartamentos();
    }
    
    public ArrayList<Provincia> listarProvincias(int idDep) throws ClassNotFoundException, SQLException{
        return accesoDatos.listarProvincias(idDep);
    }
    
    public ArrayList<Distrito> listarDistritos(int idProv) throws ClassNotFoundException, SQLException{
        return accesoDatos.listarDistritos(idProv);
    }
    
     public ArrayList<Cliente> listarClientes() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarClientes();
    }
    
    public int registrarCliente(Cliente c) throws ClassNotFoundException, SQLException{
        return accesoDatos.registrarCliente(c);
    }
    
    public int modificarCliente(Cliente c) throws ClassNotFoundException, SQLException{
        return accesoDatos.modificarCliente(c);
    }
    
    public void eliminarCliente(int id) throws ClassNotFoundException, SQLException{
        accesoDatos.eliminarCliente(id);
    }
    
    public ArrayList<Cliente> buscarClientes(int tipo, String nombre, String apPat, String apMat, String numDoc, String ruc, String razon) throws ClassNotFoundException, SQLException{
        return accesoDatos.buscarClientes(tipo, nombre, apPat, apMat, numDoc, ruc, razon);
    }
}
