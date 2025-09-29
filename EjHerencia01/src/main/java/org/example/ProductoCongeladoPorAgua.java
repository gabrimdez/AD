package org.example;

public class ProductoCongeladoPorAgua extends ProductoCongelado{

    private double salinidadAgua; // gramos de sal por litro

    public ProductoCongeladoPorAgua(String fechaCaducidad, int numeroLote, double temperaturaCongelacion,
                                    double salinidadAgua) {
        super(fechaCaducidad, numeroLote, temperaturaCongelacion);
        this.salinidadAgua = salinidadAgua;
    }

    // Métodos get y set para salinidad

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salinidad del agua: " + salinidadAgua + " gramos/litro");
    }
}
