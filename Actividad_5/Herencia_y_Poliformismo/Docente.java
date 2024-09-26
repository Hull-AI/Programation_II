package programacion_II_herencia;

/**
 *
 * @author Hull
 */
public abstract class Docente {

    private String Nombre;
    private String Facultad;
    private String Cadi;

    public Docente(String Nombre, String Facultad, String Cadi) {
        this.Nombre = Nombre;
        this.Facultad = Facultad;
        this.Cadi = Cadi;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public String getCadi() {
        return Cadi;
    }

    public void setCadi(String Cadi) {
        this.Cadi = Cadi;
    }
    
    public abstract double Calcular_Sueldo();
    
    @Override
    public String toString(){
        String Linea = "Nombre del Docente: " + Nombre;
        Linea += "Facultad del Docente: " + Facultad;
        Linea += "Cadi del Docente: " + Integer.parseInt(Cadi);
        return Linea;
    }
}
