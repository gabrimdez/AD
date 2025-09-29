// src/main/java/servicio/RegistroUsuarios.java
package servicio;

import modelo.Usuario;
import modelo.Canal;

public class RegistroUsuarios {
    private static final Usuario[] usuarios = new Usuario[Canal.MAX_USUARIOS];
    private static int totalUsuarios = 0;

    private RegistroUsuarios() {
        // Evita la instanciación
    }

    public static boolean altaUsuario(Usuario u) {
        if (u == null || totalUsuarios >= Canal.MAX_USUARIOS) return false;
        if (buscarPorEmail(u.getEmail()) != null) return false;
        usuarios[totalUsuarios++] = u;
        return true;
    }

    public static Usuario buscarPorEmail(String email) {
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i].getEmail().equals(email)) {
                return usuarios[i];
            }
        }
        return null;
    }

    public static Usuario[] listar() {
        Usuario[] lista = new Usuario[totalUsuarios];
        System.arraycopy(usuarios, 0, lista, 0, totalUsuarios);
        return lista;
    }

    public static int getTotalUsuarios() {
        return totalUsuarios;
    }
}
