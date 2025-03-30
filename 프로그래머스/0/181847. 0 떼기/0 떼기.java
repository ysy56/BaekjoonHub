class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        boolean check = false;
        
        for (int i = 0; i<n_str.length(); i++) {
            if (check)
                sb.append(n_str.charAt(i));
            else if (!check && n_str.charAt(i) != '0') {
                check = true;
                sb.append(n_str.charAt(i));
            }
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}