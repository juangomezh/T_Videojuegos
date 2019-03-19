/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armas;

import armas.Arma;

/**
 *
 * @author jgome
 */
public class Espada extends Arma {
    int resistencia;
    public Espada(int daño, String nombre, int resistencia)
    {
        super(daño, nombre);
        this.resistencia=resistencia;
    }
    @Override
    public void usar()
    {
        resistencia--;
    }
    @Override
    public boolean disponible()
    {
        if(resistencia>0) return true;
        else return false;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public int getResistencia() {
        return resistencia;
    }
    @Override
    public String toString()
    {
        return(super.toString()+"con resistencia: "+resistencia);
    }
}
