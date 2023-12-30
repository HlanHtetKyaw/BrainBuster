package application.LogicAdult;

import application.Logic._0CommonLogicEz;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _10LogicE extends Application {
	_0CommonLogicEz c = new _0CommonLogicEz();
	public void questions() {
		
		c.setQEng("Logic/LogicQ/_10LogicQA.png");
		c.setQMM("Logic/LogicQ/_10LogicQMMA.png");
		c.seta1("Logic/10LogicAnsA/a1.png");
		c.seta2("Logic/10LogicAnsA/a2.png");
		c.seta3("Logic/10LogicAnsA/a3.png");
		c.b1.setOnAction(e->{
			c.clickCorrect();
		});
		c.b2.setOnAction(e->{
			c.clickWrong();
		});
		c.b3.setOnAction(e->{
			c.clickWrong();
		});
		
	}
	public void start(Stage stage) throws Exception {
		questions();
		c.start(stage);
	}
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		questions();
		c.switchToDifficulty(ea, languageChange, sp);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
