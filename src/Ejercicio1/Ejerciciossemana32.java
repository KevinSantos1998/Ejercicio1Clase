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
public class Ejerciciossemana32 {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        double SalarioTotal = 0, ISR = 0, Descuento=0;
        System.out.println("Calculo del ISR");
        System.out.println("Ingrese Nombre de Empleado: ");
        String Nombre=leer.nextLine();
        System.out.println("Ingrese Salario: ");
        double Salario=leer.nextDouble();
        if (Salario >= 0.01 && Salario<= 152557.15){
            ISR= 0;
            Descuento = 0;
        }else if (Salario >= 152557.16  && Salario<= 232622.61){
          ISR= 0.15;
          Descuento = 15;
        }else if (Salario >= 232622.62  && Salario<= 540982.82){
          ISR= 0.2;  
          Descuento = 20;
        }else if (Salario >= 540982.83){
          ISR= 0.25;  
          Descuento = 25;
        }
        SalarioTotal = Salario-(Salario*ISR);
        System.out.println("El Nombre del Empleado es: "+ Nombre);
        System.out.println("El Descuesto es: "+ ISR+"%");
        System.out.println("El Salario Total es: "+ SalarioTotal);
        
    }
}
