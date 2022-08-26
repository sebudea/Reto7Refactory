/*
John Sebastian Gomez Gonzalez y Sebastian Aristizabal
*/
package com.mycompany.reto7refactorizado;

/**
 *
 * @author Sebastian
 */
public abstract class TramoGenerico {
    public abstract double getLongitud();
    public abstract double getArea();
    public abstract double getVolumen();
    
    protected double coordenadaXi;
    protected double coordenadaYi;
    protected double coordenadaXf;
    protected double coordenadaYf; 

    public TramoGenerico(double coordenadaXi, double coordenadaYi, double coordenadaXf, double coordenadaYf) {
        this.coordenadaXi = coordenadaXi;
        this.coordenadaYi = coordenadaYi;
        this.coordenadaXf = coordenadaXf;
        this.coordenadaYf = coordenadaYf;
    }
    
    

    public double getCoordenadaXi() {
        return coordenadaXi;
    }

    public void setCoordenadaXi(double coordenadaXi) {
        this.coordenadaXi = coordenadaXi;
    }

    public double getCoordenadaYi() {
        return coordenadaYi;
    }

    public void setCoordenadaYi(double coordenadaYi) {
        this.coordenadaYi = coordenadaYi;
    }

    public double getCoordenadaXf() {
        return coordenadaXf;
    }

    public void setCoordenadaXf(double coordenadaXf) {
        this.coordenadaXf = coordenadaXf;
    }

    public double getCoordenadaYf() {
        return coordenadaYf;
    }

    public void setCoordenadaYf(double coordenadaYf) {
        this.coordenadaYf = coordenadaYf;
    }
    
    
    
}
