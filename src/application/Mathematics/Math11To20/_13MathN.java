package application.Mathematics.Math11To20;

import application.Category;
import application.Mathematics._0CommonNor;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _13MathN {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonNor c = new _0CommonNor();

		c.setQEng("Math/MathQ/_13MathQ.png");
		c.a1Eng = "10";
		c.a2Eng = "11";
		c.a3Eng = "12";
		c.a4Eng = "13";
		
		c.setQMM("Math/MathQ/_13MathQMM.png");
		c.setA1MM("Math/13MathAns/a1.png");
		c.setA2MM("Math/13MathAns/a2.png");
		c.setA3MM("Math/13MathAns/a3.png");
		c.setA4MM("Math/13MathAns/a4.png");
		
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
