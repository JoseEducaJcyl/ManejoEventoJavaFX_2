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
        Button boton = new Button("Boton");
        boton.setOnAction(e -> {
            System.out.println("Boton pulsado");
        });

        Scene scene = new Scene(boton, 100,100);
        stage.setTitle("Manejo de Eventos JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
