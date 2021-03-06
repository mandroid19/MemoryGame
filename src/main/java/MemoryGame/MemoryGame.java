package MemoryGame;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Collections;
import java.util.List;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Elindítja magát az alkalmazást (az első scene-t).
 * @author mandr
 *
 */
public class MemoryGame extends Application {
  



	/**
	 * Staget létrehozza.
	 */
	public  static Stage Mainstage = new Stage();


  
    /* (non-Javadoc)
     * Betölti az első scene-t.
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
     Pane startPane = (Pane) FXMLLoader.load(MemoryGame.class.getResource("/scene1.fxml"));
    Mainstage.setScene(new Scene(startPane));
    Mainstage.setTitle("MemoryGame Start");
    Mainstage.show();
    Mainstage.setOnCloseRequest(e -> Platform.exit());
    }

   
    /**
     * Elindítja az applikációt.
     * @param args standard argumentumok
     */
    public static void main(String[] args) {
       Application.launch(args);
    }
}
