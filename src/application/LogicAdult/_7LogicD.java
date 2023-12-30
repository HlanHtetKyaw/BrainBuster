package application.LogicAdult;

import application.Logic._0CommonLogicDiff;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _7LogicD extends Application {
	_0CommonLogicDiff c = new _0CommonLogicDiff();
	
	public void start(Stage stage) throws Exception {
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
