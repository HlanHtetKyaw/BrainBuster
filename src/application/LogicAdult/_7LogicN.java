package application.LogicAdult;

import application.Category;
import application.Logic._0CommonLogicNor;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _7LogicN extends Application {
	_0CommonLogicNor c = new _0CommonLogicNor();
	
	public void start(Stage stage) throws Exception {
		c.setQEng("Logic/LogicQ/_7LogicQA.png");
		c.setQMM("Logic/LogicQ/_7LogicQMMA.png");
		c.seta1("Logic/7LogicAnsA/a1.png");
		c.seta2("Logic/7LogicAnsA/a2.png");
		c.seta3("Logic/7LogicAnsA/a3.png");
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
		
		c.start(stage);
	}
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		c.setQEng("Logic/LogicQ/_7LogicQA.png");
		c.setQMM("Logic/LogicQ/_7LogicQMMA.png");
		c.seta1("Logic/7LogicAnsA/a1.png");
		c.seta2("Logic/7LogicAnsA/a2.png");
		c.seta3("Logic/7LogicAnsA/a3.png");
		c.b1.setOnAction(e->{
			c.clickWrong();
		});
		c.b2.setOnAction(e->{
			c.clickCorrect();
		});
		c.b3.setOnAction(e->{
			c.clickWrong();
		});
		
		c.switchToDifficulty(ea, languageChange, sp);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
