// input : 페인트 칠해야 할 구역(int: 1~n)
        // 벽에 페인트를 칠하는 롤러의 길이(int: 1~m)
        // 다시 칠하기로 정한 구역들의 번호(int[]: section)
// variable : 배열의 크기(int: size) 
        // 롤러로 칠한 가장 왼쪽 구역 번호(int: left_num) 
        // 칠한 횟수(int: answer)

/* process
배열 크기 구하기
left_num = section[0] // 가장 왼쪽 구역기준 롤러 한 번 칠하기
answer = 1 // 이미 롤러를 한 번 칠한다는 가정이기 때문

배열 크기 만큼 반복문(i = 1)
     배열 요소가 left_num+(m-1)보다 크다면
        left_num = section[i];
        answer++;
*/

// return : 롤러로 페인트 칠해야 하는 최소 횟수(int: answer)

class Solution {
    public int solution(int n, int m, int[] section) {
        int size = section.length;
        int left_num = section[0];
        int answer = 1;
        
        for (int i = 1; i < size; i++) {
            if (section[i] > left_num+(m-1)) {
                left_num = section[i];
                answer++;
            }
        }
        
        return answer;
    }
}