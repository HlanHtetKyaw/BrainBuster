package application;

import java.util.Optional;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;

public class Category {

	static Scene scene1;
	static Stage currentStage;
	static Stage s;
	Scene sc;

	static Button back;
	static Button lan_button;
	static Button math_button;
	static Button math_in_button;
	static Button lg_button;
	static Button lg_in_button;
	static Button iq_button;
	static Button iq_in_button;
	static Button ach_button;
	static Button ach_in_button;
	public static Button profile;
	static Button name;
	static Button soundButton;
	static Button vfxButton;

	static Text Myanmar;
	static Text English;
	static Text Lan;
	static Text Math;
	static Text Logic;
	static Text IQ;
	static Text Ach;

	static Image Lang = new Image("lang.png");
	static Image Arrow = new Image("arrow.png");
	static Image Boy = new Image("boy.png");
	static Image Girl = new Image("girl.png");
	static Image Flat = new Image("flat.png");
	static Image G_board = new Image("greenBoard.png");
	static Image CatText = new Image("catText.png");
	static Image CatTextM = new Image("catTextM.png");
	static Image M_Math = new Image("m_math.png");
	static Image M_Logic = new Image("m_logic.png");
	static Image M_IQ = new Image("m_iq.png");
	static Image M_Ach = new Image("m_ach.png");
	static Image M_MathB = new Image("m_mathB.png");
	static Image M_LogicB = new Image("m_logicB.png");
	static Image M_IQB = new Image("m_iqB.png");
	static Image M_AchB = new Image("m_achB.png");
	static Image Moon = new Image("moon.png");
	static Image Cone = new Image("cone.png");
	static Image Pyramid = new Image("pyramid.png");
	static Image Rookie = new Image("rookie.png");
	static Image Cele = new Image("celeRope.png");
	static Image eaistein = new Image("Profile/eaistein.png");
	static Image idea = new Image("Profile/idea.png");
	static Image fire = new Image("Profile/fire_brain.png");
	static Image supBoy = new Image("Profile/supBoy.png");
	static Image koala = new Image("Profile/koala.png");
	static Image soundE = new Image("Sound/soundE.png");
	static Image soundEC = new Image("Sound/soundEC.png");

	static ImageView soundEImg = new ImageView(soundE);
	static ImageView soundMImg = new ImageView(new Image("Sound/soundM.png"));
	static ImageView soundMCImg = new ImageView(new Image("Sound/soundMC.png"));
	static ImageView vfxMImg = new ImageView(new Image("Sound/vfxSoundM.png"));
	static ImageView vfxMCImg = new ImageView(new Image("Sound/vfxSoundMC.png"));
	static ImageView vfxEImg = new ImageView(new Image("Sound/vfxSoundE.png"));
	static ImageView vfxECImg = new ImageView(new Image("Sound/vfxSoundEC.png"));
	static ImageView soundECImg = new ImageView(soundEC);

	static ImageView ideaImg = new ImageView(idea);
	static ImageView fireImg = new ImageView(fire);
	static ImageView supBoyImg = new ImageView(supBoy);
	static ImageView koalaImg = new ImageView(koala);

	static ImageView langText = new ImageView(Lang);
	static ImageView backArrow = new ImageView(Arrow);
	static ImageView boyStand = new ImageView(Boy);
	static ImageView girlStand = new ImageView(Girl);
	static ImageView flat = new ImageView(Flat);
	static ImageView gBoard = new ImageView(G_board);
	static ImageView catText = new ImageView(CatText);
	static ImageView catTextM = new ImageView(CatTextM);
	static ImageView m_Math = new ImageView(M_Math);
	static ImageView m_Logic = new ImageView(M_Logic);
	static ImageView m_IQ = new ImageView(M_IQ);
	static ImageView m_Ach = new ImageView(M_Ach);
	static ImageView m_MathB = new ImageView(M_MathB);
	static ImageView m_LogicB = new ImageView(M_LogicB);
	static ImageView m_IQB = new ImageView(M_IQB);
	static ImageView m_AchB = new ImageView(M_AchB);
	static ImageView moonImg = new ImageView(Moon);
	static ImageView coneImg = new ImageView(Cone);
	static ImageView pyramidImg = new ImageView(Pyramid);
	static ImageView rookieImg = new ImageView(Rookie);
	static ImageView celeImg = new ImageView(Cele);
	static ImageView eaisteinImg = new ImageView(eaistein);
	static ImageView restartImg = new ImageView(new Image("Profile/restart.png"));
	static StackPane root;

