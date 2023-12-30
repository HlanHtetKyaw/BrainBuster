package application.Mathematics;

import application.Category;
import application.IqQuestions;
import application.IqResultCheck;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;

public class _3MathE extends Application {
	boolean checker = false;
	Scene scene1;
	Stage currentStage;
	Stage s;
	Scene sc;

	Button back;
	Button forward = new Button();
	Button tryagain = new Button();
	
	Button b1 = new Button();
	Button b2 = new Button();
	Button b3 = new Button();
	Button b4 = new Button();
	
	Label tryagainL = new Label();
	Label b1Label = new Label();
	Label b2Label = new Label();
	Label b3Label = new Label();
	Label b4Label = new Label();
	
	Image Arrow = new Image("arrow.png");
	Image forw = new Image("Math/forward.png");
	Image teacher = new Image("Math/teacher.png");
	Image brain = new Image("Math/brain.png");
	Image boy = new Image("Math/boy.png");
	Image cor = new Image("Math/correct.png");
	Image wro = new Image("Math/wrong.png");
	Image corMM = new Image("Math/correctMM.png");
	Image wroMM = new Image("Math/wrongMM.png");
	Image qEng = new Image("Math/MathQ/_3MathQ.png");
	Image qMM = new Image("Math/MathQ/_3MathQMM.png");
	Image tryAgain = new Image("Math/TryagainMM.png");
	
	Image a1 = new Image("Math/3MathAns/a1.png");
	Image a2 = new Image("Math/3MathAns/a2.png");
	Image a3 = new Image("Math/3MathAns/a3.png");
	Image a4 = new Image("Math/3MathAns/a4.png");
	
	ImageView backArrow = new ImageView(Arrow);
	ImageView forwImg = new ImageView(forw);
	ImageView teacherImg = new ImageView(teacher);
	ImageView brainImg = new ImageView(brain);
	ImageView boyImg = new ImageView(boy);
	ImageView corImg = new ImageView(cor);
	ImageView wroImg = new ImageView(wro);
	ImageView corMMImg = new ImageView(corMM);
	ImageView wroMMImg = new ImageView(wroMM);
	ImageView qEngImg = new ImageView(qEng);
	ImageView qMMImg = new ImageView(qMM);
	ImageView tryAgainImg = new ImageView(tryAgain);
	
	ImageView a1Img = new ImageView(a1);
	ImageView a2Img = new ImageView(a2);
	ImageView a3Img = new ImageView(a3);
	ImageView a4Img = new ImageView(a4);
	
	StackPane root;
	StackPane rectangle1 = new StackPane();
	StackPane rectangle2 = new StackPane();
	
	application.Category cat = new application.Category();
	boolean languageChange;
	boolean nonesense = false;
	
	int mark=0;
	
	public void switchToDifficulty(ActionEvent event, boolean languageChange,StackPane proot) {
		this.languageChange = languageChange;
		root = new StackPane();
		root.setStyle("-fx-background-color: #F79630");

		elements();
		lan_change();
		// Retrieve the stage from the event source
		currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();

		scene1 = new Scene(root, currentStage.getWidth(), currentStage.getHeight());
		scene1.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
		scene1.getStylesheets().add(getClass().getResource("/application/Mathematics/Math.css").toExternalForm());
		currentStage.setScene(scene1);
		currentStage.show();
		proot.getChildren().clear();
	}
	
