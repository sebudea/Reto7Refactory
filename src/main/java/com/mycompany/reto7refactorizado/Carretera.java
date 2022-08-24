/*
John Sebastian Gomez Gonzalez y Sebastian Aristizabal
*/
package com.mycompany.reto7refactorizado;

import java.util.ArrayList;



public class Carretera {
    private ArrayList<TramoGenerico> tramos = new ArrayList<>();
    private double longitudTotal;

    
    public double longitudTotal(double lon){
        return longitudTotal;
    }
    
    public void setTramo(TramoGenerico tramo){
        tramos.add(tramo);
    }
    
    
    
}
