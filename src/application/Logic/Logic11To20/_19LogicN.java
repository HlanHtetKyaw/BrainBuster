package application.Logic.Logic11To20;

import application.Logic._0CommonLogicDiff;
import application.Logic._0CommonLogicNor;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _19LogicN {
	_0CommonLogicNor c = new _0CommonLogicNor();

	public void questions() {

		c.setQEng("Logic/LogicQ/_19LogicQ.png");
		c.setQMM("Logic/LogicQ/_19LogicQMM.png");
		c.seta1("Logic/19LogicAns/a1.png");
		c.seta2("Logic/19LogicAns/a2.png");
		c.seta3("Logic/19LogicAns/a3.png");
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

	public void switchToDifficulty(ActionEvent ea, boolean languageChange, StackPane sp) {
		questions();
		c.switchToDifficulty(ea, languageChange, sp);
	}
}
