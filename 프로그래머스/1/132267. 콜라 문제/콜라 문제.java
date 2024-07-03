class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int submitCola = n - (n % a);
            int addCola = n / a * b;
            n = n - submitCola + addCola;
            answer += addCola;
        }
        return answer;
    }
}