import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int len = Long.toString(n).length();
        long[] numArr = new long[len];
        String[] strArr = Long.toString(n).split("");
        
        for (int i = 0; i<len; i++) {
            numArr[i] = Long.parseLong(strArr[i]);
        }
        Arrays.sort(numArr);
        answer = numArr[len-1];
        for (int i = len-2; i>=0; i--) {
            answer *= 10;
            answer += numArr[i];
        }
        return answer;
    }
}