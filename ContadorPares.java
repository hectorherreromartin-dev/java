
package contadorpares;

import java.util.Scanner;

public class ContadorPares {

    public static void main(String[] args) {
    
           Scanner scanner = new Scanner(System.in);
        int limite;

       
        do {
            System.out.print("Introduce un número entero y que sea positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Debes introducir un número que sea entero.");
                scanner.next(); // Limpiar entrada inválida
                System.out.print("Introduce un númeroque sea entero positivo: ");
            }
            limite = scanner.nextInt();
            if (limite <= 0) {
                System.out.println("El número tiene que ser mayor que cero.");
            }
        } while (limite <= 0);

        System.out.println("Números pares del 1 al " + limite + ":");

        //Utilizo for con continue para omitir impares
        
        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                continue; // Al añadir continue salta los impares
            }
            System.out.println(i); 
        }

        scanner.close();
    }
}
    
