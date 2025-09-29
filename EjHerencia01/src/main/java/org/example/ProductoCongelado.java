package org.example;

public class ProductoCongelado extends Producto{

    private double temperaturaCongelacion;

    public ProductoCongelado(String fechaCaducidad, int numeroLote, double temperaturaCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Temperatura Congelacion: " + this.temperaturaCongelacion);
    }
}
