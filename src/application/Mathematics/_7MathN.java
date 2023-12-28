package application.Mathematics;
import javafx.stage.*;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _7MathN extends Application{
public void start(Stage stage) throws Exception {
	_0CommonNor c = new _0CommonNor();
	c.setQEng("Math/MathQ/_7MathQ.png");
	c.a1Eng = "A pound of feather";
	c.a2Eng = "A pound of rocks";
	c.a3Eng = "A pound of water";
	c.a4Eng = "None";
	
	c.setQMM("Math/MathQ/_7MathQMM.png");
	c.setA1MM("Math/7MathAns/a1.png");
	c.setA2MM("Math/7MathAns/a2.png");
	c.setA3MM("Math/7MathAns/a3.png");
	c.setA4MM("Math/7MathAns/a4.png");
	
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
	_0CommonNor c = new _0CommonNor();
	c.setQEng("Math/MathQ/_7MathQ.png");
	c.a1Eng = "A pound of feather";
	c.a2Eng = "A pound of rocks";
	c.a3Eng = "A pound of water";
	c.a4Eng = "None";
	
	c.setQMM("Math/MathQ/_7MathQMM.png");
	c.setA1MM("Math/7MathAns/a1.png");
	c.setA2MM("Math/7MathAns/a2.png");
	c.setA3MM("Math/7MathAns/a3.png");
	c.setA4MM("Math/7MathAns/a4.png");
	
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
