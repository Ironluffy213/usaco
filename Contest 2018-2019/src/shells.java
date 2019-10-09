import java.util.*;
import java.io.*;

public class shells {
	static int[] cnt;
	static int[] pos;
	static Scanner in;
	static PrintWriter out;
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
			in = new Scanner(new File("shells.in"));
			out = new PrintWriter(new File("shells.out"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		cnt = new int[3];
		pos = new int[3];
		for(int i = 0; i < 3; i++) {
			pos[i] = i+1;
		}
	}
	public static void solve() {
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int fir = in.nextInt();
			int sec = in.nextInt();
			int temp = pos[fir-1];
			pos[fir-1] = sec;
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
