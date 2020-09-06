package GS222MH_assign2.EX6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class SnowMan extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        //Create the sky as Rectangle which has the same x as scene
        Rectangle Sky = new Rectangle(640, 370);
        Sky.setStroke(Color.DEEPSKYBLUE);
        Sky.setFill(Color.DEEPSKYBLUE);


        //SUN
        Circle Sun = new Circle(550, 80, 50);
        Sun.setStrokeWidth(1.0);
        Sun.setStroke(Color.YELLOW);
        Sun.setFill(Color.YELLOW);


        //The head of SnowMan
        Circle head = new Circle(320, 245, 18);
        head.setStrokeWidth(1.0);
        head.setStroke(Color.WHITE);
        head.setFill(Color.WHITE);

        //The body
        Circle body = new Circle(320, 280, 25);
        body.setStrokeWidth(1.0);
        body.setStroke(Color.WHITE);
        body.setFill(Color.WHITE);

        //The body
        Circle bodyBig = new Circle(320, 335, 40);
        bodyBig.setStrokeWidth(1.0);
        bodyBig.setStroke(Color.WHITE);
        bodyBig.setFill(Color.WHITE);


        //The right eye
        Circle eyeRight = new Circle(310, 240, 3);
        eyeRight.setStroke(Color.BLACK);
        eyeRight.setFill(Color.BLACK);

        //The left eye
        Circle eyeLift = new Circle(328, 240, 3);
        eyeLift.setStroke(Color.BLACK);
        eyeLift.setFill(Color.BLACK);

        Circle butten1 = new Circle(319, 267, 2.4);
        butten1.setStrokeWidth(1.0);
        butten1.setStroke(Color.BLACK);
        butten1.setFill(Color.BLACK);

        Circle butten2 = new Circle(319, 282, 2.4);
        butten2.setStrokeWidth(1.0);
        butten2.setStroke(Color.BLACK);
        butten2.setFill(Color.BLACK);

        Circle butten3 = new Circle(319, 297, 2.4);
        butten3.setStrokeWidth(1.0);
        butten3.setStroke(Color.BLACK);
        butten3.setFill(Color.BLACK);

        //Line for mouth which start from x to x1 and y to y1
        Line mouth = new Line(328, 250, 310, 250);
        mouth.setStrokeWidth(1.5);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.BLACK);


        //Show all that the sun should be after the sky and so on.
        root.getChildren().addAll(Sky, Sun, head, body, bodyBig, eyeLift, eyeRight, butten1, butten2, butten3, mouth);

        Scene scene = new Scene(root, 640, 480);
        primaryStage.setTitle("TEST");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
