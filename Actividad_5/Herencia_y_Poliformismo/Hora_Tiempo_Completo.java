package programacion_II_herencia;

/**
 *
 * @author Hull
 */
public class Hora_Tiempo_Completo extends Docente{
    
    final private double basico = 2000000.0;
    private int Cantidad_Trabajos_De_Grado;

    public double getBasico() {
        return basico;
    }

    public int getCantidad_Trabajos_De_Grado() {
        return Cantidad_Trabajos_De_Grado;
    }

    public Hora_Tiempo_Completo(String Nombre, String Facultad, String Cadi,int Cantidad_Trabajos_De_Grado) {
        super(Nombre, Facultad, Cadi);
        this.Cantidad_Trabajos_De_Grado = Cantidad_Trabajos_De_Grado;
    }

    @Override
    public double Calcular_Sueldo() {
        double Bono = 150000.0 * Cantidad_Trabajos_De_Grado;
        return this.basico + Bono;
    }
    
    @Override
    public String toString(){
        String Linea = "Nombre del Docente: " + getNombre() + "\n";
        Linea += "Facultad del Docente: " + getFacultad() + "\n";
        Linea += "Cadi del Docente: " + getCadi() + "\n";
        Linea += "Cantidad de Trabajos de Grado: " + Cantidad_Trabajos_De_Grado + "\n";
        Linea += "Salario Basico: " + basico + "\n";
        Linea += "Salario del Docente: " + Calcular_Sueldo();
        return Linea;
    }
    
    
    
}
