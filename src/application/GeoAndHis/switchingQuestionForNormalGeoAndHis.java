package application.GeoAndHis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import application.Mathematics.Math11To20.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import application.Mathematics.*;

public class switchingQuestionForNormalGeoAndHis {
	static _1GeoAndHisN oneGeoAndHis = new _1GeoAndHisN();
	static _2GeoAndHisN twoGeoAndHis = new _2GeoAndHisN();
	static _3GeoAndHisN threeGeoAndHis = new _3GeoAndHisN();
	static _4GeoAndHisN fourGeoAndHis = new _4GeoAndHisN();
	static _5GeoAndHisN fiveGeoAndHis = new _5GeoAndHisN();
	static _6GeoAndHisN sixGeoAndHis = new _6GeoAndHisN();
	static _7GeoAndHisN sevenGeoAndHis = new _7GeoAndHisN();
	static _8GeoAndHisN eightGeoAndHis = new _8GeoAndHisN();
	static _9GeoAndHisN nineGeoAndHis = new _9GeoAndHisN();
	static _10GeoAndHisN tenGeoAndHis = new _10GeoAndHisN();
	static _11GeoAndHisN elevenGeoAndHis = new _11GeoAndHisN();
	static _12GeoAndHisN twelveGeoAndHis = new _12GeoAndHisN();
	static _13GeoAndHisN thirteenGeoAndHis = new _13GeoAndHisN();
	static _14GeoAndHisN fourteenGeoAndHis = new _14GeoAndHisN();
	static _15GeoAndHisN fifthteenGeoAndHis = new _15GeoAndHisN();
	static _16GeoAndHisN sixteenGeoAndHis = new _16GeoAndHisN();
	static _17GeoAndHisN seventeenGeoAndHis = new _17GeoAndHisN();
	static _18GeoAndHisN eighteenGeoAndHis = new _18GeoAndHisN();
	static _19GeoAndHisN ninteenGeoAndHis = new _19GeoAndHisN();
	static _20GeoAndHisN twentyGeoAndHis = new _20GeoAndHisN();
	

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
