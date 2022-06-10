/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sara.ejerciciostematres.segundoEjercicio;

 
public class Coche {
    private int numeroPuertas;

    public Coche(int numeroPuertas) throws Exception {
        this.setNumeroPuertas(numeroPuertas);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    private void setNumeroPuertas(int numeroPuertas) throws Exception {
        if (numeroPuertas > 5) throw new Exception("El numero de puertas no puede ser mayor a cinco");
        if (numeroPuertas < 2) throw new Exception("El numero de puertas no puede ser menor a dos");
        this.numeroPuertas = numeroPuertas;
        
    }
    
    public void agregarPuerta(){
        this.numeroPuertas++;
    }
   
}
