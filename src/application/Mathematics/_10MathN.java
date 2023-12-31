package application.Mathematics;
import javafx.stage.*;
import application.Category;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _10MathN extends Application{
public void start(Stage stage) throws Exception {
	_0CommonNor c = new _0CommonNor();

	c.setQEng("Math/MathQ/_10MathQ.png");
	c.a1Eng = "5";
	c.a2Eng = "3";
	c.a3Eng = "2";
	c.a4Eng = "1000";
	
	c.setQMM("Math/MathQ/_10MathQMM.png");
	c.setA1MM("Math/10MathAns/a1.png");
	c.setA2MM("Math/10MathAns/a2.png");
	c.setA3MM("Math/10MathAns/a3.png");
	c.setA4MM("Math/10MathAns/a4.png");
	
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

	c.setQEng("Math/MathQ/_10MathQ.png");
	c.a1Eng = "5";
	c.a2Eng = "3";
	c.a3Eng = "2";
	c.a4Eng = "1000";
	
	c.setQMM("Math/MathQ/_10MathQMM.png");
	c.setA1MM("Math/10MathAns/a1.png");
	c.setA2MM("Math/10MathAns/a2.png");
	c.setA3MM("Math/10MathAns/a3.png");
	c.setA4MM("Math/10MathAns/a4.png");
	
	c.b1.setOnAction(e->{
		Category.clickSound.playClickSound();
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
public static void main(String[]args) {
	launch(args);
}
}
