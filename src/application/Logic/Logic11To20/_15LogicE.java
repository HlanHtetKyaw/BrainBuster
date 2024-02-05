package application.Logic.Logic11To20;

import application.Logic._0CommonLogicDiff;
import application.Logic._0CommonLogicEz;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _15LogicE {
	_0CommonLogicEz c = new _0CommonLogicEz();
	public void questions() {
		
		c.setQEng("Logic/LogicQ/_15LogicQ.png");
		c.setQMM("Logic/LogicQ/_15LogicQMM.png");
		c.seta1("Logic/15LogicAns/a1.png");
		c.seta2("Logic/15LogicAns/a2.png");
		c.seta3("Logic/15LogicAns/a3.png");
		c.b1.setOnAction(e->{
			_0CommonLogicDiff.sound.playWrongSound();
			c.clickWrong();
		});
		c.b2.setOnAction(e->{
			_0CommonLogicDiff.sound.playCorrectSound();
			c.clickCorrect();
		});
		c.b3.setOnAction(e->{
			_0CommonLogicDiff.sound.playWrongSound();
			c.clickWrong();
		});
		
	}
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		questions();
		c.switchToDifficulty(ea, languageChange, sp);
	}
}
