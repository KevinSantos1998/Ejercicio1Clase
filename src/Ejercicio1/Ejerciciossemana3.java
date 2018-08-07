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
public class Ejerciciossemana3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ejercicio  de pares multiplos de 3 y primos");
        System.out.println("Ingrese 20 numeros: ");
        int Contador=0;
        int Numero=0;
        int pares = 0;
        int multiplos = 0;
        int primos = 0;
        while (Contador<=5){
        Numero=leer.nextInt();
        Contador++;
        if (Numero%2==0){
        pares ++;
        }
        if(Numero/Numero == 1 && Numero/1 == Numero && Numero%3 != 0){
            primos ++;
        }
        if(Numero%3==0 || Numero==3){
        multiplos ++;
        if(Numero==3){
        primos ++;
        }
        }
        }
        System.out.println("Cantidad de Numeros Pares: " + pares);
        System.out.println("Cantidad de Numeros Multiplos de 3: " + multiplos);
        System.out.println("Cantidad de Numeros Primos: " + primos);
    }
}
