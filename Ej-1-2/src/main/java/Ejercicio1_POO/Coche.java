package Ejercicio1_POO;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double kilometros;

    // Atributo estático
    private static int numCoches = 0;

    public Coche() {
        this.marca = "Genérica";
        this.modelo = "ModeloX";
        this.anio = 2000;
        this.color = "Blanco";
        this.kilometros = 0.0;
        numCoches++;
    }

    public Coche(String marca, String modelo, int anio, String color, double kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.kilometros = kilometros;
        numCoches++;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public static int getNumCoches() {
        return numCoches;
    }


    public void conducir(double km) {
        if (km > 0) {
            this.kilometros += km;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", color='" + color + '\'' +
                ", kilometros=" + kilometros +
                '}';
    }
}
