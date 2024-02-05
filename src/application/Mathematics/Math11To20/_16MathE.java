package application.Mathematics.Math11To20;

import application.Category;
import application.Mathematics._0CommonEz;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class _16MathE {
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		_0CommonEz c = new _0CommonEz();


		c.setQEng("Math/MathQ/_16MathQ.png");
		c.a1Eng = "8";
		c.a2Eng = "7";
		c.a3Eng = "6";
		c.a4Eng = "5";
		
		c.setQMM("Math/MathQ/_16MathQMM.png");
		c.setA1MM("Math/16MathAns/a1.png");
		c.setA2MM("Math/16MathAns/a2.png");
		c.setA3MM("Math/16MathAns/a3.png");
		c.setA4MM("Math/16MathAns/a4.png");
		
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
