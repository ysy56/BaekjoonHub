import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[N];
		long first = 1; // 분모
		long second = 1; // 분자
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		first = arr[N-1];
		for (int i = N-2; i >= 0; i--) {
			long temp = 0;
			
			second = first * arr[i] + second;
			temp = second;
			second = first;
			first = temp;
		}
		second = first - second;
		
		System.out.println(second);
		System.out.println(first);
	}
}