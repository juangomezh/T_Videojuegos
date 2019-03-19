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
public class Baston extends Arma {
    int magia;
    public Baston(int daño, String nombre, int magia)
    {
        super(daño, nombre);
        this.magia=magia;
    }
    @Override
    public void usar()
    {
        magia--;
    }
    @Override
    public boolean disponible()
    {
        if(magia>0) return true;
        else return false;
    }
    public void setMagia(int magia) {
        this.magia = magia;
    }
    public int getMagia() {
        return magia;
    }
    @Override
    public String toString()
    {
        return(super.toString()+"con puntos de magia: "+magia);
    }
}
