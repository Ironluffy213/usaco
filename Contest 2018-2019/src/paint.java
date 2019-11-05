import java.io.*;
import java.util.*;
public class paint {
	static Scanner in;
	static PrintWriter out;
	static int[] len;
	static boolean[] fence;
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
			len[i]= in.nextInt();
		}
		fence = new boolean[101];
	}
	public static void solve() {
		for(int i = len[0]; i < len[1]; i++) {
			fence[i] = true;
		}
		for(int i = len[2]; i < len[3]; i++) {
			fence[i] = true;
		}
		int count = 0;
		for(int i = 0; i <= 100; i++) {
			if(fence[i] == true) {
				count ++;
			}
		}
		out.println(count);
	}
	
}
