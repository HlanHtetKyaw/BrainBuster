package application.Mathematics.Math11To20;

import application.Category;
import application.Mathematics._0CommonDiff;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _18MathD {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonDiff c = new _0CommonDiff();

		c.setQEng("Math/MathQ/_18MathQ.png");
		c.a1Eng = "$8";
		c.a2Eng = "$5";
		c.a3Eng = "$3";
		c.a4Eng = "$10";
		
		c.setQMM("Math/MathQ/_18MathQMM.png");
		c.setA1MM("Math/18MathAns/a1.png");
		c.setA2MM("Math/18MathAns/a2.png");
		c.setA3MM("Math/18MathAns/a3.png");
		c.setA4MM("Math/18MathAns/a4.png");
		
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
