package application.Logic;

import application.Mathematics._0CommonEz;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _6LogicN extends Application {
	_0CommonLogicNor c = new _0CommonLogicNor();
	
	public void start(Stage stage) throws Exception {
		c.setQEng("Logic/LogicQ/_6LogicQ.png");
		c.setQMM("Logic/LogicQ/_6LogicQMM.png");
		c.seta1("Logic/6LogicAns/a1.png");
		c.seta2("Logic/6LogicAns/a2.png");
		c.seta3("Logic/6LogicAns/a3.png");
		c.start(stage);
	}
	public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
		c.setQEng("Logic/LogicQ/_6LogicQ.png");
		c.setQMM("Logic/LogicQ/_6LogicQMM.png");
		c.seta1("Logic/6LogicAns/a1.png");
		c.seta2("Logic/6LogicAns/a2.png");
		c.seta3("Logic/6LogicAns/a3.png");
		c.switchToDifficulty(ea, languageChange, sp);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