	/*This is only for developing part*/
	public void start(Stage primaryStage) throws Exception {
		root = new StackPane();
		root.setStyle("-fx-background-color: #F79630");
		elements();
		lan_change();
		scene1 = new Scene(root, 1366, 766);
		scene1.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
		scene1.getStylesheets().add(getClass().getResource("/application/Mathematics/Math.css").toExternalForm());
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	/*This is only for developing part*/

	private void elements() {
		back = new Button();
		back.getStyleClass().add("lets_start");
		back.setPrefSize(60, 60);
		back.setOnAction(a -> {

			Category.switchToScene1(a, application.Mathematics.MathResult.scV, languageChange);
			MathResultCheck.correct=0;
			MathResultCheck.percent=0;
			MathResultCheck.result=0;
			switchingQuestionForEasyMath.point=-1;

			
	
			application.Mathematics.switchingQuestionForEasyMath.checker = true;

			rectangle1.getChildren().clear();
			rectangle2.getChildren().clear();
		});
		backArrow.setFitWidth(40);
		backArrow.setFitHeight(30);

		back.setGraphic(backArrow);
		StackPane.setAlignment(back, Pos.TOP_LEFT);
		StackPane.setMargin(back, new Insets(30, 0, 0, 30));// top right bottom left
		
		rectangle1.setMaxWidth(508);
		rectangle1.setStyle("-fx-background-color:WHITE; -fx-background-radius:30px;");
		rectangle1.setMaxHeight(467);
		StackPane.setMargin(rectangle1, new Insets(0,650,0,0));
		
		rectangle2.setMaxWidth(290);
		rectangle2.setStyle("-fx-background-color:WHITE; -fx-background-radius:30px;");
		rectangle2.setMaxHeight(70);
		StackPane.setMargin(rectangle2, new Insets(0,0,550,600));
		
		StackPane.setMargin(b1, new Insets(80,0,450,600));
		StackPane.setMargin(b2, new Insets(80,0,250,600));
		StackPane.setMargin(b3, new Insets(80,0,50,600));
		StackPane.setMargin(b4, new Insets(80,0,-150,600));
		
		int size1 = 438;
		int size2 = 65;
		b1.setMaxSize(size1, size2);
		b2.setMaxSize(size1, size2);
		b3.setMaxSize(size1, size2);
		b4.setMaxSize(size1, size2);
		
		b1.getStyleClass().add("bBut");
		b1.setOnAction(e->{
			clickWrong();
		});
		b2.getStyleClass().add("bBut");
		b2.setOnAction(e->{
			clickWrong();
		});
		b3.getStyleClass().add("bBut");
		b3.setOnAction(e->{
			clickWrong();
		});
		b4.getStyleClass().add("bBut");
		b4.setOnAction(e->{
			clickCorrect();
		});
		

		forward.setMaxSize(74,74);
		forward.setGraphic(forwImg);
		forward.getStyleClass().add("forward");
		forward.setOnAction(e->{
			clickForward(e);
		});
		StackPane.setMargin(forward, new Insets(0,0,-400,850));
		
		tryagain.setDisable(true);
		tryagain.setMaxSize(118,40);
		tryagain.getStyleClass().add("forward");
		tryagain.setOnAction(e->{
			clickTryAgain();
		});
		StackPane.setMargin(tryagain, new Insets(0,0,-400,600));
		
		StackPane.setAlignment(teacherImg, Pos.BOTTOM_RIGHT);
		StackPane.setAlignment(brainImg, Pos.TOP_RIGHT);
		StackPane.setAlignment(boyImg, Pos.BOTTOM_LEFT);
		
		root.getChildren().addAll( back,rectangle1,b1,b2,b3,b4,rectangle2,forward,tryagain,teacherImg,brainImg,boyImg);
	}
	private void lan_change() {
		if (languageChange) {
			tryAgainImg.setVisible(false);
			qMMImg.setVisible(false);
			a1Img.setVisible(false);
			a2Img.setVisible(false);
			a3Img.setVisible(false);
			a4Img.setVisible(false);
			corMMImg.setVisible(false);
			wroMMImg.setVisible(false);
			
			Font quest_font = Font.loadFont(getClass().getResourceAsStream("/PoppinB.ttf"), 15);
			tryagainL.setText("Try Again");
			tryagainL.setFont(quest_font);
			tryagainL.setTextFill(Color.WHITE);
			tryagain.setGraphic(tryagainL);
			
			if(!rectangle1.getChildren().contains(qEngImg)) {
				rectangle1.getChildren().add(qEngImg);
			}
			
			Font b_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 30);
			b1Label.setText("0");
			b1Label.setTextFill(Color.BLACK);
			b1Label.setFont(b_font);
			b1.setGraphic(b1Label);
			
			b2Label.setText("8");
			b2Label.setTextFill(Color.BLACK);
			b2Label.setFont(b_font);
			b2.setGraphic(b2Label);
			
			b3Label.setText("7");
			b3Label.setTextFill(Color.BLACK);
			b3Label.setFont(b_font);
			b3.setGraphic(b3Label);
			
			b4Label.setText("1");
			b4Label.setTextFill(Color.BLACK);
			b4Label.setFont(b_font);
			b4.setGraphic(b4Label);
			
			root.getChildren().addAll();

			nonesense = true;
		} else {
			if (nonesense == true) {
				tryAgainImg.setVisible(true);
				qMMImg.setVisible(true);
				a1Img.setVisible(true);
				a2Img.setVisible(true);
				a3Img.setVisible(true);
				a4Img.setVisible(true);
				corMMImg.setVisible(true);
				wroMMImg.setVisible(true);
			}
			tryagain.setGraphic(tryAgainImg);
			rectangle1.getChildren().add(qMMImg);
			b1.setGraphic(a1Img);
			b2.setGraphic(a2Img);
			b3.setGraphic(a3Img);
			b4.setGraphic(a4Img);
			
			root.getChildren().addAll();
		}
	}
	private void clickCommon() {
		tryagain.setDisable(false);
		forward.setDisable(false);
		b1.setDisable(true);
		b2.setDisable(true);
		b3.setDisable(true);
		b4.setDisable(true);
	}
	private void clickCorrect() {
		checker = true;
		clickCommon();
		mark = 1;
		if(languageChange) {
			rectangle2.getChildren().add(corImg);
		}else {
			rectangle2.getChildren().add(corMMImg);
		}
	}
	private void clickWrong() {
		checker = false;
		clickCommon();
		mark = 0;
		if(languageChange) {
			rectangle2.getChildren().add(wroImg);
		}else {
			rectangle2.getChildren().add(wroMMImg);
		}
	}
	private void clickTryAgain() {
		checker = false;
		rectangle2.getChildren().clear();
		mark = 0;
		tryagain.setDisable(true);
		b1.setDisable(false);
		b2.setDisable(false);
		b3.setDisable(false);
		b4.setDisable(false);
	}
	private void clickForward(ActionEvent e) {
		if(checker) {
			MathResultCheck.check();
		}
		rectangle1.getChildren().clear();
		rectangle2.getChildren().clear();
		switchingQuestionForEasyMath.switchToQuestions(e, languageChange, root);
		System.out.println(mark);
		b1.setDisable(false);
		b2.setDisable(false);
		b3.setDisable(false);
		b4.setDisable(false);
	}
}
