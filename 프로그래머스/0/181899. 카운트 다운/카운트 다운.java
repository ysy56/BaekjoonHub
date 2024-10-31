class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = start_num - end_num + 1;
        int[] answer = new int[len];
        
        for (int i = 0; i<len; i++) {
            answer[i] = start_num - i;
        }
        
        return answer;
    }
}