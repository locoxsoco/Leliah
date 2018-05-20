/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.ServicioDA;
import clases.Servicio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class ServicioBL {
    private ServicioDA accesoDatos;
    
    public ServicioBL(){
        accesoDatos = new ServicioDA();
    }
    
    
    public ArrayList<Servicio> listarServicios() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarServicios();
    }
    
    public void registrarServicio(Servicio s) throws ClassNotFoundException, SQLException{
        accesoDatos.registrarServicio(s);
    }
    
}
