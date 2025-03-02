class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i<pat.length(); i++) {
            if (pat.charAt(i) == 'A')
                sb.append("B");
            else
                sb.append("A");
        }
        pat = sb.toString();
        
        int idx = 0;
        for (int i = 0; i<myString.length(); i++) {
            if (idx < pat.length() && myString.charAt(i) == pat.charAt(idx))
                idx++;
            else if (idx < pat.length() && idx > 0 && myString.charAt(i) != pat.charAt(idx)){
                break;
            }
        }
        
        if (idx >= pat.length())
            return 1;
        
        return 0;
    }
}