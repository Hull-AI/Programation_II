package actividad_2_p2_Operaciones;

/**
 *
 * @author Hull
 */
import java.util.Scanner;

public class Operador {

    private int[] Numeros = new int[2];
    private int res = 0;
    private Scanner sc = new Scanner(System.in);

    public void operador() {
        System.out.print("Ingrese 2 numeros enteros: ");
        for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = sc.nextInt();
        }
        System.out.println("Operaciones: ");
        System.out.println("  1. Suma");
        System.out.println("  2. Resta");
        System.out.println("  3. Multiplicacion");
        System.out.println("  0. Salir");
        System.out.print("Ingrese el numero de la operacion a realizar: ");
        int Opcion = sc.nextInt();
        Operaciones(Opcion);
    }

    private void Operaciones(int Opcion) {
        switch (Opcion) {
            case 1:
                res = Numeros[1] + Numeros[0];
                System.out.println(Numeros[0] + " + " + Numeros[1] + " = " + res);
                break;
            case 2:
                res = Numeros[1] - Numeros[0];
                System.out.println(Numeros[0] + " - " + Numeros[1] + " = " + res);
                break;
            case 3:
                res = Numeros[1] * Numeros[0];
                System.out.println(Numeros[0] + " * " + Numeros[1] + " = " + res);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Ingrese un numero de opcion valido");
        }
        operador();

    }

}

