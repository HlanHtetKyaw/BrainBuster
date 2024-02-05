package application.MathematicsAdult.Math11To20;

import application.Category;
import application.Mathematics._0CommonEz;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _15MathE {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonEz c = new _0CommonEz();


		c.setQEng("Math/MathQ/_15MathQA.png");
		c.a1Eng = "7";
		c.a2Eng = "3";
		c.a3Eng = "4";
		c.a4Eng = "12";
		
		c.setQMM("Math/MathQ/_15MathQMMA.png");
		c.setA1MM("Math/15MathAnsAdult/a1.png");
		c.setA2MM("Math/15MathAnsAdult/a2.png");
		c.setA3MM("Math/15MathAnsAdult/a3.png");
		c.setA4MM("Math/15MathAnsAdult/a4.png");
		
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
