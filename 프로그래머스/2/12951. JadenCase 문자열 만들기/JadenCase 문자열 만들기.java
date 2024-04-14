class Solution {
    public String solution(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        
    
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
            sb.append((char)(s.charAt(0) - 'a' + 'A'));
        else
            sb.append(s.charAt(0));
        
        for (int i = 1; i<len; i++) {
            if (s.charAt(i-1) == ' ' && s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                sb.append((char)(s.charAt(i) - 'a' + 'A')); // 단어의 첫 영어글자 대문자로..
            else if (s.charAt(i-1) != ' ' && s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                sb.append((char)(s.charAt(i) - 'A' + 'a')); // 단어의 뒷 영어글자 소문자로..
            else
                sb.append(s.charAt(i));
        }
        String answer = sb.toString();
        
        return answer;
    }
}