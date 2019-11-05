import java.util.*;
import java.io.*;

public class shell {
	static int[] shell, fir, sec, ge;
	static PrintWriter out;
	static Scanner in;
	static int max, n;
	
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
		n = in.nextInt();
		fir = new int[n];
		sec = new int[n];
		ge = new int[n];
		shell = new int[3];
		for(int i = 0; i < n; i++) {
			fir[i] = in.nextInt()-1;
			sec[i] = in.nextInt()-1;
			ge[i] = in.nextInt()-1;
		}
		max = 0;
		//System.out.println(Arrays.toString(ge));
	}
	public static void solve() {
		for(int i = 0; i < 3; i++) {
			shell = new int[3];
			shell[i] = 1;
			max= Math.max(max, score());
		}
		out.println(max);
	}
	public static int score() {
		int score = 0;
		for(int i = 0; i < n; i++) {
			int temp = shell[sec[i]];
			shell[sec[i]] = shell[fir[i]];
			shell[fir[i]] = temp;
			if(shell[ge[i]] == 1) {
				score++;
			}
		}
		return score;
	}
}
