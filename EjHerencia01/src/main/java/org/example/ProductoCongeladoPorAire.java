package org.example;

public class ProductoCongeladoPorAire extends ProductoCongelado{

    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public ProductoCongeladoPorAire(String fechaCaducidad, int numeroLote, double temperaturaCongelacion,
           double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {

        super(fechaCaducidad, numeroLote, temperaturaCongelacion);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Composición aire: N2=" + porcentajeNitrogeno + "%, O2=" +
                porcentajeOxigeno + "%, CO2=" + porcentajeDioxidoCarbono +
                "%, Vapor de agua=" + porcentajeVaporAgua + "%");
    }
}
