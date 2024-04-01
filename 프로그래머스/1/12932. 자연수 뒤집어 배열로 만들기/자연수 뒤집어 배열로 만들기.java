// input : 자연수(int의 값을 넘음 = long)

// 변수 : 자리 수
// 자리 수 구하기
    // 문자열로 변경 후 문자열의 길이 구하기
// answer의 크기 자리 수로 지정
// 자리 수 만큼 반복
    // answer = 입력받은 값을 10으로 나눈 나머지
    // 입력받은 값 = 입력받은 값을 10으로 나눈 몫

// return : 자연수 뒤집은 배열

class Solution {
    public int[] solution(long n) {
        int len = Long.toString(n).length();
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            answer[i] = (int)(n % 10);
            n = n / 10;
        }
        
        return answer;
    }
}