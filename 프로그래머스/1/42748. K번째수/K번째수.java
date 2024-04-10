// input : 임의의 숫자 배열(int array)
        // [i, j, k]를 원소로 가지는 2차원 배열(int[][] commands)
// variable : 리턴해야할 배열의 크기(int size)
            // 리턴해야할 배열(int[] answer)

/* process

commands의 크기 구하기
answer의 크기 할당 및 선언
commands의 크기만큼 반복문(row = 0)
    i, j, k값 넣어주기
    (i-1) ~ (j-1)까지의 배열 복사
    복사된 배열 정렬 후 (k-1)의 요소 answer[row]에 넣기
*/

// return : array에서 i부터 j까지 자르고 정렬한 후 k번째 숫자들의 배열

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int size = commands.length;
        int[] answer = new int[size];
        
        for (int row = 0; row < size; row++) {
            int i = commands[row][0];
            int j = commands[row][1];
            int k = commands[row][2];
            
            int[] temp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(temp);
            answer[row] = temp[k-1];
        }
        
        return answer;
    }
}