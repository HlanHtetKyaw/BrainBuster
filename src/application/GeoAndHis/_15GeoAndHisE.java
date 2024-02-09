package application.GeoAndHis;
import javafx.stage.*;
import application.Category;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _15GeoAndHisE{
public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	_0CommonEz c = new _0CommonEz();
	
	c.setQMM("GeoAndHis/GeoAndHisQ/go15Q.png");
	c.setA1MM("GeoAndHis/go15Ans/a1.png");
	c.setA2MM("GeoAndHis/go15Ans/a2.png");
	c.setA3MM("GeoAndHis/go15Ans/a3.png");
	c.setA4MM("GeoAndHis/go15Ans/a4.png");
	
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
		c.clickWrong();
	});
	c.b4.setOnAction(e->{
		Category.clickSound.playCorrectSound();
		c.clickCorrect();
	});
	
	
	c.switchToDifficulty(ea, languageChange, sp);
}
}
