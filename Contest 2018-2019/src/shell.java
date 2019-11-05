import java.util.*;
import java.io.*;

public class shell {
	static int[] cnt;
	static int[] pos;
	static Scanner in;
	static PrintWriter out;
	static int n;
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
			in = new Scanner(new File("shell.in"));
			out = new PrintWriter(new File("shell.out"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		cnt = new int[3];
		pos = new int[3];
		for(int i = 0; i < 3; i++) {
			pos[i] = i+1;
		}
		n = in.nextInt();
	}
	public static void solve() {
		for(int i = 0; i < n; i++) {
			int fir = in.nextInt();
			int sec = in.nextInt();
			int temp = pos[fir-1];
			pos[fir-1] = pos[sec-1];
			pos[sec-1] = temp;
			int add = in.nextInt();
			cnt[add-1] += 1;
		}
		int max = cnt[0];
		for(int i = 1; i < 3; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
			}
		}
		out.println(max-1);
	}
}
