class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        for(int i = 0; i<s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if ((char)(s.charAt(i) + n) > 'Z') {
                    sb.append(String.valueOf((char)(s.charAt(i) + (n-1) - 'Z' + 'A')));
                              continue;
                }
                sb.append(String.valueOf((char)(s.charAt(i) + n)));
            }
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if ((char)(s.charAt(i) + n) > 'z') {
                    sb.append(String.valueOf((char)(s.charAt(i) + (n-1) - 'z' + 'a')));
                              continue;
                }
                sb.append(String.valueOf((char)(s.charAt(i) + n)));
            }
            else 
                sb.append(String.valueOf(s.charAt(i)));
        }
        
        answer = String.valueOf(sb);
        
        return answer;
    }
}