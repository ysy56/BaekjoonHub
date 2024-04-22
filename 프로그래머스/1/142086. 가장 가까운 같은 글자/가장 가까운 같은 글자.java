class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        int check = -1;
        
        for (int i = 0; i < len; i++) {
            check = -1;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j))
                    check = i-j;
            }
            answer[i] = check;
        }
        
        return answer;
    }
}