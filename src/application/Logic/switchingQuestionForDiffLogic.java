package application.Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import application.Mathematics.*;

public class switchingQuestionForDiffLogic {
	static _1LogicD oneLogic = new _1LogicD();
	static _2LogicD twoLogic = new _2LogicD();
	static _3LogicD threeLogic = new _3LogicD();
	static _4LogicD fourLogic = new _4LogicD();
	static _5LogicD fiveLogic = new _5LogicD();
	static _6LogicD sixLogic = new _6LogicD();
	static _7LogicD sevenLogic = new _7LogicD();
	static _8LogicD eightLogic = new _8LogicD();
	static _9LogicD nineLogic = new _9LogicD();
	static _10LogicD tenLogic = new _10LogicD();

	static int NOQ = 10;
	static Random random = new Random();
	static int point = -1;
	public static List<Integer> check = new ArrayList<>();
	public static boolean checker = true;

	public static void switchToQuestions(ActionEvent e, boolean languageChange, StackPane proot) {
		point++;
		if (checker == true) {
			for(int i=1;i<=10;i++) {
				if(!check.contains(i)) {
					check.add(i);
				}	
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
