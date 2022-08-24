/*
John Sebastian Gomez Gonzalez y Sebastian Aristizabal
*/
package com.mycompany.reto7refactorizado;


public class TramoAsfalto extends TramoGenerico{
    private double[] coordenadas = new double[4];//Las coordenadas XY del inicio del tramo se encuentran en las posiciones 0 y 1, Las coordenadas XY del final del tramo se encuentran en las posiciones 2 y 3
    private String proveedor;
    private int velMax;
    private boolean prohibicion;
    private double resultadoLongitud;
    private double resultadoArea;
    private double resultadoVolumen;
    private final int AREA = 8;
    private final double VOL = 0.25;
    private double[] longitudes = new double[0];
    
    
    //Constructor
    public TramoAsfalto(int coordenadaXi, int coordenadaYi, int coordenadaXf, int coordenadaYf, String proveedor, int velMax, boolean prohibicion) {
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
        double n1 = (this.coordenadas[2]-this.coordenadas[0]);//Sacando distancia entre el punto final X y el punto inicial X (Xf - Xi)
        double n2 = (this.coordenadas[3]-this.coordenadas[1]);//Sacando distancia entre el punto final Y y el punto inicial Y (Yf - Yi)
        this.resultadoLongitud = Math.sqrt(((Math.pow(n1, 2))+(Math.pow(n2, 2))));//Teorema de Pitagoras para hallar la diagonal que equivale a la longitud
        return this.resultadoLongitud;
    }
    
    
    @Override
    public double getArea() {
        this.resultadoArea = getLongitud() * AREA;
        return this.resultadoArea;
    }
    
    
    @Override
    public double getVolumen() {
        this.resultadoVolumen = getLongitud() * AREA * VOL;
        return this.resultadoVolumen;
    }
    
    
}
