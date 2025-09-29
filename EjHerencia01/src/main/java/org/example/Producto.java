package org.example;

public class Producto {

    public String fechaCaducidad;
    public int numeroLote;

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void mostrarInformacion(){
        System.out.println("Fecha Caducidad: " + this.fechaCaducidad);
        System.out.println("Numero Lote: " + this.numeroLote);
    }
}