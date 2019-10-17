import java.io.*;
import java.util.*;
public class paint {
	static Scanner in;
	static PrintWriter out;
	static int[] len;
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
		len = new int[4];
		for(int i = 0; i < 4; i++) {
			len[i] = in.nextInt();
		}
	}
	public static void solve() {
		int f = len[1] - len[0];
		int s = len[3] - len[2];
		int r = len[3] - len[0];
		out.println(f+s-r);
	}
}
