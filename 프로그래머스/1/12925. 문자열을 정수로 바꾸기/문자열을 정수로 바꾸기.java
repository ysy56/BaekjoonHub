// 변수 : 부호, 문자열 크기, 인덱스 값
// 문자열 -> 배열로 변경 필요
// 문자열 맨앞 부호
    // 조건문 : "+"일 경우 -> 부호 저장 및 문자열 크기-1 인덱스+1
    // 조건문 : "-"일 경우 -> 음수 곱하기 및 부호 저장 및 문자열 크기-1 인덱스+1
// 문자열 -> 정수
    // 문자열의 크기 구하기(부호 제외된 상태)
    // answer = s[0(부호제외)] * 부호제외하고 첫 번째 인덱스 0이라고 가정
    // s[1 ~ 문자열 크기-2] * 자리 수 + s[앞의 인덱스 + 1] 반복문 돌며 answer에 더하기
// 음수 일 경우 -> answer * -1
        
// 잘못된 값 입력X(0으로 시작X) 
// s의 길이는 1이상 5이하(입력값은 항상 1자리 수 이상 존재)

class Solution {
    public int solution(String s) {
        int answer = 0;
        int sign = 0;
        int len = 0;
        int idx = 0;
        
        
        if (s.charAt(0) == '+') {
            sign = 1;
            len--;
            idx++;
        }
        else if (s.charAt(0) == '-') {
            sign = -1;
            len--;
            idx++;
        }
        
        len += s.length();
        answer = s.charAt(idx) - '0';
        for (int i = 1; i < len ; i++) {
            answer = answer * 10 + (s.charAt(idx + i) - '0');
        }
        
        if (sign == -1)
            answer *= -1;
        
        return answer;
    }
}