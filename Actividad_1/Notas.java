package actividad_1_p2;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        final int Rows = 5; 
        final int Columns = 4; 
        double[][] Grades = new double[Rows][Columns];
        Scanner SC = new Scanner(System.in);

        
        System.out.println("Ingrese las notas para cada alumno:");

        for (int i = 0; i < Rows; i++) {
            double sumaNotas = 0;
            System.out.println("\nAlumno " + (i + 1) + ":");
            for (int j = 0; j < Columns - 1; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                Grades[i][j] = SC.nextDouble();
                sumaNotas += Grades[i][j];
            }
            
            Grades[i][Columns - 1] = sumaNotas / (Columns - 1);
        }

        
        System.out.println("\nNotas y promedios de los alumnos:");
        for (int i = 0; i < Rows; i++) {
            System.out.print("Alumno " + (i + 1) + " - Notas: ");
            for (int j = 0; j < Columns - 1; j++) {
                System.out.print(Grades[i][j] + " ");
            }
            System.out.println("| Promedio: " + Grades[i][Columns - 1]);
        }

        SC.close();
    }

}
