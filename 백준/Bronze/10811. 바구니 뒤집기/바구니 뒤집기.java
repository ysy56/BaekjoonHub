import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		int[] bucket = new int[N];
		for (int i = 0; i<N; i++) {
			bucket[i] = i+1;
		}
		
		for(int n = 0; n<M; n++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			sc.nextLine();
			
			for (int left = 0; left<(j-i+1)/2; left++) {
				int temp = bucket[left+i-1];
				bucket[left+i-1] = bucket[j-left-1];
				bucket[j-left-1] = temp;
			}
		}
		
		for (int num : bucket) {
			System.out.print(num + " ");
		}
	}
}
