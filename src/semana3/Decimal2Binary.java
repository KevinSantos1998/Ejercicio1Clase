/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;
import java.util.Scanner;
/**
 *
 * @author Kevin Santos
 */
public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese un numero (Base 10): ");
        int Numero_b10=leer.nextInt();
        
        if (Numero_b10>0){
        int dividendo = Numero_b10;
        int divisor = 2;
        int cociente = dividendo/divisor;
        int residuo = dividendo % divisor;
        String numero_b2 = "";
        
        while(cociente >=1){
            numero_b2 = residuo + numero_b2;
            dividendo = cociente;
            residuo = dividendo % divisor;
            cociente = dividendo/divisor;
        }
        numero_b2 = "1" + numero_b2;
        System.out.println("El numero Binario Equivalente de " + Numero_b10 + " es " + numero_b2);
        }
        
    }
}
