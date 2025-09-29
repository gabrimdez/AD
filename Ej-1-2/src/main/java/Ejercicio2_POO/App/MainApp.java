package Ejercicio2_POO.App;

import Ejercicio2_POO.Modelo.Usuario;

import static Ejercicio2_POO.Utilidades.Mensajes.mostrarSaludo;

public class MainApp {

    public static void main(String[] args) {

        Usuario Usuario1 = new Usuario("Gabriel", "gabriel@gmail.com");
        Usuario Usuario2 = new Usuario("Enma", "enma@gmail.com");

        Usuario1.mostrasrInfo();
        System.out.println("-------------------");
        Usuario2.mostrasrInfo();
        System.out.println("-------------------");

        Usuario.getContadorUsuarios();
        System.out.println("Cantidad de usuarios: " + Usuario.getContadorUsuarios());

        System.out.println("-------------------");

        mostrarSaludo(Usuario1.getNombre());
        mostrarSaludo(Usuario2.getNombre());
        System.out.println(mostrarSaludo(Usuario1.getNombre()));
        System.out.println(mostrarSaludo(Usuario2.getNombre()));
    }
}
