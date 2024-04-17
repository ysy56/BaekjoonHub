class Solution {
    public int solution(int[] a, int[] b) {
        int size = a.length;
        int answer = 0;
        for (int i = 0; i < size; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }
}