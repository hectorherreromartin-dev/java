/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        // Introducir los numeros por consola
        System.out.print("Introduce el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println();
        
        // Operaciónes aritmeticas:
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero2 / numero1;
        
        // A continuación, se muestran los resultados:
        System.out.println("Estos son los resultados");
        System.out.println();
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
         
         // Operaciones relacionales
        boolean sonIguales = numero1 == numero2;
        boolean numero1Mayor = numero1 > numero2;
        boolean numero2Mayor = numero2 > numero1;
        
        // Operaciones logicas
        boolean algunoEsCero = numero1 == 0 || numero2 == 0;
        boolean ambosPositivos = numero1 > 0 && numero2 > 0;
        
        System.out.println();
        
        
        // Mostrar resultados relacionales
        System.out.println("Resultados relacionales");
        System.out.println();
        System.out.println("¿Son iguales?: " + sonIguales);
        System.out.println("¿El primer número es mayor?: " + numero1Mayor);
        System.out.println("¿El segundo número es mayor?: " + numero2Mayor);
        
        //Mostrar resultados logicos:
        System.out.println("Resultados Lógicos");
        System.out.println();
        System.out.println("¿Alguno de los dos es cero?: " + algunoEsCero);
        System.out.println("¿Ambos son positivos?: " + ambosPositivos);
        
        
    }
    
}
