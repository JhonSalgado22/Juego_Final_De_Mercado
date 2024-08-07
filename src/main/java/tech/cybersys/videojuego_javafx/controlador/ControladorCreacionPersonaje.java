package tech.cybersys.videojuego_javafx.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import tech.cybersys.videojuego_javafx.modelo.Builder.ComercianteBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.PersonajeBuilder;
import tech.cybersys.videojuego_javafx.modelo.Director;
import tech.cybersys.videojuego_javafx.modelo.Personaje;

import java.io.IOException;

public class ControladorCreacionPersonaje {

    @FXML private TabPane TablaPestanas;
    @FXML private TextArea CampoHistoria;
    @FXML private TextField CampoNombre;
    @FXML private Label EtiquetaErrorNombre;

    Personaje comerciante1;
    private ComercianteBuilder ComercianteBuilder;

    @FXML
    public void MostrarAtributosComerciante() throws IOException {
        if(CampoNombre.equals("")){
            EtiquetaErrorNombre.setVisible(true);
        }else{
            EtiquetaErrorNombre.setVisible(false);
            Director director = new Director();
            director.setBuilder(ComercianteBuilder);
            comerciante1 = director.construirComerciante(CampoNombre.toString());
            TablaPestanas.setVisible(true);
            CampoHistoria.setText(comerciante1.getHistoria());
        }



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
