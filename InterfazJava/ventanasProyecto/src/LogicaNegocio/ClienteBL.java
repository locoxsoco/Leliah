/*
 * Nombre: Luis Alberto Carranza Cobenas
 * Codigo: 20151110
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.ClienteDA;
import clases.Departamento;
import clases.Distrito;
import clases.Provincia;
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
    
    public ArrayList<Departamento> listarDepartamentos() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarDepartamentos();
    }
    
    public ArrayList<Provincia> listarProvincias(int idDep) throws ClassNotFoundException, SQLException{
        return accesoDatos.listarProvincias(idDep);
    }
    
    public ArrayList<Distrito> listarDistritos(int idProv) throws ClassNotFoundException, SQLException{
        return accesoDatos.listarDistritos(idProv);
    }
}
