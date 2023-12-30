package application.Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import application.Mathematics.*;

public class switchingQuestionForNormalLogic {
	static _1LogicN oneLogic = new _1LogicN();
	static _2LogicN twoLogic = new _2LogicN();
	static _3LogicN threeLogic = new _3LogicN();
	static _4LogicN fourLogic = new _4LogicN();
	static _5LogicN fiveLogic = new _5LogicN();
	static _6LogicN sixLogic = new _6LogicN();
	static _7LogicN sevenLogic = new _7LogicN();
	static _8LogicN eightLogic = new _8LogicN();
	static _9LogicN nineLogic = new _9LogicN();
	static _10LogicN tenLogic = new _10LogicN();

	static int NOQ = 10;
	static Random random = new Random();
	static int point = -1;
	public static List<Integer> check = new ArrayList<>();
	public static boolean checker = true;

	public static void switchToQuestions(ActionEvent e, boolean languageChange, StackPane proot) {
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
			case 1:
				oneLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 2:
				twoLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 3:
				threeLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 4:
				fourLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 5:
				fiveLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 6:
				sixLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 7:
				sevenLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 8:
				eightLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 9:
				nineLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 10:
				tenLogic.switchToDifficulty(e, languageChange, proot);
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
