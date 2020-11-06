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
 * @author USUARIO PC
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double montoPrestamo;
        double interesMensual;
        double totalMensual;
        
        System.out.println("Ingresar el monto del préstamo");
        montoPrestamo = entrada.nextDouble(); 
        System.out.println("Ingresar el interes mensual a pagar");
        interesMensual = entrada.nextDouble();
        
        //Proceso
        totalMensual = montoPrestamo / 12 + interesMensual; 
        
        System.out.println("El valor mensual a pagar es:\n" + totalMensual);
        
        
        
        
    }
    
}
