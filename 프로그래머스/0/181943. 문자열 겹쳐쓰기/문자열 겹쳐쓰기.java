class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i<my_string.length(); i++) {
            if (i == s) {
                for (int j = 0; j<overwrite_string.length(); j++) {
                    sb.append(overwrite_string.charAt(j));
                }
                i += overwrite_string.length() - 1;
            }
            else {
                sb.append(my_string.charAt(i));
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}