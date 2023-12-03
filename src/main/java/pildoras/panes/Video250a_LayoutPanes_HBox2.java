/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.panes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Video250a_LayoutPanes_HBox2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear botones
        Button boton1 = new Button("Boton 1");
        Button boton2 = new Button("Boton 2");
        Button boton3 = new Button("Boton 3");
        Button boton4 = new Button("Boton 4");
        Button boton5 = new Button("Boton 5");
        Button boton6 = new Button("Boton 6");
        Button boton7 = new Button("Boton 7");
        Button boton8 = new Button("Boton 8");
        Button boton9 = new Button("Boton 9");

        // Establecer tamaños preferidos para los botones
        boton1.setPrefSize(250, 80);
        boton2.setPrefSize(150, 50);

        // HBox
        HBox miHBox = new HBox(boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9);
        miHBox.setAlignment(Pos.CENTER);
        miHBox.setBackground(new Background(new BackgroundFill(Color.CORAL, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        //El tamaño solo se ve afectado cuando está dentro de otro contenedor
        miHBox.setMaxHeight(400);
        miHBox.setMinHeight(100);
        
        VBox miVBox = new VBox(miHBox);
        
        miVBox.setAlignment(Pos.CENTER);

        // Crear escena y mostrarla en el stage
        Scene miScene = new Scene(miVBox, 700, 500);
        primaryStage.setTitle("Ejemplo de HBox con Altura Limitada");
        primaryStage.setScene(miScene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
