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
		boards = new boolean[2001][2001];
      
        cnt = 0;
        for(int k = 0; k < 2; k++){
          	int x1 = in.nextInt()+1000;
			int y1 = in.nextInt()+1000;
			int x2 = in.nextInt()+1000;
			int y2 = in.nextInt()+1000;
			
			for(int i = x1; i < x2; i++) {
				for(int j = y1; j < y2; j++) {
					boards[i][j] = true;
                  	cnt++;
				}
			}
        }
		
	}
	public static void solve() { 
		int x1 = in.nextInt()+1000;
		int y1 = in.nextInt()+1000;
		int x2 = in.nextInt()+1000;
		int y2 = in.nextInt()+1000;
		
		for(int i = x1; i < x2; i++) {
			for(int j = y1; j < y2; j++) {
				if(boards[i][j]) cnt--;
			}
		}
		
		out.println(cnt);
	}
}