	static boolean languageChange;
	static boolean nonesense = false;
	public static Sound clickSound = new Sound();

	static int selectValue;
	public static Object cleanup;

	public static void switchToScene1(ActionEvent event, int SelectValue, boolean lanSwap) {
		System.gc();
		languageChange = lanSwap;
		application.Mathematics.MathResult.scV = SelectValue;
		selectValue = SelectValue;
		root = new StackPane();
		root.setStyle("-fx-background-color: #F79630");
		profile();
		elements();
		mathematics();
		logic();
		iq_test();
		achievement();
		lan_change();
		if(Sound.cc) {
			back.setDisable(true);
			lan_button.setDisable(true);
        	math_button.setDisable(true);
        	math_in_button.setDisable(true);
        	lg_button.setDisable(true);
        	lg_in_button.setDisable(true);
        	iq_button.setDisable(true);
        	iq_in_button.setDisable(true);
        	ach_button.setDisable(true);
        	ach_in_button.setDisable(true);
        	profile.setDisable(true);
        	name.setDisable(true);
        	soundButton.setDisable(true);
        	vfxButton.setDisable(true);
			clickSound.playWelcomeSound();
			Sound.Welclip.addLineListener((LineListener) new LineListener() {
                @Override
                public void update(LineEvent event) {
                    if (event.getType() == LineEvent.Type.STOP) {
                        back.setDisable(false);
                        lan_button.setDisable(false);
                    	math_button.setDisable(false);
                    	math_in_button.setDisable(false);
                    	lg_button.setDisable(false);
                    	lg_in_button.setDisable(false);
                    	iq_button.setDisable(false);
                    	iq_in_button.setDisable(false);
                    	ach_button.setDisable(false);
                    	ach_in_button.setDisable(false);
                    	profile.setDisable(false);
                    	name.setDisable(false);
                    	soundButton.setDisable(false);
                    	vfxButton.setDisable(false);
                    }
                }
            });
			Sound.cc = false;
		}
		// Retrieve the stage from the event source
		currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
		scene1 = new Scene(root);
		currentStage.setWidth(currentStage.getWidth());
		currentStage.setHeight(currentStage.getHeight());
		scene1.getStylesheets().add(Category.class.getResource("application.css").toExternalForm());
		currentStage.setScene(scene1);
		currentStage.show();
	}

	private static void back(ActionEvent event) {
		clickSound.playClickSound();
		s = currentStage;
		currentStage.setHeight(s.getHeight());
		currentStage.setWidth(s.getWidth());
		currentStage.setScene(Main.scene);
		currentStage.show();

	}

	static boolean sClick = true;
	static boolean sClickM = true;

