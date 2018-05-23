/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Andres
 */
public class TiempoPago {
    private int idTiempo;
    private String nombTiempo;

    @Override
    public String toString(){
        return this.nombTiempo;
    }
    
    public String getNombTiempo() {
        return nombTiempo;
    }

    public void setNombTiempo(String nombTiempo) {
        this.nombTiempo = nombTiempo;
    }
    
    public TiempoPago(){
        
    }
    
    public int getIdTiempo(){
        return idTiempo;
    }
    
    public void setIdTiempo(int id){
        this.idTiempo = id;
    }
    
    
    
    
}
