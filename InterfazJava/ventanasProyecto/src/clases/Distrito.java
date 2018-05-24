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
public class Distrito {
    private int idDist;
    private String nombDist;

    public Distrito() {
    }

    public int getIdDist() {
        return idDist;
    }

    public void setIdDist(int idDist) {
        this.idDist = idDist;
    }

    public String getNombDist() {
        return nombDist;
    }

    public void setNombDist(String nombDist) {
        this.nombDist = nombDist;
    }
    
    @Override
    public String toString(){
        return this.nombDist;
    }
}
