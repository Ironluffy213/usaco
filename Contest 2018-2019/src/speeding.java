import java.io.*;
import java.util.*;
public class speeding {
	static Scanner in;
	static PrintWriter out;
	static int n;
	static int m;
	static int[] dis1;
	static int[] sped1;
	static int[] dis2;
	static int[] cow;
	public static void main(String [] args) {
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
			in = new Scanner(new File("paint.in"));
			out = new PrintWriter(new File("paint.out"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		n = in.nextInt();
		m = in.nextInt();
		dis1 = new int[3];
		sped1 = new int[3];
		dis2 = new int[3];
		cow = new int[3];
		for(int i =0; i < 3; i++) {
			dis1[i] = in.nextInt();
			sped1[i] = in.nextInt();
		}
		for(int i =0; i < 3; i++) {
			dis2[i] = in.nextInt();
			cow[i] = in.nextInt();
		}
	}
	public static void solve() {
		
	}
}
