/*
John Sebastian Gomez Gonzalez y Sebastian Aristizabal
*/
package com.mycompany.reto7refactorizado;

import java.math.*;
import java.util.Scanner;

public class TramoSinAsfalto extends TramoGenerico{
    private double[] coordenadas = new double[4];//Las coordenadas XY del inicio del tramo se encuentran en las posiciones 0 y 1, Las coordenadas XY del final del tramo se encuentran en las posiciones 2 y 3
    private String proveedor;
    private int velMax;
    private boolean prohibicion;
    private double resultadoLongitud;
    private double resultadoArea;
    private double resultadoVolumen;
    private final int AREA = 6;
    private final double VOLPIEDRA = 0.19;
    private final double VOLARENA = 0.21;
    private final double VOLBALASTRO = 0.23;
    private int tipoMaterial;
    
    
    //Constructor
    public TramoSinAsfalto(int coordenadaXi, int coordenadaYi, int coordenadaXf, int coordenadaYf, String proveedor, int velMax, boolean prohibicion) {
        this.coordenadas[0] = coordenadaXi;
        this.coordenadas[1] = coordenadaYi;
        this.coordenadas[2] = coordenadaXf;
        this.coordenadas[3] = coordenadaYf;
        this.proveedor = proveedor;
        this.velMax = velMax;
        this.prohibicion = prohibicion;
    }
    
    @Override
    public double getLongitud() {
        double n1 = (this.coordenadas[2]-this.coordenadas[0]);
        double n2 = (this.coordenadas[3]-this.coordenadas[1]);
        resultadoLongitud = Math.sqrt(((Math.pow(n1, 2))+(Math.pow(n2, 2))));
        return resultadoLongitud;
    }

    @Override
    public double getArea() {
        resultadoArea = getLongitud() * AREA;
        return resultadoArea;
    }

    @Override
    public double getVolumen() {
        /*
        1 equivale a piedra
        2 equivale a arena
        3 equivale a balastro
        */
        if (tipoMaterial == 1 ) {
            resultadoVolumen = getLongitud() * AREA * VOLPIEDRA;
        } else if (tipoMaterial == 2) {
            resultadoVolumen = getLongitud() * AREA * VOLARENA;
        } else if (tipoMaterial == 3) {
            resultadoVolumen = getLongitud() * AREA * VOLBALASTRO;
        }
          else {
            System.out.println("La opción elegida es incorrecta");
            return resultadoVolumen;
        }  
        return resultadoVolumen;
    }
    

    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

}