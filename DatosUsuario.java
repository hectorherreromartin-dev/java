/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datosusuario;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DatosUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
         // Variables con mis datos personales:
        String nombre = "Hector";
        int edad = 33;
        double altura = 1.81;
        char tallaCamiseta = 'M';
        boolean esTrabajador = true;

        // Constante con mi lugar de trabajo
        final String LUGAR_TRABAJO = "Rocódromo Treparriscos";

        // Mostrar los datos en consola
        System.out.println("--- Datos del Usuario ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Talla de camiseta: " + tallaCamiseta);
        System.out.println("¿Es trabajador?: " + esTrabajador);
        System.out.println("Lugar de trabajo: " + LUGAR_TRABAJO);
                
    }
    
}
