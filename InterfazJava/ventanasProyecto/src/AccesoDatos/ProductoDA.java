/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import clases.Categoria_Consumible;
import clases.Categoria_NoConsumible;
import clases.Consumible;
import clases.NoConsumible;
import clases.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class ProductoDA {
    public ProductoDA(){
        
    }
    
    
    
    public ArrayList<Producto> listarProductos() throws ClassNotFoundException, SQLException{
        ArrayList<Producto> lista = new ArrayList<Producto>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call LISTAR_PRODUCTOS()}";
        CallableStatement stmt = con.prepareCall(sql);
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            //agregar elementos a lista
            Producto p;
            int tipo = rs.getInt("consumible");
            if(tipo == 1){
                p = new Consumible();
                String s = rs.getString("categoria");
                Categoria_Consumible c = Categoria_Consumible.valueOf(s);
                ((Consumible) p).setCategoria(c);
            }else{
                p = new NoConsumible();
                String s = rs.getString("categoria");
                Categoria_NoConsumible c = Categoria_NoConsumible.valueOf(s);
                ((NoConsumible) p).setCategoria(c);
            }
                
            p.setIdProducto(rs.getInt("idProducto"));
            //System.out.println(s.getId());
            p.setNombre(rs.getString("nombre"));
            p.setPrecio(rs.getDouble("precioUnitario"));
            p.setCantMinima(rs.getInt("cantidadMinima"));
            p.setMarca(rs.getString("marca"));
            p.setMoneda(rs.getString("moneda"));
            
            lista.add(p);
        }
        con.close();
        
        return lista;
    }
    
}
