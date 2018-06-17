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
public class TipoDocumentoIdentidad {
    private int idTipo;
    private String nombTipo;
    private int cantChar;

    public int getCantChar() {
        return cantChar;
    }

    public void setCantChar(int cantChar) {
        this.cantChar = cantChar;
    }

    @Override
    public String toString(){
        return this.nombTipo;
    }
    
    public TipoDocumentoIdentidad() {
    }

    public TipoDocumentoIdentidad(int idTipo, String nombTipo) {
        this.idTipo = idTipo;
        this.nombTipo = nombTipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombTipo() {
        return nombTipo;
    }

    public void setNombTipo(String nombTipo) {
        this.nombTipo = nombTipo;
    }
}
