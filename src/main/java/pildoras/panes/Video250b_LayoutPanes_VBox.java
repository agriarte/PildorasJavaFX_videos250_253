/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.panes;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Video250b_LayoutPanes_VBox extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Ejemplo de creación de botones
        Button boton1 = new Button("Boton 1");
        Button boton2 = new Button("Boton 2");
        Button boton3 = new Button("Boton 3");
        Button boton4 = new Button("Boton 4");
        Button boton5 = new Button("Boton 5");
        Button boton6 = new Button("Boton 6");
        Button boton7 = new Button("Boton 7");
        Button boton8 = new Button("Boton 8");
        Button boton9 = new Button("Boton 9");

        // VBox
        VBox miVBox2 = new VBox();
        miVBox2.setAlignment(Pos.BOTTOM_CENTER);
        miVBox2.setStyle("-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black");
        miVBox2.getChildren().setAll(boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9);

        // ScrollPane para limitar la altura
        ScrollPane scrollPane = new ScrollPane(miVBox2);
        //altura máxima del VBox.
        //***IMPORTANTE***
        //solo afecta al tamaño cuando el VBox está dentro de otro contenedor (scrollPane, HBox, etc)
        scrollPane.setMaxHeight(500);

        // Crear escena y mostrarla en el stage
        Scene miScene = new Scene(scrollPane, 700, 500);
        primaryStage.setTitle("Ejemplo de HBox con Altura Limitada");
        primaryStage.setScene(miScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
