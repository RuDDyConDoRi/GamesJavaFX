/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GamesJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource(
                "/gamesjavafx/vistas/vistaSplash.fxml"));
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
