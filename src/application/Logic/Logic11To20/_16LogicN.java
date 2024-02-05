package application.Logic.Logic11To20;

import application.Logic._0CommonLogicDiff;
import application.Logic._0CommonLogicNor;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _16LogicN {
	_0CommonLogicNor c = new _0CommonLogicNor();

	public void questions() {

		c.setQEng("Logic/LogicQ/_16LogicQ.png");
		c.setQMM("Logic/LogicQ/_16LogicQMM.png");
		c.seta1("Logic/16LogicAns/a1.png");
		c.seta2("Logic/16LogicAns/a2.png");
		c.seta3("Logic/16LogicAns/a3.png");
		c.b1.setOnAction(e->{
			_0CommonLogicDiff.sound.playWrongSound();
			c.clickWrong();
		});
		c.b2.setOnAction(e->{
			_0CommonLogicDiff.sound.playWrongSound();
			c.clickWrong();
		});
		c.b3.setOnAction(e->{
			_0CommonLogicDiff.sound.playWrongSound();
			_0CommonLogicDiff.sound.playCorrectSound();
			c.clickCorrect();
		});

	}

	public void switchToDifficulty(ActionEvent ea, boolean languageChange, StackPane sp) {
		questions();
		c.switchToDifficulty(ea, languageChange, sp);
	}
}
