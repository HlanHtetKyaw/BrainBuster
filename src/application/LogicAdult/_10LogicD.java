package application.LogicAdult;

import application.Category;
import application.Logic._0CommonLogicDiff;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _10LogicD extends Application {
	_0CommonLogicDiff c = new _0CommonLogicDiff();

	public void questions() {

		c.setQEng("Logic/LogicQ/_10LogicQA.png");
		c.setQMM("Logic/LogicQ/_10LogicQMMA.png");
		c.seta1("Logic/10LogicAnsA/a1.png");
		c.seta2("Logic/10LogicAnsA/a2.png");
		c.seta3("Logic/10LogicAnsA/a3.png");
		c.b1.setOnAction(e->{
			Category.clickSound.playCorrectSound();
			c.clickCorrect();
		});
		c.b2.setOnAction(e->{
			Category.clickSound.playWrongSound();
			c.clickWrong();
		});
		c.b3.setOnAction(e->{
			Category.clickSound.playWrongSound();
			c.clickWrong();
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
