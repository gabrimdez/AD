package org.example;

public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, double duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        if (actorPrincipal == null && actrizPrincipal == null) {
            throw new IllegalArgumentException("Error: Ambos actor y actriz no pueden ser ambos nulos.");
        }
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() { return actorPrincipal; }
    public String getActrizPrincipal() { return actrizPrincipal; }

    @Override
    public String toString() {
        return super.toString() +
                ", Actor Principal: " + (actorPrincipal != null ? actorPrincipal : "N/A") +
                ", Actriz Principal: " + (actrizPrincipal != null ? actrizPrincipal : "N/A");
    }
}

