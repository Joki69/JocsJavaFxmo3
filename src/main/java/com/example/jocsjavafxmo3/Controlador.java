package com.example.jocsjavafxmo3;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controlador {
  @FXML
  private Rectangle cabeza;
  @FXML
  private Rectangle cuerpo1;
  @FXML
  private Rectangle cuerpo2;
  private List<Rectangle> snake = new ArrayList<>();

  public void start(){
      snake.add(cabeza);
      snake.add(cuerpo1);
      snake.add(cuerpo2);

  }


}