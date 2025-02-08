class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder(myString.toLowerCase());
        
        for (int i = 0; i<myString.length(); i++) {
            if (sb.charAt(i) == 'a')
                sb.setCharAt(i, 'A');
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}