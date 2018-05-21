/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

/**
 *
 * @author VikAle
 */
public class producto {
    String nombre;
    int cantidad;
    float preUnit;
    int lote = 0;

    @Override
    public String toString() {
        return nombre ;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPreUnit(float pu) {
        this.preUnit = pu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }
    public int getLote() {
        return lote;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPreUnit() {
        return preUnit;
    }

    public producto(String nombre, int cantidad, float subTotal,int lote) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.preUnit = subTotal;
        this.lote = lote;
    }

    
}
