package application.MathematicsAdult;
import javafx.stage.*;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import application.Mathematics.*;

public class _6MathE{
	_0CommonEz c = new _0CommonEz();
public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	
c.setQEng("Math/MathQ/_6MathQA.png");
	
	c.a1Eng = "8";
	c.a2Eng = "4";
	c.a3Eng = "5";
	c.a4Eng = "9";
	
	c.setQMM("Math/MathQ/_6MathQMMA.png");
	c.setA1MM("Math/6MathAnsAdult/a1.png");
	c.setA2MM("Math/6MathAnsAdult/a2.png");
	c.setA3MM("Math/6MathAnsAdult/a3.png");
	c.setA4MM("Math/6MathAnsAdult/a4.png");
	
	c.b1.setOnAction(e->{
		c.clickCorrect();
	});
	c.b2.setOnAction(e->{
		c.clickWrong();
	});
	c.b3.setOnAction(e->{
		c.clickWrong();
	});
	c.b4.setOnAction(e->{
		c.clickWrong();
	});
	c.switchToDifficulty(ea, languageChange, sp);
}
}