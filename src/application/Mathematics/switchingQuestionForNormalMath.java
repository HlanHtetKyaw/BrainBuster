package application.Mathematics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import application.Mathematics.Math11To20.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class switchingQuestionForNormalMath {
	static _1MathN oneMath = new _1MathN();
	static _2MathN twoMath = new _2MathN();
	static _3MathN threeMath = new _3MathN();
	static _4MathN fourMath = new _4MathN();
	static _5MathN fiveMath = new _5MathN();
	static _6MathN sixMath = new _6MathN();
	static _7MathN sevenMath = new _7MathN();
	static _8MathN eightMath = new _8MathN();
	static _9MathN nineMath = new _9MathN();
	static _10MathN tenMath = new _10MathN();
	static _11MathN elevenMath = new _11MathN();
	static _12MathN twelveMath = new _12MathN();
	static _13MathN thirteenMath = new _13MathN();
	static _14MathN fourteenMath = new _14MathN();
	static _15MathN fifthteenMath = new _15MathN();
	static _16MathN sixteenMath = new _16MathN();
	static _17MathN seventeenMath = new _17MathN();
	static _18MathN eighteenMath = new _18MathN();
	static _19MathN ninteenMath = new _19MathN();
	static _20MathN twentyMath = new _20MathN();
	
	static int NOQ = 20;
	static Random random = new Random();
	static int point = -1;
	static List<Integer> check = new ArrayList<>();
	static boolean checker = true;

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
