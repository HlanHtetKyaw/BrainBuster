package application.MathematicsAdult.Math11To20;

import application.Category;
import application.Mathematics._0CommonDiff;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _15MathD {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonDiff c = new _0CommonDiff();

		c.setQEng("Math/MathQ/_15MathQA.png");
		c.a1Eng = "27";
		c.a2Eng = "17";
		c.a3Eng = "25";
		c.a4Eng = "77";
		
		c.setQMM("Math/MathQ/_15MathQMMA.png");
		c.setA1MM("Math/15MathAnsAdult/a1.png");
		c.setA2MM("Math/15MathAnsAdult/a2.png");
		c.setA3MM("Math/15MathAnsAdult/a3.png");
		c.setA4MM("Math/15MathAnsAdult/a4.png");
		
		c.b1.setOnAction(e->{
			Category.clickSound.playWrongSound();
			c.clickWrong();
		});
		c.b2.setOnAction(e->{
			Category.clickSound.playWrongSound();
			c.clickWrong();
		});
		c.b3.setOnAction(e->{
			Category.clickSound.playCorrectSound();
			c.clickCorrect();
		});
		c.b4.setOnAction(e->{
			Category.clickSound.playWrongSound();
			c.clickWrong();
		});
		
		
		
		c.switchToDifficulty(ea, languageChange, sp);
	}
}
