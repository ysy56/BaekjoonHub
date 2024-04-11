// input : 빈병(int a), 새로운 콜라(int b), 내가 가진 빈병(int n)
// variable : 새로 받은 콜라(int answer)
            // 남는 병(int temp)

/* process
내가 가진 빈병이 빈병보다 크거나 같으면 반복
    남는 병 = 내가 가진 빈병 % 빈병
    새로 받은 콜라 += (내가 가진 빈병 / 빈병) * 새로운 콜라
    내가 가진 빈병 = (내가 가진 빈병 / 빈병) * 새로운 콜라 + 남는 병

*/

// result : 내가 가진 빈병으로 교환했을 때 새로운 콜라병 수

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp = 0;
        
        while (n >= a) {
            temp = n % a;
            answer += (n / a) * b;
            n = (n / a) * b + temp;
        }
        
        return answer;
    }
}