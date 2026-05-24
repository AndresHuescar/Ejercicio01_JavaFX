package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Creo un botón con el texto que pide el ejercicio
        Button boton = new Button("Haz clic aquí");

        // StackPane es un layout que coloca el botón centrado en la ventana
        StackPane root = new StackPane();
        root.getChildren().add(boton);

        // Creo la escena con el contenido y el tamaño de la ventana
        Scene scene = new Scene(root, 400, 250);

        // Configuro el título de la ventana principal
        stage.setTitle("Ejercicio 1 - JavaFX");

        // Añado la escena al Stage
        stage.setScene(scene);

        // Muestro la ventana
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}