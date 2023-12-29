package application.MathematicsAdult;
import javafx.stage.*;
import application.Mathematics.*;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _9MathN extends Application{
public void start(Stage stage) throws Exception {
	_0CommonNor c = new _0CommonNor();

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
	
	c.start(stage);
}
public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	_0CommonNor c = new _0CommonNor();

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
public static void main(String[]args) {
	launch(args);
}
}
