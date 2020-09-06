package GS222MH_assign3.EX9;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Santa extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group layout = new Group();
        Scene scene = new Scene(layout, 1800, 893);

        //BackGround
        ImageView background = new ImageView();
        Image groundBack = new Image("file:/home/ghayth/Downloads/photo/BG.png");
        background.setImage(groundBack);

        //ground
        ImageView ground = new ImageView();
        Image round = new Image("file:/home/ghayth/Downloads/photo/g1.png");
        ground.setImage(round);
        ground.setX(0);
        ground.setY(720);
        ImageView ground1 = new ImageView();
        Image round1 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground1.setImage(round1);
        ground1.setX(125);
        ground1.setY(720);
        ImageView ground2 = new ImageView();
        Image round2 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground2.setImage(round2);
        ground2.setX(250);
        ground2.setY(720);
        ImageView ground3 = new ImageView();
        Image round3 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground3.setImage(round3);
        ground3.setX(375);
        ground3.setY(720);
        ImageView ground4 = new ImageView();
        Image round4 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground4.setImage(round4);
        ground4.setX(500);
        ground4.setY(720);
        ImageView ground5 = new ImageView();
        Image round5 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground5.setImage(round5);
        ground5.setX(625);
        ground5.setY(720);
        ImageView ground6 = new ImageView();
        Image round6 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground6.setImage(round6);
        ground6.setX(750);
        ground6.setY(720);
        ImageView ground7 = new ImageView();
        Image round7 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground7.setImage(round7);
        ground7.setX(875);
        ground7.setY(720);
        ImageView ground8 = new ImageView();
        Image round8 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground8.setImage(round8);
        ground8.setX(1000);
        ground8.setY(720);
        ImageView ground9 = new ImageView();
        Image round9 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground9.setImage(round9);
        ground9.setX(1125);
        ground9.setY(720);
        ImageView ground10 = new ImageView();
        Image round10 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground10.setImage(round10);
        ground10.setX(1250);
        ground10.setY(720);
        ImageView ground11 = new ImageView();
        Image round11 = new Image("file:/home/ghayth/Downloads/photo/g2.png");
        ground11.setImage(round11);
        ground11.setX(1375);
        ground11.setY(720);
        ImageView ground12 = new ImageView();
        Image round12 = new Image("file:/home/ghayth/Downloads/photo/g3.png");
        ground12.setImage(round12);
        ground12.setX(1475);
        ground12.setY(720);

        //Tree
        ImageView tree = new ImageView();
        Image tree1 = new Image("file:/home/ghayth/Downloads/photo/Tree.png");
        tree.setImage(tree1);
        tree.setX(1400);
        tree.setY(443);

        //Snowman
        ImageView snow = new ImageView();
        Image snowMan = new Image("file:/home/ghayth/Downloads/photo/SnowMan.png");
        snow.setImage(snowMan);
        snow.setX(20);
        snow.setY(515);

        //Santa
        ImageView santa = new ImageView();
        Image santaMan = new Image("file:/home/ghayth/Downloads/photo/1.png");
        santa.setImage(santaMan);
        santa.setFitWidth(250);
        santa.setFitHeight(200);
        santa.setX(140);
        santa.setY(545);

        //Move steps
        ImageView walk1 = new ImageView();
        Image walkk1 = new Image("file:/home/ghayth/Downloads/photo/2.png");
        walk1.setImage(walkk1);
        walk1.setFitWidth(250);
        walk1.setFitHeight(200);
        walk1.setX(140);
        walk1.setY(545);

        ImageView walk2 = new ImageView();
        Image walkk2 = new Image("file:/home/ghayth/Downloads/photo/3.png");
        walk2.setImage(walkk2);
        walk2.setFitWidth(250);
        walk2.setFitHeight(200);
        walk2.setX(140);
        walk2.setY(545);

        ImageView walk3 = new ImageView();
        Image walkk3 = new Image("file:/home/ghayth/Downloads/photo/4.png");
        walk3.setImage(walkk3);
        walk3.setFitWidth(250);
        walk3.setFitHeight(200);
        walk3.setX(140);
        walk3.setY(545);

        ImageView walk4 = new ImageView();
        Image walkk4 = new Image("file:/home/ghayth/Downloads/photo/5.png");
        walk4.setImage(walkk4);
        walk4.setFitWidth(250);
        walk4.setFitHeight(200);
        walk4.setX(140);
        walk4.setY(545);

        ImageView walk5 = new ImageView();
        Image walkk5 = new Image("file:/home/ghayth/Downloads/photo/6.png");
        walk5.setImage(walkk5);
        walk5.setFitWidth(250);
        walk5.setFitHeight(200);
        walk5.setX(140);
        walk5.setY(545);

        ImageView walk6 = new ImageView();
        Image walkk6 = new Image("file:/home/ghayth/Downloads/photo/7.png");
        walk6.setImage(walkk6);
        walk6.setFitWidth(250);
        walk6.setFitHeight(200);
        walk6.setX(140);
        walk6.setY(545);

        ImageView walk7 = new ImageView();
        Image walkk7 = new Image("file:/home/ghayth/Downloads/photo/8.png");
        walk7.setImage(walkk7);
        walk7.setFitWidth(250);
        walk7.setFitHeight(200);
        walk7.setX(140);
        walk7.setY(545);

        ImageView walk8 = new ImageView();
        Image walkk8 = new Image("file:/home/ghayth/Downloads/photo/9.png");
        walk8.setImage(walkk8);
        walk8.setFitWidth(250);
        walk8.setFitHeight(200);
        walk8.setX(140);
        walk8.setY(545);

        ImageView walk9 = new ImageView();
        Image walkk9 = new Image("file:/home/ghayth/Downloads/photo/10.png");
        walk9.setImage(walkk9);
        walk9.setFitWidth(250);
        walk9.setFitHeight(200);
        walk9.setX(140);
        walk9.setY(545);

        ImageView walk10 = new ImageView();
        Image walkk10 = new Image("file:/home/ghayth/Downloads/photo/11.png");
        walk10.setImage(walkk10);
        walk10.setFitWidth(250);
        walk10.setFitHeight(200);
        walk10.setX(140);
        walk10.setY(545);

        ImageView walk11 = new ImageView();
        Image walkk11 = new Image("file:/home/ghayth/Downloads/photo/12.png");
        walk11.setImage(walkk11);
        walk11.setFitWidth(250);
        walk11.setFitHeight(200);
        walk11.setX(140);
        walk11.setY(545);

        ImageView walk12 = new ImageView();
        Image walkk12 = new Image("file:/home/ghayth/Downloads/photo/13.png");
        walk12.setImage(walkk12);
        walk12.setFitWidth(250);
        walk12.setFitHeight(200);
        walk12.setX(140);
        walk12.setY(545);

        //Set timeLine to move the santa
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.0), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, santa);
                    }
                }),
                new KeyFrame(Duration.seconds(0.25), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk1);
                    }
                }),
                new KeyFrame(Duration.seconds(0.50), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk2);
                    }
                }),
                new KeyFrame(Duration.seconds(0.75), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk3);
                    }
                }),
                new KeyFrame(Duration.seconds(1.0), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk4);
                    }
                }),
                new KeyFrame(Duration.seconds(1.25), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk5);
                    }
                }),
                new KeyFrame(Duration.seconds(1.50), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk6);
                    }
                }),
                new KeyFrame(Duration.seconds(1.75), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk7);
                    }
                }),
                new KeyFrame(Duration.seconds(2.0), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk8);
                    }
                }),
                new KeyFrame(Duration.seconds(2.25), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk9);
                    }
                }),
                new KeyFrame(Duration.seconds(2.50), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk10);
                    }
                }),
                new KeyFrame(Duration.seconds(2.75), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk11);
                    }
                }),
                new KeyFrame(Duration.seconds(3.0), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        layout.getChildren().setAll(background, ground, ground1, ground2, ground3, ground4, ground5, ground6, ground7, ground8, ground9, ground10, ground11, ground12, tree, snow, walk12);
                    }
                })
        );
        timeline.setAutoReverse(true);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        new AnimationTimer() {
            boolean right = true;
            int x = 0;

            @Override
            public void handle(long arg0) {
                if (right) {
                    santa.setScaleX(1);
                    walk1.setScaleX(1);
                    walk2.setScaleX(1);
                    walk3.setScaleX(1);
                    walk4.setScaleX(1);
                    walk5.setScaleX(1);
                    walk6.setScaleX(1);
                    walk7.setScaleX(1);
                    walk8.setScaleX(1);
                    walk9.setScaleX(1);
                    walk10.setScaleX(1);
                    walk11.setScaleX(1);
                    walk12.setScaleX(1);
                    if (x <= 1120) {
                        x += 1;
                    } else right = false;
                } else {
                    santa.setScaleX(-1);
                    walk1.setScaleX(-1);
                    walk2.setScaleX(-1);
                    walk3.setScaleX(-1);
                    walk4.setScaleX(-1);
                    walk5.setScaleX(-1);
                    walk6.setScaleX(-1);
                    walk7.setScaleX(-1);
                    walk8.setScaleX(-1);
                    walk9.setScaleX(-1);
                    walk10.setScaleX(-1);
                    walk11.setScaleX(-1);
                    walk12.setScaleX(-1);
                    if (x >= 0) {
                        x -= 1;
                    } else right = true;
                }
                santa.setTranslateX(x);
                walk1.setTranslateX(x);
                walk2.setTranslateX(x);
                walk3.setTranslateX(x);
                walk4.setTranslateX(x);
                walk5.setTranslateX(x);
                walk6.setTranslateX(x);
                walk7.setTranslateX(x);
                walk8.setTranslateX(x);
                walk9.setTranslateX(x);
                walk10.setTranslateX(x);
                walk11.setTranslateX(x);
                walk12.setTranslateX(x);
            }
        }.start();
        stage.setTitle("Santa");
        stage.setScene(scene);
        stage.show();
    }
}