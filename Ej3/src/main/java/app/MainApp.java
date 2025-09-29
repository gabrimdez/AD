package app;

import modelo.Usuario;
import servicio.RegistroUsuarios;
import servicio.RegistroMensajes;
import utils.Mensajes;

public class MainApp {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario u1 = new Usuario("Ana", "ana@email.com");
        Usuario u2 = new Usuario("Luis", "luis@email.com");

        // Registrar usuarios
        RegistroUsuarios.altaUsuario(u1);
        RegistroUsuarios.altaUsuario(u2);

        // Mostrar información de cada usuario
        System.out.println(u1);
        System.out.println(u2);

        // Saludo personalizado
        System.out.println(Mensajes.mostrarSaludo(u1.getName()));
        System.out.println(Mensajes.mostrarSaludo(u2.getName()));

        // Enviar mensajes
        RegistroMensajes.enviar(u1.getEmail(), u2.getEmail(), "¡Hola Luis!");
        RegistroMensajes.enviar(u2.getEmail(), u1.getEmail(), "¡Hola Ana!");

        // Mostrar bandeja de entrada
        System.out.println("Bandeja de Ana:");
        for (var m : RegistroMensajes.bandejaDeEntrada(u1.getEmail())) {
            System.out.println(m);
        }
        System.out.println("Bandeja de Luis:");
        for (var m : RegistroMensajes.bandejaDeEntrada(u2.getEmail())) {
            System.out.println(m);
        }

        // Mostrar totales
        System.out.println("Total de usuarios creados: " + Usuario.getContadorUsuarios());
        System.out.println("Total de usuarios registrados: " + RegistroUsuarios.getTotalUsuarios());
        System.out.println("Total de mensajes enviados: " + RegistroMensajes.getTotalMensajes());

        // Mensaje final formateado
        System.out.println(Mensajes.formatearMensaje("Fin de la demo"));
    }
}
