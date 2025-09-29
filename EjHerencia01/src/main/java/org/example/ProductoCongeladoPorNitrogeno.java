package org.example;

public class ProductoCongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion; // segundos

    public ProductoCongeladoPorNitrogeno(String fechaCaducidad, int numeroLote, double temperaturaCongelacion,
                                         String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, temperaturaCongelacion);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    // Métodos get y set para cada atributo

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Método de congelación: " + metodoCongelacion);
        System.out.println("Tiempo de exposición: " + tiempoExposicion + " segundos");
    }
}
