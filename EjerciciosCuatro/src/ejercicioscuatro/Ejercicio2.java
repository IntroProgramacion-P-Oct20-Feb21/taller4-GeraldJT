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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
         entrada.useLocale(Locale.US);
         // Variable
         double gastosh1;
         double gastosh2;
         double gastosh3;
         double total;
         // Datos
         System.out.println("Ingresar los gastos del hijo 1");
         gastosh1 = entrada.nextDouble();
         System.out.println("Ingresar los gastos del hijo 2");
         gastosh2 = entrada.nextDouble();
         System.out.println("Ingresar los gastos del hijo 3");
         gastosh3 = entrada.nextDouble();
         // Proceso
         total = gastosh1 + gastosh2 + gastosh3;
         // Salida
         System.out.println("Los gastos totales de los hijos es:\n" + total);
       
   
         
         
    }
}