	private static void profile() {
		profile = new Button();
		profile.getStyleClass().add("circular-button");
		profile.setPrefSize(125, 125);
		StackPane.setAlignment(profile, Pos.TOP_RIGHT);
		StackPane.setMargin(profile, new Insets(25, 330, 0, 0));
		profile.setOnAction(e -> {

			Stage news = new Stage();
			Profile p = new Profile();
			try {
				clickSound.playClickSound();
				p.start(news, languageChange);
			} catch (Exception a) {

			}
		});
		name = new Button();
		name.getStyleClass().add("name");
		name.setPrefSize(70, 70);
		StackPane.setAlignment(name, Pos.BOTTOM_LEFT);
		StackPane.setMargin(name, new Insets(0, 0, 60, 200));
		name.setGraphic(restartImg);
		name.setOnAction(e -> {
			clickSound.playClickSound();
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Alert");
			alert.setHeaderText("Restart the app\n" + "This process will make you lose all of your progress..");
			alert.setContentText("Are you sure you want to proceed?");

			Optional<ButtonType> result = alert.showAndWait();
			if (result.isPresent() && result.get() == ButtonType.OK) {
				BooleanHolder b = new BooleanHolder();
				b.setInt(66);
				b.pre.putBoolean(b.memory, false);
				b.pre2.putBoolean(b.memory2, false);
				b.pre3.putBoolean(b.memory3, false);
				b.pre4.putBoolean(b.memory4, false);
				b.pre5.putBoolean(b.memory5, false);
				Platform.exit();
			} else {
				alert.close();
			}
		});

		soundButton = new Button();
		soundButton.getStyleClass().add("name");
		if (languageChange) {
			soundButton.setGraphic(soundEImg);
		} else {
			soundButton.setGraphic(soundMImg);
		}

		soundButton.setPrefSize(70, 70);
		StackPane.setAlignment(soundButton, Pos.BOTTOM_LEFT);
		StackPane.setMargin(soundButton, new Insets(0, 0, 60, 300));
		// soundButton.setGraphic(restartImg);
		soundButton.setOnAction(e -> {

			clickSound.playClickSound();

		});

		soundButton.setOnMouseClicked(e -> {

			if (sClick) {
				Sound.Bgclip.stop();
				System.out.println("sa win");
				if (languageChange) {

					soundButton.setGraphic(soundECImg);
				} else {

					soundButton.setGraphic(soundMCImg);
				}
				sClick = false;
			} else {
				clickSound.playBgSound();
				System.out.println("win");
				if (languageChange) {
					soundButton.setGraphic(soundEImg);
				} else {
					soundButton.setGraphic(soundMImg);
				}
				sClick = true;
			}
		});

		vfxButton = new Button();
		vfxButton.getStyleClass().add("name");
		if (languageChange) {
			vfxButton.setGraphic(vfxEImg);
		} else {
			vfxButton.setGraphic(vfxMImg);
		}

		vfxButton.setPrefSize(70, 70);
		StackPane.setAlignment(vfxButton, Pos.BOTTOM_LEFT);
		StackPane.setMargin(vfxButton, new Insets(0, 0, 60, 400));
		// vfxButton.setGraphic(restartImg);
		vfxButton.setOnAction(e -> {

			clickSound.playClickSound();

		});

		vfxButton.setOnMouseClicked(e -> {

			if (sClickM) {
				Sound.check = false;
				System.out.println("sa win");
				if (languageChange) {

					vfxButton.setGraphic(vfxECImg);
				} else {

					vfxButton.setGraphic(vfxMCImg);
				}
				sClickM = false;
			} else {
				Sound.check = true;
				System.out.println("win");
				if (languageChange) {
					vfxButton.setGraphic(vfxEImg);
				} else {
					vfxButton.setGraphic(vfxMImg);
				}
				sClickM = true;
			}
		});

		rookieImg = new ImageView(Rookie);
		rookieImg.setFitWidth(55);
		rookieImg.setFitHeight(77);

		eaisteinImg.setFitHeight(73);
		eaisteinImg.setFitWidth(61);

		ideaImg.setFitWidth(63);
		ideaImg.setFitHeight(72);
		fireImg.setFitWidth(53);
		fireImg.setFitHeight(59);
		koalaImg.setFitWidth(68);
		koalaImg.setFitHeight(65);

		BooleanHolder b = new BooleanHolder();
		switch (b.getInt()) {
		case 0:
			profile.setGraphic(rookieImg);
			break;
		case 66:
			profile.setGraphic(rookieImg);
			break;
		case 73:
			profile.setGraphic(eaisteinImg);
			profile.setStyle("-fx-background-color:" + "#EFE400");
			break;
		case 72:
			profile.setGraphic(ideaImg);
			break;
		case 59:
			profile.setGraphic(fireImg);
			break;
		case 64:
			profile.setGraphic(supBoyImg);
			break;
		case 65:
			profile.setGraphic(koalaImg);
			break;
		default:
			System.out.println("no error");
		}
		root.getChildren().addAll(name, profile, soundButton, vfxButton);
	}

