package GS222MH_assign2.EX7;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CompoundInterest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Make the window and set the title
        Group root = new Group();
        Scene scene = new Scene(root, 350, 180);
        primaryStage.setTitle("Compound Interest");
        primaryStage.setScene(scene);
        primaryStage.show();

        //Write a text and set the size of the text and in which pos.
        final Text theText = new Text(10, 40, "Compound Interest");
        theText.setStyle("-fx-font: 25 arial;");
        theText.setX(50);
        theText.setY(30);

        //Create GridPane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(50, 12.5, 50, 14.4));

        //Create three boxes for each input
        pane.add(new Label("Start amount: "), 0, 0);
        final TextField startAmount = new TextField();
        pane.add(startAmount, 1, 0);

        pane.add(new Label("Interest: "), 0, 2);
        final TextField interest = new TextField();
        pane.add(interest, 1, 2);

        pane.add(new Label("Number of year: "), 0, 3);
        final TextField numOfYear = new TextField();
        pane.add(numOfYear, 1, 3);

        //Button to calculate all
        Button calculate = new Button("Calculate");
        pane.add(calculate, 0, 4);

        //I make another GridPane, cuz the msg is so long.
        //If I click the button the Label move to the right.
        GridPane pane1 = new GridPane();
        pane1.setAlignment(Pos.CENTER);
        pane1.setPadding(new Insets(158, 12.5, 158, 14.4));

        final Label msg = new Label();
        pane1.add(msg, 0, 0);

        //Get the msg when we click on the button
        calculate.setOnAction(actionEvent -> {

            //Calculate the Compound Interest according to Wiki
            double amount = Double.parseDouble(startAmount.getText());
            double inter = Double.parseDouble(interest.getText());
            int year = Integer.parseInt(numOfYear.getText());
            double interPro = inter / 100;
            int calculated = (int) Math.round((amount * Math.pow(interPro + 1, year)));
            msg.setText("In total that will be " + calculated);

        });

        //Show all things.
        root.getChildren().addAll(pane, pane1, theText);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
