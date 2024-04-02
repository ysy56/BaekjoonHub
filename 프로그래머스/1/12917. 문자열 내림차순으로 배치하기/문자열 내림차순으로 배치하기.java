// 문자열 char 배열로 바꾸기
// 배열 정렬 sort() 내림차순
// 정렬된 배열 다시 문자열로 바꾸기

// result : 문자열 내림차순
// 단, 대문자는 소문자보다 작은 것으로 간주

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        for (int i = s.length() -1 ; i >= 0 ; i--) {
            answer += String.valueOf(charArray[i]);
        }
        
        return answer;
    }
}