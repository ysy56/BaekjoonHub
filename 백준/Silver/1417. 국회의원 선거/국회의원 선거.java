import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int my_vote = scanner.nextInt();
        int buy = 0;

        if (N == 1) {
            System.out.print(buy);
            return;
        }

        Integer[] vote = new Integer[N-1];
        for (int i = 0; i<N-1; i++) {
            vote[i] = scanner.nextInt();
        }

        Arrays.sort(vote, Collections.reverseOrder());
        while(my_vote+buy <= vote[0]) {
            buy++;
            vote[0]--;
            Arrays.sort(vote, Collections.reverseOrder());
        }

        System.out.print(buy);
    }
}