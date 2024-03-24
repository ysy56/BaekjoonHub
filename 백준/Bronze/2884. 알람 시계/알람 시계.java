import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if (H == 0 && M < 45) {
			int newM = M + 60 - 45;
			System.out.print( 23 + " " + newM);
		}
		else if (M < 45) {
			int newM = M + 60 - 45;
			System.out.print( (H - 1) + " " + newM);
		}
		else {
			System.out.print( H + " " + (M - 45));
		}
	}
}