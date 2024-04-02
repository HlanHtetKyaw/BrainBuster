package application.GeoAndHis;
import javafx.stage.*;
import application.Category;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
public class _1GeoAndHisE extends Application{
public void start(Stage stage) throws Exception {
	_0CommonEz c = new _0CommonEz();
	
	//c.setQMM("GeoAndHis/GeoAndHisQ/go01Q.png");
	c.qMMQues.setText("     မြန်မာနိုင်ငံတော်အလံမာ အရောင်ဘယ်နှစ်ရောင် ပါလဲ?");
	c.setA1MM("GeoAndHis/go01Ans/a1.png");
	c.setA2MM("GeoAndHis/go01Ans/a2.png");
	c.setA3MM("GeoAndHis/go01Ans/a3.png");
	c.setA4MM("GeoAndHis/go01Ans/a4.png");
	
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
	
	
	c.start(stage);
}
public void switchToDifficulty(ActionEvent ea,boolean languageChange,StackPane sp) {
	_0CommonEz c = new _0CommonEz();
	
	//c.setQMM("GeoAndHis/GeoAndHisQ/go01Q.png");
		c.qMMQues.setText("     မြန်မာနိုင်ငံတော်အလံမာ အရောင်ဘယ်နှစ်ရောင် ပါလဲ?");
	c.setA1MM("GeoAndHis/go01Ans/a1.png");
	c.setA2MM("GeoAndHis/go01Ans/a2.png");
	c.setA3MM("GeoAndHis/go01Ans/a3.png");
	c.setA4MM("GeoAndHis/go01Ans/a4.png");
	
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
