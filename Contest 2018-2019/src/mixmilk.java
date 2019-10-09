import java.util.*;
import java.io.*;

public class mixmilk {
	static int[] cap, milk;
	static Scanner in;
	static PrintWriter out;
	public static void main(String[] args) {
		try {
			init();
			solve();
			in.close();
			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void init() {
		cap = new int[3];
		milk = new int[3];
		try {
			in = new Scanner(new File("mixmilk.in"));
			out = new PrintWriter(new File("mixmilk.out"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int i = 0; i < 3; i++) {
			cap[i] = in.nextInt();
			milk[i] = in.nextInt();
		}
	}
	public static void solve() {
		for(int i = 0; i < 100; i++) {
			int cur = i%3;
			int end = (i+1)%3;
			int spce = cap[end] - milk[end];
			if(spce >= milk[cur]) {
				milk[end] += milk[cur];
				milk[cur] = 0;
			}else {
				milk[end] = cap[end];
				milk[cur] -= spce;
			}
		}
		for(int n: milk) {
			out.println(n);
		}
	}
}
