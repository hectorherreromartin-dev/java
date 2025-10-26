
package gestortemperaturas;

import java.util.Scanner;

public class GestorTemperaturas {

     public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double suma = 0;

        System.out.println("Introduce las temperaturas de la semana:");

        for (int i = 0; i < temperaturas.length; i++) {
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.print("Temperatura del " + dias[i] + ": ");
                try {
                    temperaturas[i] = Double.parseDouble(scanner.nextLine());
                    entradaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes introducir un número que sea válido.");
                }
            }

            suma += temperaturas[i];
        }

        double media = suma / temperaturas.length;
        System.out.printf("La temperatura media semanal es: %.2f°C\n", media);

        scanner.close();
    }
    
}
         
         
         
    
    

