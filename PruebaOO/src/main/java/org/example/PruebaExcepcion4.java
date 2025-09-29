package org.example;

public class PruebaExcepcion4 {

    static void divide(){
        int num[] = {4,5,6,7,8,9};
        int den[] = {2,0,4,8,4,16};

        for (int i=0; i<num.length; i++){
            try {
                System.out.println(num[i] + " / " + den[i] + " = " + (num[i] / den[i]));
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir " + num[i] + " entre " + den[i]);
            }
        }
    }

}
