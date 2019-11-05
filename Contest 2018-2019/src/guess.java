import java.util.*;
import java.io.*;

public class guess {
	static Scanner in;
	static PrintWriter out;
	static Map<String,Integer> bank  = new HashMap<String,Integer>();
	static int max;
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
		int num = in.nextInt();
		for(int i = 0; i < num-1; i++) {
			String[] temp = in.nextLine().split(" ");
			for(int j = 2; j < temp.length; j++) {
				if(bank.containsKey(temp[j])) {
					bank.put(temp[j], bank.get(temp[j])+1);
				}else {
					bank.put(temp[j], 1);
				}
			}
		}
	}
	public static void solve() {
		max = 0;
		for(String s: bank.keySet()) {
			int tem = bank.get(s);
			if(max < tem) {
				max = tem;
			}
		}
		out.print(max);
	}
}
