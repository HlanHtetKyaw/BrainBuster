package application.Mathematics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import application.Mathematics.Math11To20.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;

public class switchingQuestionForEasyMath {
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
	static _11MathE elevenMath = new _11MathE();
	static _12MathE twelveMath = new _12MathE();
	static _13MathE thirteenMath = new _13MathE();
	static _14MathE fourteenMath = new _14MathE();
	static _15MathE fifthteenMath = new _15MathE();
	static _16MathE sixteenMath = new _16MathE();
	static _17MathE seventeenMath = new _17MathE();
	static _18MathE eighteenMath = new _18MathE();
	static _19MathE ninteenMath = new _19MathE();
	static _20MathE twentyMath = new _20MathE();

	static int NOQ = 20;
	static Random random = new Random();
	static int point = -1;
	static List<Integer> check = new ArrayList<>();
	static boolean checker = true;

	public static void switchToQuestions(ActionEvent e, boolean languageChange, StackPane proot) {
		
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
			
			case 1:
				oneMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 2:
				twoMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 3:
				threeMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 4:
				fourMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 5:
				fiveMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 6:
				sixMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 7:
				sevenMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 8:
				eightMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 9:
				nineMath.switchToDifficulty(e, languageChange, proot);
				break;
			case 10:
				tenMath.switchToDifficulty(e, languageChange, proot);
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
