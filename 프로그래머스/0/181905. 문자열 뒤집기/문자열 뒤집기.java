// 저장할 변수 sb 선언
// my_string의 처음부터 s까지 문자 sb에 저장
// my_string의 e부터 s까지의 문자 sb에 저장
// my_string의 e부터 마지막까지의 문자 sb에 저장
// 리턴할 변수 answer에 맞게 sb 치환 후 저장 

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i<s; i++) {
            sb.append(my_string.charAt(i));
        }
        
        for (int i = e; i>=s; i--) {
            sb.append(my_string.charAt(i));
        }
        
        for (int i = e+1; i<my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}