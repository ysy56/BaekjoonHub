// 입력 : 배열(arr), 나눌 값(divisor)
// 변수 : 배열의 크기(len), 리턴 배열의 크기(re_len), 리턴 배열의 인덱스(re_idx)

// 배열의 크기만큼 반복문
    // 배열의 요소가 divisor로 나뉘어진다면 re_len++
// re_len의 값이 0이면 크기가 1인 배열에 -1값을 넣어 리턴
// 리턴할 배열 선언 및 크기 할당
// 배열의 크기만큼 반복문
    // 배열의 요소가 divisor로 나뉘어진다면 answer[re_idx]에 넣기
    // re_idx++;
// sort()를 이용한 정렬

// return : 배열의 각 요소가 divisor로 나누어 떨어지는 값(오름차순)
// 나누어 떨어지는 요소가 없다면 배열의 값에 -1 넣어서 반환

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int len = arr.length;
        int re_len = 0;
        int re_idx = 0;
        
        for (int i = 0; i < len; i++) {
            if (arr[i] % divisor == 0)
                re_len++;
        }
        if (re_len == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[re_len];
        for (int i = 0; i < len; i++) {
            if (arr[i] % divisor == 0){
                answer[re_idx] = arr[i];
                re_idx++;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}