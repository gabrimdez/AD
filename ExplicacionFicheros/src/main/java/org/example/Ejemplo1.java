package org.example;

import java.io.File;
import java.io.IOException;

public class Ejemplo1 {
    public static void main(String[] args) {
        File f = new File("gabriel.txt"); // El nombre del archivo debe ir entre comillas

        try {
            boolean created = f.createNewFile(); // Puede lanzar IOException, por eso está en try-catch
            if (created) {
                System.out.println("Fichero creado con éxito");
            } else {
                System.out.println("El fichero ya existía");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }

        if (f.exists()) {
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }

        if (f.isFile()) {
            System.out.println("El fichero es un archivo");
        } else if (f.isDirectory()) {  // Se cambia else(f.isDirectory()) por else if(f.isDirectory())
            System.out.println("El fichero es un directorio");
        }
    }
}
