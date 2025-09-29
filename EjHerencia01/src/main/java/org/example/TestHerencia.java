package org.example;

public class TestHerencia {
    public static void main(String[] args) {
        ProductoFresco productoFresco = new ProductoFresco("2024-12-31", 12345, "2024-01-01", "España");
        ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("2024-11-30", 54321, "ABC123", 4.0);
        ProductoCongelado productoCongelado = new ProductoCongelado("2025-01-15", 67890, -18.0);

        System.out.println("Producto Fresco:");
        productoFresco.mostrarInformacion();
        System.out.println();

        System.out.println("Producto Refrigerado:");
        productoRefrigerado.mostrarInformacion();
        System.out.println();

        System.out.println("Producto Congelado:");
        productoCongelado.mostrarInformacion();
    }
}
