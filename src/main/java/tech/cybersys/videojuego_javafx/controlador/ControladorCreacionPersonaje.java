package tech.cybersys.videojuego_javafx.controlador;

import tech.cybersys.videojuego_javafx.modelo.Builder.ComercianteBuilder;
import tech.cybersys.videojuego_javafx.modelo.Director;
import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class ControladorCreacionPersonaje {
    private Director director;

    public ControladorCreacionPersonaje() {
        this.director = new Director();
    }

    public Personaje crearComerciante(String nombre) {
        ComercianteBuilder comercianteBuilder = new ComercianteBuilder();
        director.setBuilder(comercianteBuilder);
        return director.construirPersonaje(nombre);
    }

//    public Personaje crearAgricultor(String nombre) {
//        AgricultorBuilder agricultorBuilder = new AgricultorBuilder();
//        director.setBuilder(agricultorBuilder);
//        return director.construirPersonaje(nombre);
//    }
//
//    public Personaje crearSoldado(String nombre) {
//        SoldadoBuilder soldadoBuilder = new SoldadoBuilder();
//        director.setBuilder(soldadoBuilder);
//        return director.construirPersonaje(nombre);
//    }
}
