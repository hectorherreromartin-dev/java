/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluadornotas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EvaluadorNotas {

    public static void main(String[] args) {
       
        //Añadimos la linea de codigo de Scanner para al lanzar el programa podamos insertar un numero
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una nota entre 0 y 10 para comprobar la nota del examen: ");

        if (scanner.hasNextDouble()) {
            
            //Pongo double porque las notas pueden ser decimales y no enteros solo
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                if (nota < 5) {
                    System.out.println("Suspenso");
                } else if (nota < 7) {
                    System.out.println("Aprobado");
                } else if (nota < 9) {
                    System.out.println("Notable");
                } else {
                    System.out.println("Sobresaliente");
                }
            } else {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
            }
        } else {
            System.out.println("Error: Entrada no válida. Debes introducir un número.");
        }
        
        
    }
    
}
