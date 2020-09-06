package GS222MH_assign3.EX8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;

import javafx.scene.layout.VBox;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.knowm.xchart.style.markers.Square;

import java.awt.*;


public class TinyPainter extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);

        VBox layout = new VBox();
        layout.centerShapeProperty();
        layout.setPadding(new Insets(5, 5, 5, 5));

        //List of shape
        ComboBox<String> shape = new ComboBox<>();
        shape.getItems().addAll(
                "Line",
                "Dot",
                "Rectangle",
                "Circle"
        );

        //List of size
        ComboBox<String> size = new ComboBox<>();
        size.setLayoutX(125);
        size.getItems().addAll("1", "5", "10", "15", "20", "25", "30", "40");

        //List of all colors
        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setLayoutX(200);


        //Start when shape in on action
        shape.setOnAction((ActionEvent v) -> {

            //When the mouse is pressed we look if the chosen is circle or another shape
            scene.setOnMousePressed(r -> {
                Circle circle = new Circle();
                if (shape.getValue().equals("Circle")) {

                    //If it is a circle we select the click x and y (the center of the circle)
                    circle.setCenterX(r.getX());
                    circle.setCenterY(r.getY());
                    scene.setOnMouseDragged(event -> {
                        circle.setRadius(Math.sqrt(Math.pow(r.getX() - event.getX(), 2) + Math.pow(r.getY() - event.getY(), 2)));
                    });

                    //Set the color
                    circle.setStroke(colorPicker.getValue());
                    circle.setFill(colorPicker.getValue());
                    root.getChildren().addAll(circle);
                } else if (shape.getValue().equals("Rectangle")) {

                    //https://coderanch.com/t/689100/java/rectangle-dragging-image
                    //I get help from this source above (just for Rectangle). Before I use it I understand it
                    Rectangle rectangle = new Rectangle();
                    final Point anchor = new Point();
                    anchor.x = (int) r.getX();
                    anchor.y = (int) r.getY();
                    rectangle.setX(r.getX());
                    rectangle.setY(r.getY());
                    scene.setOnMouseDragged(event -> {
                        //Math.abs is to draw the rectangle in any direction.
                        rectangle.setWidth(Math.abs(event.getX() - anchor.getX()));
                        rectangle.setHeight(Math.abs(event.getY() - anchor.getY()));
                        rectangle.setX(Math.min(anchor.getX(), event.getX()));
                        rectangle.setY(Math.min(anchor.getY(), event.getY()));
                    });
                    rectangle.setStroke(colorPicker.getValue());
                    rectangle.setFill(colorPicker.getValue());
                    root.getChildren().addAll(rectangle);


                    //same as dot (line of dot)
                } else if (shape.getValue().equals("Line")) {
                    Line line = new Line();
                    int width = Integer.parseInt(size.getValue());
                    line.setStartX(r.getX());
                    line.setStartY(r.getY());

                    scene.setOnMouseDragged(event -> {
                        line.setEndX(event.getX());
                        line.setEndY(event.getY());
                        line.setStrokeWidth(width);
                    });
                    line.setStroke(colorPicker.getValue());
                    line.setFill(colorPicker.getValue());
                    root.getChildren().addAll(line);

                    //Same as rectangle with width = Height
                    //Dot does not work really good. It get an effect from the last shape has been drawn.
                } else if (shape.getValue().equals("Dot")) {
                    int width = Integer.parseInt(size.getValue());
                    Rectangle dot = new Rectangle(width, width, width, width);
                    dot.setX(r.getX());
                    dot.setY(r.getY());
                    dot.setStroke(colorPicker.getValue());
                    dot.setFill(colorPicker.getValue());
                    root.getChildren().addAll(dot);
                }
            });
        });

        root.getChildren().addAll(layout, shape, size, colorPicker);
        primaryStage.setTitle("Tiny Painter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
