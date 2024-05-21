class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int idx = 0;
        
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' '){
                idx = 0;
                sb.append(s.charAt(i));
            }
            else if (idx % 2 == 0 && s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                sb.append((char)(s.charAt(i) - 32));
            else if (idx % 2 != 0 && s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                sb.append((char)(s.charAt(i) + 32));
            else
                sb.append(s.charAt(i));
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') 
                || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                idx++;
        }
        answer = sb.toString();
        
        return answer;
    }
}