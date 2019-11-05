import java.util.*;
import java.io.*;

public class backforth {
	public static Scanner in;
	public static PrintWriter out;
	public static ArrayList<Integer> b1;
	public static ArrayList<Integer> b2;
	public static int[] pos ;
	
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
		pos = new int[2000];
		b1 = new ArrayList<Integer>();
		b2 = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			b1.add(in.nextInt());
		}
		for(int i = 0; i < 10; i++) {
			b2.add(in.nextInt());
		}
	}
	public static void solve() {
		tues(1000, b1, b2);
		int ans = 0;
		for(int i = 0; i < pos.length; i++) {
			ans += pos[i];
		}
		out.println(ans);
	}
	public static ArrayList<Integer> copy(ArrayList<Integer> blist){
		ArrayList<Integer> newb = new ArrayList<Integer>();
		for(int i = 0; i < blist.size(); i++) {
			newb.add(blist.get(i));
		}
		return newb;
	}
	public static void tues(int amnt, ArrayList<Integer> b1, ArrayList<Integer> b2){
		for(int i = 0; i < b1.size(); i++) {
			int x = b1.get(i);
			ArrayList<Integer> newb1 = copy(b1);
			newb1.remove(i);
			newb1.add(x);
			ArrayList<Integer> newb2 = copy(b2);
			newb2.remove(i);
			newb2.add(x);
			wed(amnt-x, newb1, newb2);
		}
	}
	public static void wed(int amnt, ArrayList<Integer> b1, ArrayList<Integer> b2){
		for(int i = 0; i < b2.size(); i++) {
			int x = b2.get(i);
			ArrayList<Integer> newb1 = copy(b1);
			newb1.remove(i);
			newb1.add(x);
			ArrayList<Integer> newb2 = copy(b2);
			newb2.remove(i);
			newb2.add(x);
			thurs(amnt+x, newb1, newb2);
		}
	}
	public static void thurs(int amnt, ArrayList<Integer> b1, ArrayList<Integer> b2){
		for(int i = 0; i < b1.size(); i++) {
			int x = b1.get(i);
			ArrayList<Integer> newb1 = copy(b1);
			newb1.remove(i);
			newb1.add(x);
			ArrayList<Integer> newb2 = copy(b2);
			newb2.remove(i);
			newb2.add(x);
			fri(amnt-x, newb1, newb2);
		}
	}
	public static void fri(int amnt, ArrayList<Integer> b1, ArrayList<Integer> b2){
		for(int i = 0; i < b2.size(); i++) {
			int x = b2.get(i);
			pos[amnt+x] = 1;
		}
	}
}

