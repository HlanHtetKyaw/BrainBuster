package application.MathematicsAdult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import application.Mathematics.MathResult;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class switchingQuestionForEasyMathA {
	static _1MathE oneMath = new _1MathE();
	static _2MathE twoMath = new _2MathE();
	static _3MathE threeMath = new _3MathE();
	static _4MathE fourMath = new _4MathE();
	static _5MathE fiveMath = new _5MathE();
	static _6MathE sixMath = new _6MathE();
	static _7MathE sevenMath = new _7MathE();
	static _8MathE eightMath = new _8MathE();
	static _9MathE nineMath = new _9MathE();
	static _10MathE tenMath = new _10MathE();
	
	static int NOQ = 10;
	static Random random = new Random();
	static int point = -1;
	public static List<Integer> check = new ArrayList<>();
	public static boolean checker = true;

	public static void switchToQuestions(ActionEvent e, boolean languageChange,StackPane proot) {
		point++;
		if (checker == true) {
			for(int i=1;i<=10;i++) {
				check.add(i);
			}
			// Shuffle the list to get random order
			Collections.shuffle(check);
			checker = false;
		}
		if (point == 5) {
			checker = true;
			point = -1;
			if (conditionToStopLoop()) {
				MathResult mr = new MathResult();
				mr.switchToDifficulty(e, languageChange, proot);
				return;
			}
		}
		try {
			switch (check.get(point)) {
			case 1:oneMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 2:twoMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 3:threeMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 4:fourMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 5:fiveMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 6:sixMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 7:sevenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 8:eightMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 9:nineMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 10:tenMath.switchToDifficulty(e, languageChange, proot);
				break;
			default:
				System.out.println("error generated");
			}
		} catch (Exception ea) {
			ea.printStackTrace();
		}
	}
	public static boolean conditionToStopLoop() {

		return true;
	}
}