	private static void elements() {
		back = new Button();
		back.getStyleClass().add("lets_start");
		back.setPrefSize(60, 60);
		back.setOnAction(a -> back(a));

		backArrow.setFitWidth(40);
		backArrow.setFitHeight(30);
		back.setGraphic(backArrow);
		StackPane.setAlignment(back, Pos.TOP_LEFT);
		StackPane.setMargin(back, new Insets(30, 0, 0, 30));// top right bottom left

		lan_button = new Button();
		lan_button.setPrefSize(78, 39);
		lan_button.getStyleClass().add("lets_start");
		lan_button.setOnAction(e -> lan_click());
		StackPane.setAlignment(lan_button, Pos.TOP_LEFT);
		StackPane.setMargin(lan_button, new Insets(100, 0, 0, 210));

		flat.setFitWidth(128);
		flat.setFitHeight(30);
		StackPane.setAlignment(flat, Pos.BOTTOM_LEFT);
		StackPane.setMargin(flat, new Insets(0, 0, 125, 25));
		TranslateTransition tt0 = new TranslateTransition();
		tt0.setFromY(0);
		tt0.setByY(-50);
		tt0.setCycleCount(TranslateTransition.INDEFINITE);
		tt0.setAutoReverse(true);
		tt0.setNode(flat);
		tt0.setDuration(Duration.seconds(10));

		boyStand.setFitWidth(102);
		boyStand.setFitHeight(211);
		StackPane.setAlignment(boyStand, Pos.BOTTOM_LEFT);
		StackPane.setMargin(boyStand, new Insets(0, 0, 140, 35));
		TranslateTransition tt = new TranslateTransition();
		tt.setFromY(0);
		tt.setByY(-50);
		tt.setCycleCount(TranslateTransition.INDEFINITE);
		tt.setAutoReverse(true);
		tt.setNode(boyStand);
		tt.setDuration(Duration.seconds(10));

		girlStand.setFitWidth(111);
		girlStand.setFitHeight(211);
		StackPane.setAlignment(girlStand, Pos.CENTER_RIGHT);
		StackPane.setMargin(girlStand, new Insets(0, 25, 0, 0));
		TranslateTransition tt1 = new TranslateTransition();
		tt1.setFromY(0);
		tt1.setByY(50);
		tt1.setCycleCount(TranslateTransition.INDEFINITE);
		tt1.setAutoReverse(true);
		tt1.setNode(girlStand);
		tt1.setDuration(Duration.seconds(10));

		gBoard.setFitWidth(490);
		gBoard.setFitHeight(370);
		StackPane.setAlignment(gBoard, Pos.CENTER);
		StackPane.setMargin(gBoard, new Insets(0, 450, 0, 0));

		moonImg.setFitWidth(128);
		moonImg.setFitHeight(116);
		StackPane.setAlignment(moonImg, Pos.CENTER_LEFT);
		StackPane.setMargin(moonImg, new Insets(0, 0, 200, 50));
		RotateTransition rotateMoon = new RotateTransition();
		rotateMoon.setByAngle(-360);
		rotateMoon.setDuration(Duration.seconds(20));
		rotateMoon.setCycleCount(RotateTransition.INDEFINITE);
		rotateMoon.setAutoReverse(false);
		rotateMoon.setNode(moonImg);

		coneImg.setFitWidth(77);
		coneImg.setFitHeight(81);
		StackPane.setAlignment(coneImg, Pos.TOP_RIGHT);
		StackPane.setMargin(coneImg, new Insets(50, 50, 0, 0));
		RotateTransition rotateCone = new RotateTransition();
		rotateCone.setByAngle(360);
		rotateCone.setDuration(Duration.seconds(20));
		rotateCone.setCycleCount(RotateTransition.INDEFINITE);
		rotateCone.setAutoReverse(false);
		rotateCone.setNode(coneImg);
		ScaleTransition stc = new ScaleTransition();
		stc.setToX(1.5);
		stc.setToY(1.5);
		stc.setAutoReverse(true);
		stc.setCycleCount(ScaleTransition.INDEFINITE);
		stc.setDuration(Duration.seconds(5));
		stc.setNode(coneImg);

		pyramidImg.setFitWidth(92);
		pyramidImg.setFitHeight(65);
		StackPane.setAlignment(pyramidImg, Pos.BOTTOM_RIGHT);
		StackPane.setMargin(pyramidImg, new Insets(0, 25, 25, 0));
		RotateTransition rotatePyramid = new RotateTransition();
		rotatePyramid.setByAngle(360);
		rotatePyramid.setDuration(Duration.seconds(20));
		rotatePyramid.setCycleCount(RotateTransition.INDEFINITE);
		rotatePyramid.setAutoReverse(false);
		rotatePyramid.setNode(pyramidImg);

		celeImg = new ImageView(Cele);
		celeImg.setFitWidth(338);
		celeImg.setFitHeight(142);
		StackPane.setAlignment(celeImg, Pos.TOP_CENTER);
		StackPane.setMargin(celeImg, new Insets(0, 180, 0, 0));
		Rotate rt = new Rotate(-5);
		celeImg.getTransforms().add(rt);

		ParallelTransition parallelTransition = new ParallelTransition();
		parallelTransition.getChildren().addAll(rotateMoon, stc, rotateCone, rotatePyramid, tt, tt0, tt1);
		parallelTransition.play();

		root.getChildren().addAll(celeImg, lan_button, back, flat, boyStand, girlStand, gBoard, moonImg, coneImg,
				pyramidImg);
	}

