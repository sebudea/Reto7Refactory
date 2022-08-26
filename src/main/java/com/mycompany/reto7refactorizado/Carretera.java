/*
John Sebastian Gomez Gonzalez y Sebastian Aristizabal
*/
package com.mycompany.reto7refactorizado;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Carretera {
    private final ArrayList<TramoGenerico> tramos = new ArrayList<>();

    public ArrayList<TramoGenerico> getVias() {
        return tramos;
    }
    public void setVias(TramoGenerico nuevoTramo) {
        tramos.add(nuevoTramo);        
    }
    
    public double longitudTotal(){
        double sumaLongitud = 0;
        for (TramoGenerico tramo: tramos) {
            sumaLongitud += tramo.getLongitud();
        }
        return sumaLongitud;
    }
    
    public double areaTotal(){
        double sumaArea = 0;
        for (TramoGenerico tramo: tramos) {
            sumaArea +=tramo.getArea();
        }
        return sumaArea;
    }
    
    public double volumenAsfaltoTotal(){
        double sumaVolumenAsfalto = 0;
        for (TramoGenerico tramo: tramos) {
            if(tramo.getClass().getSimpleName().equals("Asfalto"))
            sumaVolumenAsfalto += tramo.getVolumen();           
        }
        return sumaVolumenAsfalto;
    }
    
    public double volumenSinAsfaltoTotal(){
        double volumenSinAsfaltoTotal = 0;
        for (TramoGenerico tramo: tramos) {
            if(tramo.getClass().getSimpleName().equals("NoAsfalto"))
            volumenSinAsfaltoTotal += tramo.getVolumen();
        }
        return volumenSinAsfaltoTotal;
    }
    
    public double volumenTotal(){
        double sumaVolumen = 0;
        for (TramoGenerico tramo: tramos) {
            sumaVolumen +=tramo.getVolumen();
        }
        return sumaVolumen;
    }
      
    
    public void tramosConectados(){
        int contador = 0;
        for(int i=0; i<tramos.size()-1;i++){
            if(tramos.get(i).coordenadaXf == tramos.get(i+1).coordenadaXi && tramos.get(i).coordenadaYf == tramos.get(i+1).coordenadaYi){
                contador ++;
            }            
        } 
        if(contador == tramos.size()-1){
            System.out.println("Los tramos estan conectados");
        }else{
            System.out.println("Los tramos no estan conectados");
        }
    }
}
