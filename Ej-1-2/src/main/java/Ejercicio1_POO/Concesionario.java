package Ejercicio1_POO;

public class Concesionario {
    public static void main(String[] args) {

        Coche coche = new Coche(); // por defecto
        Coche coche1 = new Coche("Toyota", "Corolla", 2018, "Rojo", 45000.0);
        Coche coche2 = new Coche("Ford", "Mustang", 2021, "Negro", 12000.0);

        // Modificar el color de un coche con setter
        coche1.setColor("Azul");

        // Hacer que uno de los coches conduzca
        coche2.conducir(150.5);

        // Mostrar datos de todos los coches
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(coche2.toString());

        // Mostrar cuántos coches se han creado en total
        System.out.println("Número total de coches creados: " + Coche.getNumCoches());
    }
}

