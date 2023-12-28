package application.Mathematics;
import java.awt.*;
import java.awt.event.*;


public class test{
	public static void main(String[] args) throws AWTException {
		Robot robot = new Robot();
		robot.delay(5000);
		for(int i=1;i<=999;i++) {
			keyPress(robot,"gay with gway");
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(1000);
		}
		
	}
	public static void keyPress(Robot robot,String t) {
		for(int i=0;i<t.length();i++) {
			char c = t.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
			}else {
				switch(c) {
				case ',':robot.keyPress(KeyEvent.VK_COMMA);
					break;
				case ' ':robot.keyPress(KeyEvent.VK_SPACE);
					break;
				}
			}
		}
	}
}