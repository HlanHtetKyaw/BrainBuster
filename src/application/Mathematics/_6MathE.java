package application.Mathematics;
import javafx.stage.*;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _6MathE extends Application{
public void start(Stage stage) throws Exception {
	_0Common c = new _0Common();
	c.setQEng("Math/MathQ/_6MathQ.png");
	
	c.a1Eng = "1/2";
	c.a2Eng = "1";
	c.a3Eng = "1/3";
	c.a4Eng = "1/4";
	
	c.setA1MM("Math/6MathAns/a1.png");
	c.b1.setOnAction(e->{
		c.clickWrong();
	});
	c.b2.setOnAction(e->{
		c.clickWrong();
	});
	c.b3.setOnAction(e->{
		c.clickWrong();
	});
	c.b4.setOnAction(e->{
		c.clickCorrect();
	});
	
	
	c.start(stage);
}
public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	_0Common c = new _0Common();
	c.setQEng("Math/MathQ/_6MathQ.png");
	
	c.a1Eng = "1/2";
	c.a2Eng = "1";
	c.a3Eng = "1/3";
	c.a4Eng = "1/4";
	
	c.setA1MM("Math/6MathAns/a1.png");
	c.b1.setOnAction(e->{
		c.clickWrong();
	});
	c.b2.setOnAction(e->{
		c.clickWrong();
	});
	c.b3.setOnAction(e->{
		c.clickWrong();
	});
	c.b4.setOnAction(e->{
		c.clickCorrect();
	});
	c.switchToDifficulty(ea, languageChange, sp);
}
public static void main(String[]args) {
	launch(args);
}
}
