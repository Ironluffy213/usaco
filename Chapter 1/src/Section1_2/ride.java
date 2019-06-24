/*
 ID: syk
 LANG: JAVA
 TASK: ride
 */
package Section1_2;
import java.util.*;
import java.io.*;
public class ride {
	static Scanner in;
	static PrintWriter out;
	static String input[];
	static String result;
	public static void main(String[] args) {
		
		try {
			in = new Scanner(new File("ride.in"));
			out = new PrintWriter(new File("ride.out"));
			
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
		input = new String[2];
		input[0] = in.nextLine();
		input[1] = in.nextLine();
	}
	static String solve() {
		int n1 = convert(input[0]);
		int n2 = convert(input[1]);
		if(n1 == n2) {
			return "GO";
		}else {
			return "STAY";
		}
	}
	static int convert(String s) {
		int val = s.charAt(0)-64;
		for(int i = 1; i < s.length(); i++) {
			int n = s.charAt(i) - 64;
			val = val * n;
		}
		return val%47;
	}
}
