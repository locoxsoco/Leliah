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
public class Departamento {
    private int idDep;
    private String nombDep;

    public Departamento() {
    }

    public int getIdDep() {
        return idDep;
    }

    public void setIdDep(int idDep) {
        this.idDep = idDep;
    }

    public String getNombDep() {
        return nombDep;
    }

    public void setNombDep(String nombDep) {
        this.nombDep = nombDep;
    }
    
    @Override
    public String toString(){
        return this.nombDep;
    }
    
}
