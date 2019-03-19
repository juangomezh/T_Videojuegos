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
public class Arco extends Arma {
    int flechas;
    public Arco(int daño, String nombre, int flechas)
    {
        super(daño, nombre);
        this.flechas=flechas;
    }
    @Override
    public void usar()
    {
        flechas--;
    }
    @Override
    public boolean disponible()
    {
        if(flechas>0) return true;
        else return false;
    }
    public int getFlechas() {
        return flechas;
    }
    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }
    @Override
    public String toString()
    {
        return(super.toString()+"con numero de flechas: "+flechas);
    }
}
