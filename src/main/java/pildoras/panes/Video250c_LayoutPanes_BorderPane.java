/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.panes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 *  VIDEO 250, minuto 16 BorderPane
 */
public class Video250c_LayoutPanes_BorderPane extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Crear botones
        Button boton1 = new Button("Boton 1");
        Button boton2 = new Button("Boton 2");
        Button boton3 = new Button("Boton 3");
        Button boton4 = new Button("Boton 4");
        Button boton5 = new Button("Boton 5");

        // Constructor de BorderPane que pide center, top, right, bottom, left
        BorderPane miBorderPane = new BorderPane(boton1, boton2, boton3, boton4, boton5);
        miBorderPane.setId("miBorderPane"); // Establecer un ID para el BorderPane

        // Cambiar alineado a center
        BorderPane.setAlignment(boton1, Pos.CENTER);
        BorderPane.setAlignment(boton2, Pos.CENTER);
        BorderPane.setAlignment(boton3, Pos.CENTER);
        BorderPane.setAlignment(boton4, Pos.CENTER);
        BorderPane.setAlignment(boton5, Pos.CENTER);
        
        
         // Cambiar colores de fondo
        miBorderPane.setStyle("-fx-background-color: lightblue;"); // Fondo del BorderPane
        //puedo cambiar el color de fondo de los botones
        //no he podido cambiar color de fondo de las áreas del borderpane
        boton1.setStyle("-fx-background-color: lightgreen;"); // Fondo del boton
        boton2.setStyle("-fx-background-color: lightcoral;"); // Fondo del boton
        boton3.setStyle("-fx-background-color: lightyellow;"); // Fondo del boton
        boton4.setStyle("-fx-background-color: lightpink;"); // Fondo del boton
        boton5.setStyle("-fx-background-color: lightgrey;"); // Fondo del boton


        Scene scene = new Scene(miBorderPane, 600, 450);
        
        
        

      
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
