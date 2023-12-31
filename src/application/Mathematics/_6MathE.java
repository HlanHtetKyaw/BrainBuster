package application.Mathematics;
import javafx.stage.*;
import application.Category;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _6MathE{
	_0CommonEz c = new _0CommonEz();
public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	
	c.setQEng("Math/MathQ/_6MathQ.png");
	
	c.a1Eng = "1/2";
	c.a2Eng = "1";
	c.a3Eng = "1/3";
	c.a4Eng = "1/4";
	
	c.setQMM("Math/MathQ/_6MathQMM.png");
	c.setA1MM("Math/6MathAns/a1.png");
	c.setA2MM("Math/6MathAns/a2.png");
	c.setA3MM("Math/6MathAns/a3.png");
	c.setA4MM("Math/6MathAns/a4.png");

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
