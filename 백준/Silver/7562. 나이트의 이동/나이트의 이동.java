import java.util.*;

public class Main {
    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 개수

        while (T-- > 0) {
            int l = scanner.nextInt(); // 체스판 크기
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            int targetX = scanner.nextInt();
            int targetY = scanner.nextInt();

            System.out.println(bfs(l, startX, startY, targetX, targetY));
        }

        scanner.close();
    }

    public static int bfs(int l, int startX, int startY, int targetX, int targetY) {
        if (startX == targetX && startY == targetY) return 0; // 이미 목표 위치에 있는 경우

        boolean[][] visited = new boolean[l][l];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0}); // {현재 x, 현재 y, 이동 횟수}
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1], moves = cur[2];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]) {
                    if (nx == targetX && ny == targetY) return moves + 1; // 목표 도달 시 종료
                    queue.add(new int[]{nx, ny, moves + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        return -1; // 예외 케이스 (이론적으로는 발생하지 않음)
    }
}
