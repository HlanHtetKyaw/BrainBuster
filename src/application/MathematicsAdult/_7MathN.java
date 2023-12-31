package application.MathematicsAdult;
import javafx.stage.*;
import application.Category;
import application.Mathematics.*;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _7MathN extends Application{
public void start(Stage stage) throws Exception {
	_0CommonNor c = new _0CommonNor();
c.setQEng("Math/MathQ/_7MathQA.png");
	
	c.a1Eng = "100";
	c.a2Eng = "99";
	c.a3Eng = "101";
	c.a4Eng = "98";
	
	c.setQMM("Math/MathQ/_7MathQMMA.png");
	c.setA1MM("Math/7MathAnsAdult/a1.png");
	c.setA2MM("Math/7MathAnsAdult/a2.png");
	c.setA3MM("Math/7MathAnsAdult/a3.png");
	c.setA4MM("Math/7MathAnsAdult/a4.png");
	
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
		c.clickCorrect();
	});
	c.b4.setOnAction(e->{
		Category.clickSound.playWrongSound();
		c.clickWrong();
	});
	c.start(stage);
}
public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	_0CommonNor c = new _0CommonNor();
c.setQEng("Math/MathQ/_7MathQA.png");
	
	c.a1Eng = "100";
	c.a2Eng = "99";
	c.a3Eng = "101";
	c.a4Eng = "98";
	
	c.setQMM("Math/MathQ/_7MathQMMA.png");
	c.setA1MM("Math/7MathAnsAdult/a1.png");
	c.setA2MM("Math/7MathAnsAdult/a2.png");
	c.setA3MM("Math/7MathAnsAdult/a3.png");
	c.setA4MM("Math/7MathAnsAdult/a4.png");
	
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
public static void main(String[]args) {
	launch(args);
}
}