	static void lan_click() {
		clickSound.playClickSound();
		languageChange = !languageChange;
		lan_change();
	}

	private static void mathematics() {
		math_in_button = new Button();
		math_in_button.setPrefSize(410, 65);
		math_in_button.getStyleClass().add("category_in_button");

		math_button = new Button();
		math_button.setPrefSize(470, 105);
		math_button.getStyleClass().add("category_button");
		math_button.setGraphic(math_in_button);
		math_button.setOnMouseEntered(e -> {
			math_in_button.setStyle("-fx-background-color: WHITE;");
			if (languageChange) {
				Math.setFill(Color.BLACK);
			} else {
				m_MathB = new ImageView(M_MathB);
				m_MathB.setFitWidth(145);
				m_MathB.setFitHeight(40);
				math_in_button.setGraphic(m_MathB);
			}
		});
		math_button.setOnMouseExited(e -> {
			math_in_button.setStyle("-fx-background-color: BLACK;");
			if (languageChange) {
				Math.setFill(Color.WHITE);
			} else {
				math_in_button.setGraphic(m_Math);
			}
		});
		StackPane.setAlignment(math_button, Pos.CENTER_RIGHT);
		StackPane.setMargin(math_button, new Insets(0, 150, 300, 0));

		math_button.setOnAction(event -> {
			clickSound.playClickSound();
			Difficulty d = new Difficulty();
			d.switchToDifficulty(event, languageChange, root, true, selectValue);
			application.Mathematics.MathResult.modeFilter(true);
			root.getChildren().clear();
		});
		root.getChildren().addAll(math_button);
	}

	private static void logic() {
		lg_in_button = new Button();
		lg_in_button.setPrefSize(410, 65);
		lg_in_button.getStyleClass().add("category_in_button");

		lg_button = new Button();
		lg_button.setPrefSize(470, 105);
		lg_button.getStyleClass().add("category_button");
		lg_button.setGraphic(lg_in_button);
		lg_button.setOnMouseEntered(e -> {
			lg_in_button.setStyle("-fx-background-color: WHITE;");
			if (languageChange) {
				Logic.setFill(Color.BLACK);
			} else {
				m_LogicB = new ImageView(M_LogicB);
				m_LogicB.setFitWidth(115);
				m_LogicB.setFitHeight(45);
				lg_in_button.setGraphic(m_LogicB);
			}
		});
		lg_button.setOnMouseExited(e -> {
			lg_in_button.setStyle("-fx-background-color: BLACK;");
			if (languageChange) {
				Logic.setFill(Color.WHITE);
			} else {
				lg_in_button.setGraphic(m_Logic);
			}
		});
		StackPane.setAlignment(lg_button, Pos.CENTER_RIGHT);
		StackPane.setMargin(lg_button, new Insets(0, 150, 25, 0));

		lg_button.setOnAction(event -> {
			clickSound.playClickSound();
			Difficulty d = new Difficulty();
			d.switchToDifficulty(event, languageChange, root, false, selectValue);
			root.getChildren().clear();
			application.Mathematics.MathResult.modeFilter(false);
		});

		root.getChildren().addAll(lg_button);
	}

