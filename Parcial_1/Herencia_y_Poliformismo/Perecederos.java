package programacion_ii_parcial_h.p;

/**
 *
 * @author JH
 */
public class Perecederos extends articulo {

    private int Dias;
    private final double[] descuento = {0.2, 0.4, 0.6};

    public Perecederos(String nombre, double precio, int codigo, int dias, int cantidad) {
        super(nombre, precio, codigo, cantidad);
        this.Dias = dias;
    }

    @Override
    public double Calcular() {
        if (Dias <= 3) {
            switch (Dias) {
                case 1 -> {
                    Precio -= Precio * descuento[2];
                    Precio *= Cantidad;
                }
                case 2 -> {
                    Precio -= Precio * descuento[1];
                    Precio *= Cantidad;
                }
                case 3 -> {
                    Precio -= Precio * descuento[0];
                    Precio *= Cantidad;
                }
            }
        } else if (Dias > 3) {
            Precio *= Cantidad;
        }
        return Precio;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }
    
    @Override
    public String toString(){
        String ts = "---------------------------------\n";
        ts += "Nombre de Producto: \n" + Nombre;
        ts += "Precio de Producto: \n" + df.format(Precio);
        ts += "Codigo de Producto: \n" + Codigo;
        ts += "Cantidad de Producto: \n" + Cantidad;
        ts += "Dias de Caducidad de Producto: \n" + Dias;
        return ts;
    }

}
