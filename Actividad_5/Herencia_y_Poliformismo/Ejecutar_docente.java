package programacion_II_herencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hull
 */
public class Ejecutar_Docente {

    private static ArrayList<Docente> Docentes = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu(sc);
    }

    private static void menu(Scanner D) {
        desplegarMenu();
    }

    private static void desplegarMenu() {
        mostrarOpciones();
        int TipoCuenta = Integer.parseInt(sc.nextLine());
        ejecutarOpcionSeleccionada(TipoCuenta);

        desplegarMenu();
    }

    private static void mostrarOpciones() {
        String strMenu = "\nSeleccione el tipo de Docente: ";
        strMenu += "\n1. Ingresar Docente por Horas Catedra.";
        strMenu += "\n2. Ingresar Docente Tiempo Completo.";
        strMenu += "\n3. Mostrar Docentes.";
        strMenu += "\n0. Salir.";

        System.out.println(strMenu);
    }

    private static void ejecutarOpcionSeleccionada(int Tipo) {
        switch (Tipo) {
            case 1:
                System.out.println("Ingrese El Nombre, La Facultad, El Cadi del Docente,\n"
                        + "y La cantidad de Horas Trabajadas: ");
                String[] Linea1 = sc.nextLine().split(",");
                HoraCatedra HC = new HoraCatedra(Linea1[0], Linea1[1], Linea1[3], Integer.parseInt(Linea1[3]));
                Docentes.add(HC);
                break;
            case 2:
                System.out.println("Ingrese El Nombre, La Facultad, El Cadi del Docente,\n"
                        + "y La cantidad de Trabajos de Grado: ");
                String[] Linea2 = sc.nextLine().split(",");
                Hora_Tiempo_Completo HTC = new Hora_Tiempo_Completo(Linea2[0], Linea2[1], Linea2[3], Integer.parseInt(Linea2[3]));
                Docentes.add(HTC);
                break;
            case 3:
                for (int i = 0; i < Docentes.size(); i++) {
                    System.out.println(Docentes.get(i).toString() + "\n");
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Seleccione una Opcion valida.");
                desplegarMenu();
        }

    }

}
