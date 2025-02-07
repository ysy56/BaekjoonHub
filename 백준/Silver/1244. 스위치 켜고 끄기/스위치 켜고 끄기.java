import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] switch_status = new int[N];

        for (int i = 0; i < N; i++) {
            switch_status[i] = scanner.nextInt();
        }

        int stu = scanner.nextInt();

        for (int i = 0; i < stu; i++) {
            int gender = scanner.nextInt();
            int num = scanner.nextInt();

            if (gender == 1) { // 남학생
                for (int j = num - 1; j < N; j += num) {
                    switch_status[j] = change_switch(switch_status[j]);
                }
            } else { // 여학생
                int cur = num - 1;
                switch_status[cur] = change_switch(switch_status[cur]);

                int idx = 1;
                while (cur + idx < N && cur - idx >= 0) {
                    if (switch_status[cur + idx] == switch_status[cur - idx]) {
                        switch_status[cur + idx] = change_switch(switch_status[cur + idx]);
                        switch_status[cur - idx] = change_switch(switch_status[cur - idx]);
                    } else {
                        break;
                    }
                    idx++;
                }
            }
        }

        // 20개씩 출력
        for (int i = 0; i < N; i++) {
            System.out.print(switch_status[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static int change_switch(int s) {
        return s == 0 ? 1 : 0;
    }
}
