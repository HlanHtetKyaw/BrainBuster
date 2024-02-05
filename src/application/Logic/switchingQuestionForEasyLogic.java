package application.Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import application.Mathematics.*;
import application.Logic.Logic11To20.*;

public class switchingQuestionForEasyLogic {
	static _1LogicE oneLogic = new _1LogicE();
	static _2LogicE twoLogic = new _2LogicE();
	static _3LogicE threeLogic = new _3LogicE();
	static _4LogicE fourLogic = new _4LogicE();
	static _5LogicE fiveLogic = new _5LogicE();
	static _6LogicE sixLogic = new _6LogicE();
	static _7LogicE sevenLogic = new _7LogicE();
	static _8LogicE eightLogic = new _8LogicE();
	static _9LogicE nineLogic = new _9LogicE();
	static _10LogicE tenLogic = new _10LogicE();
	static _11LogicE elevenLogic = new _11LogicE();
	static _12LogicE twelveLogic = new _12LogicE();
	static _13LogicE thirteenLogic = new _13LogicE();
	static _14LogicE fourteenLogic = new _14LogicE();
	static _15LogicE fifthteenLogic = new _15LogicE();
	static _16LogicE sixteenLogic = new _16LogicE();
	static _17LogicE seventeenLogic = new _17LogicE();
	static _18LogicE eighteenLogic = new _18LogicE();
	static _19LogicE ninteenLogic = new _19LogicE();
	static _20LogicE twentyLogic = new _20LogicE();

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
