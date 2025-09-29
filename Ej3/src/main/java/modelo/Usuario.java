package modelo;

public class Usuario {

    private String name;
    private String email;

    static int contadorUsuarios = 0;

    public Usuario(String name, String email) {
        this.name = name;
        this.email = email;
        contadorUsuarios++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public String mostrarInfo() {
        return "Nombre: " + name + ", Email: " + email;
    }
}
