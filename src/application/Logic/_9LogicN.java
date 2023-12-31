package application.Logic;

import application.Mathematics._0CommonEz;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _9LogicN extends Application {
	_0CommonLogicNor c = new _0CommonLogicNor();

	public void questions() {

		c.setQEng("Logic/LogicQ/_9LogicQ.png");
		c.setQMM("Logic/LogicQ/_9LogicQMM.png");
		c.seta1("Logic/9LogicAns/a1.png");
		c.seta2("Logic/9LogicAns/a2.png");
		c.seta3("Logic/9LogicAns/a3.png");
		c.b1.setOnAction(e->{
			_0CommonLogicDiff.sound.playWrongSound();
			c.clickWrong();
		});
		c.b2.setOnAction(e->{
			_0CommonLogicDiff.sound.playWrongSound();
			c.clickWrong();
		});
		c.b3.setOnAction(e->{
			_0CommonLogicDiff.sound.playCorrectSound();
			c.clickCorrect();
		});

	}

	public void start(Stage stage) throws Exception {
		questions();
		c.start(stage);
	}

	public void switchToDifficulty(ActionEvent ea, boolean languageChange, StackPane sp) {
		questions();
		c.switchToDifficulty(ea, languageChange, sp);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
