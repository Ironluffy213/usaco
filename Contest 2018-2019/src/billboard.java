import java.util.*;
import java.io.*;

public class billboard {
	static PrintWriter out;
	static Scanner in;
	static boolean[][] boards;
	static int cnt;
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
		boards = new boolean[1000][1000];
		int x1 = in.nextInt();
		int x2 = in.nextInt();
		int y1 = in.nextInt();
		int y2 = in.nextInt();
		boards[x1][x2] = true;
		boards[y1][y2] = true;
		for(int i = x1; i < y1; i++) {
			for(int j = x2; j < y2; j++) {
				boards[i][j] = true;
			}
		}
	}
	public static void solve() {
		int x1 = in.nextInt();
		int x2 = in.nextInt();
		int y1 = in.nextInt();
		int y2 = in.nextInt();
		boards[x1][x2] = true;
		boards[y1][y2] = true;
		for(int i = x1; i < y1; i++) {
			for(int j = x2; j < y2; j++) {
				boards[i][j] = false;
			}
		}
		cnt = 0;
		for(int i = 0; i < 1000; i++) {
			for(int j = 0; j < 1000; j++) {
				if(boards[i][j] == true) {
					cnt ++;
				}
			}
		}
		out.println(cnt);
	}
}
