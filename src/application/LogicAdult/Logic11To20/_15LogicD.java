package application.LogicAdult.Logic11To20;

import application.Logic._0CommonLogicDiff;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _15LogicD {
	_0CommonLogicDiff c = new _0CommonLogicDiff();

	public void questions() {

		c.setQEng("Logic/LogicQ/_15LogicQA.png");
		c.setQMM("Logic/LogicQ/_15LogicQMMA.png");
		c.seta1("Logic/15LogicAnsA/a1.png");
		c.seta2("Logic/15LogicAnsA/a2.png");
		c.seta3("Logic/15LogicAnsA/a3.png");
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


	public void switchToDifficulty(ActionEvent ea, boolean languageChange, StackPane sp) {
		questions();
		c.switchToDifficulty(ea, languageChange, sp);
	}

}
