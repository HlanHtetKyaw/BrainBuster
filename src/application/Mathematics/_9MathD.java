package application.Mathematics;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _9MathD{
	_0CommonDiff c = new _0CommonDiff();

public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	
	c.setQEng("Math/MathQ/_9MathQ.png");
	c.a1Eng = "34";
	c.a2Eng = "43";
	c.a3Eng = "0";
	c.a4Eng = "44";
	
	c.setQMM("Math/MathQ/_9MathQMM.png");
	c.setA1MM("Math/9MathAns/a1.png");
	c.setA2MM("Math/9MathAns/a2.png");
	c.setA3MM("Math/9MathAns/a3.png");
	c.setA4MM("Math/9MathAns/a4.png");
	
	c.b1.setOnAction(e->{
		c.clickWrong();
	});
	c.b2.setOnAction(e->{
		c.clickWrong();
	});
	c.b3.setOnAction(e->{
		c.clickCorrect();
	});
	c.b4.setOnAction(e->{
		c.clickWrong();
	});
	
	
	c.switchToDifficulty(ea, languageChange, sp);
}
}