package application;

import javafx.stage.Stage;

import java.util.prefs.Preferences;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.event.Event;
import javafx.scene.control.Button;

public class AchievementController {

	boolean languageChange;
    @FXML
    private StackPane one;
    
    @FXML
    private ImageView oneCover;
    
    @FXML
    private ImageView TwoCover;
    
    @FXML
    private ImageView ThreeCover;
    
    @FXML
    private ImageView FourCover;
    
    @FXML
    private ImageView FiveCover;
    
    @FXML
    private ImageView cancel;
    
    Stage stage;
	public void start(Stage stage, boolean lan) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Achievement.fxml"));
		Parent root = loader.load();
		languageChange = lan;
		Scene scene = new Scene(root);
		scene.setFill(Color.TRANSPARENT);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}
	  @FXML
	    private void initialize() {
		  BooleanHolder b = new BooleanHolder();
		  cancel.getStyleClass().add("cancelHand");
		  
		  if(b.getBool()) {
			  oneCover.setVisible(false);
		  }else {
			  oneCover.setVisible(true);
		  }
		  
		  if(b.getBoolTwo()) {
			  TwoCover.setVisible(false);
		  }else {
			  TwoCover.setVisible(true);
		  }
		  
		  if(b.getBoolThree()) {
			  ThreeCover.setVisible(false);
		  }else {
			  ThreeCover.setVisible(true);
		  }
		  
		  if(b.getBoolFour()) {
			  FourCover.setVisible(false);
		  }else {
			  FourCover.setVisible(true);
		  }
		  
		  if(b.getBoolFive()) {
			  FiveCover.setVisible(false);
		  }else {
			  FiveCover.setVisible(true);
		  }
	    		
	    }
	  @FXML
		private void windowClose() {
			stage = (Stage) cancel.getScene().getWindow();
			stage.close();
		}
}
