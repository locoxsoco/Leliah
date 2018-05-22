/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.ProductoDA;
import clases.Producto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class ProductoBL {
    private ProductoDA accesoDatos;
    
    public ProductoBL(){
        accesoDatos = new ProductoDA();
    }
    
    public ArrayList<Producto> listarProductos() throws ClassNotFoundException, SQLException{
        return accesoDatos.listarProductos();
    }
    
    public void registrarProducto(Producto p) throws ClassNotFoundException, SQLException{
        accesoDatos.registrarProducto(p);
    }
    
    public void modificarProducto(Producto p) throws ClassNotFoundException, SQLException{
        accesoDatos.modificarProducto(p);
    }
    
    public void eliminarProducto(int id) throws ClassNotFoundException, SQLException{
        accesoDatos.eliminarProducto(id);
    }
}
