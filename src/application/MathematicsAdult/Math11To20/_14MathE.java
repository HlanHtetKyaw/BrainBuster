package application.MathematicsAdult.Math11To20;

import application.Category;
import application.Mathematics._0CommonEz;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _14MathE {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonEz c = new _0CommonEz();


		c.setQEng("Math/MathQ/_14MathQA.png");
		c.a1Eng = "27";
		c.a2Eng = "17";
		c.a3Eng = "25";
		c.a4Eng = "77";
		
		c.setQMM("Math/MathQ/_14MathQMMA.png");
		c.setA1MM("Math/14MathAnsAdult/a1.png");
		c.setA2MM("Math/14MathAnsAdult/a2.png");
		c.setA3MM("Math/14MathAnsAdult/a3.png");
		c.setA4MM("Math/14MathAnsAdult/a4.png");
		
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
