/*
 ID: syk
 LANG: JAVA
 TASK: friday
 */
package Section1_2;
import java.util.*;
import java.io.*;
public class friday {
	static Scanner in;
	static PrintWriter 
	out;static int add;
	static int date;
	static int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	static int[] days;
	public static void main(String [] args) {
		try {
			in = new Scanner(new File("friday.in"));
			out = new PrintWriter(new File("friday.out"));
			init();
			out.println(solve());
			in.close();
			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void init() {
		add = in.nextInt();
		date = 13;
		days = new int[7];
	}
	static String solve() {
		for(int y = 1900; y < 1900+add; y++) {
			for(int m = 1; m < 13; m++) {
				days[date%7]++;
				date += month[m];
				if(m == 2 && isleap(y)) {
					date++;
				}
			}
		}
		String ans = "" + days[6];
		for(int i = 0; i < 6; i++) {
			ans = ans + " " + days[i];
		}
		return ans;
	}
	static boolean isleap(int y) {
		if(y % 4 == 0 &&(y%100 != 0 || y%400 == 0)) {
			return true;
		}
		return false;
	}
}
