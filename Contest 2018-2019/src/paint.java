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
		int max = len[0];
		for(int i = 1; i < len.length; i++) {
			if(max < len[i]) {
				max = len[i];
			}
		}
		int min = len[0];
		for(int i = 1; i < len.length; i++) {
			if(min > len[i]) {
				min = len[i];
			}
		}
		out.println(max-min);
	}
}
