import java.util.*;
import java.io.*;

public class backforth {
	public static Scanner in;
	public static PrintWriter out;
	public static int b1[], b2[], a1[], a2[], ans;
	public static Set<Integer> pos;
	
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
			in = new Scanner(new File("backforth.in"));
			out = new PrintWriter(new File("backforth.out"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		b1 = new int[10];
		b2 = new int[10];
		a1 = new int[10];
		a2 = new int[10];
		for(int i = 0; i < 10; i++) {
			a1[i] = in.nextInt();
			b1[i] = a1[i];
		}
		for(int i = 0; i < 10; i++) {
			a2[i] = in.nextInt();
			b2[i] = a2[i];
		}
		pos = new HashSet <Integer>();
		//System.out.println(Arrays.toString(a2));
	}
	public static void solve() {
		int milk = 0;
		for(int i = 0;i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				milk = b2[j] - b1[i];
				int temp = b1[i];
				b1[i] = b2[j];
				b2[j] = temp;
				for(int k = 0; k < 10; k++) {
					for(int m = 0; m < 10; m++) {
						ans = milk + b2[m] - b1[k];
						pos.add(ans);
					}
				}
				b1 = a1.clone();
				b2 = a2.clone();
			}
		}
		out.println(pos.size());
	}
}