	private static void iq_test() {
		iq_in_button = new Button();
		iq_in_button.setPrefSize(410, 65);
		iq_in_button.getStyleClass().add("category_in_button");

		iq_button = new Button();
		iq_button.setPrefSize(470, 105);
		iq_button.getStyleClass().add("category_button");
		iq_button.setGraphic(iq_in_button);
		iq_button.setOnMouseEntered(e -> {
			iq_in_button.setStyle("-fx-background-color: WHITE;");
			if (languageChange) {
				IQ.setFill(Color.BLACK);
			} else {
				m_IQB = new ImageView(M_IQB);
				m_IQB.setFitWidth(210);
				m_IQB.setFitHeight(60);
				iq_in_button.setGraphic(m_IQB);
			}
		});
		iq_button.setOnMouseExited(e -> {
			iq_in_button.setStyle("-fx-background-color: BLACK;");
			if (languageChange) {
				IQ.setFill(Color.WHITE);
			} else {
				iq_in_button.setGraphic(m_IQ);
			}
		});
		StackPane.setAlignment(iq_button, Pos.CENTER_RIGHT);
		StackPane.setMargin(iq_button, new Insets(0, 150, -250, 0));
		iq_button.setOnAction(event -> {
			clickSound.playClickSound();
			IqQuestions.switchToIqQuestions(event, languageChange, root);
		});

		root.getChildren().addAll(iq_button);
	}

	private static void achievement() {
		ach_in_button = new Button();
		ach_in_button.setPrefSize(410, 65);
		ach_in_button.getStyleClass().add("category_in_button");

		ach_button = new Button();
		ach_button.setPrefSize(470, 105);
		ach_button.getStyleClass().add("category_button");
		ach_button.setGraphic(ach_in_button);
		ach_button.setOnMouseEntered(e -> {
			ach_in_button.setStyle("-fx-background-color: WHITE;");
			if (languageChange) {
				Ach.setFill(Color.BLACK);
			} else {
				m_AchB = new ImageView(M_AchB);
				m_AchB.setFitWidth(120);
				m_AchB.setFitHeight(55);
				ach_in_button.setGraphic(m_AchB);
			}
		});
		ach_button.setOnMouseExited(e -> {
			ach_in_button.setStyle("-fx-background-color: BLACK;");
			if (languageChange) {
				Ach.setFill(Color.WHITE);
			} else {
				ach_in_button.setGraphic(m_Ach);
			}
		});
		ach_button.setOnAction(e -> {
			clickSound.playClickSound();
			Stage news = new Stage();
			AchievementController ac = new AchievementController();
			try {
				ac.start(news, languageChange);
			} catch (Exception a) {

			}
		});
		StackPane.setAlignment(ach_button, Pos.CENTER_RIGHT);
		StackPane.setMargin(ach_button, new Insets(0, 150, -525, 0));

		root.getChildren().addAll(ach_button);
	}

