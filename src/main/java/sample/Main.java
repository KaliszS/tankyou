package sample;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Main extends Application {



    private final int sceneWidth = 800;
    private final int sceneHeight = 600;
    private final int scoresPanelHeight = 0;
    private final int gamePanelHeight = sceneHeight - scoresPanelHeight;


//
   Brick a = new Brick (40,30,30,30,Color.BLUE);
//


    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        root.getChildren().add(a);
        Scene scene = new Scene(root, sceneWidth, sceneHeight);
        GridPane mainGrid = prepareGridPane();

       root.getChildren().add(mainGrid);

        Pane gamePane = prepareGamePane(mainGrid);
        gamePane.getChildren().add(a);
        primaryStage.setTitle("tankyou");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        a.MoveDown();
        primaryStage.show();

    }

    private GridPane prepareGridPane() {
        GridPane grid = new GridPane();
        grid.setMaxSize(sceneWidth, sceneHeight);
        return grid;
    }

    private Pane prepareGamePane(GridPane grid) {
        Pane gamePane = new Pane();
        gamePane.setMinSize(sceneWidth, gamePanelHeight);
        gamePane.setMaxSize(sceneWidth, gamePanelHeight);
        gamePane.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

        grid.add(gamePane, 0, 1);

        return gamePane;
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.exit(0);
    }
}
