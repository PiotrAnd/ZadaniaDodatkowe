package FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();
        Button button = new Button("Przycisk");
        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane,300,300);

        primaryStage.setScene(scene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        //primaryStage.setResizable(false);
        //primaryStage.setOpacity(0.5);
        primaryStage.setTitle("Pierwsze okienko");
        primaryStage.show();
    }
}
