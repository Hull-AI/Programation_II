package actividad_2_p2_Notas;

/**
 *
 * @author Hull
 */
import java.util.Random;
import java.text.DecimalFormat;

public class Operador {

    private double[] Notas = new double[15];
    private double Mayor, Menor, Promedio, PorcentajeAprobados;
    private int PosicionMenorNota;

    private Random r = new Random();
    private DecimalFormat df = new DecimalFormat("#.0");

    public void ejecutar() {

        for (int i = 0; i < Notas.length; i++) {
            Notas[i] = r.nextDouble(5);
        }

        MostrarNotas();
        Mayor();
        Porcentaje();
        Promedio();
        PosicionMenor();

    }

    private void Mayor() {
        Mayor = Notas[0];
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] > Mayor) {
                Mayor = Notas[i];
            }
        }
        System.out.println("La nota mayor es: " + df.format(Mayor));
    }

    private void Porcentaje() {
        PorcentajeAprobados = 0;
        for (int i = 0; i < Notas.length; i++) {

            if (Notas[i] > 3) {
                PorcentajeAprobados++;
            }
        }
        PorcentajeAprobados /= Notas.length;
        System.out.println("En promedio un " + df.format(PorcentajeAprobados * 100) + "% Aprobo la materia");
    }

    private void Promedio() {
        Promedio = 0;
        for (int i = 0; i < Notas.length; i++) {
            Promedio += Notas[i];
        }
        Promedio /= Notas.length;
        System.out.println("La nota promedio de la clase fue: " + df.format(Promedio));
    }

    private void PosicionMenor() {
        PosicionMenorNota = 0;
        Menor = Notas[0];
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] < Menor) {
                Menor = Notas[i];
                PosicionMenorNota = i;
            }
        }
        PosicionMenorNota++;
        System.out.println("El estudiante con menor nota esta en la posicion: " + PosicionMenorNota);
    }

    private void MostrarNotas() {
        System.out.println("Las notas de los estudiantes son: ");
        for (int i = 0; i < Notas.length; i++) {
            if (i == Notas.length - 1) {
                if (Notas[i] < 1) {
                    System.out.println("[0" + df.format(Notas[i]) + "] ");
                } else {
                    System.out.println("[" + df.format(Notas[i]) + "] ");
                }
            } else {
                if (Notas[i] < 1) {
                    System.out.print("[0" + df.format(Notas[i]) + "] ");
                } else {
                    System.out.print("[" + df.format(Notas[i]) + "] ");
                }
            }

        }
    }

}
