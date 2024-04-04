// 입력 : 1이상 10,000이하 정수(x)
// 변수 : 입력값 복사(copy), 자리 수 길이(len), 각 자리 수 합(sum)

// 입력값 다른 변수에 복사해주기
// 자리 수 길이 구하기
    // 문자열로 변환 후 문자열의 길이 구하기
// 자리 수 길이 만큼 반복문 돌며 각 자리 수 합 구하기
    // sum += x % 10 각 자리 수 합에 일의 자리 수 더하기
    // x /= 10 일의 자리 수 버리기
// 입력값을 복사한 변수를 각 자리 수 합으로 나누었을 때 나머지가 생긴다면
    // answer에 false 값 넣기

// result : 각 자리 수의 합으로 나누어 떨어지는지 여부

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int copy = x;
        int len = Integer.toString(x).length();
        int sum = 0;
        
        for (int i = 0; i < len ; i++) {
            sum += x % 10;
            x /= 10;
        }
        
        if (copy % sum != 0)
            answer = false;
        
        return answer;
    }
}