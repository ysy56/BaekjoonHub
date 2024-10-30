class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i<=my_string.length() - m; i++) {
            if (i % m == 0)
                sb.append(my_string.charAt(i + c - 1));
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}