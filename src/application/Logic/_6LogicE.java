package application.Logic;

import application.Mathematics._0CommonEz;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _6LogicE extends Application {
	_0CommonLogicEz c = new _0CommonLogicEz();
	
	public void start(Stage stage) throws Exception {
		c.setQEng("Logic/LogicQ/_6LogicQ.png");
		c.setQMM("Logic/LogicQ/_6LogicQMM.png");
		c.seta1("Logic/6LogicAns/a1.png");
		c.seta2("Logic/6LogicAns/a2.png");
		c.seta3("Logic/6LogicAns/a3.png");
		c.b1.setOnAction(e->{
			c.clickCorrect();
		});
		c.b2.setOnAction(e->{
			c.clickWrong();
		});
		c.b3.setOnAction(e->{
			c.clickWrong();
		});
		
		c.start(stage);
	}
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		c.setQEng("Logic/LogicQ/_6LogicQ.png");
		c.setQMM("Logic/LogicQ/_6LogicQMM.png");
		c.seta1("Logic/6LogicAns/a1.png");
		c.seta2("Logic/6LogicAns/a2.png");
		c.seta3("Logic/6LogicAns/a3.png");
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
		c.switchToDifficulty(ea, languageChange, sp);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
