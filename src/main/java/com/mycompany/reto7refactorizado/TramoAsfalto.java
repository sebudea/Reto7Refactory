/*
John Sebastian Gomez Gonzalez y Sebastian Aristizabal
*/
package com.mycompany.reto7refactorizado;

/**
 *
 * @author Sebastian
 */
public class TramoAsfalto extends TramoGenerico{
    private String proveedor;
    private int velMax;
    private boolean prohibicion;
    private final int AREA = 8;
    private final double VOL = 0.25;
    
    
    //Constructor

    public TramoAsfalto(String proveedor, int velMax, boolean prohibicion, double coordenadaXi, double coordenadaYi, double coordenadaXf, double coordenadaYf) {
        super(coordenadaXi, coordenadaYi, coordenadaXf, coordenadaYf);
        this.proveedor = proveedor;
        this.velMax = velMax;
        this.prohibicion = prohibicion;
    }
    

    
    
    @Override
    public double getLongitud() {
        return Math.sqrt(Math.pow(coordenadaXf-coordenadaXi,2)+ Math.pow(coordenadaYf-coordenadaYi,2));
    }
    
    
    @Override
    public double getArea() {
        return getLongitud() * AREA;
    }
    
    
    @Override
    public double getVolumen() {
        return getLongitud() * AREA * VOL;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public boolean isProhibicion() {
        return prohibicion;
    }

    public void setProhibicion(boolean prohibicion) {
        this.prohibicion = prohibicion;
    }
    
    
}
