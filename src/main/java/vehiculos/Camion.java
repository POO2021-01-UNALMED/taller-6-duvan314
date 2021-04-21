package vehiculos;

class Camion extends Vehiculo{

    public int ejes;
    static int cantidadCamion = 0;

    public Camion(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getCantidadCamion() {
        return cantidadCamion;
    }
}

