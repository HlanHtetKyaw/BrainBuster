package application.GeoAndHis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import application.Mathematics.Math11To20.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import application.Mathematics.*;

public class switchingQuestionForDiffGeoAndHis {
	static _1GeoAndHisD oneGeoAndHis = new _1GeoAndHisD();
	static _2GeoAndHisD twoGeoAndHis = new _2GeoAndHisD();
	static _3GeoAndHisD threeGeoAndHis = new _3GeoAndHisD();
	static _4GeoAndHisD fourGeoAndHis = new _4GeoAndHisD();
	static _5GeoAndHisD fiveGeoAndHis = new _5GeoAndHisD();
	static _6GeoAndHisD sixGeoAndHis = new _6GeoAndHisD();
	static _7GeoAndHisD sevenGeoAndHis = new _7GeoAndHisD();
	static _8GeoAndHisD eightGeoAndHis = new _8GeoAndHisD();
	static _9GeoAndHisD nineGeoAndHis = new _9GeoAndHisD();
	static _10GeoAndHisD tenGeoAndHis = new _10GeoAndHisD();
	static _11GeoAndHisD elevenGeoAndHis = new _11GeoAndHisD();
	static _12GeoAndHisD twelveGeoAndHis = new _12GeoAndHisD();
	static _13GeoAndHisD thirteenGeoAndHis = new _13GeoAndHisD();
	static _14GeoAndHisD fourteenGeoAndHis = new _14GeoAndHisD();
	static _15GeoAndHisD fifthteenGeoAndHis = new _15GeoAndHisD();
	static _16GeoAndHisD sixteenGeoAndHis = new _16GeoAndHisD();
	static _17GeoAndHisD seventeenGeoAndHis = new _17GeoAndHisD();
	static _18GeoAndHisD eighteenGeoAndHis = new _18GeoAndHisD();
	static _19GeoAndHisD ninteenGeoAndHis = new _19GeoAndHisD();
	static _20GeoAndHisD twentyGeoAndHis = new _20GeoAndHisD();
	

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
