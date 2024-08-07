package tech.cybersys.videojuego_javafx.modelo.Builder;


import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class ComercianteBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public ComercianteBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildSalud() {
        builder.setSalud(80);
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza(50);
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia(90);
    }

    @Override
    public void buildClase() {
        builder.setClase("Comerciante");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
