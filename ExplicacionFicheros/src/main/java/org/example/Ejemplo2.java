package org.example;

import java.io.File;

public class Ejemplo2 {

    public static void main(String[] args) {

        String ruta = "/Users/gabriel/Desktop/";
        File carpeta = new File(ruta);
        if(carpeta.isDirectory() && carpeta.exists()){
            File archivos [] = carpeta.listFiles();
            if(archivos != null){
                for(File archivo : archivos){
                    System.out.println(archivo.getName());
                }
            }
        }
    }

}
