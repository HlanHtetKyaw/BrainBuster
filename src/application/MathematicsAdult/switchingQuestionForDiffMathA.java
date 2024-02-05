package application.MathematicsAdult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import application.Mathematics.MathResult;
import application.MathematicsAdult.Math11To20.*;
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
	static _11MathD elevenMath = new _11MathD();
	static _12MathD twelveMath = new _12MathD();
	static _13MathD thirteenMath = new _13MathD();
	static _14MathD fourteenMath = new _14MathD();
	static _15MathD fifthteenMath = new _15MathD();
	static _16MathD sixteenMath = new _16MathD();
	static _17MathD seventeenMath = new _17MathD();
	static _18MathD eighteenMath = new _18MathD();
	static _19MathD ninteenMath = new _19MathD();
	static _20MathD twentyMath = new _20MathD();
	
	static int NOQ = 20;
	static Random random = new Random();
	static int point = -1;
	public static List<Integer> check = new ArrayList<>();
	public static boolean checker = true;

	public static void switchToQuestions(ActionEvent e, boolean languageChange,StackPane proot) {
		
		if (checker == true) {
			point = -1;
			for(int i=1;i<=NOQ;i++) {
				if(!check.contains(i)) {
					check.add(i);
				}	
			}
			// Shuffle the list to get random order
			Collections.shuffle(check);
			checker = false;
		}
		point++;
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
			case 11:
				elevenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 12:
				twelveMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 13:
				thirteenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 14:
				fourteenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 15:
				fifthteenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 16:
				sixteenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 17:
				seventeenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 18:
				eighteenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 19:
				ninteenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 20:
				twentyMath.switchToDifficulty(e, languageChange, proot);
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
