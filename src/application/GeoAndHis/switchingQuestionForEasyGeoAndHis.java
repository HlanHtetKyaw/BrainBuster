package application.GeoAndHis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import application.Mathematics.Math11To20.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import application.Mathematics.*;

public class switchingQuestionForEasyGeoAndHis {
	static _1GeoAndHisE oneGeoAndHis = new _1GeoAndHisE();
	static _2GeoAndHisE twoGeoAndHis = new _2GeoAndHisE();
	static _3GeoAndHisE threeGeoAndHis = new _3GeoAndHisE();
	static _4GeoAndHisE fourGeoAndHis = new _4GeoAndHisE();
	static _5GeoAndHisE fiveGeoAndHis = new _5GeoAndHisE();
	static _6GeoAndHisE sixGeoAndHis = new _6GeoAndHisE();
	static _7GeoAndHisE sevenGeoAndHis = new _7GeoAndHisE();
	static _8GeoAndHisE eightGeoAndHis = new _8GeoAndHisE();
	static _9GeoAndHisE nineGeoAndHis = new _9GeoAndHisE();
	static _10GeoAndHisE tenGeoAndHis = new _10GeoAndHisE();
	static _11GeoAndHisE elevenGeoAndHis = new _11GeoAndHisE();
	static _12GeoAndHisE twelveGeoAndHis = new _12GeoAndHisE();
	static _13GeoAndHisE thirteenGeoAndHis = new _13GeoAndHisE();
	static _14GeoAndHisE fourteenGeoAndHis = new _14GeoAndHisE();
	static _15GeoAndHisE fifthteenGeoAndHis = new _15GeoAndHisE();
	static _16GeoAndHisE sixteenGeoAndHis = new _16GeoAndHisE();
	static _17GeoAndHisE seventeenGeoAndHis = new _17GeoAndHisE();
	static _18GeoAndHisE eighteenGeoAndHis = new _18GeoAndHisE();
	static _19GeoAndHisE ninteenGeoAndHis = new _19GeoAndHisE();
	static _20GeoAndHisE twentyGeoAndHis = new _20GeoAndHisE();
	

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
				oneGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 2:
				twoGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 3:
				threeGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 4:
				fourGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 5:
				fiveGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 6:
				sixGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 7:
				sevenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 8:
				eightGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 9:
				nineGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 10:
				tenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 11:
				elevenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 12:
				twelveGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 13:
				thirteenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 14:
				fourteenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 15:
				fifthteenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 16:
				sixteenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 17:
				seventeenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 18:
				eighteenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 19:
				ninteenGeoAndHis.switchToDifficulty(e, languageChange, proot);
				break;
			case 20:
				twentyGeoAndHis.switchToDifficulty(e, languageChange, proot);
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
