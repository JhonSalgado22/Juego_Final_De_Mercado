package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class AgricultorBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public AgricultorBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "Lian, un joven apicultor de las serenas Colinas de Estrella, se hizo famoso por su destreza en el cuidado " +
                "de abejas y la producción de la miel más dulce de la región. Desde niño, pasaba horas observando el ajetreo de las colmenas, " +
                "aprendiendo de su abuelo el arte de la apicultura y el profundo respeto por estos pequeños pero vitales insectos.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("500");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("500");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("1000");
    }

    @Override
    public void buildClase() {
        builder.setClase("Agricultor");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}