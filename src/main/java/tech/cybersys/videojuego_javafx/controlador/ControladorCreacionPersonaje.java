package tech.cybersys.videojuego_javafx.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import tech.cybersys.videojuego_javafx.modelo.Builder.PersonajeBuilder;
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
        String historia = "Selena, una ingeniosa comerciante del vibrante mercado de Celestia, es reconocida por su habilidad para" +
                " cerrar tratos y asegurar las mejores mercancías. Desde niña, observó a su madre, una influyente comerciante, dominar" +
                " el arte de la persuasión y el intercambio. Aprendió que un buen negocio no solo se basa en los bienes que se intercambian, " +
                "sino en la confianza que se forja.";

        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje comerciante = new Personaje.Builder()
                    .setClase("Comerciante")
                    .setFuerza("300")
                    .setHistoria(historia)
                    .setInteligencia("525")
                    .setSalud("2000")
                    .setNombre("Juan")
                    .setDinero("100")
                    .build();
            PersonajeGuardado = comerciante;

            CampoHistoria.setText(comerciante.getHistoria());
            CampoSalud.setText(comerciante.getSalud());
            CampoFuerza.setText(comerciante.getFuerza());
            CampoDinero.setText(comerciante.getDinero());
            CampoInteligencia.setText(comerciante.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosSoldado() throws IOException {

        String historia = "En las vastas llanuras de Kalindor, había una mujer llamada Elda, famosa por su sabiduría y su " +
                "habilidad con el arco. Desde niña, Elda mostró una afinidad especial por la naturaleza, pasando horas " +
                "observando los vientos y escuchando el susurro de los árboles. Guiada por los antiguos druidas del bosque, " +
                "Elda aprendió el arte de la arquería y la magia natural, convirtiéndose en una protectora silenciosa de su tierra natal.";



        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje Soldado = new Personaje.Builder()
                    .setClase("Soldado")
                    .setFuerza("900")
                    .setHistoria(historia)
                    .setInteligencia("300")
                    .setSalud("400")
                    .setNombre("Jonathan")
                    .setDinero("100")
                    .build();
            PersonajeGuardado = Soldado;

            CampoHistoria.setText(Soldado.getHistoria());
            CampoSalud.setText(Soldado.getSalud());
            CampoFuerza.setText(Soldado.getFuerza());
            CampoDinero.setText(Soldado.getDinero());
            CampoInteligencia.setText(Soldado.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosAgricultor() throws IOException {

        String historia = "Lian, un joven apicultor de las serenas Colinas de Estrella, se hizo famoso por su destreza en el cuidado " +
                "de abejas y la producción de la miel más dulce de la región. Desde niño, pasaba horas observando el ajetreo de las colmenas, " +
                "aprendiendo de su abuelo el arte de la apicultura y el profundo respeto por estos pequeños pero vitales insectos.";

        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje agricultor = new Personaje.Builder()
                    .setClase("Agricultor")
                    .setFuerza("500")
                    .setHistoria(historia)
                    .setInteligencia("500")
                    .setSalud("1000")
                    .setNombre("Joni")
                    .setDinero("1000")
                    .build();
            PersonajeGuardado = agricultor;

            CampoHistoria.setText(agricultor.getHistoria());
            CampoSalud.setText(agricultor.getSalud());
            CampoFuerza.setText(agricultor.getFuerza());
            CampoDinero.setText(agricultor.getDinero());
            CampoInteligencia.setText(agricultor.getInteligencia());
        }
    }

    @FXML
    public void CrearPersonaje(ActionEvent event) throws IOException {
        PersonajeDAO personajeDAO = new PersonajeDAOImpl();
        personajeDAO.guardarPersonaje(PersonajeGuardado);
        mostrarVentana(event, null, "Juego-view.fxml", "Pantalla de Juego");
    }

    @FXML
    public void CargarPersonaje(String nombre) throws IOException {
        Personaje personaje1;
        PersonajeDAO personajedao = new PersonajeDAOImpl();
        personaje1 = personajedao.cargarPersonaje(nombre);
    }
}
