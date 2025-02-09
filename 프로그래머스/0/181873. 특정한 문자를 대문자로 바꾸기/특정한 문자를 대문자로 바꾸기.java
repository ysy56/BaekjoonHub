class Solution {
    public String solution(String my_string, String alp) {
        char small = alp.charAt(0);
        char big = alp.toUpperCase().charAt(0);
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i<my_string.length(); i++) {
            if (my_string.charAt(i) == alp.charAt(0)){
                sb.setCharAt(i, big);
            }
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}