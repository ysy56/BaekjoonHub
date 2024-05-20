class Solution {
    public int getGCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return getGCD(num2, num1%num2);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGCD(n, m);
        answer[1] = n*m/answer[0];
        
        return answer;
    }
}