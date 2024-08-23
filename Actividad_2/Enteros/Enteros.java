package actividad_1_p2.Enteros;

import java.util.Scanner;

/**
 *
 * @author Hull
 */
public class Enteros {

    private Scanner sc = new Scanner(System.in);
    private int[] Datos;
    private int[] Resultados;

    public void ejecutar() {
        System.out.println("ingrese la cantidad de numeros que quiera");
        int cant = sc.nextInt();
        Datos = new int[cant];
        System.out.println("ingrese los numeros del arreglo");
        for (int i = 0; i < Datos.length; i++) {
            Datos[i] = sc.nextInt();
        }
        Resultados = Comparador(Datos);
        System.out.println("Hay " + Resultados[0] + " Numeros Positivos.");
        System.out.println("Hay " + Resultados[1] + " Numeros Negativos.");
        System.out.println("Hay " + Resultados[2] + " Ceros.");
    }

    private static int[] Comparador(int[] x) {
        int[] PNC = new int[3];
        PNC[0] = 0;
        PNC[1] = 0;
        PNC[2] = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                PNC[0]++;
            } else if (x[i] < 0) {
                PNC[1]++;
            } else if (x[i] == 0) {
                PNC[2]++;
            }
        }
        return PNC;
    }
}
