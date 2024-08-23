package actividad_1_p2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Promedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAMANO_VECTOR = 10;
        int[] numeros = new int[TAMANO_VECTOR];
        HashMap<Integer, Integer> contador = new HashMap<>();
        int suma = 0;

        System.out.println("Ingrese " + TAMANO_VECTOR + " números:");

        for (int i = 0; i < TAMANO_VECTOR; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            contador.put(numeros[i], contador.getOrDefault(numeros[i], 0) + 1);

            suma += numeros[i];
        }

        System.out.println("\nCantidad de veces que se ingresó cada número:");
        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            System.out.println("El número " + entry.getKey() + " se ingresó " + entry.getValue() + " vez/veces.");
        }

        double promedio = (double) suma / TAMANO_VECTOR;
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);

        sc.close();
    }
}