	private static void lan_change() {
		if (languageChange) {
			langText.setVisible(false);
			catTextM.setVisible(false);
			m_Math.setVisible(false);
			m_Logic.setVisible(false);
			m_IQ.setVisible(false);
			m_Ach.setVisible(false);

			if (sClick) {
				soundButton.setGraphic(soundEImg);
			} else {
				soundButton.setGraphic(soundECImg);
			}
			if (sClickM) {
				vfxButton.setGraphic(vfxEImg);
			} else {
				vfxButton.setGraphic(vfxECImg);
			}

			Lan = new Text("Language:");
			Font lan_font = Font.loadFont(Category.class.getResourceAsStream("/PoppinB.ttf"), 20);
			Lan.setFont(lan_font);
			Lan.setFill(Color.WHITE);
			StackPane.setAlignment(Lan, Pos.TOP_LEFT);
			StackPane.setMargin(Lan, new Insets(105, 0, 0, 90));

			English = new Text("ENG");
			Font English_font = Font.loadFont(Category.class.getResourceAsStream("/PoppinB.ttf"), 20);
			English.setFont(English_font);
			English.setFill(Color.WHITE);
			lan_button.setGraphic(English);

			Math = new Text("MATHEMATICS");
			Font Mathematics_font = Font.loadFont(Category.class.getResourceAsStream("/Poppin.ttf"), 23);
			Math.setFont(Mathematics_font);
			Math.setFill(Color.WHITE);
			math_in_button.setGraphic(Math);

			Logic = new Text("LOGIC");
			Logic.setFont(Mathematics_font);
			Logic.setFill(Color.WHITE);
			lg_in_button.setGraphic(Logic);

			IQ = new Text("IQ");
			IQ.setFont(Mathematics_font);
			IQ.setFill(Color.WHITE);
			iq_in_button.setGraphic(IQ);

			Ach = new Text("ACHIEVEMENT");
			Ach.setFont(Mathematics_font);
			Ach.setFill(Color.WHITE);
			ach_in_button.setGraphic(Ach);

			catText = new ImageView(CatText);
			catText.setFitWidth(366);
			catText.setFitHeight(271);
			StackPane.setAlignment(catText, Pos.CENTER);
			StackPane.setMargin(catText, new Insets(0, 450, 0, 0));

			root.getChildren().addAll(Lan, catText);
			nonesense = true;
		} else {
			if (nonesense == true) {
				Lan.setVisible(false);
				Math.setVisible(false);
				Logic.setVisible(false);
				IQ.setVisible(false);
				Ach.setVisible(false);
				catText.setVisible(false);
			}
			if (sClick) {
				soundButton.setGraphic(soundMImg);
			} else {
				soundButton.setGraphic(soundMCImg);
			}
			if (sClickM) {
				vfxButton.setGraphic(vfxMImg);
			} else {
				vfxButton.setGraphic(vfxMCImg);
			}

			langText = new ImageView(Lang);
			langText.setFitWidth(130);
			langText.setFitHeight(20);
			StackPane.setAlignment(langText, Pos.TOP_LEFT);
			StackPane.setMargin(langText, new Insets(110, 0, 0, 70));

			Myanmar = new Text("Myan");
			Font English_font = Font.loadFont(Category.class.getResourceAsStream("/PoppinB.ttf"), 20);
			Myanmar.setFont(English_font);
			Myanmar.setFill(Color.WHITE);
			lan_button.setGraphic(Myanmar);

			catTextM = new ImageView(CatTextM);
			catTextM.setFitWidth(335);
			catTextM.setFitHeight(290);
			StackPane.setAlignment(catTextM, Pos.CENTER);
			StackPane.setMargin(catTextM, new Insets(0, 450, 0, 0));

			m_Math = new ImageView(M_Math);
			m_Math.setFitWidth(145);
			m_Math.setFitHeight(40);
			math_in_button.setGraphic(m_Math);

			m_Logic = new ImageView(M_Logic);
			m_Logic.setFitWidth(115);
			m_Logic.setFitHeight(45);
			lg_in_button.setGraphic(m_Logic);

			m_IQ = new ImageView(M_IQ);
			m_IQ.setFitWidth(210);
			m_IQ.setFitHeight(60);
			iq_in_button.setGraphic(m_IQ);

			m_Ach = new ImageView(M_Ach);
			m_Ach.setFitWidth(120);
			m_Ach.setFitHeight(55);
			ach_in_button.setGraphic(m_Ach);

			root.getChildren().addAll(langText, catTextM);
		}
	}
}
