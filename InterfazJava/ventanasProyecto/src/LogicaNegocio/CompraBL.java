/*
 * Nombre: Luis Alberto Carranza Cobenas
 * Codigo: 20151110
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.CompraDA;
import clases.Compra;
import clases.LineaxCompra;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luis Alberto Carranza Cobenas <20151110>
 */
public class CompraBL {
    private CompraDA accesoDatosCompra;
    private LineaxCompra accesoDatosDetCompra; 
    public CompraBL(){
        accesoDatosCompra = new CompraDA();
        accesoDatosDetCompra = new LineaxCompra();
    }
    
    
    public void registrarCompras(Compra c) throws ClassNotFoundException, SQLException{
        accesoDatosCompra.registrarCompras(c);
    }
    
    public void eliminarCompras(int id) throws ClassNotFoundException, SQLException{
        accesoDatosCompra.eliminarCompras(id);
    }
    
}
