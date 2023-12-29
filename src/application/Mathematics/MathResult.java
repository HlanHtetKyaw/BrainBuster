package application.Mathematics;

import application.BooleanHolder;
import application.Category;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.PauseTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
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
import javafx.util.Duration;
import javafx.util.*;
import javafx.scene.control.*;

public class MathResult extends Application{
	Category cat = new Category();
	
	Scene scene1;
	Stage currentStage;
	String s;
	String s1;
	String s2;
	
	Scene sc;

	Button back;
	
	Label result;
	Label excellent = new Label();
	Label r2Label = new Label();
	Label r3Label = new Label();
	
	
	Image Arrow = new Image("IqResult/home.png");
	Image brain = new Image("MathResult/boy.png");
	Image brainR = new Image("MathResult/certi.png");
	Image hat = new Image("MathResult/hat.png");
	Image paperplane = new Image("MathResult/paperplane.png");
	Image medal = new Image("MathResult/medal.png");
	static Image mathMM = new Image("m_mathB.png");
	Image logicMM = new Image("m_logicB.png");
	Image ezMM = new Image("Difficult/elvlB.png");
	Image norMM = new Image("Difficult/nlvlB.png");
	Image diffMM = new Image("Difficult/dlvlB.png");
	Image congrat = new Image("MathResult/congrat.png");
	Image lvlMM = new Image("MathResult/lvlMM.png");
	Image modeMM = new Image("MathResult/modeMM.png");
	Image eaistein = new Image("Profile/supBoy.png");
	Image cele1 = new Image("IqFive/cele1.png");
	Image cele2 = new Image("IqFive/cele2.png");
	Image notiMM = new Image("IqFive/notiSupBoy.png");
	
	ImageView congratImg = new ImageView(congrat);
	ImageView lvlMMImg = new ImageView(lvlMM);
	ImageView modeMMImg = new ImageView(modeMM);
	
	ImageView backArrow = new ImageView(Arrow);
	ImageView brainImg = new ImageView(brain);
	ImageView brainRImg = new ImageView(brainR);
	ImageView hatImg = new ImageView(hat);
	ImageView paperplaneImg = new ImageView(paperplane);
	ImageView medalImg = new ImageView(medal);
	ImageView mathMMImg = new ImageView(mathMM);
	ImageView logicMMImg = new ImageView(logicMM);
	ImageView ezMMImg = new ImageView(ezMM);
	ImageView norMMImg = new ImageView(norMM);
	ImageView diffMMImg = new ImageView(diffMM);
	ImageView eaisteinImg = new ImageView(eaistein);
	ImageView cele1Img = new ImageView(cele1);
	ImageView cele2Img = new ImageView(cele2);
	ImageView notiMMImg = new ImageView(notiMM);
	
	StackPane root;
	StackPane noti;
	StackPane rectangle1 = new StackPane();
	StackPane rectangle2 = new StackPane();
	
	Text math = new Text("Mathematics");
	Text logic = new Text("Logic");
	Text cong = new Text("Congratulation!!");
	
	Label mode = new Label();
	Label difficulty = new Label();
	Label ezL = new Label();
	Label norL = new Label();
	Label diffL = new Label();
	Button modeDis = new Button();
	Button diffDis = new Button();
	
	ProgressIndicator pi = new ProgressIndicator();
	static double targetValue;
	
	boolean languageChange;
	boolean nonesense = false;
	
	public void switchToDifficulty(ActionEvent event, boolean languageChange,StackPane proot) {
		s = String.valueOf(MathResultCheck.getScore());
		s1 = String.valueOf(MathResultCheck.getResult());
		s2 = String.valueOf(MathResultCheck.getPercent());
		
		targetValue = Double.parseDouble(s);
		System.out.println(targetValue);
		this.languageChange = languageChange;
		root = new StackPane();
		root.setStyle("-fx-background-color: #66676D");
		
		if(through) {
			math();
		}else {
			log();
		}
		
		if(filt==0) {
			ez();
		}else if(filt==1) {
			nor();
		}else {
			diff();
		}
		notification();
		elements();
		lan_change();
		// Retrieve the stage from the event source
		currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();

		scene1 = new Scene(root, currentStage.getWidth(), currentStage.getHeight());
		scene1.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
		scene1.getStylesheets().add(getClass().getResource("/application/IqQuestion.css").toExternalForm());
		currentStage.setScene(scene1);
		currentStage.show();
		proot.getChildren().clear();
	}
	
