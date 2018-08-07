/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Kevin Santos
 */
public class Ejercicioossemana33 {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int Numero = 0, Factorial = 1;
    System.out.println("Calculo Factorial");
    System.out.println("Ingrese un Numero");
    Numero=leer.nextInt();
    while(Numero > 0){
        while(Numero > 0){
        Factorial*=Numero;
        Numero--;
        }
        System.out.println("El Factorial es de: " + Factorial + "\n");
        System.out.println("Ingrese un numero: ");
        Numero = 0;
        Factorial = 1;
        Numero=leer.nextInt();
    }
    }
}
