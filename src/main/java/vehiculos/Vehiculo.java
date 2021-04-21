package vehiculos;

public class Vehiculo {

    public String placa;
    public int puertas;
    public float velocidadMaxima;
    public String nombre;
    public float precio;
    public float peso;
    public String traccion;
    public Fabricante fabricante;
    static int CantidadVehiculos = 0;

    public Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos ++;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }


    public String vehiculosPorTipo(){
        return ("Automoviles: "+ Automovil.getCantidadAutomovil() +
                "Camionetas: "+ Camioneta.getCantidadCamioneta())+
                "Camiones: "+ Camion.getCantidadCamion();
    }

    public String paisMasVendedor(){

        return "A";


    }


}