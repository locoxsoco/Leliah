/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.ProveedorDA;
import clases.Departamento;
import clases.DiaSemana;
import clases.Distrito;
import clases.Provincia;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class ProveedorBL {
    private ProveedorDA accesoDatos;
    public ProveedorBL(){
        accesoDatos = new ProveedorDA();
    }
    
    public ArrayList<DiaSemana> listarDias() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarDias();
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
