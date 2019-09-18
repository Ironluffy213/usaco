import java.util.*;
import java.io.*;

public class blist {
	public static int n;
	public static int[] time;
	public static Scanner in;
	public static PrintWriter out;
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
			in = new Scanner(new File("blist.in"));
			out = new PrintWriter(new File("blist.out"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		time = new int[1001];
		n = in.nextInt();
		for(int i =0; i < n; i++) {
			int s = in.nextInt();
			int e = in.nextInt();
			int b = in.nextInt();
			for(int j = s; j <= e; j++) {
				time[j] += b;
			}
		}
	}
	public static void solve() {
		int max = time[1];
		for(int i = 2; i <= 1000; i++) {
			if(time[i] > max) {
				max = time[i];
			}
		}
		System.out.println(max);
	}
}
