package application.GeoAndHis;
import application.Sound;
import application.Category;
import application.Main;
import application.MathematicsAdult.switchingQuestionForEasyMathA;
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
import application.Mathematics.*;

public class _0CommonEz extends Application {
	boolean checker = false;
	Scene scene1;
	Stage currentStage;
	Stage s;
	Scene sc;

	Button back;
	Button forward = new Button();
	Button tryagain = new Button();
	
	public Button b1 = new Button();
	public Button b2 = new Button();
	public Button b3 = new Button();
	public Button b4 = new Button();
	
	Label tryagainL = new Label();
	Label b1Label = new Label();
	Label b2Label = new Label();
	Label b3Label = new Label();
	Label b4Label = new Label();
	
	Image Arrow = new Image("arrow.png");
	Image forw = new Image("Math/forward.png");
	Image greeting = new Image("GeoAndHis/greet.png");
	Image brain = new Image("GeoAndHis/brain.png");
	Image kids = new Image("GeoAndHis/kids.png");
	Image cor = new Image("Math/correct.png");
	Image wro = new Image("Math/wrong.png");
	Image corMM = new Image("Math/correctMM.png");
	Image wroMM = new Image("Math/wrongMM.png");
	Image tryAgain = new Image("Math/TryagainMM.png");
	/***********************************************/
	String qEngPath = "Math/MathQ/_2MathQ.png";
	String qMMPath = "Math/MathQ/_2MathQMM.png";
	String a1MMPath = "Math/2MathAns/a1.png";
	String a2MMPath = "Math/2MathAns/a1.png";
	String a3MMPath = "Math/2MathAns/a1.png";
	String a4MMPath = "Math/2MathAns/a1.png";
	public String a1Eng = "100";
	public String a2Eng = "100";
	public String a3Eng = "100";
	public String a4Eng = "100";
	
	Image qEng = new Image(qEngPath);
	
	Image qMM = new Image(qMMPath);
	
	Image a1 = new Image(a1MMPath);
	Image a2 = new Image(a2MMPath);
	Image a3 = new Image(a3MMPath);
	Image a4 = new Image(a4MMPath);
	/***********************************************/
	ImageView backArrow = new ImageView(Arrow);
	ImageView forwImg = new ImageView(forw);
	ImageView teacherImg = new ImageView(greeting);
	ImageView brainImg = new ImageView(brain);
	ImageView boyImg = new ImageView(kids);
	ImageView corImg = new ImageView(cor);
	ImageView wroImg = new ImageView(wro);
	ImageView corMMImg = new ImageView(corMM);
	ImageView wroMMImg = new ImageView(wroMM);
	ImageView tryAgainImg = new ImageView(tryAgain);
	/***********************************************/
	ImageView qEngImg = new ImageView(qEng);
	ImageView qMMImg = new ImageView(qMM);
	
	ImageView a1Img = new ImageView(a1);
	ImageView a2Img = new ImageView(a2);
	ImageView a3Img = new ImageView(a3);
	ImageView a4Img = new ImageView(a4);
	/***********************************************/
	StackPane root;
	StackPane rectangle1 = new StackPane();
	StackPane rectangle2 = new StackPane();
	
	application.Category cat = new application.Category();
	boolean languageChange = false;
	boolean nonesense = false;
	static Sound sound = new Sound();
	int mark=0;
	public void setQEng(String pathQEng) {
		this.qEngPath = pathQEng;
		qEng = new Image(qEngPath);
		qEngImg = new ImageView(qEng);
	}
	public void setQMM(String pathQMM) {
		this.qMMPath = pathQMM;
		qMM = new Image(qMMPath);
		qMMImg = new ImageView(qMM);
	}
	public void setA1MM(String patha1MM) {
		this.a1MMPath = patha1MM;
		a1 = new Image(a1MMPath);
		a1Img = new ImageView(a1);
	}
	public void setA2MM(String patha2MM) {
		this.a2MMPath = patha2MM;
		a2 = new Image(a2MMPath);
		a2Img = new ImageView(a2);
	}
	public void setA3MM(String patha3MM) {
		this.a3MMPath = patha3MM;
		a3 = new Image(a3MMPath);
		a3Img = new ImageView(a3);
	}
	public void setA4MM(String patha4MM) {
		this.a4MMPath = patha4MM;
		a4 = new Image(a4MMPath);
		a4Img = new ImageView(a4);
	}
	public void switchToDifficulty(ActionEvent event, boolean languageChange,StackPane proot) {
		this.languageChange = languageChange;
		root = new StackPane();
		root.setStyle("-fx-background-color: #7ED957");

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
		root.setStyle("-fx-background-color: #7ED957");
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
			Category.clickSound.playClickSound();
			Category.switchToScene1(a, application.Mathematics.MathResult.scV, languageChange);
			MathResultCheck.correct=0;
			MathResultCheck.percent=0;
			MathResultCheck.result=0;
			switchingQuestionForEasyGeoAndHis.point=-1;
			
			application.GeoAndHis.switchingQuestionForEasyGeoAndHis.checker=true;
			
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
	
		b2.getStyleClass().add("bBut");
		
		b3.getStyleClass().add("bBut");
		
		b4.getStyleClass().add("bBut");
		

		forward.setMaxSize(74,74);
		forward.setGraphic(forwImg);
		forward.getStyleClass().add("forward");
		forward.setOnAction(e->{
			Category.clickSound.playClickSound();
			clickForward(e);
		});
		StackPane.setMargin(forward, new Insets(0,0,-400,850));
		
		tryagain.setDisable(true);
		tryagain.setMaxSize(118,40);
		tryagain.getStyleClass().add("forward");
		tryagain.setOnAction(e->{
			Category.clickSound.playClickSound();
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
			b1Label.setText(a1Eng);
			b1Label.setTextFill(Color.BLACK);
			b1Label.setFont(b_font);
			b1.setGraphic(b1Label);
			
			b2Label.setText(a2Eng);
			b2Label.setTextFill(Color.BLACK);
			b2Label.setFont(b_font);
			b2.setGraphic(b2Label);
			
			b3Label.setText(a3Eng);
			b3Label.setTextFill(Color.BLACK);
			b3Label.setFont(b_font);
			b3.setGraphic(b3Label);
			
			b4Label.setText(a4Eng);
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
	public void clickCorrect() {
		checker = true;
		clickCommon();
		mark = 1;
		if(languageChange) {
			rectangle2.getChildren().add(corImg);
		}else {
			rectangle2.getChildren().add(corMMImg);
		}
	}
	public void clickWrong() {
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
			
			switchingQuestionForEasyGeoAndHis.switchToQuestions(e, languageChange, root);

		System.out.println(mark);
		b1.setDisable(false);
		b2.setDisable(false);
		b3.setDisable(false);
		b4.setDisable(false);
	}
}
