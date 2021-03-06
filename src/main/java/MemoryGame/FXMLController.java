package MemoryGame;
//CHECKSTYLE:OFF
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.binding.MapExpression;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Első scene FXML controllere.
 * @author mandr
 *
 */
public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button Start;
    
    /**
     * A start gomb megnyomására betölti a játék scenet.
     * @param event
     */
    @FXML
    private void onStartClicked(ActionEvent event) {
    
            new Thread() {
                @Override
                public void run() {
                	try{
                
                    new JFXPanel();
                    Platform.runLater(new Runnable(){
                    	@Override
                    	public void run(){
                    		try {
                    		new GameLauncher().start(new Stage());   
                    		}catch (Exception e){
                    			e.printStackTrace();
                    		}
                    	}
                    });
                	
                	}catch (Exception e){
                		e.printStackTrace();
                	}
                }
            }.start();  
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
