/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.TrabajadorDA;
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
}
