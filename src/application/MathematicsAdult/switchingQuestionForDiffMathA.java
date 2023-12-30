package application.MathematicsAdult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import application.Mathematics.MathResult;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class switchingQuestionForDiffMathA {
	static _1MathD oneMath = new _1MathD();
	static _2MathD twoMath = new _2MathD();
	static _3MathD threeMath = new _3MathD();
	static _4MathD fourMath = new _4MathD();
	static _5MathD fiveMath = new _5MathD();
	static _6MathD sixMath = new _6MathD();
	static _7MathD sevenMath = new _7MathD();
	static _8MathD eightMath = new _8MathD();
	static _9MathD nineMath = new _9MathD();
	static _10MathD tenMath = new _10MathD();
	
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
