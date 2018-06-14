/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.ProductoDA;
import clases.LineaxCompra;
import clases.Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        //ArrayList<Producto> l = new ArrayList<Producto>();
        //return l;
    }
    
    public int registrarProducto(Producto p) throws ClassNotFoundException, SQLException{
        return accesoDatos.registrarProducto(p);
    }
    
    public int modificarProducto(Producto p) throws ClassNotFoundException, SQLException{
        return accesoDatos.modificarProducto(p);
    }
    
    public void eliminarProducto(int id) throws ClassNotFoundException, SQLException{
        accesoDatos.eliminarProducto(id);
    }
    
    public ArrayList<String> listarProdxCat(int tipo){   
        return accesoDatos.listarProdxCat(tipo);
    }
    
    public ArrayList<Producto> buscarProductos(String nombre, String marca, String cat, int cons) throws ClassNotFoundException, SQLException{
        return accesoDatos.buscarProductos(nombre, marca, cat, cons);
    }
    
    public ArrayList<LineaxCompra> listarProxVencimiento(String fecha) throws ClassNotFoundException, SQLException{
        return accesoDatos.listarProxVencimiento(fecha);
    }

}
