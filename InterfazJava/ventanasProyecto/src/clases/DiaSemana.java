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
public class DiaSemana {
    private int idDia;
    private String nombDia;
    
    public DiaSemana() {
    }

    public int getIdDia() {
        return idDia;
    }

    public void setIdDia(int idDia) {
        this.idDia = idDia;
    }

    public String getNombDia() {
        return nombDia;
    }

    public void setNombDia(String nombDia) {
        this.nombDia = nombDia;
    }
    
    @Override
    public String toString(){
        return this.nombDia;
    }
    
}
