package application.MathematicsAdult.Math11To20;

import application.Category;
import application.Mathematics._0CommonEz;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _19MathE {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonEz c = new _0CommonEz();


		c.setQEng("Math/MathQ/_19MathQA.png");
		c.a1Eng = "81";
		c.a2Eng = "49";
		c.a3Eng = "55";
		c.a4Eng = "63";
		
		c.setQMM("Math/MathQ/_19MathQMMA.png");
		c.setA1MM("Math/19MathAnsAdult/a1.png");
		c.setA2MM("Math/19MathAnsAdult/a2.png");
		c.setA3MM("Math/19MathAnsAdult/a3.png");
		c.setA4MM("Math/19MathAnsAdult/a4.png");
		
		c.b1.setOnAction(e->{
			Category.clickSound.playWrongSound();
			c.clickWrong();
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
			Category.clickSound.playCorrectSound();
			c.clickCorrect();
		});
		
		
		c.switchToDifficulty(ea, languageChange, sp);
	}
}
