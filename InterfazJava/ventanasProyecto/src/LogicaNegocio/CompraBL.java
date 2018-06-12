/*
 * Nombre: Luis Alberto Carranza Cobenas
 * Codigo: 20151110
 * and open the template in the editor.
 */
package LogicaNegocio;

import AccesoDatos.CompraDA;
import AccesoDatos.LineaxCompraDA;
import clases.Compra;
import clases.LineaxCompra;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luis Alberto Carranza Cobenas <20151110>
 */
public class CompraBL {
    private CompraDA accesoDatosCompra;
    private LineaxCompraDA accesoDatosDetCompra; 
    public CompraBL(){
        accesoDatosCompra = new CompraDA();
        accesoDatosDetCompra = new LineaxCompraDA();
    }
    
    
    public void registrarCompras(Compra c) throws ClassNotFoundException, SQLException{
        accesoDatosCompra.registrarCompras(c);
        for (LineaxCompra lineaxProd : c.getListLineaxProd()) {
            accesoDatosDetCompra.registrarDetCompra(lineaxProd,c.getIdCompra());
        }
    }
    
    
}
