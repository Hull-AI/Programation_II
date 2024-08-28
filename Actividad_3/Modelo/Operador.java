package actividad_3_p2_Modulos;

import java.util.*;

/**
 *
 * @author Hull
 */
public class Operador {

    private ArrayList<Estudiante> Estudiantes;
    private Scanner sc = new Scanner(System.in);

    private int CantidadEstudiantes;
    private int[] modelos = {0,0,0,0,0};

    public void ejecutar() {
        Estudiantes = new ArrayList<>();
        Ingreso();
        Modelo();
        CalcularModelos();
        MostrarModelos();
    }

    private void Ingreso() {
        System.out.print("Ingrese la cantidad de estudiantes: ");
        CantidadEstudiantes = sc.nextInt();
        if (CantidadEstudiantes == 0) {
            System.exit(0);
        }
        for (int i = 0; i < CantidadEstudiantes; i++) {
            System.out.println("Ingrese los 2 ultimos digitos de la cedula del estudiante #" + (i + 1));
            int cedula = sc.nextInt();
            Estudiante x = new Estudiante(cedula);
            Estudiantes.add(x);
        }

    }

    private void Modelo() {
        for (int i = 0; i < Estudiantes.size(); i++) {
            switch (Estudiantes.get(i).getLastD()) {
                case '1', '6':
                    Estudiantes.get(i).setModelo(1);
                    System.out.println(Estudiantes.get(i).getModelo());
                    break;
                case '2', '7':
                    Estudiantes.get(i).setModelo(2);
                    System.out.println(Estudiantes.get(i).getModelo());
                    break;
                case '3', '8':
                    Estudiantes.get(i).setModelo(3);
                    System.out.println(Estudiantes.get(i).getModelo());
                    break;
                case '4', '9':
                    Estudiantes.get(i).setModelo(4);
                    System.out.println(Estudiantes.get(i).getModelo());
                    break;
                case '5', '0':
                    Estudiantes.get(i).setModelo(5);
                    System.out.println(Estudiantes.get(i).getModelo());
                    break;
                default:
                    System.out.println("No Corresponde");
            }
        }
    }

    private void CalcularModelos() {
        for (int i = 0; i < Estudiantes.size(); i++) {
            switch (Estudiantes.get(i).getModelo()) {
                case 1 ->
                    modelos[0]++;
                case 2 ->
                    modelos[1]++;
                case 3 ->
                    modelos[2]++;
                case 4 ->
                    modelos[3]++;
                case 5 ->
                    modelos[4]++;
                default ->
                    System.out.println("No Corresponde");
            }
        }
    }

    private void MostrarModelos() {
        for (int j = 0; j < modelos.length; j++) {
            System.out.println("La cantidad de estudiantes del modelo #" + (j + 1) + " son: " + modelos[j]);
        }
        ejecutar();
    }
}
