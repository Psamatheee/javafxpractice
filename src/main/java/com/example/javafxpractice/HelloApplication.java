package com.example.javafxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;

import java.io.IOException;

import static javafx.scene.control.ContentDisplay.CENTER;
import static javafx.scene.paint.Color.GREEN;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button btn1 = new Button("Hello World");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("hello world");
            }
        });

       /* Line line = new Line();
        line.setStartX(0);
        line.setStartY(0);
        line.setEndX(100);
        line.setEndY(100);
        Line line2 = new Line(10,10,30,400);
        line2.setStroke(Color.GOLD);
        btn1.setLayoutX(200);
        btn1.setLayoutY(200);
        Rectangle rect = new Rectangle(300,300,100,100);
        rect.setArcHeight(35);
        rect.setArcWidth(35);
        Circle circ = new Circle(500,100,25,Color.rgb(20,45,167));
        Group root = new Group();
        root.getChildren().add(btn1);        line.setEndX(100);
        root.getChildren().addAll(line, line2, rect, circ);*/

        Text welcome_text = new Text();
        welcome_text.setText("Welcome to ASCII Art Generator!");
        welcome_text.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 20));
        welcome_text.setTextAlignment(TextAlignment.CENTER);
        int width = (int) Screen.getPrimary().getBounds().getWidth();
        int height = (int) Screen.getPrimary().getBounds().getHeight();
        GridPane root = new GridPane();
        root.addRow(0,welcome_text);
        Scene scene = new Scene(root, width, height, Color.CYAN);
        stage.setScene(scene);
        stage.setTitle("Practice JavaFX application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}