/*
John Sebastian Gomez Gonzalez y Sebastian Aristizabal
*/
package com.mycompany.reto7refactorizado;

/**
 *
 * @author Sebastian
 */
public class TramoSinAsfalto extends TramoGenerico{
    private String proveedor;
    private int velMax;
    private boolean prohibicion;
    private double resultadoVolumen;
    private final int AREA = 6;
    private final double VOLPIEDRA = 0.19;
    private final double VOLARENA = 0.21;
    private final double VOLBALASTRO = 0.23;
    private int tipoMaterial;
    
    
    //Constructor
    
    
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
        /*
        1 equivale a piedra
        2 equivale a arena
        3 equivale a balastro
         */
        switch (tipoMaterial) {
            case 1 -> resultadoVolumen = getLongitud() * AREA * VOLPIEDRA;
            case 2 -> resultadoVolumen = getLongitud() * AREA * VOLARENA;
            case 3 -> resultadoVolumen = getLongitud() * AREA * VOLBALASTRO;
            default -> {
                    System.out.println("La opción elegida es incorrecta");
                    return resultadoVolumen;
            }
        }
        return resultadoVolumen;
    }
    

    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
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
