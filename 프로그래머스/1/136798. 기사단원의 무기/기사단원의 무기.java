// 입력 : 기사단원의 수(number), 공격력의 제한수치(limit), 제한 수치 초과시 사용할 무기의 공격력(power)
// 변수 : 기사단원이 사용할 무기의 공격력(약수)를 담을 배열(measure)

/* 기사단원의 수(1~number)까지의 약수 구하기
1~number까지 반복문 돌기 = i
    약수 개수 구할 변수 선언 및 초기화(measureNum)
    1~i/2까지 반복문 돌기 =j
        i%j == 0일 경우, 약수 개수++
    약수 개수++ -> 마지막 자기 자신 포함
    기사단원의 약수(measure[i-1]) = 약수 개수
*/

// 기사단원의 수만큼 반복문 돌기
    // 만약 제한 수치 초과시, answer += power
    // 아닐 경우, answer += 기사단원의 약수(measure[i])

// result : 무기를 모두 만둘기 위해 필요한 철의 무게(공격력 1 = 철 1kg)

import java.util.Arrays;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] measure = new int[number];
        
        for (int i = 1; i <= number; i++) {
            int measureNum = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i%j == 0)
                    measureNum++;
            }
            measureNum++;
            measure[i - 1] = measureNum;
        }
        
        for (int i = 0; i < number; i++) {
            if (measure[i] > limit)
                answer += power;
            else 
                answer += measure[i];
        }
        
        return answer;
    }
}