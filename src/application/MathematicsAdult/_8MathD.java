package application.MathematicsAdult;
import javafx.event.ActionEvent;
import application.Mathematics.*;
import javafx.scene.layout.StackPane;
public class _8MathD{
	_0CommonDiff c = new _0CommonDiff();

public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	
	c.setQEng("Math/MathQ/_8MathQA.png");
	c.a1Eng = "10";
	c.a2Eng = "1.5";
	c.a3Eng = "1";
	c.a4Eng = "9";

	c.setQMM("Math/MathQ/_8MathQMMA.png");
	c.setA1MM("Math/8MathAnsAdult/a1.png");
	c.setA2MM("Math/8MathAnsAdult/a2.png");
	c.setA3MM("Math/8MathAnsAdult/a3.png");
	c.setA4MM("Math/8MathAnsAdult/a4.png");

	c.b1.setOnAction(e -> {
		c.clickWrong();
	});
	c.b2.setOnAction(e -> {
		c.clickWrong();
	});
	c.b3.setOnAction(e -> {
		c.clickWrong();
	});
	c.b4.setOnAction(e -> {
		c.clickCorrect();
	});

	c.switchToDifficulty(ea, languageChange, sp);
}
}