	/*This is only for developing part*/
	public void start(Stage primaryStage) throws Exception {
		root = new StackPane();
		root.setStyle("-fx-background-color: #66676D");
		if(through) {
			math();
		}else {
			log();
		}
		if(filt==0) {
			ez();
		}else if(filt==1) {
			nor();
		}else {
			diff();
		}
		elements();
		lan_change();
		scene1 = new Scene(root, 1366, 766);
		scene1.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
		scene1.getStylesheets().add(getClass().getResource("/application/IqQuestion.css").toExternalForm());
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	/*This is only for developing part*/
	public static int scV;
	
	private void elements() {
		back = new Button();
		back.getStyleClass().add("lets_startR");
		back.setPrefSize(60, 60);
		back.setOnAction(a -> {
			rectangle1.getChildren().clear();
			rectangle2.getChildren().clear();
			//application.Category cat = new application.Category();
			Category.switchToScene1(a, scV, languageChange);
			rectangle1.getChildren().clear();
			rectangle2.getChildren().clear();
			rectangle1.getChildren().removeAll();
			MathResultCheck.correct=0;
			MathResultCheck.percent=0;
			MathResultCheck.result=0;
			targetValue = 0;
			System.out.println(targetValue);
			application.Mathematics.switchingQuestionForDiffMath.check.clear();
			application.Mathematics.switchingQuestionForDiffMath.checker = true;
			
			
			application.Mathematics.switchingQuestionForEasyMath.check.clear();
			application.Mathematics.switchingQuestionForEasyMath.checker = true;
			
			application.Mathematics.switchingQuestionForNormalMath.check.clear();
			application.Mathematics.switchingQuestionForNormalMath.checker=true;
			
			application.MathematicsAdult.switchingQuestionForDiffMathA.check.clear();
			application.MathematicsAdult.switchingQuestionForDiffMathA.checker = true;
			
			application.MathematicsAdult.switchingQuestionForEasyMathA.check.clear();
			application.MathematicsAdult.switchingQuestionForEasyMathA.checker = true;
			
			application.MathematicsAdult.switchingQuestionForNormalMathA.check.clear();
			application.MathematicsAdult.switchingQuestionForNormalMathA.checker=true;
			
			application.Logic.switchingQuestionForDiffLogic.check.clear();
			application.Logic.switchingQuestionForDiffLogic.checker=true;
			application.Logic.switchingQuestionForNormalLogic.check.clear();
			application.Logic.switchingQuestionForNormalLogic.checker=true;
			application.Logic.switchingQuestionForEasyLogic.check.clear();
			application.Logic.switchingQuestionForEasyLogic.checker=true;
			
			application.LogicAdult.switchingQuestionForDiffLogicAdult.check.clear();
			application.LogicAdult.switchingQuestionForDiffLogicAdult.checker=true;
			application.LogicAdult.switchingQuestionForNormalLogicAdult.check.clear();
			application.LogicAdult.switchingQuestionForNormalLogicAdult.checker=true;
			application.LogicAdult.switchingQuestionForEasyLogicAdult.check.clear();
			application.LogicAdult.switchingQuestionForEasyLogicAdult.checker=true;
		});
		backArrow.setFitWidth(40);
		backArrow.setFitHeight(40);
		
		back.setGraphic(backArrow);
		StackPane.setAlignment(back, Pos.CENTER);
		StackPane.setMargin(back, new Insets(0, 0, 150, 800));// top right bottom left
		
		incicate();
		StackPane.setAlignment(pi, Pos.CENTER_LEFT);
		StackPane.setMargin(pi, new Insets(0,0,0,50));
		if(!rectangle1.getChildren().contains(pi)) {
			rectangle1.getChildren().add(pi);
		}
		rectangle1.setMaxWidth(640);
		rectangle1.setStyle("-fx-background-color:WHITE; -fx-background-radius:25px;");
		rectangle1.setMaxHeight(430);
		
		StackPane.setMargin(mode, new Insets(0,0,300,300));
		modeDis.setPrefSize(217, 62);
		modeDis.getStyleClass().add("display");
		StackPane.setMargin(modeDis, new Insets(0,0,200,300));
		
		StackPane.setMargin(difficulty, new Insets(0,0,-100,300));
		diffDis.setPrefSize(217, 62);
		diffDis.getStyleClass().add("display");
		StackPane.setMargin(diffDis, new Insets(0,0,-200,300));
		
		rectangle1.getChildren().addAll(mode,difficulty,modeDis,diffDis);
		
		StackPane.setMargin(rectangle1, new Insets(0,0,150,0));
		
		rectangle2.setMaxWidth(640);
		rectangle2.setStyle("-fx-background-color:WHITE; -fx-background-radius:25px;");
		rectangle2.setMaxHeight(90);
		StackPane.setMargin(rectangle2, new Insets(400,0,0,0));
		
		StackPane.setAlignment(brainImg, Pos.BOTTOM_LEFT);
		StackPane.setAlignment(brainRImg, Pos.BOTTOM_RIGHT);
		StackPane.setAlignment(hatImg, Pos.TOP_LEFT);
		StackPane.setAlignment(paperplaneImg, Pos.TOP_RIGHT);

		StackPane.setMargin(medalImg, new Insets(0,600,570,0));

		root.getChildren().addAll(brainImg,brainRImg,back,rectangle1,rectangle2,hatImg,paperplaneImg,medalImg,noti);
	}
	private void incicate() {
	
		excellent.visibleProperty().bind(pi.progressProperty().isEqualTo((long) 1.0));

		
		excellent.setStyle("-fx-background-color:WHITE;");
		StackPane.setAlignment(excellent, Pos.BOTTOM_CENTER);
		StackPane.setMargin(excellent, new Insets(0,240,60,0));
		
		pi.getStyleClass().add("cpi");
		pi.setMaxSize(290, 290);
        Duration duration = Duration.seconds(2); // Animation duration (in this case, 2 seconds)
        System.out.println("Target value: "+targetValue);
        // Create a Timeline to animate the ProgressIndicator to the target value
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(pi.progressProperty(), 0)),
                new KeyFrame(duration, new KeyValue(pi.progressProperty(), targetValue))
        );
        BooleanBinding isTargetReached = Bindings.createBooleanBinding(
                () -> pi.getProgress() >= targetValue,
                pi.progressProperty()
        );
        r3Label.visibleProperty().bind(isTargetReached);
        isTargetReached.addListener((observable, oldValue, newValue) -> {
            if (newValue) {
            	showNoti();
            	BooleanHolder b = new BooleanHolder();
				b.setBoolFour(true);
				
            	if(languageChange) {
            		Font English_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 40);
            		cong.setFont(English_font);
            		 r3Label.setGraphic(cong);
            	}else {
            		r3Label.setGraphic(congratImg);
            	}
             
            } else {
            	
            }
        });
        rectangle2.getChildren().add(r3Label);
        timeline.play();
	}
	static boolean through;
	public static void modeFilter(boolean filter) {
		if(filter) {
				through = true;
		}else {
			through = false;
		}
	}
	static int filt;
	public static void lvlFilter(int filter) {
		filt = filter;
	}
	public void diffFilter() {
		
	}
	
	void math() {
		if(languageChange) {
			mathMMImg.setVisible(false);
			math.setVisible(true);
			Font English_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 22);
			math.setFont(English_font);
			System.out.println(languageChange);
			
			modeDis.setGraphic(math);
			nonesense = true;
		}else {
			if(nonesense == true) {
				math.setVisible(false);
				mathMMImg.setVisible(true);
			}
			mathMMImg.setFitWidth(150);
			mathMMImg.setFitHeight(30);
			modeDis.setGraphic(mathMMImg);
		}
	}
	void log() {
		if(languageChange) {
			logicMMImg.setVisible(false);
			logic.setVisible(true);
			Font English_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 22);
			logic.setFont(English_font);
			System.out.println(languageChange);
			
			modeDis.setGraphic(logic);
			nonesense = true;
		}else {
			if(nonesense == true) {
				logic.setVisible(false);
				logicMMImg.setVisible(true);
			}
			logicMMImg.setFitWidth(150);
			logicMMImg.setFitHeight(30);
			modeDis.setGraphic(logicMMImg);
		}
	}
	void ez() {
		if(languageChange) {
			ezMMImg.setVisible(false);
			ezL.setVisible(true);
			Font English_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 22);
			ezL.setFont(English_font);
			ezL.setText("EASY");
			diffDis.setGraphic(ezL);
			nonesense = true;
		}else {
			if(nonesense == true) {
				math.setVisible(false);
				mathMMImg.setVisible(true);
			}
			ezMMImg.setFitWidth(150);
			ezMMImg.setFitHeight(30);
			diffDis.setGraphic(ezMMImg);
		}
	}
	void diff() {
		if(languageChange) {
			diffMMImg.setVisible(false);
			diffL.setVisible(true);
			Font English_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 22);
			diffL.setFont(English_font);
			diffL.setText("Difficult");
			diffDis.setGraphic(diffL);
			nonesense = true;
		}else {
			if(nonesense == true) {
				diffL.setVisible(false);
				diffMMImg.setVisible(true);
			}
			diffMMImg.setFitWidth(150);
			diffMMImg.setFitHeight(30);
			diffDis.setGraphic(diffMMImg);
		}
	}
	void nor() {
		if(languageChange) {
			norMMImg.setVisible(false);
			norL.setVisible(true);
			Font English_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 22);
			norL.setFont(English_font);
			norL.setText("Normal");
			diffDis.setGraphic(norL);
			nonesense = true;
		}else {
			if(nonesense == true) {
				norL.setVisible(false);
				norMMImg.setVisible(true);
			}
			norMMImg.setFitWidth(150);
			norMMImg.setFitHeight(30);
			diffDis.setGraphic(norMMImg);
		}
	}
	private void notification() {
		noti = new StackPane();
		noti.setMaxWidth(613);
		noti.setMaxHeight(141);
		StackPane.setAlignment(noti, Pos.TOP_CENTER);
		StackPane.setMargin(noti, new Insets(-200, 0, 0, 0));
		noti.getStyleClass().add("noti");
		noti.setVisible(false);

		Button award = new Button();
		award.setMaxSize(100, 100);
		award.setStyle("-fx-background-color: #FFCC00; -fx-background-radius: 50%;");
		StackPane.setAlignment(award, Pos.CENTER_LEFT);
		StackPane.setMargin(award, new Insets(0, 0, 0, 25));

		eaisteinImg.setFitWidth(55);
		eaisteinImg.setFitHeight(70);
		award.setGraphic(eaisteinImg);

		StackPane.setAlignment(cele1Img, Pos.BOTTOM_LEFT);
		StackPane.setMargin(cele1Img, new Insets(0, 0, 15, 140));

		StackPane.setAlignment(cele2Img, Pos.TOP_RIGHT);
		StackPane.setMargin(cele2Img, new Insets(15, 50, 0, 0));
		StackPane.setMargin(notiMMImg, new Insets(0,-100,0,0));
		noti.getChildren().addAll(award, cele1Img, cele2Img,notiMMImg);
	}
	private void showNoti() {
		System.out.println("win tal");
		noti.setVisible(true);
		TranslateTransition down = new TranslateTransition();
		down.setByY(200);
		down.setDuration(Duration.seconds(1));
		down.setNode(noti);

		PauseTransition pause = new PauseTransition();
		pause.setDuration(Duration.seconds(4));

		ScaleTransition shake = new ScaleTransition();
		shake.setNode(noti);
		shake.setToX(0.9);
		shake.setToY(0.9);
		shake.setAutoReverse(true);
		shake.setCycleCount(4);
		shake.setDuration(Duration.seconds(1));

		ParallelTransition pt = new ParallelTransition();
		pt.getChildren().addAll(pause, shake);

		TranslateTransition up = new TranslateTransition();
		up.setByY(-200);
		up.setDuration(Duration.seconds(1));
		up.setNode(noti);

		down.setOnFinished(e -> pt.play());
		pause.setOnFinished(e -> up.play());
		down.play();
	}
	private void lan_change() {
		result = new Label();
		if (languageChange) {
			excellent.setText("EXCELLENT!!");
			Font quest_font = Font.loadFont(getClass().getResourceAsStream("/PoppinB.ttf"), 24);
			excellent.setFont(quest_font);
			
			Font quest_font1 = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 40);
			
			result.setTextFill(Color.WHITE);
			result.setFont(quest_font1);
			StackPane.setAlignment(result, Pos.CENTER);
			StackPane.setMargin(result, new Insets(0,0,70,200));
			
			Font quest_font2 = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 30);
			r2Label.setFont(quest_font2);
			r2Label.setTextFill(Color.WHITE);
			r2Label.setText("IQ RESULT:");
	
			Font quest_font3 = Font.loadFont(getClass().getResourceAsStream("/PoppinB.ttf"), 30);
			r3Label.setFont(quest_font3);
			r3Label.setTextFill(Color.WHITE);
			
			mode.setText("MODE");
			mode.setFont(quest_font3);
			
			difficulty.setText("DIFFICULTY");
			difficulty.setFont(quest_font3);
			
			
			rectangle1.getChildren().add(excellent);
			root.getChildren().addAll(result);

			nonesense = true;
		} else {
			if (nonesense == true) {
				
			}
			excellent.setText("EXCELLENT!!");
			Font quest_font = Font.loadFont(getClass().getResourceAsStream("/PoppinB.ttf"), 24);
			excellent.setFont(quest_font);
			
			StackPane.setMargin(modeMMImg, new Insets(0,0,320,300));
			StackPane.setMargin(lvlMMImg, new Insets(0,0,-90,300));
			rectangle1.getChildren().addAll(modeMMImg,lvlMMImg,excellent);
			root.getChildren().addAll();
		}
	}
}
