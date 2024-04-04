// 입력 : 1개 이상의 단어(s)
// 단어는 하나 이상의 공백으로 구분

// 변수 : StringBuilder, 문자열 길이(len), 각 단어 인덱스(idx)

// 문자열 길이 구하기
// 문자열 길이 만큼 반복문 돌며 대/소문자 변환
    // 공백일 경우, 
        // 각 단어 인덱스 초기화
        // 원래 문자 그대로 스트링빌더에 넣기
    // 단어 인덱스 짝수이며 소문자일 경우, 
        // 대문자로 변환 후 스트링빌더에 넣기
    // 단어 인덱스 홀수이며 대문자일 경우, 
        // 소문자로 변환 후 스트링빌더에 넣기
    // 그 외의 경우, -> (이미 조건에 부합한 경우)
        // 원래 문자 그대로 스트링빌더에 넣기
    // 대/소문자일 경우
        // 인덱스++;
// 리턴 문자열에 스트링빌더 값 넣기
    
// result : 문자의 짝/홀수 단어별로 대/소문자 변환한 문자열

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int idx = 0;
        
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' '){
                idx = 0;
                sb.append(s.charAt(i));
            }
            else if (idx % 2 == 0 && s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                sb.append((char)(s.charAt(i) - 32));
            else if (idx % 2 != 0 && s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                sb.append((char)(s.charAt(i) + 32));
            else
                sb.append(s.charAt(i));
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') 
                || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                idx++;
        }
        answer = sb.toString();
        
        return answer;
    }
}