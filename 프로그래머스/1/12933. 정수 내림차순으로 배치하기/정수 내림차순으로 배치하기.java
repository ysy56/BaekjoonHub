class Solution {
    public long solution(long n) {
        long answer = 0;
        int size = String.valueOf(n).length();
        long[] tmpArr = new long[size];
        
        for (int i = 0; i<size; i++) {
            tmpArr[i] = n%10;
            n /= 10;
        }
        
        for (int i = 0; i<size; i++) {
            for (int j = i+1; j<size; j++) {
                if (tmpArr[i] < tmpArr[j]) {
                    long tmp = tmpArr[i];
                    tmpArr[i] = tmpArr[j];
                    tmpArr[j] = tmp;
                }
            }
        }
        
        for (int i = 0; i<size; i++) {
            answer += tmpArr[i];
            if (i == size - 1)
                break;
            answer *= 10;
        }
        
        return answer;
    }
}