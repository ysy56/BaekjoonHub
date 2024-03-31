// 변수 : 반복 횟수, 형변환 변수

// 입력 수 = 1 -> 반복X
// 입력 수 = 짝수 -> 2로 나누기
// 입력 수 = 홀수 -> 3을 곱하고 1 더하기 (0은 홀수로 취급?)
// 입력 수 = 1이 될 때까지 반복

// result 반복한 횟수
// 반복 횟수가 500이상 일 경우 result -1

class Solution {
    public int solution(int num) {
        int answer = 0;
        int loop_num = 0;
        long change_num = 0;
        
        change_num = (long)num;
        while(loop_num < 500) {
            if (change_num == 1)
                break;
            else if (change_num%2 == 0)
                change_num /= 2;
            else 
                change_num = change_num * 3 + 1;
            loop_num++;
        }
        
        answer = loop_num;
        if (loop_num >= 500) {
            answer = -1;
        }
        
        return answer;
    }
}