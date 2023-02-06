package com.example.jocsjavafxmo3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Main  {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        VBox root = new VBox();
        Canvas c = new Canvas(controlador.width * controlador.cornersize, controlador.height * controlador.cornersize);
        GraphicsContext gc = c.getGraphicsContext2D();
        root.getChildren().add(c);
        Stage primaryStage = new Stage();
        Scene scene = new Scene(root, controlador.width * controlador.cornersize, controlador.height * controlador.cornersize);
        primaryStage.setScene(scene);
        primaryStage.setTitle("SNAKE GAME");
        primaryStage.show();




    }
}