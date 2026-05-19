package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Se crea un botón con el texto "Boton"
        Button boton = new Button("Boton");

        // Se asigna una acción al botón cuando es presionado (evento de clic)
        boton.setOnAction(e -> {
            // Cuando se pulsa el botón, se imprime este mensaje en la consola
            System.out.println("Boton pulsado");
        });

        // Se crea una escena que contiene el botón como único elemento, de 100x100 píxeles
        Scene scene = new Scene(boton, 100, 100);
        // Se asigna el título de la ventana principal
        stage.setTitle("Manejo de Eventos JavaFX");
        // Se asigna la escena a la ventana
        stage.setScene(scene);
        // Se hace visible la ventana
        stage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}