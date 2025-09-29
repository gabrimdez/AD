package org.example;

public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase, String region) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String nueva_region) {
        this.region = nueva_region;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * 1.10;
    }
}

