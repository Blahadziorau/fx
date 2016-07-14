package fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Pane main = new VBox();
        Pane parent = new Pane();

        View view1 = new AppView();
        View view2 = new HelloView();
        Pane pane1 = view1.getPane();
        Pane pane2 = view2.getPane();

        View panel = new Panel(parent, pane1, pane2);
        main.getChildren().addAll(panel.getPane(), parent);
        Scene scene = new Scene(main, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
