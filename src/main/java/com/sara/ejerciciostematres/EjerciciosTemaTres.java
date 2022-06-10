/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.sara.ejerciciostematres;

import com.sara.ejerciciostematres.primerEjercicio.Calculadora;
import com.sara.ejerciciostematres.segundoEjercicio.Coche;

public class EjerciciosTemaTres {

    public static void main(String[] args) throws Exception {
        ejemploCalculadora(4, 50, 60);
        ejemploCoche(5);
    }

    public static void ejemploCalculadora(int a, int b, int c){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(a, b, c);
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static void ejemploCoche(int numeroPuertas){
        try {
            Coche miCoche = new Coche(numeroPuertas);
            miCoche.agregarPuerta();
            System.out.println("La cantidad de puertas del coche es: " + miCoche.getNumeroPuertas());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
