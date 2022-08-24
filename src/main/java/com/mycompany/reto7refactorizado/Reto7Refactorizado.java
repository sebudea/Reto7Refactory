/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto7refactorizado;


/**
 *
 * @author sebastian.aristizabalc
 */
public class Reto7Refactorizado {

    public static void main(String[] args) {
        TramoAsfalto tramo1 = new TramoAsfalto(10, 10, 40, 40, "Argos", 100, true);
        double longi = tramo1.getLongitud();
        System.out.println("Longitud tramo1: "+longi);
        
        double are = tramo1.getArea();
        System.out.println("Area tramo1: "+are);
        
    }
}
