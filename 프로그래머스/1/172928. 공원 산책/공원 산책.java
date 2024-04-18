import java.util.Arrays;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        int x_size = park[0].length();
        int y_size = park.length;

        // 시작 위치를 찾음
        for (int i = 0; i < y_size; i++) {
            for (int j = 0; j < x_size; j++) {
                if (park[i].charAt(j) == 'S') {
                    x = j;
                    y = i;
                    break;
                }
            }
        }

        // 이동
        for (String route : routes) {
            String[] moveArr = route.split(" ");
            int move = Integer.parseInt(moveArr[1]);
            int obstacle = 0;

            if (moveArr[0].equals("E")) { // 동쪽
                x += move;
                if (x >= x_size || x < 0) {
                    x -= move;
                    continue;
                }
                for (int j = 0; j < move; j++) {
                    if (park[y].charAt(x - j) == 'X') {
                        obstacle = 1;
                        break;
                    }
                }
                if (obstacle == 1) {
                    x -= move;
                    continue;
                }
            } else if (moveArr[0].equals("W")) { // 서쪽
                x -= move;
                if (x >= x_size || x < 0) {
                    x += move;
                    continue;
                }
                for (int j = 0; j < move; j++) {
                    if (park[y].charAt(x + j) == 'X') {
                        obstacle = 1;
                        break;
                    }
                }
                if (obstacle == 1) {
                    x += move;
                    continue;
                }
            } else if (moveArr[0].equals("S")) { // 남쪽
                y += move;
                if (y >= y_size || y < 0) {
                    y -= move;
                    continue;
                }
                for (int j = 0; j < move; j++) {
                    if (park[y - j].charAt(x) == 'X') {
                        obstacle = 1;
                        break;
                    }
                }
                if (obstacle == 1) {
                    y -= move;
                    continue;
                }
            } else { // 북쪽
                y -= move;
                if (y >= y_size || y < 0) {
                    y += move;
                    continue;
                }
                for (int j = 0; j < move; j++) {
                    if (park[y + j].charAt(x) == 'X') {
                        obstacle = 1;
                        break;
                    }
                }
                if (obstacle == 1) {
                    y += move;
                    continue;
                }
            }
        }

        int[] answer = {y, x};
        return answer;
    }
}
