package actividad_1_p2;

import java.util.Scanner;

public class Tabla_Multiplicar {

    private static Scanner sc = new Scanner(System.in);
    private static int Multiplicador;

    public static void main(String[] args) {
        System.out.print("Ingrese el numero entero de la tabla de multiplicar que desea ver: ");
        Multiplicador = sc.nextInt();
        for (int i = 1; i < 16; i++) {
            int res = Multiplicador * i;
            System.out.println(i + " x " + Multiplicador + " = " + res);
        }
    }

}
