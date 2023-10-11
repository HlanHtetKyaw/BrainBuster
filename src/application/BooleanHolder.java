package application;

import java.util.prefs.Preferences;

public class BooleanHolder {
	public Preferences pre = Preferences.userRoot().node(this.getClass().getName());
	public Preferences pre2 = Preferences.userRoot().node(this.getClass().getName());
	public Preferences pre3 = Preferences.userRoot().node(this.getClass().getName());
	public Preferences pre4 = Preferences.userRoot().node(this.getClass().getName());
	public Preferences pre5 = Preferences.userRoot().node(this.getClass().getName());
	
	public Preferences pre6 = Preferences.userRoot().node(this.getClass().getName());
	
	String memory = "1";
	String memory2 = "2";
	String memory3 = "3";
	String memory4 = "4";
	String memory5 = "5";
	
	String p1 = "p1";
	
	private static boolean lan = true;
	public boolean LockOne;
	public boolean LockTwo;
	public boolean LockThree;
	public boolean LockFour;
	public boolean LockFive;
	
	public int one;
	public int two;
	public int three;
	public int four;
	public int five;
	
	public int getInt() {
		one = pre6.getInt(p1, 0);
		return one;
	}
	public void setInt(int num) {
		pre6.putInt(p1, num);
	}
	public boolean getBool() {

		LockOne = pre.getBoolean(memory, false);
		return LockOne;
	}
	public void setBool(boolean sb) {
		pre.putBoolean(memory, sb);
	}
	
	public boolean getBoolTwo() {
		LockTwo = pre2.getBoolean(memory2, false);
		return LockTwo;
	}
	public void setBoolTwo(boolean sb) {
		pre2.putBoolean(memory2, sb);
	}
	
	public boolean getBoolThree() {
		LockThree = pre3.getBoolean(memory3,false);
		return LockThree;
	}
	public void setBoolThree(boolean sb) {
		pre3.putBoolean(memory3,sb);
	}
	
	public boolean getBoolFour() {
		LockFour = pre4.getBoolean(memory4,false);
		return LockFour;
	}
	public void setBoolFour(boolean sb) {
		pre4.putBoolean(memory4,sb);
	}
	
	public boolean getBoolFive() {
		LockFive = pre5.getBoolean(memory5,false);
		return LockFive;
	}
	public void setBoolFive(boolean sb) {
		pre5.putBoolean(memory5,sb);
	}
}
