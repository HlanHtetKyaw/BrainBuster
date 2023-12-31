package application.Mathematics;
import application.Category;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _8MathD{
	_0CommonDiff c = new _0CommonDiff();

public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	
	c.setQEng("Math/MathQ/_8MathQ.png");
	c.a1Eng = "16";
	c.a2Eng = "28";
	c.a3Eng = "20";
	c.a4Eng = "24";
	
	c.setQMM("Math/MathQ/_8MathQMM.png");
	c.setA1MM("Math/8MathAns/a1.png");
	c.setA2MM("Math/8MathAns/a2.png");
	c.setA3MM("Math/8MathAns/a3.png");
	c.setA4MM("Math/8MathAns/a4.png");
	
	c.b1.setOnAction(e->{
		Category.clickSound.playWrongSound();
		c.clickWrong();
	});
	c.b2.setOnAction(e->{
		Category.clickSound.playCorrectSound();
		c.clickCorrect();
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
