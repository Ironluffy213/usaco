import java.util.*;
import java.io.*;

public class guess {
	static Scanner in;
	static PrintWriter out;
	static int n;
	static ArrayList<String> [] des;
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
			in = new Scanner(new File("guess.in"));
			out = new PrintWriter(new File("guess.out"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		 n = in.nextInt();
		 des = new ArrayList[n];
		 for(int i = 0; i < n; i++) {
			 in.next();
			 des[i] = new ArrayList<String>();
			 int temp = in.nextInt();
			 for(int j = 0; j < temp; j++) {
				 des[i].add(in.next());
			 }
		 }
		 //System.out.println(Arrays.toString(des));
	}
	public static void solve() {
		int max = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				int same = 0;
				for(String p: des[i]) {
					if(des[j].contains(p)) {
						same ++;
					}
				}			
				//System.out.println(same);
				max = Math.max(max, same);	
			}
		}
		out.println(max+1);
	}
}
