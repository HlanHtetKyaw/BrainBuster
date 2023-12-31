package application.MathematicsAdult;
import javafx.event.ActionEvent;
import application.Category;
import application.Mathematics.*;
import javafx.scene.layout.StackPane;
public class _9MathD{
	_0CommonDiff c = new _0CommonDiff();

public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	

	c.setQEng("Math/MathQ/_9MathQA.png");
	c.a1Eng = "-3";
	c.a2Eng = "3";
	c.a3Eng = "-4";
	c.a4Eng = "4";
	
	c.setQMM("Math/MathQ/_9MathQMMA.png");
	c.setA1MM("Math/9MathAnsAdult/a1.png");
	c.setA2MM("Math/9MathAnsAdult/a2.png");
	c.setA3MM("Math/9MathAnsAdult/a3.png");
	c.setA4MM("Math/9MathAnsAdult/a4.png");
	
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
