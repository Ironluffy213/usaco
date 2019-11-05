import java.util.*;
import java.io.*;

public class sleepy {
	static Scanner in;
	static PrintWriter out;
	static int N;
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
		N = in.nextInt();
		cow = new int[N];
		for(int i = 0; i < N; i++) {
			cow[i] = in.nextInt();
		}
	}
	public static void solve() {
		
	}
}

