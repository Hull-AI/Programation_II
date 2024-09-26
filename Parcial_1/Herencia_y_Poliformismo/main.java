package programacion_ii_parcial_h.p;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Hull
 */
public class main {

    private static ArrayList<articulo> Articulos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        desplegarMenu();
    }

    private static void desplegarMenu() {
        mostrarOpciones();
        int Opcion = Integer.parseInt(sc.nextLine());
        ejecutarOpcionSeleccionada(Opcion);

        desplegarMenu();
    }

    private static void mostrarOpciones() {
        String strMenu = "\nSeleccione una opcion: ";
        strMenu += "\n1. Ingresar Articulo.";
        strMenu += "\n2. Calcular.";
        strMenu += "\n3. Mostrar Articulos.";
        strMenu += "\n0. Salir.";

        System.out.println(strMenu);
    }

    private static void ejecutarOpcionSeleccionada(int Opcion) {
        switch (Opcion) {
            case 1 -> IngresarArticulo();
            case 2 -> Calcular();
            case 3 -> Mostrar();
            default -> {
                System.out.println("Seleccione una Opcion valida.");
                desplegarMenu();
            }
        }

    }

    private static void IngresarArticulo() {
        System.out.println("Seleccione un tipo de articulo");
        System.out.println("1. Perecedero.");
        System.out.println("2. No Perecedero.");

        int tipo = Integer.parseInt(sc.nextLine());
        switch (tipo) {
            case 1 -> {
                System.out.println("Ingrese El Nombre, Precio, Codigo, Los dias que faltan para la caducidad y la cantidad del producto:");
                String[] linea1 = sc.nextLine().split(",");
                Perecederos p1 = new Perecederos(linea1[0], Double.parseDouble(linea1[1]), Integer.parseInt(linea1[2]), Integer.parseInt(linea1[3]), Integer.parseInt(linea1[4]));
                Articulos.add(p1);
            }
            case 2 -> {
                System.out.println("Ingrese El Nombre, Precio, Codigo y Cantidad del producto:");
                String[] linea2 = sc.nextLine().split(",");
                NoPerecederos p2 = new NoPerecederos(linea2[0], Double.parseDouble(linea2[1]), Integer.parseInt(linea2[2]),Integer.parseInt(linea2[3]));
                Articulos.add(p2);
            }
            default -> throw new AssertionError("Eliga una opcion valida.");
        }
    }

    private static void Calcular() {
        for (int i = 0; i < Articulos.size(); i++) {
            Articulos.get(i).Calcular();
        }
    }

    private static void Mostrar() {
        for (int i = 0; i < Articulos.size(); i++) {
            System.out.println(Articulos.get(i));
        }
    }

}
