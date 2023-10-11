package application;

import application.Mathematics.MathResultCheck;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class IqFifteen{
	Timeline timeLine;

	int Counter = 15;
	int remain_counter = Counter;
	
	Scene scene1;
	Stage currentStage;
	Stage s;
	Scene sc;

	Button back;
	Button timer = new Button();
	Button b1 = new Button();
	Button b2 = new Button();
	Button b3 = new Button();
	
	Text timeT = new Text();
	Text b1T = new Text();
	Text b2T = new Text();
	Text b3T = new Text();
	Text EngT = new Text();
	
	Label quest = new Label();
	
	Image Arrow = new Image("arrow.png");
	Image pyramid = new Image("IqFifteen/pyramid.png");
	Image clock = new Image("IqFifteen/clock.png");
	Image cylinder = new Image("IqFifteen/cylinder.png");
	Image triangle = new Image("IqFifteen/triangle.png");

	
	ImageView backArrow = new ImageView(Arrow);
	ImageView pyramidImg = new ImageView(pyramid);
	ImageView clockImg = new ImageView(clock);
	ImageView cylinderImg = new ImageView(cylinder);
	ImageView triangleImg = new ImageView(triangle);
	ImageView iq15MMImg = new ImageView(new Image("IqFifteen/iq15MM.png"));
	ImageView a1Img = new ImageView(new Image("IqFifteen/a1.png"));
	ImageView a2Img = new ImageView(new Image("IqFifteen/a2.png"));
	ImageView a3Img = new ImageView(new Image("IqFifteen/a3.png"));
	
	StackPane root;
	StackPane rectangle = new StackPane();
	
	boolean languageChange;
	boolean nonesense = false;

	public void switchToDifficulty(ActionEvent event, boolean languageChange,StackPane proot) {
		remain_counter = Counter;
		this.languageChange = languageChange;
		root = new StackPane();
		root.setStyle("-fx-background-color: #524F4F");
		
		Counting();
		elements();
		lan_change();
		// Retrieve the stage from the event source
		currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();

		scene1 = new Scene(root, currentStage.getWidth(), currentStage.getHeight());
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		scene1.getStylesheets().add(getClass().getResource("IqQuestion.css").toExternalForm());
		currentStage.setScene(scene1);
		currentStage.show();
		proot.getChildren().clear();
	}
	
	/*This is only for developing part*/
//	public void start(Stage primaryStage) throws Exception {
//		root = new StackPane();
//		root.setStyle("-fx-background-color: #524F4F");
//		
//		Counting();
//		elements();
//		lan_change();
//		scene1 = new Scene(root, 1366, 766);
//		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		scene1.getStylesheets().add(getClass().getResource("IqQuestion.css").toExternalForm());
//		primaryStage.setScene(scene1);
//		primaryStage.show();
//	}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
	/*This is only for developing part*/

	private void elements() {
		back = new Button();
		back.getStyleClass().add("lets_start");
		back.setPrefSize(60, 60);
		back.setOnAction(a -> {
			Category cat = new Category();
			cat.switchToScene1(a, application.Mathematics.MathResult.scV, languageChange);
			timeLine.stop();
			rectangle.getChildren().clear();
			IqResultCheck.correct=0;
			IqResultCheck.percent=0;
			IqResultCheck.result=0;
			IqQuestions.point=-1;
			IqQuestions.checker = true;
			IqQuestions.check.clear();
		});
		backArrow.setFitWidth(40);
		backArrow.setFitHeight(30);

		back.setGraphic(backArrow);
		StackPane.setAlignment(back, Pos.TOP_LEFT);
		StackPane.setMargin(back, new Insets(30, 0, 0, 30));// top right bottom left
		
		rectangle.setMaxSize(722, 230);
		rectangle.setStyle("-fx-background-color:#2C3047; -fx-background-radius:25px;");
		StackPane.setMargin(rectangle, new Insets(0,0,0,0));
		
		StackPane.setMargin(b1, new Insets(350,500,0,0));
		StackPane.setMargin(b2, new Insets(350,0,0,0));
		StackPane.setMargin(b3, new Insets(350,-500,0,0));

		b1.setMaxSize(230, 66);
		b1.setOnAction(e->{
			timeLine.stop();
			rectangle.getChildren().clear();
			IqQuestions.switchToIqQuestions(e, languageChange,root);
		});
		b2.setMaxSize(230, 66);
		b2.setOnAction(e->{
			timeLine.stop();
			IqResultCheck.check();
			rectangle.getChildren().clear();
			IqQuestions.switchToIqQuestions(e, languageChange,root);
		});
		b3.setOnAction(e->{
			timeLine.stop();
			rectangle.getChildren().clear();
			IqQuestions.switchToIqQuestions(e, languageChange,root);
		});
		b3.setMaxSize(230, 66);
		
		b1.getStyleClass().add("bButFift");
		b2.getStyleClass().add("bButFift");
		b3.getStyleClass().add("bButFift");
		
		StackPane.setAlignment(pyramidImg, Pos.BOTTOM_RIGHT);
		StackPane.setAlignment(triangleImg, Pos.BOTTOM_LEFT);
		StackPane.setAlignment(cylinderImg, Pos.TOP_RIGHT);
		
		root.getChildren().addAll( rectangle,b1,b2,b3,back,pyramidImg,triangleImg,cylinderImg);
	}

	void lan_click() {
		languageChange = !languageChange;
		lan_change();
	}
	void Counting() {
		Button over = new Button();
		over.setOnAction(e->{
			IqQuestions.switchToIqQuestions(e, languageChange,root);
			rectangle.getChildren().clear();
		});
		over.setVisible(false);
		root.getChildren().add(over);
		clockImg = new ImageView(clock);
		StackPane.setMargin(clockImg, new Insets(0, 100, 470, 0));

		timer.getStyleClass().add("timer");
		timer.setMaxSize(140, 60);
		StackPane.setMargin(timer, new Insets(0, 0, 450, 0));
		timeT.setFill(Color.BLACK);
		Font Mathematics_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 30);
		timeT.setFont(Mathematics_font);
		timeT.setText(Integer.toString(Counter));
		timer.setGraphic(timeT);
		timeLine = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
			remain_counter--;
			timeT.setText(Integer.toString(remain_counter));
			timer.setGraphic(timeT);
			if (remain_counter == 10) {
				timeT.setFill(Color.RED);
			}
			if (remain_counter <= 0) {
				timeLine.stop();
				over.fire();
			}
		}));
		timeLine.setCycleCount(Counter);
		timeLine.play();
		
		root.getChildren().addAll(timer,clockImg);
	}
	
	private void lan_change() {
		if (languageChange) {
			iq15MMImg.setVisible(false);
			a1Img.setVisible(false);
			a2Img.setVisible(false);
			a3Img.setVisible(false);
			
			EngT.setVisible(true);
			b1T.setVisible(true);
			b2T.setVisible(true);
			b3T.setVisible(true);
			
			EngT.setText("\t\t\tIdentify the pattern: \r\n"
					+ "Triangle is to pyramid as circle is to _____.");
			quest.setGraphic(EngT);
			Font quest_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 30);
			EngT.setFont(quest_font);
			EngT.setFill(Color.WHITE);
			if (!rectangle.getChildren().contains(quest)) {
			    rectangle.getChildren().add(quest);
			}
			
			b1T.setText("Cycle");
			b1T.setFont(quest_font);
			b1T.setFill(Color.WHITE);
			b1.setGraphic(b1T);
			
			b2T.setText("Cylinder");
			b2T.setFont(quest_font);
			b2T.setFill(Color.WHITE);
			b2.setGraphic(b2T);
			
			b3T.setText("Cyclic");
			b3T.setFont(quest_font);
			b3T.setFill(Color.WHITE);
			b3.setGraphic(b3T);
			
			root.getChildren().addAll();

			nonesense = true;
		} else {
			if (nonesense == true) {
				iq15MMImg.setVisible(true);
				a1Img.setVisible(true);
				a2Img.setVisible(true);
				a3Img.setVisible(true);
				
				EngT.setVisible(false);
				b1T.setVisible(false);
				b2T.setVisible(false);
				b3T.setVisible(false);
			}
			quest.setGraphic(iq15MMImg);
			rectangle.getChildren().add(quest);
			b1.setGraphic(a1Img);
			b2.setGraphic(a2Img);
			b3.setGraphic(a3Img);
			
			root.getChildren().addAll();
		}
	}
}
