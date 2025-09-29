package org.example;

public class PruebaExcepcion2 {

    void miMetodo(){
        int numero [] = new int[5];

        try{
            System.out.println("Accediendo a una posicion ilegal");
            numero[7] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocurrio una excepcion");
        }
    }

}
