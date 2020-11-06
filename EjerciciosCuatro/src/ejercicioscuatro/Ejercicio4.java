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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
         entrada.useLocale(Locale.US);
         //Variables
         double preciocpu;
         double precioteclado;
         double preciopantalla;
         double precioraton;
         double total;
         //Datos
         System.out.println("Ingresar el precio del cpu");
         preciocpu = entrada.nextDouble();
         System.out.println("Ingresar el precio del teclado");
         precioteclado = entrada.nextDouble();
         System.out.println("Ingresar el precio de la pantalla");
         preciopantalla = entrada.nextDouble();
         System.out.println("Ingresar el precio del raton");
         precioraton = entrada.nextDouble();
         //Proceso
         total = preciocpu + precioteclado + preciopantalla + precioraton;
         //Salida
         System.out.println("El valor total a pagar por la computadora: es\n" +
                 total);
    }
    
}
