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
import clases.usuario;
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
    
    public int registrarTrabajador(Trabajador t) throws ClassNotFoundException, SQLException{
        return accesoDatos.registrarTrabajador(t);
    }
    
    public int modificarTrabajador(Trabajador t) throws ClassNotFoundException, SQLException{
        return accesoDatos.modificarTrabajador(t);
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
    
    public usuario validarUsuario(String _username,String _password) throws ClassNotFoundException, SQLException{
        return accesoDatos.validarUsuario(_username, _password);
    }
    
    public ArrayList<Trabajador> buscarTrabajadores(String nombre, String apPat, String apMat, String user, int privI, String numDoc) throws ClassNotFoundException, SQLException{
        return accesoDatos.buscarTrabajadores(nombre, apPat, apMat, user, privI, numDoc);
    }
}
