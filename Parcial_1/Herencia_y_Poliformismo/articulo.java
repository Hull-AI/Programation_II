package programacion_ii_parcial_h.p;

import java.text.DecimalFormat;
/**
 *
 * @author Hull
 */
public class articulo {
    
    protected DecimalFormat df = new DecimalFormat("#.00");
    
    protected String Nombre;
    protected double Precio;
    protected int Codigo;
    protected int Cantidad;

    public articulo(String nombre, double precio, int codigo, int cantidad) {
        this.Nombre = nombre;
        this.Precio = precio;
        this.Codigo = codigo;
        this.Cantidad = cantidad;
    }

    public double Calcular() {
        Precio *= Cantidad;
        return Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    @Override
    public String toString(){
        String ts = "---------------------------------\n";
        ts += "Nombre de Producto: \n" + Nombre;
        ts += "Precio de Producto: \n" + df.format(Precio);
        ts += "Codigo de Producto: \n" + Codigo;
        ts += "Cantidad de Producto: \n" + Cantidad;
        return ts;
    }

}
