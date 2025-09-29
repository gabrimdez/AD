package servicio;

import modelo.Mensaje;
import modelo.Canal;

public class RegistroMensajes {
    private static final Mensaje[] mensajes = new Mensaje[Canal.MAX_MENSAJES];
    private static int totalMensajes = 0;
    private static int siguienteId = 1;

    private RegistroMensajes() {
        // Evita la instanciación
    }

    public static boolean enviar(String remitente, String destinatario, String texto) {
        if (totalMensajes >= Canal.MAX_MENSAJES) return false;
        if (servicio.RegistroUsuarios.buscarPorEmail(remitente) == null ||
                servicio.RegistroUsuarios.buscarPorEmail(destinatario) == null) return false;
        mensajes[totalMensajes++] = new Mensaje(siguienteId++, remitente, destinatario, texto);
        return true;
    }

    public static Mensaje[] bandejaDeEntrada(String email) {
        int count = 0;
        for (int i = 0; i < totalMensajes; i++) {
            if (mensajes[i].getDestinatario().equals(email)) count++;
        }
        Mensaje[] bandeja = new Mensaje[count];
        int idx = 0;
        for (int i = 0; i < totalMensajes; i++) {
            if (mensajes[i].getDestinatario().equals(email)) {
                bandeja[idx++] = mensajes[i];
            }
        }
        return bandeja;
    }

    public static int getTotalMensajes() {
        return totalMensajes;
    }
}
