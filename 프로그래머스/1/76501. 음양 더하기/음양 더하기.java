// absolutes = 자연수
// signs = absolutes의 음수, 양수

// answer = 0 초기화
// absolutes의 길이 만큼 반복
    // true일 경우(양수) answer += absolutes[i] (더하기)
    // false일 경우(음수) answer -= absolutes[i] (빼기)

// result : 입력된 수의 음수, 양수 판별 후 총합

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true)
                answer += absolutes[i];
            else 
                answer -= absolutes[i];
        }
        return answer;
    }
}