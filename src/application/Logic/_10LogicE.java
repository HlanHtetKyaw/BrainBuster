package application.Logic;

import application.Mathematics._0CommonEz;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _10LogicE extends Application {
	_0CommonLogicEz c = new _0CommonLogicEz();
	public void questions() {
		
		c.setQEng("Logic/LogicQ/_10LogicQ.png");
		c.setQMM("Logic/LogicQ/_10LogicQMM.png");
		c.seta1("Logic/10LogicAns/a1.png");
		c.seta2("Logic/10LogicAns/a2.png");
		c.seta3("Logic/10LogicAns/a3.png");
		c.b1.setOnAction(e->{
			_0CommonLogicDiff.sound.playCorrectSound();
			c.clickCorrect();
		});
		c.b2.setOnAction(e->{
			_0CommonLogicDiff.sound.playWrongSound();
			c.clickWrong();
		});
		c.b3.setOnAction(e->{
			_0CommonLogicDiff.sound.playWrongSound();
			c.clickWrong();
		});
		
	}
	public void start(Stage stage) throws Exception {
		questions();
		c.start(stage);
	}
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		questions();
		c.switchToDifficulty(ea, languageChange, sp);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
