package tech.cybersys.videojuego_javafx.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import tech.cybersys.videojuego_javafx.modelo.Personaje;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAO;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAOImpl;

import java.io.IOException;

import static tech.cybersys.videojuego_javafx.controlador.ControladorVentanas.mostrarVentana;

public class ControladorCreacionPersonaje {

    @FXML private TabPane TablaPestanas;
    @FXML private TextArea CampoHistoria;
    @FXML private TextField CampoNombre;
    @FXML private Label EtiquetaErrorNombre;
    @FXML private TextField CampoSalud;
    @FXML private TextField CampoFuerza;
    @FXML private TextField CampoInteligencia;
    @FXML private TextField CampoDinero;
    @FXML private Button BotonCrearPersonaje;

    Personaje PersonajeGuardado;

    @FXML
    public void MostrarAtributosComerciante() throws IOException {
        String historia ="Un astuto comerciante, nacido en el bullicioso puerto de Marvella. " +
                "Desde joven, aprendió el arte del trueque y la negociación de su padre, un renombrado mercader. " +
                "Con un ojo agudo para los tesoros y una lengua de plata, él viaja por tierras lejanas en busca de " +
                "objetos raros y valiosos. Su tienda es conocida por tener los artículos más exóticos y útiles, " +
                "desde pociones mágicas hasta armas legendarias. Aunque su apariencia es modesta, su conocimiento " +
                "y recursos son invaluables para cualquier aventurero que cruce su camino.";
        if(CampoNombre.getText().equals("")){
            EtiquetaErrorNombre.setVisible(true);
        }else{
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje comerciante = new Personaje.Builder()
                    .setClase("Comerciante")
                    .setFuerza("50")
                    .setHistoria(historia)
                    .setInteligencia("55")
                    .setSalud("200")
                    .setNombre("Carlos")
                    .setDinero("1000")
                    .build();
            PersonajeGuardado = comerciante;

            CampoHistoria.setText(comerciante.getHistoria());
            CampoSalud.setText(comerciante.getSalud());
            CampoFuerza.setText(comerciante.getFuerza());
            CampoDinero.setText(comerciante.getDinero());
            CampoInteligencia.setText(comerciante.getInteligencia());
            CampoDinero.setText(comerciante.getDinero());
        }



    }

    @FXML
   public void CrearPersonaje(ActionEvent event) throws IOException {
       PersonajeDAO personajeDAO = new PersonajeDAOImpl();
       personajeDAO.guardarPersonaje(PersonajeGuardado);
        mostrarVentana(event, null, "Juego-view.fxml", "Pantalla de Juego");
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
