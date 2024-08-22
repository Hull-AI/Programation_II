
package actividad_1_p2;

import java.util.Scanner;

public class Registraduria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int AÑO_ACTUAL = 2024; 
        final int EDAD_MINIMA = 18; 
        final int ward = -1;

        System.out.println("Ingrese el año de nacimiento de cada persona. Ingrese " + ward + " para terminar.");

        while (true) {
            System.out.print("Año de nacimiento: ");
            int añoNacimiento = sc.nextInt();

            if (añoNacimiento == ward) {
                break;
            }

            int edad = AÑO_ACTUAL - añoNacimiento;

            if (edad >= EDAD_MINIMA) {
                System.out.println("La persona es apta para votar.");
            } else {
                System.out.println("La persona no es apta para votar.");
            }
        }

        System.out.println("Programa terminado.");
        sc.close();
    }
}
