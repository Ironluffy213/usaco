/*
 ID: syk
 LANG: JAVA
 TASK: gift1
 */
package Section1_2;
	import java.util.*;
	import java.io.*;
public class gift1 {
	static Scanner in;
	static PrintWriter out;
	static int n;
	static ArrayList <String> name;
	static ArrayList <Integer> money;
	public static void main(String [] args) {
		try {
			in = new Scanner(new File("gift1.in"));
			out = new PrintWriter(new File("gift1.out"));
			
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
		for(int i = 0; i < n; i++) {
			name.add(in.next());
			money.add(0);
		}
	}
	static String solve() {
		String ans = "";
		for(int i = 0; i < n; i++) {
			String givr = in.next();
			int mon = in.nextInt();
			int ppl = in.nextInt();
			int gm = mon/ppl;
			int rem = mon%ppl;
			int index = name.indexOf(givr);
			money.set(money.get(index), money.get(index)-mon+rem);
			for(int j = 0; j<ppl; j++) {
				String rec = in.next();
				index = name.indexOf(rec);
				money.set(money.get(index), money.get(index)+gm);
			}
			
			for(int j = 0; j<n; j++) {
				ans += name.get(j) + " " + money.get(j) + "\n";
			}
		}
		return ans;
	}
}
