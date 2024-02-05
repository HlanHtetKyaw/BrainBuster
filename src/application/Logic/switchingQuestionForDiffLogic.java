package application.Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import application.Logic.Logic11To20.*;
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
	static _11LogicD elevenLogic = new _11LogicD();
	static _12LogicD twelveLogic = new _12LogicD();
	static _13LogicD thirteenLogic = new _13LogicD();
	static _14LogicD fourteenLogic = new _14LogicD();
	static _15LogicD fifthteenLogic = new _15LogicD();
	static _16LogicD sixteenLogic = new _16LogicD();
	static _17LogicD seventeenLogic = new _17LogicD();
	static _18LogicD eighteenLogic = new _18LogicD();
	static _19LogicD ninteenLogic = new _19LogicD();
	static _20LogicD twentyLogic = new _20LogicD();

	static int NOQ = 20;
	static Random random = new Random();
	static int point = -1;
	public static List<Integer> check = new ArrayList<>();
	public static boolean checker = true;

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
			case 11:
				elevenLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 12:
				twelveLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 13:
				thirteenLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 14:
				fourteenLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 15:
				fifthteenLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 16:
				sixteenLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 17:
				seventeenLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 18:
				eighteenLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 19:
				ninteenLogic.switchToDifficulty(e, languageChange, proot);
				break;
			case 20:
				twentyLogic.switchToDifficulty(e, languageChange, proot);
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
