package application.MathematicsAdult.Math11To20;

import application.Category;
import application.Mathematics._0CommonNor;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _11MathN {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonNor c = new _0CommonNor();

		c.setQEng("Math/MathQ/_11MathQA.png");
		c.a1Eng = "180km";
		c.a2Eng = "20km";
		c.a3Eng = "170km";
		c.a4Eng = "10km";
		
		c.setQMM("Math/MathQ/_11MathQMMA.png");
		c.setA1MM("Math/11MathAnsAdult/a1.png");
		c.setA2MM("Math/11MathAnsAdult/a2.png");
		c.setA3MM("Math/11MathAnsAdult/a3.png");
		c.setA4MM("Math/11MathAnsAdult/a4.png");
		
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
