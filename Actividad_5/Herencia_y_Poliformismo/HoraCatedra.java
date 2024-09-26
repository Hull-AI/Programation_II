package programacion_II_herencia;

/**
 *
 * @author Hull
 */
public class HoraCatedra extends Docente {

    private int Horas_Trabajadas;
    private double Valor_Hora = 8300.0;

    public HoraCatedra(String Nombre, String Facultad, String Cadi, int Horas_Trabajadas) {
        super(Nombre, Facultad, Cadi);
        this.Horas_Trabajadas = Horas_Trabajadas;

    }

    @Override
    public double Calcular_Sueldo() {
        return Horas_Trabajadas * Valor_Hora;
    }
    public void setHoras_Trabajadas(int Horas_Trabajadas) {
        this.Horas_Trabajadas = Horas_Trabajadas;
    }

    public void setValor_Hora(double Valor_Hora) {
        this.Valor_Hora = Valor_Hora;
    }
    
    @Override
    public String toString(){
        String Linea = "Nombre del Docente: " + getNombre() + "\n";
        Linea += "Facultad del Docente: " + getFacultad() + "\n";
        Linea += "Cadi del Docente: " + getCadi() + "\n";
        Linea += "Horas Trabajadas: " + Horas_Trabajadas + "\n";
        Linea += "Valor de Hora Trabajada: " + Valor_Hora + "\n";
        Linea += "Salario del Docente: " + Calcular_Sueldo();
        return Linea;
    }

    

}
