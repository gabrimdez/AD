package org.example;

public class ProductoRefrigerado extends Producto {

    private String codigoSupervisionAlimentaria;
    private double temperaturaMantenimiento;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoSupervisionAlimentaria, double temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getCodigoSupervisionAlimentaria() {
        return codigoSupervisionAlimentaria;
    }

    public void setCodigoSupervisionAlimentaria(String codigoSupervisionAlimentaria) {
        this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Codigo Supervision Alimentaria: " + this.codigoSupervisionAlimentaria);
        System.out.println("Temperatura Mantenimiento: " + this.temperaturaMantenimiento);
    }
}
