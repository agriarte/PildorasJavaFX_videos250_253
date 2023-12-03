/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.textfields;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Textfields_videos251_252 extends Application {

    private TextField txtJugador, txtEquipo, txtPuntos;

    @Override
    public void start(Stage primaryStage) {
        //Etiqueta del equipo
        Label lbEquipo = new Label("Nombre del equipo: ");
        lbEquipo.setMinWidth(100);
        lbEquipo.setAlignment(Pos.BOTTOM_RIGHT);
        //campo de texto del equipo
        txtEquipo = new TextField();
        txtEquipo.setMinWidth(100);
        txtEquipo.setMaxWidth(100);
        txtEquipo.setPromptText("Nombre del equipo");

        //Etiqueta del jugador
        Label lbJugador = new Label("Nombre del jugador: ");
        lbJugador.setMinWidth(100);
        lbJugador.setAlignment(Pos.BOTTOM_RIGHT);
        //campo de texto del jugador
        txtJugador = new TextField();
        txtJugador.setMinWidth(100);
        txtJugador.setMaxWidth(100);
        txtJugador.setPromptText("Nombre del Jugador");

        //Etiqueta de los puntos
        Label lbPuntos = new Label("Puntos por partido: ");
        lbPuntos.setMinWidth(100);
        lbPuntos.setAlignment(Pos.BOTTOM_RIGHT);
        //campo de texto de los puntos
        txtPuntos = new TextField();
        txtPuntos.setMinWidth(100);
        txtPuntos.setMaxWidth(100);
        txtPuntos.setPromptText("Introduce los puntos aquí");

        //boton
        Button miBoton = new Button("entrar");
        miBoton.setMinWidth(80);
        miBoton.setMaxWidth(80);
        //evento de boton
        miBoton.setOnAction(e -> accionClick());

        //creacion del pane del equipo
        HBox hBoxEquipo = new HBox(20, lbEquipo, txtEquipo);
        hBoxEquipo.setPadding(new Insets(10));//añadir un padding de una forma que parece un poco rebuscada
        //Crea una clase de tipo Insets con un margen de 10 para los 4 lados. Esta línea es equivalente a:
        //hBoxEquipo.setPadding(new Insets(10,10,10,10));
        //El método setPadding requiere objeto tipo Insets como parámetro. No es válido hacer hBoxEquipo.setPadding(10); que sería lo
        //más intuitivo y fácil.

        //creacion del pane del jugador
        HBox hBoxJugador = new HBox(20, lbJugador, txtJugador);
        hBoxJugador.setPadding(new Insets(10));

        //creacion del pane de puntos
        HBox hBoxPuntos = new HBox(20, lbPuntos, txtPuntos);
        hBoxPuntos.setPadding(new Insets(10));

        //creacion del pane del boton
        HBox hBoxBoton = new HBox(20, miBoton);
        hBoxBoton.setPadding(new Insets(10));
        hBoxBoton.setAlignment(Pos.BOTTOM_RIGHT);

        //CREACION DEL VBOX QUE INCLUYE LOS 4 HBOX
        VBox miVBox = new VBox(10, hBoxEquipo, hBoxJugador, hBoxPuntos, hBoxBoton);

        Scene miScene = new Scene(miVBox, 300, 250);

        primaryStage.setTitle("Datos del Jugador");
        primaryStage.setScene(miScene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void accionClick() {
        String mensaje = "";
        if (txtEquipo.getText().length() == 0) {
            mensaje += "\nEl nombre del equipo es requerido.";
        }
        if (txtJugador.getText().length() == 0) {
            mensaje += "\nEl nombre del jugador es requerido.";
        }
        //si hay entrada de datos tanto de jugador como de equipo, mensaje valdrá "" osea longitud 0 y eso demuestra que
        //los datos se entraron. Mostramos mensaje de resumen de datos del jugador
        if (mensaje.length() == 0) {

            //comprobar entero
            //si no es entero desde el método se llama a la ventana con el mensaje de error del parámetro
            if (comprobarEntero(txtPuntos, "Debes introducir un valor numérico entero")) {
                mensaje = "El jugador " + txtJugador.getText() + " del equipo " + txtEquipo.getText() + " anota " + txtPuntos.getText() + " puntos";
                VentanaEmergente.mostrar(mensaje, "Datos del Jugador");
            }else {
                //
                txtPuntos.requestFocus();
            }
        } else {
            VentanaEmergente.mostrar(mensaje, "¡Faltan datos!");
        }
    }

    private boolean comprobarEntero(TextField fieldPuntos, String mensaje) {
        // si llega un entero devuelve true, si no es entero se captura la excepción
        try {
            Integer.parseInt(fieldPuntos.getText());
            return true;
        } catch (NumberFormatException e) {
            VentanaEmergente.mostrar(mensaje, "Error en los datos");
            return false;
        }
    }

}
