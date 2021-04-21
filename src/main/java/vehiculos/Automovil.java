package vehiculos;

public class Automovil extends Vehiculo {
    public int puestos;
    public static int cantidadAutomovil = 0;


    public Automovil(String placa, int puertas, float velocidadMaxima, String nombre,
                     float precio, float peso, String traccion, Fabricante fabricante, int puestos) {

        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getCantidadAutomovil() {
        return cantidadAutomovil;
    }
}
