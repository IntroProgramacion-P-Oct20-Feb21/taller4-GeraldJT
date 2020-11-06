/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
         entrada.useLocale(Locale.US);
         // Variables
         double cminutos;
         double minutoscmes;
         double total;
         // Datos
         System.out.println("Ingresar el costo por minuto");
         cminutos = entrada.nextDouble();
         System.out.println("Ingresar minutos consumidos");
         minutoscmes = entrada.nextDouble();
         // Proceso
         total = cminutos * minutoscmes;
         //Salida
         System.out.println("El valor a pagar es:\n" + total);
    
         
         
         
                 
     
    }
    
        
        
    
}
