package application.GeoAndHis;
import javafx.stage.*;
import application.Category;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _20GeoAndHisN{
public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	_0CommonNor c = new _0CommonNor();
	
	c.setQMM("GeoAndHis/GeoAndHisQ/go20Q.png");
	c.setA1MM("GeoAndHis/go20Ans/a1.png");
	c.setA2MM("GeoAndHis/go20Ans/a2.png");
	c.setA3MM("GeoAndHis/go20Ans/a3.png");
	c.setA4MM("GeoAndHis/go20Ans/a4.png");
	
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
	c.b4.setOnAction(e->{
		Category.clickSound.playWrongSound();
		c.clickWrong();
	});
	
	
	c.switchToDifficulty(ea, languageChange, sp);
}
}
