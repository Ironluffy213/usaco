import java.util.*;
import java.io.*;

public class sleepy {
	static Scanner in;
	static PrintWriter out;
	static int n;
	static int[] cow;
	public static void main(String[] args) {
		try {
			init();
			solve();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		in.close();
		out.close();
	}
	public static void init() {
		try {
			in = new Scanner(new File("sleepy.in"));
			out = new PrintWriter(new File("sleepy.out"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		n = in.nextInt();
		cow = new int[n];
		for(int i = 0; i < n; i++) {
			cow[i] = in.nextInt();
		}
	}
	public static void solve() {
		int ans = 0;
		for(int i = cow.length-1; i > 0; i--) {
			if(cow[i-1] > cow[i]) {
				ans = i;
				break;
			}
		}
		out.println(ans);
	}
}

