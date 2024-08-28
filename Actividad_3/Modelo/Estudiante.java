package actividad_3_p2_Modulos;

/**
 *
 * @author Hull
 */
public class Estudiante {

    private int cedula ;
    private String Ced = ""+this.cedula;
    private char LastD = Ced.charAt(Ced.length()-1);
    private int Modelo ;

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modulo) {
        this.Modelo = Modulo;
    }

    public Estudiante(int cedula) {
        this.cedula = cedula;
    }

    public int getCadula() {
        return cedula;
    }

    public void setCadula(int cedula) {
        this.cedula = cedula;
    }

    public char getLastD() {
        return LastD;
    }

    @Override
    public String toString() {
        return "El estudiante de cedula: " + this.cedula;
    }

}

