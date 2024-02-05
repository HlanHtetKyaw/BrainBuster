package application.MathematicsAdult.Math11To20;

import application.Category;
import application.Mathematics._0CommonEz;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _20MathE {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonEz c = new _0CommonEz();


		c.setQEng("Math/MathQ/_20MathQA.png");
		c.a1Eng = "21 and 23";
		c.a2Eng = "22 and 22";
		c.a3Eng = "44 and 00";
		c.a4Eng = "11 and 23";
		
		c.setQMM("Math/MathQ/_20MathQMMA.png");
		c.setA1MM("Math/20MathAnsAdult/a1.png");
		c.setA2MM("Math/20MathAnsAdult/a2.png");
		c.setA3MM("Math/20MathAnsAdult/a3.png");
		c.setA4MM("Math/20MathAnsAdult/a4.png");
		
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
