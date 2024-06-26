class Solution {
    public int[] solution(String s) {
        int size = s.length();
        int[] answer = new int[size];
        
        for (int i = 0; i<size; i++) {
            answer[i] = -1;
            for (int j = 0; j<i; j++) {
                if (s.charAt(i) == s.charAt(j)) 
                    answer[i] = i - j;
            }
        }
        
        return answer;
    }
}