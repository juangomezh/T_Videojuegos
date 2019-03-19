/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armas;

/**
 *
 * @author jgome
 */
public abstract class Arma {
    String nombre;
    int daño;
    public abstract void usar();
    public abstract boolean disponible();
    public Arma(int daño, String nombre)
    {
        this.daño=daño;
        this.nombre=nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }
    public String getNombre() {
        return nombre;
    }
    public int getDaño() {
        return daño;
    }
    @Override
    public String toString()
    {
        return("nombre: "+nombre+", con daño: "+daño);
    }
}
