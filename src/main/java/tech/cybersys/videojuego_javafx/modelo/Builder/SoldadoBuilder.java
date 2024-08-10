package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class SoldadoBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public SoldadoBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "En las vastas llanuras de Kalindor, había una mujer llamada Elda, famosa por su sabiduría y su " +
                "habilidad con el arco. Desde niña, Elda mostró una afinidad especial por la naturaleza, pasando horas " +
                "observando los vientos y escuchando el susurro de los árboles. Guiada por los antiguos druidas del bosque, " +
                "Elda aprendió el arte de la arquería y la magia natural, convirtiéndose en una protectora silenciosa de su tierra natal.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("400");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("900");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("300");
    }

    @Override
    public void buildClase() {
        builder.setClase("Soldado");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}