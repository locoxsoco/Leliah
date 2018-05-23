/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.TrabajadorDA;
import clases.TiempoPago;
import clases.TipoDocumentoIdentidad;
import clases.Trabajador;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class TrabajadorBL {
    private TrabajadorDA accesoDatos;
    public TrabajadorBL(){
        accesoDatos = new TrabajadorDA();
    }
    
    public ArrayList<Trabajador> listarTrabajadores() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarTrabajadores();
    }
    
    public void registrarTrabajador(Trabajador t) throws ClassNotFoundException, SQLException{
        accesoDatos.registrarTrabajador(t);
    }
    
    public void modificarTrabajador(Trabajador t) throws ClassNotFoundException, SQLException{
        accesoDatos.modificarTrabajador(t);
    }
    
    public void eliminarTrabajador(int id) throws ClassNotFoundException, SQLException{
        accesoDatos.eliminarTrabajador(id);
    }
    
    public ArrayList<TipoDocumentoIdentidad> listarDocumentos() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarDocumentos();
    }
    
    public ArrayList<TiempoPago> listarTiempoPago() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarTiempoPago();
    }
}
