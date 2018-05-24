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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
            p.setDescripcion(rs.getString("descripcion"));
            
            lista.add(p);
        }
        con.close();
        
        return lista;
    }
    
    public void registrarProducto(Producto p) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call REGISTRAR_PRODUCTO(?,?,?,?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        if(p instanceof Consumible){
            stmt.setInt("_consumible", 1);
            stmt.setString("_categoria", ((Consumible) p).getCategoria().toString());
        }else if(p instanceof NoConsumible){
            stmt.setInt("_consumible", 0);
            stmt.setString("_categoria", ((NoConsumible) p).getCategoria().toString());
        }
        
        stmt.setString("_nombre", p.getNombre());        
        stmt.setDouble("_precioUnitario", p.getPrecio());
        stmt.setInt("_cantidadMinima", p.getCantMinima());
        stmt.setString("_marca", p.getMarca());
        stmt.setString("_descripcion", p.getDescripcion());
        stmt.setString("_moneda", p.getMoneda());
        
        stmt.registerOutParameter("_id", java.sql.Types.INTEGER);
        
        stmt.executeUpdate();
        
        p.setIdProducto(stmt.getInt("_id"));
        
        con.close();
    }
    
    public void modificarProducto(Producto p) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call MODIFICAR_PRODUCTO(?,?,?,?,?,?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        if(p instanceof Consumible){
            stmt.setInt("_consumible", 1);
            stmt.setString("_categoria", ((Consumible) p).getCategoria().toString());
        }else if(p instanceof NoConsumible){
            stmt.setInt("_consumible", 0);
            stmt.setString("_categoria", ((NoConsumible) p).getCategoria().toString());
        }
        
        stmt.setString("_nombre", p.getNombre());        
        stmt.setDouble("_precioUnitario", p.getPrecio());
        stmt.setInt("_cantidadMinima", p.getCantMinima());
        stmt.setString("_marca", p.getMarca());
        stmt.setString("_descripcion", p.getDescripcion());
        stmt.setString("_moneda", p.getMoneda());
        stmt.setInt("_id", p.getIdProducto());
        
        stmt.executeUpdate();
        
        con.close();
    }
    
    public void eliminarProducto(int id) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        String sql = "{call ELIMINAR_PRODUCTO(?)}";
        CallableStatement stmt = con.prepareCall(sql);
        
        stmt.setInt("_id", id);
        
        stmt.executeUpdate();
        
        con.close();
    }
    
    public ArrayList<String> listarProdxCat(int tipo){
        ArrayList<String> lista = new ArrayList<String>();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g9?useSSL=false","inf282g9","Yf9bS1");
        Statement sentencia = con.createStatement();
        String sql;
        ResultSet rs;
        switch(tipo){
            case 1:
                sql = "SELECT nombre FROM Producto where consumible=0 and categoria LIKE '%UtilOficina%';";
                rs = sentencia.executeQuery(sql);
                while(rs.next()){                    
                    lista.add(rs.getString("nombre"));
                }
                break;
            case 2:
                sql = "SELECT nombre FROM Producto where consumible=0 and categoria LIKE '%Juguete%';";
                rs = sentencia.executeQuery(sql);
                while(rs.next()){
                    lista.add(rs.getString("nombre"));
                }
                break;
            case 3:
                sql = "SELECT nombre FROM Producto where consumible=0 and categoria LIKE '%Adorno%';";
                rs = sentencia.executeQuery(sql);
                while(rs.next()){
                    lista.add(rs.getString("nombre"));
                }
                break;
            case 4:
                sql = "SELECT nombre FROM Producto where consumible=1 and categoria LIKE '%Bebida%';";
                rs = sentencia.executeQuery(sql);
                while(rs.next()){
                    lista.add(rs.getString("nombre"));
                }
                break;
            case 5:
                sql = "SELECT nombre FROM Producto where consumible=1 and categoria LIKE '%Caramelo%';";
                rs = sentencia.executeQuery(sql);
                while(rs.next()){
                    lista.add(rs.getString("nombre"));
                }
                break;
            case 6:
                sql = "SELECT nombre FROM Producto where consumible=1 and categoria LIKE '%Snack%';";
                rs = sentencia.executeQuery(sql);
                while(rs.next()){
                    lista.add(rs.getString("nombre"));
                }
                break;
            case 7:
                sql = "SELECT nombre FROM Producto where consumible=1 and categoria LIKE '%Postre%';";
                rs = sentencia.executeQuery(sql);
                while(rs.next()){
                    lista.add(rs.getString("nombre"));
                }
                break;
            case 8:
                sql = "SELECT nombre FROM Producto where consumible=1 and categoria LIKE '%Helado%';";
                rs = sentencia.executeQuery(sql);
                while(rs.next()){
                    lista.add(rs.getString("nombre"));
                }
                break;
        }
        con.close();
        }catch(Exception e){
        }
        return lista;
    }
    
}
