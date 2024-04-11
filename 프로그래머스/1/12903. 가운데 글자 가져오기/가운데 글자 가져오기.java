class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int len = s.length();
        
        if (len % 2 == 0) {
            sb.append(s.charAt(s.length()/2 - 1));
            sb.append(s.charAt(s.length()/2));
        }
        else {
            sb.append(s.charAt(s.length()/2));
        }
        answer = sb.toString();
        return answer;
    }
}