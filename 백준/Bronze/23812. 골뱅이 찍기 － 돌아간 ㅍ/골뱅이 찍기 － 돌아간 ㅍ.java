import java.util.*;

public class Main {
	public static void full(int n) {
		String ch = "@";
		for (int i = 0; i < n; i++) {
			System.out.println(ch.repeat(n*2 + n*3));
		}
	}
	public static void side(int n) {
		String ch = "@";
		String sp = "   ";
		for (int i = 0; i < n; i++) {
			System.out.print(ch.repeat(n));
			System.out.print(sp.repeat(n));
			System.out.print(ch.repeat(n));
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		side(N);
		full(N);
		side(N);
		full(N);
		side(N);
	}
}
