package Logic;

import java.util.*;
import GUI.Interfaz;
import Persistance.Estudiante;

/**
 *
 * @author Hull
 */
public class Operador {

    public static void main(String[] args) {
        Interfaz I = new Interfaz();
        I.setVisible(true);
        I.setLocationRelativeTo(null);
    }

    private ArrayList<Estudiante> Estudiantes;
    private int[] Modelos;

    public Operador() {
        this.Estudiantes = new ArrayList<>();
        this.Modelos = new int[5];
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return Estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> Estudiantes) {
        this.Estudiantes = Estudiantes;
    }

    public int[] getModelos() {
        return Modelos;
    }

    public void setModelos(int[] modelos) {
        this.Modelos = modelos;
    }

    public void Logica() {
        Modelo();
        CalcularModelos();
    }

    private void Modelo() {
        for (int i = 0; i < Estudiantes.size(); i++) {
            switch (Estudiantes.get(i).getLastD()) {
                case '1', '6' -> Estudiantes.get(i).setModelo(1);
                case '2', '7' -> Estudiantes.get(i).setModelo(2);
                case '3', '8' -> Estudiantes.get(i).setModelo(3);
                case '4', '9' -> Estudiantes.get(i).setModelo(4);
                case '5', '0' -> Estudiantes.get(i).setModelo(5);
                default -> System.out.println("No Corresponde");
            }
        }
    }

    private void CalcularModelos() {
        for (int i = 0; i < Estudiantes.size(); i++) {
            switch (Estudiantes.get(i).getModelo()) {
                case 1 ->
                    Modelos[0]++;
                case 2 ->
                    Modelos[1]++;
                case 3 ->
                    Modelos[2]++;
                case 4 ->
                    Modelos[3]++;
                case 5 ->
                    Modelos[4]++;
                default ->
                    System.out.println("No Corresponde");
            }
        }
    }
}

//
