package GS222MH_assign2.EX8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Yahtzee extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Variables for add them to arrayList.
        AtomicInteger rn1 = new AtomicInteger();
        AtomicInteger rn2 = new AtomicInteger();
        AtomicInteger rn3 = new AtomicInteger();
        AtomicInteger rn4 = new AtomicInteger();
        AtomicInteger rn5 = new AtomicInteger();
        AtomicInteger x = new AtomicInteger();

        //Create an arrayList. Put All dices on the arrayList (When we roll the last time)
        ArrayList<Integer> dice = new ArrayList<Integer>();

        //Widows with size 650X650
        Group root = new Group();
        Scene scene = new Scene(root, 650, 650);
        primaryStage.setTitle("Yahtzee");
        primaryStage.setScene(scene);
        primaryStage.show();

        //Write "Yahtzee" in the corner of the window.
        final Text theText = new Text(10, 40, "Yahtzee");
        theText.setStyle("-fx-font: 45 arial;");
        theText.setX(30);
        theText.setY(60);

        //We have just 5 dices. I put the path of the six.
        Image image6 = new Image("file:/home/ghayth/Downloads/sex.png");

        //Get the first dice
        Image image1 = new Image("file:/home/ghayth/Downloads/one.png");
        ImageView one = new ImageView();

        //Get the first CheckBox
        CheckBox check1 = new CheckBox();
        check1.setLayoutX(115);
        check1.setLayoutY(300);

        //Get the second dice
        Image image2 = new Image("file:/home/ghayth/Downloads/two.png");
        ImageView two = new ImageView();

        //Get the second CheckBox
        CheckBox check2 = new CheckBox();
        check2.setLayoutX(315);
        check2.setLayoutY(300);

        //Get the third dice
        Image image3 = new Image("file:/home/ghayth/Downloads/three.png");
        ImageView three = new ImageView();

        //Get the third CheckBox
        CheckBox check3 = new CheckBox();
        check3.setLayoutX(515);
        check3.setLayoutY(300);

        //Get the fourth dice
        Image image4 = new Image("file:/home/ghayth/Downloads/four.png");
        ImageView four = new ImageView();

        //Get the fourth CheckBox
        CheckBox check4 = new CheckBox();
        check4.setLayoutX(226);
        check4.setLayoutY(520);

        //Get the fifth dice
        Image image5 = new Image("file:/home/ghayth/Downloads/five.png");
        ImageView five = new ImageView();

        //Get the fifth CheckBox
        CheckBox check5 = new CheckBox();
        check5.setLayoutX(428);
        check5.setLayoutY(520);

        //GridPane to the button and Label
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(158, 12.5, 158, 14.4));

        //Button with pos
        Button Roll = new Button();
        Roll.setText("Start");
        pane.add(Roll, 0, 0);
        Roll.setLayoutX(0);
        Roll.setLayoutY(570);

        //Msg with pos
        final Label msg = new Label();
        pane.add(msg, 0, 0);
        msg.setLayoutX(0);
        msg.setLayoutY(600);
        msg.setText("You have 3 roll left");

        //When we click in the button
        Roll.setOnAction(e -> {

            //Here x == 2
            if (Roll.hasProperties()) {
                msg.setText("You have 1 roll left");
                //plus one
                x.getAndIncrement();
            }
            if (Roll.hasProperties() && x.get() == 1) {
                msg.setText("You have 2 roll left");
            }

            //Set the name of the button
            if (x.get() == 1) {
                Roll.setText("Roll the dice!");
            }
            if (x.get() == 2) {
                Roll.setText("Roll the dice!");
            }
            if (x.get() == 3) {
                Roll.setText("Get the result");
            }

            /*
            Create a random from 1 to 6.
            If the checkBox is not select. If the random is one get the first image
            If the random is two get the second image. ... and so on.
            I repeat this Code 5 times (We have 5 images)
             */
            Random diceRnd = new Random();

            //>>>>>>>>>>>>>>>>>>>>>>>>>>>>> image 1 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            int rndDice1 = diceRnd.nextInt(6) + 1;
            if (!check1.isSelected() && x.get() < 4) {
                if (rndDice1 == 1) {
                    one.setImage(image1);
                    one.setX(50);
                    one.setY(130);
                    one.setFitHeight(150);
                    one.setFitWidth(150);
                } else if (rndDice1 == 2) {
                    one.setImage(image2);
                    one.setX(50);
                    one.setY(130);
                    one.setFitHeight(150);
                    one.setFitWidth(150);
                } else if (rndDice1 == 3) {
                    one.setImage(image3);
                    one.setX(50);
                    one.setY(130);
                    one.setFitHeight(150);
                    one.setFitWidth(150);
                } else if (rndDice1 == 4) {
                    one.setImage(image4);
                    one.setX(50);
                    one.setY(130);
                    one.setFitHeight(150);
                    one.setFitWidth(150);
                } else if (rndDice1 == 5) {
                    one.setImage(image5);
                    one.setX(50);
                    one.setY(130);
                    one.setFitHeight(150);
                    one.setFitWidth(150);
                } else if (rndDice1 == 6) {
                    one.setImage(image6);
                    one.setX(50);
                    one.setY(130);
                    one.setFitHeight(150);
                    one.setFitWidth(150);
                }
                rn1.set(rndDice1);
            } else if (x.get() == 4) {

                //Add the random to the arrayList
                dice.add(rn1.get());
            }

            //>>>>>>>>>>>>>>>>>>>>>>>>>>>>> image 2 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            int rndDice2 = diceRnd.nextInt(6) + 1;
            if (!check2.isSelected() && x.get() < 4) {
                if (rndDice2 == 1) {
                    two.setImage(image1);
                    two.setX(250);
                    two.setY(130);
                    two.setFitHeight(150);
                    two.setFitWidth(150);
                } else if (rndDice2 == 2) {
                    two.setImage(image2);
                    two.setX(250);
                    two.setY(130);
                    two.setFitHeight(150);
                    two.setFitWidth(150);
                } else if (rndDice2 == 3) {
                    two.setImage(image3);
                    two.setX(250);
                    two.setY(130);
                    two.setFitHeight(150);
                    two.setFitWidth(150);
                } else if (rndDice2 == 4) {
                    two.setImage(image4);
                    two.setX(250);
                    two.setY(130);
                    two.setFitHeight(150);
                    two.setFitWidth(150);
                } else if (rndDice2 == 5) {
                    two.setImage(image5);
                    two.setX(250);
                    two.setY(130);
                    two.setFitHeight(150);
                    two.setFitWidth(150);
                } else if (rndDice2 == 6) {
                    two.setImage(image6);
                    two.setX(250);
                    two.setY(130);
                    two.setFitHeight(150);
                    two.setFitWidth(150);
                }
                rn2.set(rndDice2);
            } else if (x.get() == 4) {

                //Add the random to the arrayList
                dice.add(rn2.get());
            }

            //>>>>>>>>>>>>>>>>>>>>>>>>>>>>> image 3 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            int rndDice3 = diceRnd.nextInt(6) + 1;
            if (!check3.isSelected() && x.get() < 4) {
                if (rndDice3 == 1) {
                    three.setImage(image1);
                    three.setX(450);
                    three.setY(130);
                    three.setFitHeight(150);
                    three.setFitWidth(150);
                } else if (rndDice3 == 2) {
                    three.setImage(image2);
                    three.setX(450);
                    three.setY(130);
                    three.setFitHeight(150);
                    three.setFitWidth(150);
                } else if (rndDice3 == 3) {
                    three.setImage(image3);
                    three.setX(450);
                    three.setY(130);
                    three.setFitHeight(150);
                    three.setFitWidth(150);
                } else if (rndDice3 == 4) {
                    three.setImage(image4);
                    three.setX(450);
                    three.setY(130);
                    three.setFitHeight(150);
                    three.setFitWidth(150);
                } else if (rndDice3 == 5) {
                    three.setImage(image5);
                    three.setX(450);
                    three.setY(130);
                    three.setFitHeight(150);
                    three.setFitWidth(150);
                } else if (rndDice3 == 6) {
                    three.setImage(image6);
                    three.setX(450);
                    three.setY(130);
                    three.setFitHeight(150);
                    three.setFitWidth(150);
                }
                rn3.set(rndDice3);
            } else if (x.get() == 4) {

                //Add the random to the arrayList
                dice.add(rn3.get());
            }

            //>>>>>>>>>>>>>>>>>>>>>>>>>>>>> image 4 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            int rndDice4 = diceRnd.nextInt(6) + 1;
            if (!check4.isSelected() && x.get() < 4) {
                if (rndDice4 == 1) {
                    four.setImage(image1);
                    four.setX(160);
                    four.setY(350);
                    four.setFitHeight(150);
                    four.setFitWidth(150);
                } else if (rndDice4 == 2) {
                    four.setImage(image2);
                    four.setX(160);
                    four.setY(350);
                    four.setFitHeight(150);
                    four.setFitWidth(150);
                } else if (rndDice4 == 3) {
                    four.setImage(image3);
                    four.setX(160);
                    four.setY(350);
                    four.setFitHeight(150);
                    four.setFitWidth(150);
                } else if (rndDice4 == 4) {
                    four.setImage(image4);
                    four.setX(160);
                    four.setY(350);
                    four.setFitHeight(150);
                    four.setFitWidth(150);
                } else if (rndDice4 == 5) {
                    four.setImage(image5);
                    four.setX(160);
                    four.setY(350);
                    four.setFitHeight(150);
                    four.setFitWidth(150);
                } else if (rndDice4 == 6) {
                    four.setImage(image6);
                    four.setX(160);
                    four.setY(350);
                    four.setFitHeight(150);
                    four.setFitWidth(150);
                }
                rn4.set(rndDice4);
            } else if (x.get() == 4) {

                //Add the random to the arrayList
                dice.add(rn4.get());
            }

            //>>>>>>>>>>>>>>>>>>>>>>>>>>>>> image 5 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            int rndDice5 = diceRnd.nextInt(6) + 1;
            if (!check5.isSelected() && x.get() < 4) {
                if (rndDice5 == 1) {
                    five.setImage(image1);
                    five.setX(360);
                    five.setY(350);
                    five.setFitHeight(150);
                    five.setFitWidth(150);
                } else if (rndDice5 == 2) {
                    five.setImage(image2);
                    five.setX(360);
                    five.setY(350);
                    five.setFitHeight(150);
                    five.setFitWidth(150);
                } else if (rndDice5 == 3) {
                    five.setImage(image3);
                    five.setX(360);
                    five.setY(350);
                    five.setFitHeight(150);
                    five.setFitWidth(150);
                } else if (rndDice5 == 4) {
                    five.setImage(image4);
                    five.setX(360);
                    five.setY(350);
                    five.setFitHeight(150);
                    five.setFitWidth(150);
                } else if (rndDice5 == 5) {
                    five.setImage(image5);
                    five.setX(360);
                    five.setY(350);
                    five.setFitHeight(150);
                    five.setFitWidth(150);
                } else if (rndDice5 == 6) {
                    five.setImage(image6);
                    five.setX(360);
                    five.setY(350);
                    five.setFitHeight(150);
                    five.setFitWidth(150);
                }
                rn5.set(rndDice5);
            } else if (x.get() == 4) {

                //Add the random to the arrayList
                dice.add(rn5.get());
            }

            if (x.get() == 3) {
                msg.setText("You have 0 roll left");
            }

            //The button will canceled if x == 4 (3 rolls and 1 result)
            if (x.get() == 4) {
                Roll.setDisable(true);
            }

            //>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ArrayList sort && The rules of the game <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            Collections.sort(dice);

            if (x.get() == 4) {
                //Yahtzee
                if (dice.stream().allMatch(dice.get(0)::equals)) {
                    msg.setText("Yahtzee");
                }

                //Large Straight
                else if (dice.get(0).equals(1) && dice.get(1).equals(2) &&
                        dice.get(2).equals(3) && dice.get(3).equals(4) && dice.get(4).equals(5) ||
                        dice.get(0).equals(2) && dice.get(1).equals(3) &&
                                dice.get(2).equals(4) && dice.get(3).equals(5) && dice.get(4).equals(6)) {
                    msg.setText("Large Straight");
                }

                //Small Straight
                else if (dice.get(0).equals(1) && dice.get(1).equals(2) &&
                        dice.get(2).equals(3) && dice.get(3).equals(4) ||
                        dice.get(0).equals(2) && dice.get(1).equals(3) &&
                                dice.get(2).equals(4) && dice.get(3).equals(5) ||
                        dice.get(0).equals(3) && dice.get(1).equals(4) &&
                                dice.get(2).equals(5) && dice.get(3).equals(6)
                ) {
                    msg.setText("Small Straight");
                }

                //Full house
                else if (dice.get(0).equals(dice.get(1)) && dice.get(2).equals(dice.get(3)) &&
                        dice.get(3).equals(dice.get(4)) || dice.get(0).equals(dice.get(1)) && dice.get(1).equals(dice.get(2)) &&
                        dice.get(3).equals(dice.get(4))) {
                    msg.setText("Full house");
                }

                //Four of kind
                else if (dice.get(0).equals(dice.get(1)) && dice.get(1).equals(dice.get(2)) && dice.get(2).equals(dice.get(3)) ||
                        dice.get(1).equals(dice.get(2)) && dice.get(2).equals(dice.get(3)) && dice.get(4).equals(dice.get(4))) {
                    msg.setText("Four of kind");
                }

                //Three of kind
                else if (dice.get(0).equals(dice.get(1)) && dice.get(1).equals(dice.get(2)) ||
                        dice.get(1).equals(dice.get(2)) && dice.get(2).equals(dice.get(3)) ||
                        dice.get(2).equals(dice.get(3)) && dice.get(3).equals(dice.get(4))) {
                    msg.setText("Three of kind");
                }

                //Pair
                else if (dice.get(0).equals(dice.get(1)) ||
                        dice.get(1).equals(dice.get(2)) ||
                        dice.get(2).equals(dice.get(3)) ||
                        dice.get(3).equals(dice.get(4))) {
                    msg.setText("Pair");
                }
            }
        });
        root.getChildren().addAll(theText, one, two, three, four, five, check1, check2, check3, check4, check5, Roll, msg);
    }
}