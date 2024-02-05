package application.Mathematics.Math11To20;

import application.Category;
import application.Mathematics._0CommonDiff;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _11MathD {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonDiff c = new _0CommonDiff();

		c.setQEng("Math/MathQ/_10MathQ.png");
		c.a1Eng = "5";
		c.a2Eng = "3";
		c.a3Eng = "2";
		c.a4Eng = "1000";
		
		c.setQMM("Math/MathQ/_10MathQMM.png");
		c.setA1MM("Math/10MathAns/a1.png");
		c.setA2MM("Math/10MathAns/a2.png");
		c.setA3MM("Math/10MathAns/a3.png");
		c.setA4MM("Math/10MathAns/a4.png");
		
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
		c.b4.setOnAction(e->{
			Category.clickSound.playWrongSound();
			c.clickWrong();
		});
		
		
		
		c.switchToDifficulty(ea, languageChange, sp);
	}
}
